package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public q9c a;
    private int archivedRow;
    public of2 b;
    public o5c c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public sla h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final byte s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final x3b y;

    /* JADX WARN: Multi-variable type inference failed */
    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new x3b(this, (byte) 0);
        this.s = i;
        this.w = arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Li));
        hashSet.add(Integer.valueOf(aob.Mi));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.z8));
        hashSet.add(Integer.valueOf(aob.y8));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final CharSequence b0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new vi((Object) this, (byte) 3), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return str;
    }

    public final void c0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean z = this.simpleActionBar.z();
        int i = 0;
        if (size <= 0) {
            if (z) {
                this.simpleActionBar.y();
                this.a.A1(false);
                o0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i = 8;
                        break;
                    }
                }
            }
            if (this.h.getVisibility() != i) {
                this.h.setVisibility(i);
            }
        }
        this.simpleActionBar.H(size, z);
        if (z) {
            return;
        }
        this.simpleActionBar.L();
        this.a.A1(true);
        if (xea.Q || this.s == 5) {
            return;
        }
        xea.Q = true;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("stickersReorderingHintUsed", xea.Q);
        edit.apply();
        v21.g(this, new ua9(getParentActivity(), ob6.M0(2131744507, null)), 3250).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        byte b = this.s;
        if (b == 0) {
            this.simpleActionBar.setTitle(ob6.M0(2131744514, null));
        } else if (b == 1) {
            this.simpleActionBar.setTitle(ob6.M0(2131748433, null));
        } else if (b == 5) {
            this.simpleActionBar.setTitle(ob6.M0(2131751161, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 18));
        rla r = this.simpleActionBar.r();
        r.b(2, R.drawable.msg_share, null, null, hl.L(54.0f), null);
        r.b(0, R.drawable.msg_archive, null, null, hl.L(54.0f), null);
        this.h = r.b(1, R.drawable.msg_delete, null, null, hl.L(54.0f), null);
        if (b != 5 || (arrayList = this.w) == null) {
            this.d = new ArrayList(uc7.s1(this.currentAccount).w0(ls6.d0(this.currentAccount).t0(b)));
        } else {
            this.d = arrayList;
        }
        this.e = f0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final byte b2 = 0;
        q9c q9cVar = new q9c(this, new icc(this) { // from class: a4b
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                byte b3 = b2;
                StickersActivity stickersActivity = this.b;
                switch (b3) {
                    case 0:
                        stickersActivity.e0((ArrayList) obj, (l9c) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        break;
                }
            }
        }, new b4b(this), new b4b(this));
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final byte b3 = 1;
        this.a.F1(new icc(this) { // from class: a4b
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                byte b32 = b3;
                StickersActivity stickersActivity = this.b;
                switch (b32) {
                    case 0:
                        stickersActivity.e0((ArrayList) obj, (l9c) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        break;
                }
            }
        }, false);
        of2 of2Var = new of2((byte) 6, this, null == true ? 1 : 0);
        this.b = of2Var;
        of2Var.i1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        return this.fragmentView;
    }

    public final void d0() {
        this.x.clear();
        this.a.g3.O(true);
        c0();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.x0;
        byte b = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == b) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i == jn7.z0 || i == jn7.A0) {
            this.a.g3.O(true);
        } else if (i == jn7.Z0 && ((Integer) objArr[0]).intValue() == b) {
            this.a.g3.O(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028c A[LOOP:1: B:62:0x028a->B:63:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(ArrayList arrayList, l9c l9cVar) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        final byte b;
        int i;
        boolean z;
        byte b2;
        int size;
        int i2;
        int i3;
        ls6 d0 = ls6.d0(this.currentAccount);
        q9c q9cVar = this.a;
        byte b3 = this.s;
        if (q9cVar == null || (!q9cVar.k3 && !this.r && this.n <= 0)) {
            if (b3 == 5) {
                ArrayList arrayList4 = new ArrayList(uc7.s1(this.currentAccount).w0(d0.t0(b3)));
                this.w = arrayList4;
                this.d = arrayList4;
            } else {
                this.d = new ArrayList(uc7.s1(this.currentAccount).w0(d0.t0(b3)));
            }
        }
        this.e = new ArrayList(f0());
        int i4 = 0;
        while (true) {
            int size2 = this.e.size();
            arrayList2 = this.e;
            arrayList3 = this.f;
            b = 1;
            if (i4 >= size2) {
                break;
            }
            if (arrayList3.contains(Long.valueOf(((TLRPC.StickerSetCovered) arrayList2.get(i4)).set.id))) {
                this.e.remove(i4);
                i4--;
            }
            i4++;
        }
        int size3 = arrayList2.size();
        int i5 = d0.c0[b3];
        int size4 = d0.t0(5).size();
        final byte b4 = 2;
        if (b3 == 0) {
            this.featuredRow = arrayList.size();
            arrayList.add(b8c.d(1, R.drawable.msg2_trending, ob6.M0(2131750798, null), size3 > 0 ? ob6.E(size3, ',') : ""));
            if (i5 > 0) {
                this.archivedRow = arrayList.size();
                if (b3 == 0) {
                    arrayList.add(b8c.d(2, R.drawable.msg2_archived_stickers, ob6.M0(2131754121, null), ob6.E(i5, ',')));
                } else {
                    b3 = b3;
                    arrayList.add(b8c.f(ob6.M0(b3 == 5 ? 2131754127 : 2131754126, null), ob6.E(i5, ','), 2));
                    arrayList.size();
                    String M0 = ob6.M0(2131751161, null);
                    String E = size4 > 0 ? ob6.E(size4, ',') : "";
                    b8c b8cVar = new b8c(43);
                    b8cVar.d = 3;
                    b8cVar.k = R.drawable.msg2_smile_status;
                    b8cVar.m = M0;
                    b8cVar.n = E;
                    arrayList.add(b8cVar);
                }
            }
            b3 = b3;
            arrayList.size();
            String M02 = ob6.M0(2131751161, null);
            if (size4 > 0) {
            }
            b8c b8cVar2 = new b8c(43);
            b8cVar2.d = 3;
            b8cVar2.k = R.drawable.msg2_smile_status;
            b8cVar2.m = M02;
            b8cVar2.n = E;
            arrayList.add(b8cVar2);
        } else if (i5 > 0) {
            this.archivedRow = arrayList.size();
            if (b3 == 0) {
                arrayList.add(b8c.d(2, R.drawable.msg2_archived_stickers, ob6.M0(2131754121, null), ob6.E(i5, ',')));
            } else {
                arrayList.add(b8c.f(ob6.M0(b3 == 5 ? 2131754127 : 2131754126, null), ob6.E(i5, ','), 2));
            }
            if (b3 == 1) {
                arrayList.add(b8c.C(ob6.M0(2131754122, null)));
            }
        }
        if (b3 == 0) {
            arrayList.size();
            String M03 = ob6.M0(2131751315, null);
            b8c b8cVar3 = new b8c(43);
            b8cVar3.d = 4;
            b8cVar3.k = R.drawable.msg2_reactions2;
            b8cVar3.m = M03;
            b8cVar3.G = new sh9(this, (byte) 13);
            arrayList.add(b8cVar3);
            arrayList.add(b8c.C(b0(ob6.M0(b3 == 5 ? 2131751150 : 2131744523, null))));
            arrayList.add(b8c.u(ob6.M0(2131744504, null)));
            this.suggestRow = arrayList.size();
            String M04 = ob6.M0(2131744055, null);
            int i6 = xea.D;
            String M05 = i6 != 0 ? i6 != 1 ? ob6.M0(2131744052, null) : ob6.M0(2131744053, null) : ob6.M0(2131744054, null);
            b8c b8cVar4 = new b8c(43);
            b8cVar4.d = 5;
            b8cVar4.m = M04;
            b8cVar4.n = M05;
            arrayList.add(b8cVar4);
            this.largeEmojiRow = arrayList.size();
            b8c i7 = b8c.i(6, ob6.M0(2131748788, null));
            i7.L(xea.P0);
            arrayList.add(i7);
            this.dynamicPackOrder = arrayList.size();
            b8c i8 = b8c.i(7, ob6.M0(2131751304, null));
            i8.L(xea.W);
            arrayList.add(i8);
            arrayList.add(b8c.C(ob6.M0(2131751303, null)));
        }
        if (b3 == 5) {
            b8c i9 = b8c.i(9, ob6.M0(2131744069, null));
            i9.L(xea.E);
            arrayList.add(i9);
            arrayList.add(b8c.C(ob6.M0(2131744068, null)));
        }
        if (this.d.size() > 0) {
            l9cVar.V();
            if (b3 != 5) {
                i3 = (!this.e.isEmpty() && b3 == 0) ? 2131752083 : 2131752084;
                l9cVar.M();
                ArrayList arrayList5 = this.d;
                size = arrayList5.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList5.get(i2);
                    i2++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    int i10 = o3b.b;
                    b8c K = b8c.K(o3b.class);
                    K.H = tL_messages_stickerSet;
                    final byte b5 = 0;
                    K.E = new View.OnClickListener(this) { // from class: w3b
                        public final /* synthetic */ StickersActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b6 = b5;
                            final StickersActivity stickersActivity = this.b;
                            switch (b6) {
                                case 0:
                                    stickersActivity.getClass();
                                    if (view != null && (view.getParent() instanceof p3b)) {
                                        p3b p3bVar = (p3b) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = p3bVar.getStickersSet();
                                        fu5 I = fu5.I(stickersActivity, p3bVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, ob6.M0(2131744515, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b7) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, ob6.M0(2131744520, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b8) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.b(R.drawable.msg_reorder, ob6.M0(2131744508, null), new z3b(stickersActivity, p3bVar, (byte) 0), false);
                                        final byte b9 = 2;
                                        I.k(R.drawable.msg_share, ob6.M0(2131744503, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b9) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b10 = 3;
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b10) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, ob6.M0(2131744512, null), !stickersSet.set.official, true);
                                        I.Y = jn7.T2;
                                        I.a0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    stickersActivity.m0(view);
                                    break;
                                default:
                                    stickersActivity.l0(view);
                                    break;
                            }
                        }
                    };
                    K.F = new View.OnClickListener(this) { // from class: w3b
                        public final /* synthetic */ StickersActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b6 = b;
                            final StickersActivity stickersActivity = this.b;
                            switch (b6) {
                                case 0:
                                    stickersActivity.getClass();
                                    if (view != null && (view.getParent() instanceof p3b)) {
                                        p3b p3bVar = (p3b) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = p3bVar.getStickersSet();
                                        fu5 I = fu5.I(stickersActivity, p3bVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, ob6.M0(2131744515, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b7) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, ob6.M0(2131744520, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b8) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.b(R.drawable.msg_reorder, ob6.M0(2131744508, null), new z3b(stickersActivity, p3bVar, (byte) 0), false);
                                        final byte b9 = 2;
                                        I.k(R.drawable.msg_share, ob6.M0(2131744503, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b9) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b10 = 3;
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b10) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, ob6.M0(2131744512, null), !stickersSet.set.official, true);
                                        I.Y = jn7.T2;
                                        I.a0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    stickersActivity.m0(view);
                                    break;
                                default:
                                    stickersActivity.l0(view);
                                    break;
                            }
                        }
                    };
                    K.L(this.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                    arrayList.add(K);
                    arrayList5 = arrayList5;
                }
                l9cVar.L();
                l9cVar.U();
                if (b3 != 1) {
                    arrayList.add(b8c.C(ob6.M0(2131748427, null)));
                } else if (b3 != 5) {
                    arrayList.add(b8c.C(null));
                }
            }
            bp1.o(i3, null, arrayList);
            l9cVar.M();
            ArrayList arrayList52 = this.d;
            size = arrayList52.size();
            i2 = 0;
            while (i2 < size) {
            }
            l9cVar.L();
            l9cVar.U();
            if (b3 != 1) {
            }
        }
        if (this.e.size() > 3) {
            i = 0;
            this.e = new ArrayList(this.e.subList(0, 3));
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (b3 == 5) {
            if (!this.e.isEmpty()) {
                if (this.d.size() > 0) {
                    arrayList.add(b8c.C(null));
                }
                bp1.o(2131750800, null, arrayList);
                ArrayList arrayList6 = this.e;
                int size5 = arrayList6.size();
                while (i < size5) {
                    Object obj2 = arrayList6.get(i);
                    i++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                    int i11 = c94.b;
                    b8c K2 = b8c.K(c94.class);
                    K2.H = stickerSetCovered;
                    K2.E = new View.OnClickListener(this) { // from class: w3b
                        public final /* synthetic */ StickersActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b6 = b4;
                            final StickersActivity stickersActivity = this.b;
                            switch (b6) {
                                case 0:
                                    stickersActivity.getClass();
                                    if (view != null && (view.getParent() instanceof p3b)) {
                                        p3b p3bVar = (p3b) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = p3bVar.getStickersSet();
                                        fu5 I = fu5.I(stickersActivity, p3bVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, ob6.M0(2131744515, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b7) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, ob6.M0(2131744520, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b8) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.b(R.drawable.msg_reorder, ob6.M0(2131744508, null), new z3b(stickersActivity, p3bVar, (byte) 0), false);
                                        final byte b9 = 2;
                                        I.k(R.drawable.msg_share, ob6.M0(2131744503, null), new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b9) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b10 = 3;
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: y3b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b10) {
                                                    case 0:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.g0(tL_messages_stickerSet2)));
                                                            d31.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            cc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.g0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            cc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, ob6.M0(2131744512, null), !stickersSet.set.official, true);
                                        I.Y = jn7.T2;
                                        I.a0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    stickersActivity.m0(view);
                                    break;
                                default:
                                    stickersActivity.l0(view);
                                    break;
                            }
                        }
                    };
                    K2.u = arrayList3.contains(Long.valueOf(stickerSetCovered.set.id));
                    arrayList.add(K2);
                    b4 = 2;
                }
                if (z) {
                    b8c c = b8c.c(8, R.drawable.msg2_trending, ob6.M0(2131745066, null));
                    c.r = true;
                    arrayList.add(c);
                }
            }
            b2 = 5;
        } else {
            b2 = 5;
        }
        if (b3 == b2) {
            arrayList.add(b8c.C(b0(ob6.M0(b3 == b2 ? 2131751150 : 2131744523, null))));
        }
    }

    public final ArrayList f0() {
        ls6 d0 = ls6.d0(this.currentAccount);
        ArrayList[] arrayListArr = d0.t0;
        if (this.s != 5) {
            return arrayListArr[0];
        }
        ArrayList arrayList = new ArrayList(arrayListArr[1]);
        int i = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i) == null || d0.D0(((TLRPC.StickerSetCovered) arrayList.get(i)).set.id, false)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    public final String g0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(uc7.s1(this.currentAccount).N2);
        sb.append("/");
        return String.format(locale, c00.k(sb, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = aob.d6;
        arrayList.add(new apb(this.a, 16, new Class[]{p3b.class, qmb.class, wkb.class}, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.a, TLObject.FLAG_13, new Class[]{p3b.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, TLObject.FLAG_14, new Class[]{p3b.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        o5c o5cVar = this.c;
        if (o5cVar != null) {
            arrayList.addAll(o5cVar.S());
        }
        return arrayList;
    }

    public final /* synthetic */ void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ls6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    public final /* synthetic */ void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ls6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, !tL_messages_stickerSet.set.archived ? 1 : 2, this, true, true);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(int i, ArrayList arrayList) {
        final byte b;
        ArrayList[] arrayListArr;
        int i2;
        int i3;
        d0();
        final ls6 d0 = ls6.d0(this.currentAccount);
        int i4 = 1;
        int i5 = i == 1 ? 0 : 1;
        long[] jArr = d0.Y;
        ArrayList[] arrayListArr2 = d0.H;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i6 = 0;
        while (true) {
            b = this.s;
            if (i6 >= size) {
                break;
            }
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i6);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i5 != 0) {
                stickerSet.archived = i5 == i4 ? i4 : 0;
            }
            int size2 = arrayListArr2[b].size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    arrayListArr = arrayListArr2;
                    i2 = i4;
                    i3 = i5;
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr2[b].get(i7);
                i2 = i4;
                i3 = i5;
                byte b2 = b;
                arrayListArr = arrayListArr2;
                if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                    arrayListArr[b2].remove(i7);
                    d0.J.l(tL_messages_stickerSet.set.id);
                    d0.K.l(tL_messages_stickerSet.set.id);
                    d0.O.remove(tL_messages_stickerSet.set.short_name);
                    break;
                }
                i7++;
                i5 = i3;
                arrayListArr2 = arrayListArr;
                i4 = i2;
                b = b2;
            }
            i6++;
            i5 = i3;
            arrayListArr2 = arrayListArr;
            i4 = i2;
        }
        ArrayList[] arrayListArr3 = arrayListArr2;
        boolean z = i4;
        final int i8 = i5;
        long s = ls6.s(arrayListArr3[b]);
        jArr[b] = s;
        d0.M1(b, d0.Z[b], s, arrayListArr3[b]);
        jn7 notificationCenter = d0.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b);
        objArr[z ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(jn7.x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i8 == 0) {
            tL_messages_toggleStickerSets.uninstall = z;
        } else if (i8 == z) {
            tL_messages_toggleStickerSets.archive = z;
        }
        d0.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() { // from class: kq6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ls6 ls6Var = ls6.this;
                boolean z2 = i8;
                final StickersActivity stickersActivity = this;
                final byte b3 = b;
                final int i9 = z2 ? 1 : 0;
                hl.c3(new Runnable() { // from class: er6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ls6 ls6Var2 = ls6.this;
                        boolean z3 = i9;
                        byte b4 = b3;
                        if (!z3) {
                            ls6Var2.b1(b4, false, true);
                            return;
                        }
                        TLObject tLObject2 = tLObject;
                        if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            ls6Var2.C1(stickersActivity, true, b4, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                        }
                        ls6Var2.c1(b4, false, false, true, null);
                    }
                });
            }
        });
    }

    public final void k0(b8c b8cVar, View view) {
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!this.x.isEmpty()) {
                q0((p3b) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                showDialog(new s4b(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            showDialog(new ly3(this, getParentActivity(), getResourceProvider(), arrayList2));
        }
        boolean z = obj instanceof TLRPC.StickerSetCovered;
        byte b = this.s;
        if (z) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (b != 5) {
                showDialog(new s4b(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            showDialog(new ly3(this, getParentActivity(), getResourceProvider(), arrayList3));
            return;
        }
        byte b2 = 10;
        switch (b8cVar.d) {
            case 1:
            case 8:
                if (b == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList f0 = f0();
                    if (f0 != null) {
                        for (int i = 0; i < f0.size(); i++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) f0.get(i);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    ls6.d0(this.currentAccount).e1(true, true);
                    showDialog(new ly3(this, getParentActivity(), getResourceProvider(), arrayList4));
                    break;
                } else {
                    o5c o5cVar = new o5c(getParentActivity(), this, new d6c(getParentActivity(), new c4b(this), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    this.c = o5cVar;
                    o5cVar.show();
                    break;
                }
                break;
            case 2:
                presentFragment(new is(b));
                break;
            case 3:
                presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                presentFragment(new n49());
                break;
            case 5:
                fu5 I = fu5.I(this, view);
                I.h(new vc(view, (byte) 8), ob6.M0(2131744054, null), xea.D == 0);
                I.h(new vc(view, (byte) 9), ob6.M0(2131744053, null), xea.D == 1);
                I.h(new vc(view, b2), ob6.M0(2131744052, null), xea.D == 2);
                I.a0();
                break;
            case 6:
                xea.P0 = !xea.P0;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("allowBigEmoji", xea.P0);
                edit.apply();
                ((wkb) view).setChecked(xea.P0);
                break;
            case 7:
                xea.N();
                ((wkb) view).setChecked(xea.W);
                break;
            case 9:
                xea.E = !xea.E;
                SharedPreferences.Editor edit2 = uc7.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", xea.E);
                edit2.apply();
                ((wkb) view).setChecked(xea.E);
                break;
        }
    }

    public final void l0(View view) {
        d94 d94Var = (d94) view.getParent();
        TLRPC.StickerSetCovered stickerSet = d94Var.getStickerSet();
        Long valueOf = Long.valueOf(stickerSet.set.id);
        ArrayList arrayList = this.f;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        d94Var.f.a(true, true);
        boolean z = d94Var.w;
        int i = this.currentAccount;
        if (z) {
            ls6.d0(i).h2(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            ls6.d0(i).h2(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void m0(View view) {
        p3b p3bVar;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r12;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof p3b) || (stickersSet = (p3bVar = (p3b) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i = 0;
        if (p3bVar.E != view) {
            if (p3bVar.F == view) {
                ls6.d0(this.currentAccount).h2(getParentActivity(), stickersSet, 0, this, false, true);
                return;
            } else {
                if (p3bVar.G == view) {
                    showDialog(new xk8((org.telegram.ui.ActionBar.e) this, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = getMediaDataController().t0[1];
        while (true) {
            if (i >= arrayList.size()) {
                r12 = 0;
                break;
            } else {
                if (stickersSet.set.id == ((TLRPC.StickerSetCovered) arrayList.get(i)).set.id) {
                    r12 = (TLRPC.StickerSetCovered) arrayList.get(i);
                    break;
                }
                i++;
            }
        }
        if (r12 != 0) {
            Long valueOf = Long.valueOf(r12.set.id);
            ArrayList arrayList2 = this.f;
            if (arrayList2.contains(valueOf)) {
                return;
            } else {
                arrayList2.add(Long.valueOf(r12.set.id));
            }
        }
        ls6.d0(this.currentAccount).h2(getParentActivity(), r12 == 0 ? stickersSet : r12, 2, this, false, false);
    }

    public final void n0(int i) {
        StickersActivity stickersActivity;
        String M0;
        TextView textView;
        int i2 = 0;
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d.get(i3);
                if (this.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(g0(tL_messages_stickerSet));
                }
            }
            String sb2 = sb.toString();
            kea H0 = kea.H0(this.fragmentView.getContext(), null, sb2, false, sb2);
            H0.n2 = new ve9(this, (byte) 13);
            H0.show();
            return;
        }
        if (i == 0 || i == 1) {
            ArrayList arrayList = new ArrayList(this.x.size());
            int size2 = this.d.size();
            for (int i4 = 0; i4 < size2; i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.d.get(i4);
                if (this.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    if (i == 1) {
                        alertDialog$Builder.a.S = ob6.a0(null, null, 2131751459, ob6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = ob6.a0(null, null, 2131751458, Integer.valueOf(size3));
                        M0 = ob6.M0(2131751563, null);
                    } else {
                        alertDialog$Builder.a.S = ob6.a0(null, null, 2131754135, ob6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = ob6.a0(null, null, 2131754134, Integer.valueOf(size3));
                        M0 = ob6.M0(2131754165, null);
                    }
                    alertDialog$Builder.j(M0, new bf(this, arrayList, i, (byte) 17));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    id idVar = alertDialog$Builder.a;
                    showDialog(idVar);
                    if (i != 1 || (textView = (TextView) idVar.c(-1)) == null) {
                        return;
                    }
                    yob.X(textView, aob.q7, null);
                    return;
                }
                int size4 = this.d.size();
                while (true) {
                    if (i2 >= size4) {
                        stickersActivity = this;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) this.d.get(i2);
                    if (!this.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                        i2++;
                    } else if (i == 0) {
                        stickersActivity = this;
                        ls6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity, true, true);
                    } else {
                        stickersActivity = this;
                        if (i == 1) {
                            ls6.d0(stickersActivity.currentAccount).h2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                        } else if (i == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity.g0(tL_messages_stickerSet3));
                                stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        } else if (i == 3) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.g0(tL_messages_stickerSet3)));
                                d31.j(stickersActivity).j();
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                        } else if (i == 4) {
                            HashSet hashSet = stickersActivity.x;
                            boolean contains = hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id));
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet3.set;
                            if (contains) {
                                hashSet.remove(Long.valueOf(stickerSet.id));
                            } else {
                                hashSet.add(Long.valueOf(stickerSet.id));
                            }
                            stickersActivity.a.g3.O(true);
                            stickersActivity.c0();
                        }
                    }
                }
                stickersActivity.d0();
            }
        }
    }

    public final void o0() {
        if (this.r) {
            this.r = false;
            ls6 d0 = ls6.d0(this.currentAccount);
            long[] jArr = d0.Y;
            ArrayList[] arrayListArr = d0.H;
            byte b = this.s;
            jArr[b] = ls6.s(arrayListArr[b]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = b == 1;
            tL_messages_reorderStickerSets.emojis = b == 5;
            int i = 0;
            while (i < this.d.size()) {
                i = dze.c(i, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new yp9(this, (byte) 6));
            jn7.f(this.currentAccount).k(jn7.x0, Integer.valueOf(b), Boolean.TRUE);
            if (xea.W) {
                xea.N();
                d31.b0(this).I(R.raw.filter_reorder, ob6.M0(2131751302, null), ob6.M0(2131751301, null)).j();
                this.a.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (this.x.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        d0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        ls6 d0 = ls6.d0(this.currentAccount);
        byte b = this.s;
        d0.D(b);
        if (b == 0) {
            ls6.d0(this.currentAccount).z();
            ls6.d0(this.currentAccount).D(1);
            ls6.d0(this.currentAccount).D(5);
        } else if (b == 6) {
            ls6.d0(this.currentAccount).y();
            jn7.f(this.currentAccount).b(this, jn7.A0);
        }
        jn7.f(this.currentAccount).b(this, jn7.x0);
        jn7.f(this.currentAccount).b(this, jn7.Z0);
        jn7.f(this.currentAccount).b(this, jn7.z0);
        jn7.f(this.currentAccount).b(this, jn7.i5);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            jn7.f(this.currentAccount).n(this, jn7.A0);
        }
        jn7.f(this.currentAccount).n(this, jn7.x0);
        jn7.f(this.currentAccount).n(this, jn7.Z0);
        jn7.f(this.currentAccount).n(this, jn7.z0);
        jn7.f(this.currentAccount).n(this, jn7.i5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        q9c q9cVar = this.a;
        if (q9cVar != null) {
            q9cVar.g3.O(true);
        }
    }

    public final void p0(View view) {
        if (view instanceof qmb) {
            qmb qmbVar = (qmb) view;
            String S = ls6.d0(this.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        wl m = wl.m(this.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m.b(qmbVar.getValueBackupImageView());
                        qmbVar.getValueBackupImageView().setImageDrawable(m);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(this.currentAccount).r.get(S);
                if (tL_availableReaction != null) {
                    qmbVar.getValueBackupImageView().getImageReceiver().d0(jn5.b(tL_availableReaction.center_icon), "100_100_lastreactframe", lp3.d(tL_availableReaction.static_icon.thumbs, aob.a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public final void q0(p3b p3bVar) {
        TLRPC.TL_messages_stickerSet stickersSet = p3bVar.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            p3bVar.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            p3bVar.b(true, true);
        }
        this.a.g3.O(true);
        c0();
    }

    public final void r0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((b8c) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.d = arrayList2;
        this.r = true;
        Collections.sort(ls6.d0(this.currentAccount).t0(this.s), new jz0(this, (byte) 7));
        x3b x3bVar = this.y;
        hl.r(x3bVar);
        hl.d3(x3bVar, 1000L);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
