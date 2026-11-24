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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public q7c a;
    private int archivedRow;
    public jg2 b;
    public p3c c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public zja h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final byte s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final b2b y;

    /* JADX WARN: Multi-variable type inference failed */
    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new b2b(this, (byte) 0);
        this.s = i;
        this.w = arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Ki));
        hashSet.add(Integer.valueOf(cmb.Li));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.y8));
        hashSet.add(Integer.valueOf(cmb.x8));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final CharSequence c0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new uj((Object) this, (byte) 3), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        byte b = this.s;
        if (b == 0) {
            this.simpleActionBar.setTitle(jb6.M0(2131744546, null));
        } else if (b == 1) {
            this.simpleActionBar.setTitle(jb6.M0(2131748436, null));
        } else if (b == 5) {
            this.simpleActionBar.setTitle(jb6.M0(2131751133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 17));
        yja q = this.simpleActionBar.q();
        q.b(2, R.drawable.msg_share, null, null, gm.L(54.0f), null);
        q.b(0, R.drawable.msg_archive, null, null, gm.L(54.0f), null);
        this.h = q.b(1, R.drawable.msg_delete, null, null, gm.L(54.0f), null);
        if (b != 5 || (arrayList = this.w) == null) {
            this.d = new ArrayList(oc7.r1(this.currentAccount).u0(hs6.d0(this.currentAccount).t0(b)));
        } else {
            this.d = arrayList;
        }
        this.e = g0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final byte b2 = 0;
        q7c q7cVar = new q7c(this, new jac(this) { // from class: d2b
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                byte b3 = b2;
                StickersActivity stickersActivity = this.b;
                switch (b3) {
                    case 0:
                        stickersActivity.f0((ArrayList) obj, (l7c) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.s0((ArrayList) obj2);
                        break;
                }
            }
        }, new e2b(this), new e2b(this));
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final byte b3 = 1;
        this.a.E1(new jac(this) { // from class: d2b
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                byte b32 = b3;
                StickersActivity stickersActivity = this.b;
                switch (b32) {
                    case 0:
                        stickersActivity.f0((ArrayList) obj, (l7c) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.s0((ArrayList) obj2);
                        break;
                }
            }
        }, false);
        jg2 jg2Var = new jg2((byte) 6, this, null == true ? 1 : 0);
        this.b = jg2Var;
        jg2Var.i1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        return this.fragmentView;
    }

    public final void d0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean x = this.simpleActionBar.x();
        int i = 0;
        if (size <= 0) {
            if (x) {
                this.simpleActionBar.w();
                this.a.z1(false);
                p0();
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
        this.simpleActionBar.F(size, x);
        if (x) {
            return;
        }
        this.simpleActionBar.J();
        this.a.z1(true);
        if (gda.Q || this.s == 5) {
            return;
        }
        gda.Q = true;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putBoolean("stickersReorderingHintUsed", gda.Q);
        edit.apply();
        u31.g(this, new j99(getParentActivity(), jb6.M0(2131744539, null)), 3250).j();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x0;
        byte b = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == b) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i == nm7.z0 || i == nm7.A0) {
            this.a.g3.O(true);
        } else if (i == nm7.Z0 && ((Integer) objArr[0]).intValue() == b) {
            this.a.g3.O(true);
        }
    }

    public final void e0() {
        this.x.clear();
        this.a.g3.O(true);
        d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028c A[LOOP:1: B:62:0x028a->B:63:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(ArrayList arrayList, l7c l7cVar) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        final byte b;
        int i;
        boolean z;
        byte b2;
        int size;
        int i2;
        int i3;
        hs6 d0 = hs6.d0(this.currentAccount);
        q7c q7cVar = this.a;
        byte b3 = this.s;
        if (q7cVar == null || (!q7cVar.k3 && !this.r && this.n <= 0)) {
            if (b3 == 5) {
                ArrayList arrayList4 = new ArrayList(oc7.r1(this.currentAccount).u0(d0.t0(b3)));
                this.w = arrayList4;
                this.d = arrayList4;
            } else {
                this.d = new ArrayList(oc7.r1(this.currentAccount).u0(d0.t0(b3)));
            }
        }
        this.e = new ArrayList(g0());
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
            arrayList.add(c6c.d(1, R.drawable.msg2_trending, jb6.M0(2131750770, null), size3 > 0 ? jb6.E(size3, ',') : ""));
            if (i5 > 0) {
                this.archivedRow = arrayList.size();
                if (b3 == 0) {
                    arrayList.add(c6c.d(2, R.drawable.msg2_archived_stickers, jb6.M0(2131754093, null), jb6.E(i5, ',')));
                } else {
                    b3 = b3;
                    arrayList.add(c6c.f(jb6.M0(b3 == 5 ? 2131754099 : 2131754098, null), jb6.E(i5, ','), 2));
                    arrayList.size();
                    String M0 = jb6.M0(2131751133, null);
                    String E = size4 > 0 ? jb6.E(size4, ',') : "";
                    c6c c6cVar = new c6c(43);
                    c6cVar.d = 3;
                    c6cVar.k = R.drawable.msg2_smile_status;
                    c6cVar.m = M0;
                    c6cVar.n = E;
                    arrayList.add(c6cVar);
                }
            }
            b3 = b3;
            arrayList.size();
            String M02 = jb6.M0(2131751133, null);
            if (size4 > 0) {
            }
            c6c c6cVar2 = new c6c(43);
            c6cVar2.d = 3;
            c6cVar2.k = R.drawable.msg2_smile_status;
            c6cVar2.m = M02;
            c6cVar2.n = E;
            arrayList.add(c6cVar2);
        } else if (i5 > 0) {
            this.archivedRow = arrayList.size();
            if (b3 == 0) {
                arrayList.add(c6c.d(2, R.drawable.msg2_archived_stickers, jb6.M0(2131754093, null), jb6.E(i5, ',')));
            } else {
                arrayList.add(c6c.f(jb6.M0(b3 == 5 ? 2131754099 : 2131754098, null), jb6.E(i5, ','), 2));
            }
            if (b3 == 1) {
                arrayList.add(c6c.C(jb6.M0(2131754094, null)));
            }
        }
        if (b3 == 0) {
            arrayList.size();
            String M03 = jb6.M0(2131751287, null);
            c6c c6cVar3 = new c6c(43);
            c6cVar3.d = 4;
            c6cVar3.k = R.drawable.msg2_reactions2;
            c6cVar3.m = M03;
            c6cVar3.G = new eg9(this, (byte) 13);
            arrayList.add(c6cVar3);
            arrayList.add(c6c.C(c0(jb6.M0(b3 == 5 ? 2131751122 : 2131744555, null))));
            arrayList.add(c6c.u(jb6.M0(2131744536, null)));
            this.suggestRow = arrayList.size();
            String M04 = jb6.M0(2131744087, null);
            int i6 = gda.D;
            String M05 = i6 != 0 ? i6 != 1 ? jb6.M0(2131744084, null) : jb6.M0(2131744085, null) : jb6.M0(2131744086, null);
            c6c c6cVar4 = new c6c(43);
            c6cVar4.d = 5;
            c6cVar4.m = M04;
            c6cVar4.n = M05;
            arrayList.add(c6cVar4);
            this.largeEmojiRow = arrayList.size();
            c6c i7 = c6c.i(6, jb6.M0(2131748791, null));
            i7.L(gda.P0);
            arrayList.add(i7);
            this.dynamicPackOrder = arrayList.size();
            c6c i8 = c6c.i(7, jb6.M0(2131751276, null));
            i8.L(gda.W);
            arrayList.add(i8);
            arrayList.add(c6c.C(jb6.M0(2131751275, null)));
        }
        if (b3 == 5) {
            c6c i9 = c6c.i(9, jb6.M0(2131744101, null));
            i9.L(gda.E);
            arrayList.add(i9);
            arrayList.add(c6c.C(jb6.M0(2131744100, null)));
        }
        if (this.d.size() > 0) {
            l7cVar.V();
            if (b3 != 5) {
                i3 = (!this.e.isEmpty() && b3 == 0) ? 2131752055 : 2131752056;
                l7cVar.M();
                ArrayList arrayList5 = this.d;
                size = arrayList5.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList5.get(i2);
                    i2++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    int i10 = r1b.b;
                    c6c K = c6c.K(r1b.class);
                    K.H = tL_messages_stickerSet;
                    final byte b5 = 0;
                    K.E = new View.OnClickListener(this) { // from class: a2b
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
                                    if (view != null && (view.getParent() instanceof s1b)) {
                                        s1b s1bVar = (s1b) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = s1bVar.getStickersSet();
                                        bu5 I = bu5.I(stickersActivity, s1bVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, jb6.M0(2131744547, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b7) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, jb6.M0(2131744552, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b8) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.b(R.drawable.msg_reorder, jb6.M0(2131744540, null), new uva(stickersActivity, s1bVar, (byte) 5), false);
                                        final byte b9 = 2;
                                        I.k(R.drawable.msg_share, jb6.M0(2131744535, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b9) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b10 = 3;
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b10) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, jb6.M0(2131744544, null), !stickersSet.set.official, true);
                                        I.V = nm7.T2;
                                        I.a0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    stickersActivity.n0(view);
                                    break;
                                default:
                                    stickersActivity.m0(view);
                                    break;
                            }
                        }
                    };
                    K.F = new View.OnClickListener(this) { // from class: a2b
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
                                    if (view != null && (view.getParent() instanceof s1b)) {
                                        s1b s1bVar = (s1b) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = s1bVar.getStickersSet();
                                        bu5 I = bu5.I(stickersActivity, s1bVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, jb6.M0(2131744547, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b7) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, jb6.M0(2131744552, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b8) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.b(R.drawable.msg_reorder, jb6.M0(2131744540, null), new uva(stickersActivity, s1bVar, (byte) 5), false);
                                        final byte b9 = 2;
                                        I.k(R.drawable.msg_share, jb6.M0(2131744535, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b9) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b10 = 3;
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b10) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, jb6.M0(2131744544, null), !stickersSet.set.official, true);
                                        I.V = nm7.T2;
                                        I.a0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    stickersActivity.n0(view);
                                    break;
                                default:
                                    stickersActivity.m0(view);
                                    break;
                            }
                        }
                    };
                    K.L(this.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                    arrayList.add(K);
                    arrayList5 = arrayList5;
                }
                l7cVar.L();
                l7cVar.U();
                if (b3 != 1) {
                    arrayList.add(c6c.C(jb6.M0(2131748430, null)));
                } else if (b3 != 5) {
                    arrayList.add(c6c.C(null));
                }
            }
            aq1.o(i3, null, arrayList);
            l7cVar.M();
            ArrayList arrayList52 = this.d;
            size = arrayList52.size();
            i2 = 0;
            while (i2 < size) {
            }
            l7cVar.L();
            l7cVar.U();
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
                    arrayList.add(c6c.C(null));
                }
                aq1.o(2131750772, null, arrayList);
                ArrayList arrayList6 = this.e;
                int size5 = arrayList6.size();
                while (i < size5) {
                    Object obj2 = arrayList6.get(i);
                    i++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                    int i11 = q94.b;
                    c6c K2 = c6c.K(q94.class);
                    K2.H = stickerSetCovered;
                    K2.E = new View.OnClickListener(this) { // from class: a2b
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
                                    if (view != null && (view.getParent() instanceof s1b)) {
                                        s1b s1bVar = (s1b) view.getParent();
                                        final TLRPC.TL_messages_stickerSet stickersSet = s1bVar.getStickersSet();
                                        bu5 I = bu5.I(stickersActivity, s1bVar);
                                        final byte b7 = 0;
                                        I.b(R.drawable.msg_archive, jb6.M0(2131744547, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b7) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, false);
                                        final byte b8 = 1;
                                        I.k(R.drawable.msg_link, jb6.M0(2131744552, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b8) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        I.b(R.drawable.msg_reorder, jb6.M0(2131744540, null), new uva(stickersActivity, s1bVar, (byte) 5), false);
                                        final byte b9 = 2;
                                        I.k(R.drawable.msg_share, jb6.M0(2131744535, null), new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b9) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, !stickersSet.set.official);
                                        final byte b10 = 3;
                                        I.l(R.drawable.msg_delete, new Runnable() { // from class: c2b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (b10) {
                                                    case 0:
                                                        stickersActivity.j0(stickersSet);
                                                        break;
                                                    case 1:
                                                        StickersActivity stickersActivity2 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                        stickersActivity2.getClass();
                                                        try {
                                                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.h0(tL_messages_stickerSet2)));
                                                            c41.j(stickersActivity2).j();
                                                            break;
                                                        } catch (Exception e) {
                                                            fc4.g(e, true);
                                                            return;
                                                        }
                                                    case 2:
                                                        StickersActivity stickersActivity3 = stickersActivity;
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickersSet;
                                                        stickersActivity3.getClass();
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.SEND");
                                                            intent.setType("text/plain");
                                                            intent.putExtra("android.intent.extra.TEXT", stickersActivity3.h0(tL_messages_stickerSet3));
                                                            stickersActivity3.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                            return;
                                                        }
                                                    default:
                                                        stickersActivity.i0(stickersSet);
                                                        break;
                                                }
                                            }
                                        }, jb6.M0(2131744544, null), !stickersSet.set.official, true);
                                        I.V = nm7.T2;
                                        I.a0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    stickersActivity.n0(view);
                                    break;
                                default:
                                    stickersActivity.m0(view);
                                    break;
                            }
                        }
                    };
                    K2.u = arrayList3.contains(Long.valueOf(stickerSetCovered.set.id));
                    arrayList.add(K2);
                    b4 = 2;
                }
                if (z) {
                    c6c c = c6c.c(8, R.drawable.msg2_trending, jb6.M0(2131745072, null));
                    c.r = true;
                    arrayList.add(c);
                }
            }
            b2 = 5;
        } else {
            b2 = 5;
        }
        if (b3 == b2) {
            arrayList.add(c6c.C(c0(jb6.M0(b3 == b2 ? 2131751122 : 2131744555, null))));
        }
    }

    public final ArrayList g0() {
        hs6 d0 = hs6.d0(this.currentAccount);
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

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = cmb.c6;
        arrayList.add(new cnb(this.a, 16, new Class[]{s1b.class, vkb.class, bjb.class}, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.a, TLObject.FLAG_13, new Class[]{s1b.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, TLObject.FLAG_14, new Class[]{s1b.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        p3c p3cVar = this.c;
        if (p3cVar != null) {
            arrayList.addAll(p3cVar.R());
        }
        return arrayList;
    }

    public final String h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(oc7.r1(this.currentAccount).N2);
        sb.append("/");
        return String.format(locale, b10.j(sb, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final /* synthetic */ void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        hs6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final /* synthetic */ void j0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        hs6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, !tL_messages_stickerSet.set.archived ? 1 : 2, this, true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(int i, ArrayList arrayList) {
        final byte b;
        ArrayList[] arrayListArr;
        int i2;
        int i3;
        e0();
        final hs6 d0 = hs6.d0(this.currentAccount);
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
        long s = hs6.s(arrayListArr3[b]);
        jArr[b] = s;
        d0.M1(b, d0.Z[b], s, arrayListArr3[b]);
        nm7 notificationCenter = d0.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b);
        objArr[z ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(nm7.x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i8 == 0) {
            tL_messages_toggleStickerSets.uninstall = z;
        } else if (i8 == z) {
            tL_messages_toggleStickerSets.archive = z;
        }
        d0.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() { // from class: gp6
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final hs6 hs6Var = hs6.this;
                boolean z2 = i8;
                final StickersActivity stickersActivity = this;
                final byte b3 = b;
                final int i9 = z2 ? 1 : 0;
                gm.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        hs6 hs6Var2 = hs6.this;
                        boolean z3 = i9;
                        byte b4 = b3;
                        if (!z3) {
                            hs6Var2.b1(b4, false, true);
                            return;
                        }
                        TLObject tLObject2 = tLObject;
                        if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            hs6Var2.C1(stickersActivity, true, b4, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                        }
                        hs6Var2.c1(b4, false, false, true, null);
                    }
                });
            }
        });
    }

    public final void l0(c6c c6cVar, View view) {
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!this.x.isEmpty()) {
                r0((s1b) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                showDialog(new x2b(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            showDialog(new az3(this, getParentActivity(), getResourceProvider(), arrayList2));
        }
        boolean z = obj instanceof TLRPC.StickerSetCovered;
        byte b = this.s;
        if (z) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (b != 5) {
                showDialog(new x2b(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            showDialog(new az3(this, getParentActivity(), getResourceProvider(), arrayList3));
            return;
        }
        switch (c6cVar.d) {
            case 1:
            case 8:
                if (b == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList g0 = g0();
                    if (g0 != null) {
                        for (int i = 0; i < g0.size(); i++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g0.get(i);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    hs6.d0(this.currentAccount).e1(true, true);
                    showDialog(new az3(this, getParentActivity(), getResourceProvider(), arrayList4));
                    break;
                } else {
                    p3c p3cVar = new p3c(getParentActivity(), this, new d4c(getParentActivity(), new f2b(this), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    this.c = p3cVar;
                    p3cVar.show();
                    break;
                }
            case 2:
                presentFragment(new ht(b));
                break;
            case 3:
                presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                presentFragment(new a39());
                break;
            case 5:
                bu5 I = bu5.I(this, view);
                I.h(new ud(view, (byte) 7), jb6.M0(2131744086, null), gda.D == 0);
                I.h(new ud(view, (byte) 8), jb6.M0(2131744085, null), gda.D == 1);
                I.h(new ud(view, (byte) 9), jb6.M0(2131744084, null), gda.D == 2);
                I.a0();
                break;
            case 6:
                gda.P0 = !gda.P0;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("allowBigEmoji", gda.P0);
                edit.apply();
                ((bjb) view).setChecked(gda.P0);
                break;
            case 7:
                gda.N();
                ((bjb) view).setChecked(gda.W);
                break;
            case 9:
                gda.E = !gda.E;
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", gda.E);
                edit2.apply();
                ((bjb) view).setChecked(gda.E);
                break;
        }
    }

    public final void m0(View view) {
        r94 r94Var = (r94) view.getParent();
        TLRPC.StickerSetCovered stickerSet = r94Var.getStickerSet();
        Long valueOf = Long.valueOf(stickerSet.set.id);
        ArrayList arrayList = this.f;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        r94Var.f.a(true, true);
        boolean z = r94Var.w;
        int i = this.currentAccount;
        if (z) {
            hs6.d0(i).h2(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            hs6.d0(i).h2(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void n0(View view) {
        s1b s1bVar;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r12;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof s1b) || (stickersSet = (s1bVar = (s1b) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i = 0;
        if (s1bVar.E != view) {
            if (s1bVar.F == view) {
                hs6.d0(this.currentAccount).h2(getParentActivity(), stickersSet, 0, this, false, true);
                return;
            } else {
                if (s1bVar.G == view) {
                    showDialog(new kj8((org.telegram.ui.ActionBar.d) this, 11, false));
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
        hs6.d0(this.currentAccount).h2(getParentActivity(), r12 == 0 ? stickersSet : r12, 2, this, false, false);
    }

    public final void o0(int i) {
        StickersActivity stickersActivity;
        String M0;
        TextView textView;
        byte b = 16;
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
                    sb.append(h0(tL_messages_stickerSet));
                }
            }
            String sb2 = sb.toString();
            tca G0 = tca.G0(this.fragmentView.getContext(), null, sb2, false, sb2);
            G0.n2 = new x59(this, b);
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
                        alertDialog$Builder.a.S = jb6.a0(null, null, 2131751431, jb6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = jb6.a0(null, null, 2131751430, Integer.valueOf(size3));
                        M0 = jb6.M0(2131751535, null);
                    } else {
                        alertDialog$Builder.a.S = jb6.a0(null, null, 2131754107, jb6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = jb6.a0(null, null, 2131754106, Integer.valueOf(size3));
                        M0 = jb6.M0(2131754137, null);
                    }
                    alertDialog$Builder.j(M0, new yg(this, arrayList, i, (byte) 16));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    he heVar = alertDialog$Builder.a;
                    showDialog(heVar);
                    if (i != 1 || (textView = (TextView) heVar.c(-1)) == null) {
                        return;
                    }
                    anb.X(textView, cmb.p7, null);
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
                        hs6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity, true, true);
                    } else {
                        stickersActivity = this;
                        if (i == 1) {
                            hs6.d0(stickersActivity.currentAccount).h2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                        } else if (i == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity.h0(tL_messages_stickerSet3));
                                stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                        } else if (i == 3) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.h0(tL_messages_stickerSet3)));
                                c41.j(stickersActivity).j();
                            } catch (Exception e2) {
                                fc4.g(e2, true);
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
                            stickersActivity.d0();
                        }
                    }
                }
                stickersActivity.e0();
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
        e0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        hs6 d0 = hs6.d0(this.currentAccount);
        byte b = this.s;
        d0.D(b);
        if (b == 0) {
            hs6.d0(this.currentAccount).z();
            hs6.d0(this.currentAccount).D(1);
            hs6.d0(this.currentAccount).D(5);
        } else if (b == 6) {
            hs6.d0(this.currentAccount).y();
            nm7.f(this.currentAccount).b(this, nm7.A0);
        }
        nm7.f(this.currentAccount).b(this, nm7.x0);
        nm7.f(this.currentAccount).b(this, nm7.Z0);
        nm7.f(this.currentAccount).b(this, nm7.z0);
        nm7.f(this.currentAccount).b(this, nm7.j5);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            nm7.f(this.currentAccount).n(this, nm7.A0);
        }
        nm7.f(this.currentAccount).n(this, nm7.x0);
        nm7.f(this.currentAccount).n(this, nm7.Z0);
        nm7.f(this.currentAccount).n(this, nm7.z0);
        nm7.f(this.currentAccount).n(this, nm7.j5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        q7c q7cVar = this.a;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
    }

    public final void p0() {
        if (this.r) {
            this.r = false;
            hs6 d0 = hs6.d0(this.currentAccount);
            long[] jArr = d0.Y;
            ArrayList[] arrayListArr = d0.H;
            byte b = this.s;
            jArr[b] = hs6.s(arrayListArr[b]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = b == 1;
            tL_messages_reorderStickerSets.emojis = b == 5;
            int i = 0;
            while (i < this.d.size()) {
                i = mle.c(i, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new go9(this, (byte) 6));
            nm7.f(this.currentAccount).k(nm7.x0, Integer.valueOf(b), Boolean.TRUE);
            if (gda.W) {
                gda.N();
                c41.b0(this).I(R.raw.filter_reorder, jb6.M0(2131751274, null), jb6.M0(2131751273, null)).j();
                this.a.g3.O(true);
            }
        }
    }

    public final void q0(View view) {
        if (view instanceof vkb) {
            vkb vkbVar = (vkb) view;
            String S = hs6.d0(this.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        vm m = vm.m(this.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m.b(vkbVar.getValueBackupImageView());
                        vkbVar.getValueBackupImageView().setImageDrawable(m);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.currentAccount).r.get(S);
                if (tL_availableReaction != null) {
                    vkbVar.getValueBackupImageView().getImageReceiver().d0(gn5.b(tL_availableReaction.center_icon), "100_100_lastreactframe", eq3.d(tL_availableReaction.static_icon.thumbs, cmb.Z6, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public final void r0(s1b s1bVar) {
        TLRPC.TL_messages_stickerSet stickersSet = s1bVar.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            s1bVar.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            s1bVar.b(true, true);
        }
        this.a.g3.O(true);
        d0();
    }

    public final void s0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((c6c) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.d = arrayList2;
        this.r = true;
        Collections.sort(hs6.d0(this.currentAccount).t0(this.s), new i01(this, (byte) 7));
        b2b b2bVar = this.y;
        gm.r(b2bVar);
        gm.d3(b2bVar, 1000L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
