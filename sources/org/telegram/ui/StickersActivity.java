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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public q5c a;
    private int archivedRow;
    public xe2 b;
    public p1c c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public xha h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final byte s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final a0b y;

    /* JADX WARN: Multi-variable type inference failed */
    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new a0b(this, (byte) 0);
        this.s = i;
        this.w = arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Ki));
        hashSet.add(Integer.valueOf(bkb.Li));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.y8));
        hashSet.add(Integer.valueOf(bkb.x8));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final CharSequence b0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new ui((Object) this, (byte) 3), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return str;
    }

    public final void c0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean x = this.simpleActionBar.x();
        int i = 0;
        if (size <= 0) {
            if (x) {
                this.simpleActionBar.w();
                this.a.z1(false);
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
        this.simpleActionBar.E(size, x);
        if (x) {
            return;
        }
        this.simpleActionBar.J();
        this.a.z1(true);
        if (gba.Q || this.s == 5) {
            return;
        }
        gba.Q = true;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("stickersReorderingHintUsed", gba.Q);
        edit.apply();
        m21.g(this, new h79(getParentActivity(), k96.M0(2131744613, null)), 3250).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        byte b = this.s;
        if (b == 0) {
            this.simpleActionBar.setTitle(k96.M0(2131744620, null));
        } else if (b == 1) {
            this.simpleActionBar.setTitle(k96.M0(2131748487, null));
        } else if (b == 5) {
            this.simpleActionBar.setTitle(k96.M0(2131751184, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 16));
        wha q = this.simpleActionBar.q();
        q.b(2, R.drawable.msg_share, null, null, gl.L(54.0f), null);
        q.b(0, R.drawable.msg_archive, null, null, gl.L(54.0f), null);
        this.h = q.b(1, R.drawable.msg_delete, null, null, gl.L(54.0f), null);
        if (b != 5 || (arrayList = this.w) == null) {
            this.d = new ArrayList(na7.q1(this.currentAccount).u0(hq6.d0(this.currentAccount).t0(b)));
        } else {
            this.d = arrayList;
        }
        this.e = f0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final byte b2 = 0;
        q5c q5cVar = new q5c(this, new i8c(this) { // from class: c0b
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // i8c
            public final void a(Object obj, Object obj2) {
                byte b3 = b2;
                StickersActivity stickersActivity = this.b;
                switch (b3) {
                    case 0:
                        stickersActivity.e0((ArrayList) obj, (l5c) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        break;
                }
            }
        }, new d0b(this), new d0b(this));
        this.a = q5cVar;
        q5cVar.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final byte b3 = 1;
        this.a.E1(new i8c(this) { // from class: c0b
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // i8c
            public final void a(Object obj, Object obj2) {
                byte b32 = b3;
                StickersActivity stickersActivity = this.b;
                switch (b32) {
                    case 0:
                        stickersActivity.e0((ArrayList) obj, (l5c) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        break;
                }
            }
        }, false);
        xe2 xe2Var = new xe2((byte) 6, this, null == true ? 1 : 0);
        this.b = xe2Var;
        xe2Var.i1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        return this.fragmentView;
    }

    public final void d0() {
        this.x.clear();
        this.a.g3.O(true);
        c0();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.w0;
        byte b = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == b) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i == kk7.y0 || i == kk7.z0) {
            this.a.g3.O(true);
        } else if (i == kk7.Y0 && ((Integer) objArr[0]).intValue() == b) {
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
    public final void e0(ArrayList arrayList, l5c l5cVar) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        final byte b;
        int i;
        boolean z;
        byte b2;
        int size;
        int i2;
        int i3;
        hq6 d0 = hq6.d0(this.currentAccount);
        q5c q5cVar = this.a;
        byte b3 = this.s;
        if (q5cVar == null || (!q5cVar.k3 && !this.r && this.n <= 0)) {
            if (b3 == 5) {
                ArrayList arrayList4 = new ArrayList(na7.q1(this.currentAccount).u0(d0.t0(b3)));
                this.w = arrayList4;
                this.d = arrayList4;
            } else {
                this.d = new ArrayList(na7.q1(this.currentAccount).u0(d0.t0(b3)));
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
            arrayList.add(c4c.d(1, R.drawable.msg2_trending, k96.M0(2131750821, null), size3 > 0 ? k96.E(size3, ',') : ""));
            if (i5 > 0) {
                this.archivedRow = arrayList.size();
                if (b3 == 0) {
                    arrayList.add(c4c.d(2, R.drawable.msg2_archived_stickers, k96.M0(2131754125, null), k96.E(i5, ',')));
                } else {
                    b3 = b3;
                    arrayList.add(c4c.f(k96.M0(b3 == 5 ? 2131754131 : 2131754130, null), k96.E(i5, ','), 2));
                    arrayList.size();
                    String M0 = k96.M0(2131751184, null);
                    String E = size4 > 0 ? k96.E(size4, ',') : "";
                    c4c c4cVar = new c4c(43);
                    c4cVar.d = 3;
                    c4cVar.k = R.drawable.msg2_smile_status;
                    c4cVar.m = M0;
                    c4cVar.n = E;
                    arrayList.add(c4cVar);
                }
            }
            b3 = b3;
            arrayList.size();
            String M02 = k96.M0(2131751184, null);
            if (size4 > 0) {
            }
            c4c c4cVar2 = new c4c(43);
            c4cVar2.d = 3;
            c4cVar2.k = R.drawable.msg2_smile_status;
            c4cVar2.m = M02;
            c4cVar2.n = E;
            arrayList.add(c4cVar2);
        } else if (i5 > 0) {
            this.archivedRow = arrayList.size();
            if (b3 == 0) {
                arrayList.add(c4c.d(2, R.drawable.msg2_archived_stickers, k96.M0(2131754125, null), k96.E(i5, ',')));
            } else {
                arrayList.add(c4c.f(k96.M0(b3 == 5 ? 2131754131 : 2131754130, null), k96.E(i5, ','), 2));
            }
            if (b3 == 1) {
                arrayList.add(c4c.C(k96.M0(2131754126, null)));
            }
        }
        if (b3 == 0) {
            arrayList.size();
            String M03 = k96.M0(2131751338, null);
            c4c c4cVar3 = new c4c(43);
            c4cVar3.d = 4;
            c4cVar3.k = R.drawable.msg2_reactions2;
            c4cVar3.m = M03;
            c4cVar3.G = new ae9(this, (byte) 13);
            arrayList.add(c4cVar3);
            arrayList.add(c4c.C(b0(k96.M0(b3 == 5 ? 2131751173 : 2131744629, null))));
            arrayList.add(c4c.u(k96.M0(2131744610, null)));
            this.suggestRow = arrayList.size();
            String M04 = k96.M0(2131744161, null);
            int i6 = gba.D;
            String M05 = i6 != 0 ? i6 != 1 ? k96.M0(2131744158, null) : k96.M0(2131744159, null) : k96.M0(2131744160, null);
            c4c c4cVar4 = new c4c(43);
            c4cVar4.d = 5;
            c4cVar4.m = M04;
            c4cVar4.n = M05;
            arrayList.add(c4cVar4);
            this.largeEmojiRow = arrayList.size();
            c4c i7 = c4c.i(6, k96.M0(2131748842, null));
            i7.L(gba.P0);
            arrayList.add(i7);
            this.dynamicPackOrder = arrayList.size();
            c4c i8 = c4c.i(7, k96.M0(2131751327, null));
            i8.L(gba.W);
            arrayList.add(i8);
            arrayList.add(c4c.C(k96.M0(2131751326, null)));
        }
        if (b3 == 5) {
            c4c i9 = c4c.i(9, k96.M0(2131744175, null));
            i9.L(gba.E);
            arrayList.add(i9);
            arrayList.add(c4c.C(k96.M0(2131744174, null)));
        }
        if (this.d.size() > 0) {
            l5cVar.V();
            if (b3 != 5) {
                i3 = (!this.e.isEmpty() && b3 == 0) ? 2131752106 : 2131752107;
                l5cVar.M();
                ArrayList arrayList5 = this.d;
                size = arrayList5.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList5.get(i2);
                    i2++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    int i10 = qza.b;
                    c4c K = c4c.K(qza.class);
                    K.H = tL_messages_stickerSet;
                    final byte b5 = 0;
                    K.E = new View.OnClickListener(this) { // from class: zza
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
                                    if (view != null && (view.getParent() instanceof rza)) {
                                        rza rzaVar = (rza) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = rzaVar.getStickersSet();
                                        cs5 I = cs5.I(stickersActivity, rzaVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, k96.M0(2131744621, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, k96.M0(2131744626, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b9 = 3;
                                        I.b(R.drawable.msg_reorder, k96.M0(2131744614, null), new iya(stickersActivity, rzaVar, (byte) 3), false);
                                        final byte b10 = 2;
                                        I.k(R.drawable.msg_share, k96.M0(2131744609, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, k96.M0(2131744618, null), !stickersSet.set.official, true);
                                        I.V = kk7.T2;
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
                    K.F = new View.OnClickListener(this) { // from class: zza
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
                                    if (view != null && (view.getParent() instanceof rza)) {
                                        rza rzaVar = (rza) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = rzaVar.getStickersSet();
                                        cs5 I = cs5.I(stickersActivity, rzaVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, k96.M0(2131744621, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, k96.M0(2131744626, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b9 = 3;
                                        I.b(R.drawable.msg_reorder, k96.M0(2131744614, null), new iya(stickersActivity, rzaVar, (byte) 3), false);
                                        final byte b10 = 2;
                                        I.k(R.drawable.msg_share, k96.M0(2131744609, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, k96.M0(2131744618, null), !stickersSet.set.official, true);
                                        I.V = kk7.T2;
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
                l5cVar.L();
                l5cVar.U();
                if (b3 != 1) {
                    arrayList.add(c4c.C(k96.M0(2131748481, null)));
                } else if (b3 != 5) {
                    arrayList.add(c4c.C(null));
                }
            }
            oo1.o(i3, null, arrayList);
            l5cVar.M();
            ArrayList arrayList52 = this.d;
            size = arrayList52.size();
            i2 = 0;
            while (i2 < size) {
            }
            l5cVar.L();
            l5cVar.U();
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
                    arrayList.add(c4c.C(null));
                }
                oo1.o(2131750823, null, arrayList);
                ArrayList arrayList6 = this.e;
                int size5 = arrayList6.size();
                while (i < size5) {
                    Object obj2 = arrayList6.get(i);
                    i++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                    int i11 = h84.b;
                    c4c K2 = c4c.K(h84.class);
                    K2.H = stickerSetCovered;
                    K2.E = new View.OnClickListener(this) { // from class: zza
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
                                    if (view != null && (view.getParent() instanceof rza)) {
                                        rza rzaVar = (rza) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = rzaVar.getStickersSet();
                                        cs5 I = cs5.I(stickersActivity, rzaVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, k96.M0(2131744621, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, k96.M0(2131744626, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b9 = 3;
                                        I.b(R.drawable.msg_reorder, k96.M0(2131744614, null), new iya(stickersActivity, rzaVar, (byte) 3), false);
                                        final byte b10 = 2;
                                        I.k(R.drawable.msg_share, k96.M0(2131744609, null), new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: b0b
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
                                                            u21.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fa4.g(e, true);
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
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fa4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.h0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, k96.M0(2131744618, null), !stickersSet.set.official, true);
                                        I.V = kk7.T2;
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
                    c4c c = c4c.c(8, R.drawable.msg2_trending, k96.M0(2131745146, null));
                    c.r = true;
                    arrayList.add(c);
                }
            }
            b2 = 5;
        } else {
            b2 = 5;
        }
        if (b3 == b2) {
            arrayList.add(c4c.C(b0(k96.M0(b3 == b2 ? 2131751173 : 2131744629, null))));
        }
    }

    public final ArrayList f0() {
        hq6 d0 = hq6.d0(this.currentAccount);
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
        sb.append(na7.q1(this.currentAccount).N2);
        sb.append("/");
        return String.format(locale, b00.j(sb, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = bkb.c6;
        arrayList.add(new blb(this.a, 16, new Class[]{rza.class, uib.class, ahb.class}, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.a, TLObject.FLAG_13, new Class[]{rza.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, TLObject.FLAG_14, new Class[]{rza.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        p1c p1cVar = this.c;
        if (p1cVar != null) {
            arrayList.addAll(p1cVar.S());
        }
        return arrayList;
    }

    public final /* synthetic */ void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        hq6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    public final /* synthetic */ void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        hq6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, !tL_messages_stickerSet.set.archived ? 1 : 2, this, true, true);
    }

    @Override // org.telegram.ui.ActionBar.d
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
        final hq6 d0 = hq6.d0(this.currentAccount);
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
        long s = hq6.s(arrayListArr3[b]);
        jArr[b] = s;
        d0.M1(b, d0.Z[b], s, arrayListArr3[b]);
        kk7 notificationCenter = d0.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b);
        objArr[z ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(kk7.w0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i8 == 0) {
            tL_messages_toggleStickerSets.uninstall = z;
        } else if (i8 == z) {
            tL_messages_toggleStickerSets.archive = z;
        }
        d0.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() { // from class: fn6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final hq6 hq6Var = hq6.this;
                boolean z2 = i8;
                final StickersActivity stickersActivity = this;
                final byte b3 = b;
                final int i9 = z2 ? 1 : 0;
                gl.c3(new Runnable() { // from class: qo6
                    @Override // java.lang.Runnable
                    public final void run() {
                        hq6 hq6Var2 = hq6.this;
                        boolean z3 = i9;
                        byte b4 = b3;
                        if (!z3) {
                            hq6Var2.b1(b4, false, true);
                            return;
                        }
                        TLObject tLObject2 = tLObject;
                        if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            hq6Var2.C1(stickersActivity, true, b4, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                        }
                        hq6Var2.c1(b4, false, false, true, null);
                    }
                });
            }
        });
    }

    public final void k0(c4c c4cVar, View view) {
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!this.x.isEmpty()) {
                q0((rza) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                showDialog(new u0b(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            showDialog(new qx3(this, getParentActivity(), getResourceProvider(), arrayList2));
        }
        boolean z = obj instanceof TLRPC.StickerSetCovered;
        byte b = this.s;
        if (z) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (b != 5) {
                showDialog(new u0b(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            showDialog(new qx3(this, getParentActivity(), getResourceProvider(), arrayList3));
            return;
        }
        switch (c4cVar.d) {
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
                    hq6.d0(this.currentAccount).e1(true, true);
                    showDialog(new qx3(this, getParentActivity(), getResourceProvider(), arrayList4));
                    break;
                } else {
                    p1c p1cVar = new p1c(getParentActivity(), this, new d2c(getParentActivity(), new e0b(this), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    this.c = p1cVar;
                    p1cVar.show();
                    break;
                }
            case 2:
                presentFragment(new hs(b));
                break;
            case 3:
                presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                presentFragment(new y09());
                break;
            case 5:
                cs5 I = cs5.I(this, view);
                I.h(new uc(view, (byte) 7), k96.M0(2131744160, null), gba.D == 0);
                I.h(new uc(view, (byte) 8), k96.M0(2131744159, null), gba.D == 1);
                I.h(new uc(view, (byte) 9), k96.M0(2131744158, null), gba.D == 2);
                I.a0();
                break;
            case 6:
                gba.P0 = !gba.P0;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("allowBigEmoji", gba.P0);
                edit.apply();
                ((ahb) view).setChecked(gba.P0);
                break;
            case 7:
                gba.N();
                ((ahb) view).setChecked(gba.W);
                break;
            case 9:
                gba.E = !gba.E;
                SharedPreferences.Editor edit2 = na7.c1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", gba.E);
                edit2.apply();
                ((ahb) view).setChecked(gba.E);
                break;
        }
    }

    public final void l0(View view) {
        i84 i84Var = (i84) view.getParent();
        TLRPC.StickerSetCovered stickerSet = i84Var.getStickerSet();
        Long valueOf = Long.valueOf(stickerSet.set.id);
        ArrayList arrayList = this.f;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        i84Var.f.a(true, true);
        boolean z = i84Var.w;
        int i = this.currentAccount;
        if (z) {
            hq6.d0(i).h2(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            hq6.d0(i).h2(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void m0(View view) {
        rza rzaVar;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r12;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof rza) || (stickersSet = (rzaVar = (rza) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i = 0;
        if (rzaVar.E != view) {
            if (rzaVar.F == view) {
                hq6.d0(this.currentAccount).h2(getParentActivity(), stickersSet, 0, this, false, true);
                return;
            } else {
                if (rzaVar.G == view) {
                    showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 11, false));
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
        hq6.d0(this.currentAccount).h2(getParentActivity(), r12 == 0 ? stickersSet : r12, 2, this, false, false);
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
            taa G0 = taa.G0(this.fragmentView.getContext(), null, sb2, false, sb2);
            G0.n2 = new u39(this, (byte) 16);
            G0.show();
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
                        alertDialog$Builder.a.S = k96.a0(null, null, 2131751482, k96.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = k96.a0(null, null, 2131751481, Integer.valueOf(size3));
                        M0 = k96.M0(2131751586, null);
                    } else {
                        alertDialog$Builder.a.S = k96.a0(null, null, 2131754139, k96.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = k96.a0(null, null, 2131754138, Integer.valueOf(size3));
                        M0 = k96.M0(2131754169, null);
                    }
                    alertDialog$Builder.j(M0, new yf((Object) this, (Object) arrayList, i, (byte) 15));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    hd hdVar = alertDialog$Builder.a;
                    showDialog(hdVar);
                    if (i != 1 || (textView = (TextView) hdVar.c(-1)) == null) {
                        return;
                    }
                    zkb.X(textView, bkb.p7, null);
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
                        hq6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity, true, true);
                    } else {
                        stickersActivity = this;
                        if (i == 1) {
                            hq6.d0(stickersActivity.currentAccount).h2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                        } else if (i == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity.g0(tL_messages_stickerSet3));
                                stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        } else if (i == 3) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.g0(tL_messages_stickerSet3)));
                                u21.j(stickersActivity).j();
                            } catch (Exception e2) {
                                fa4.g(e2, true);
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
            hq6 d0 = hq6.d0(this.currentAccount);
            long[] jArr = d0.Y;
            ArrayList[] arrayListArr = d0.H;
            byte b = this.s;
            jArr[b] = hq6.s(arrayListArr[b]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = b == 1;
            byte b2 = 5;
            tL_messages_reorderStickerSets.emojis = b == 5;
            int i = 0;
            while (i < this.d.size()) {
                i = mue.c(i, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new wx9(this, b2));
            kk7.f(this.currentAccount).k(kk7.w0, Integer.valueOf(b), Boolean.TRUE);
            if (gba.W) {
                gba.N();
                u21.b0(this).I(R.raw.filter_reorder, k96.M0(2131751325, null), k96.M0(2131751324, null)).j();
                this.a.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
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

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        hq6 d0 = hq6.d0(this.currentAccount);
        byte b = this.s;
        d0.D(b);
        if (b == 0) {
            hq6.d0(this.currentAccount).z();
            hq6.d0(this.currentAccount).D(1);
            hq6.d0(this.currentAccount).D(5);
        } else if (b == 6) {
            hq6.d0(this.currentAccount).y();
            kk7.f(this.currentAccount).b(this, kk7.z0);
        }
        kk7.f(this.currentAccount).b(this, kk7.w0);
        kk7.f(this.currentAccount).b(this, kk7.Y0);
        kk7.f(this.currentAccount).b(this, kk7.y0);
        kk7.f(this.currentAccount).b(this, kk7.h5);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            kk7.f(this.currentAccount).n(this, kk7.z0);
        }
        kk7.f(this.currentAccount).n(this, kk7.w0);
        kk7.f(this.currentAccount).n(this, kk7.Y0);
        kk7.f(this.currentAccount).n(this, kk7.y0);
        kk7.f(this.currentAccount).n(this, kk7.h5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        q5c q5cVar = this.a;
        if (q5cVar != null) {
            q5cVar.g3.O(true);
        }
    }

    public final void p0(View view) {
        if (view instanceof uib) {
            uib uibVar = (uib) view;
            String S = hq6.d0(this.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        vl m = vl.m(this.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m.b(uibVar.getValueBackupImageView());
                        uibVar.getValueBackupImageView().setImageDrawable(m);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(this.currentAccount).r.get(S);
                if (tL_availableReaction != null) {
                    uibVar.getValueBackupImageView().getImageReceiver().d0(gl5.b(tL_availableReaction.center_icon), "100_100_lastreactframe", uo3.d(tL_availableReaction.static_icon.thumbs, bkb.Z6, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public final void q0(rza rzaVar) {
        TLRPC.TL_messages_stickerSet stickersSet = rzaVar.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            rzaVar.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            rzaVar.b(true, true);
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
            Object obj2 = ((c4c) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.d = arrayList2;
        this.r = true;
        Collections.sort(hq6.d0(this.currentAccount).t0(this.s), new bz0(this, (byte) 6));
        a0b a0bVar = this.y;
        gl.r(a0bVar);
        gl.d3(a0bVar, 1000L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
