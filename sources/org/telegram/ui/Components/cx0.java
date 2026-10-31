package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class cx0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final /* synthetic */ int n2 = 0;
    public final View[] A1;
    public jg.l0 B1;
    public final org.telegram.ui.ActionBar.k2 C1;
    public oi D1;
    public final Activity E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public TLRPC.TL_messages_stickerSet J1;
    public TLRPC.Document K1;
    public org.telegram.messenger.jz L1;
    public TLRPC.InputStickerSet M1;
    public ArrayList N1;
    public final ArrayList O1;
    public ArrayList P1;
    public HashMap Q1;
    public final String R1;
    public final zw0 S1;
    public ax0 T1;
    public org.telegram.ui.f60 U1;
    public int V1;
    public int W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean a2;
    public int b2;
    public final j2.f c2;
    public final rw0 d2;
    public jg e2;
    public String f2;
    public int g2;
    public boolean h2;
    public Pattern i1;
    public String i2;
    public ag.b1 j1;
    public Runnable j2;
    public yw0 k1;
    public ArrayList k2;
    public s4.x l1;
    public int l2;
    public TLRPC.Document m1;
    public int m2;
    public p80 n1;
    public org.telegram.ui.ActionBar.t0 o1;
    public org.telegram.ui.ActionBar.b1 p1;
    public f6 q1;
    public kg.x0 r1;
    public FrameLayout s1;
    public FrameLayout t1;
    public TextView u1;
    public View v1;
    public g9 w1;
    public TextView x1;
    public k y1;
    public final AnimatorSet[] z1;

    public cx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.c2 = new j2.f(6);
        this.d2 = new rw0(this);
        this.I0 = p6Var;
        O();
        this.E1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) this;
        this.W1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new org.telegram.ui.mb(zp0Var, obj, tL_messages_getAttachedStickers, new t20(5, zp0Var, tL_messages_getAttachedStickers), 3));
        P0(context);
    }

    public static void I0(cx0 cx0Var) {
        if (cx0Var.j1.getChildCount() <= 0) {
            cx0Var.W0(cx0Var.j1.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < cx0Var.j1.getChildCount(); i12++) {
            View childAt = cx0Var.j1.getChildAt(i12);
            cx0Var.j1.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            cx0Var.T0(0, true);
        } else {
            int top = view.getTop();
            cx0Var.T0(0, false);
            i10 = top;
        }
        cx0Var.T0(1, true);
        if (cx0Var.V1 != i10) {
            cx0Var.W0(i10);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (k2Var == null) {
            return;
        }
        org.telegram.ui.un unVar = k2Var instanceof org.telegram.ui.un ? (org.telegram.ui.un) k2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (document == null || !document.mime_type.equals("image/webp")) {
            org.telegram.messenger.i0.h3(new ag.n0(k2Var, tL_messages_stickerSet, document, unVar, z10, 10), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.b8.G(org.telegram.messenger.d20.s0);
        File K = org.telegram.messenger.b8.K(document, null, true, true);
        if (K == null || !K.exists()) {
            return;
        }
        org.telegram.messenger.i0.h3(new ag.p1(K, arrayList, k2Var, unVar, document, z10, tL_messages_stickerSet), 300L);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l5));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void J0() {
        if (this.J1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.vp.r1(this.a).x0(this.J1);
            this.J1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.cd.L0(2131749244, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.w6, this.I0);
            this.h2 = true;
            this.f2 = str;
            return;
        }
        jg jgVar = this.e2;
        if (jgVar != null) {
            org.telegram.messenger.i0.r(jgVar);
            this.e2 = null;
            this.f2 = null;
            if (this.g2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.g2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.cd.L0(2131749246, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q5, this.I0);
            return;
        }
        this.h2 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(org.telegram.messenger.cd.L0(2131749242, null));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p7, this.I0);
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(org.telegram.messenger.cd.L0(2131749246, null));
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p7, this.I0);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(org.telegram.messenger.cd.L0(2131749240, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p7, this.I0);
        } else {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.cd.L0(2131749241, null));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p7, this.I0);
                return;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131749243, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.F6, this.I0);
            this.f2 = str;
            jg jgVar2 = new jg(this, str, textView, 28);
            this.e2 = jgVar2;
            org.telegram.messenger.i0.h3(jgVar2, 300L);
        }
    }

    public final void L0() {
        if (this.I1) {
            this.l1.h(null);
            this.I1 = false;
            this.c2.E(true);
            org.telegram.messenger.i0.d0(this.j1, new ag.z0(13));
            this.o1.postDelayed(new mw0(this, 0), 200L);
            this.q1.c(org.telegram.messenger.cd.L0(2131751222, null), true, true);
        }
    }

    public final void N0() {
        if (this.I1) {
            return;
        }
        this.l1.h(this.j1);
        int i10 = 1;
        this.I1 = true;
        j2.f fVar = this.c2;
        boolean z10 = false;
        fVar.E(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) fVar.d;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < 6; i11++) {
                arrayList.add(valueOf);
                ((ArrayList) fVar.e).add(valueOf);
                ((ArrayList) fVar.f).add(valueOf);
            }
        }
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            long nextFloat = (long) (Utilities.b.nextFloat() * org.telegram.messenger.zs.X4);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new bx0(fVar, i12, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = org.telegram.messenger.zs.X4;
            ofFloat.setDuration(j10);
            ofFloat.start();
            boolean z11 = z10;
            float L = org.telegram.messenger.i0.L(0.5f);
            float f10 = f7;
            float[] fArr = new float[5];
            fArr[z11 ? 1 : 0] = f10;
            fArr[1] = L;
            fArr[2] = f10;
            fArr[3] = -L;
            fArr[4] = f10;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new bx0(fVar, i12, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (org.telegram.messenger.zs.X4 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[z11 ? 1 : 0] = f10;
            fArr2[1] = L;
            fArr2[2] = f10 - L;
            fArr2[3] = f10;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new bx0(fVar, i12, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) fVar.a).add(ofFloat);
            ((ArrayList) fVar.b).add(ofFloat2);
            ((ArrayList) fVar.c).add(ofFloat3);
            i12++;
            f7 = f10;
            z10 = z11 ? 1 : 0;
        }
        org.telegram.messenger.i0.d0(this.j1, new ag.z0(14));
        this.o1.postDelayed(new mw0(this, i10), 200L);
        this.q1.c(org.telegram.messenger.cd.L0(2131751355, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.t1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new t60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        uw0 uw0Var = new uw0(this, context);
        this.b = uw0Var;
        uw0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i10 = this.t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.A1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.t6.V5;
        org.telegram.ui.ActionBar.a7.i(i11, view, this.I0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        ag.b1 b1Var = new ag.b1(this, context, 22);
        this.j1 = b1Var;
        b1Var.setTag(14);
        ag.b1 b1Var2 = this.j1;
        getContext();
        oi oiVar = new oi(this);
        this.D1 = oiVar;
        b1Var2.setLayoutManager(oiVar);
        int i12 = 6;
        this.D1.O = new jg.h1(this, i12);
        this.l1 = new s4.x(new vw0(this));
        ag.b1 b1Var3 = this.j1;
        yw0 yw0Var = new yw0(this, context);
        this.k1 = yw0Var;
        b1Var3.setAdapter(yw0Var);
        this.j1.setVerticalScrollBarEnabled(false);
        this.j1.i(new dh.g(9));
        this.j1.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.j1.setClipToPadding(false);
        this.j1.setEnabled(true);
        org.telegram.ui.ActionBar.a7.I(this.j1, org.telegram.ui.ActionBar.t6.A5, this.I0);
        this.j1.setOnTouchListener(new bk(this, i12));
        this.j1.setOnScrollListener(new bu0(this, 3));
        k kVar = new k(this, 16);
        this.y1 = kVar;
        this.j1.setOnItemClickListener(kVar);
        this.b.addView(this.j1, w7.b6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        jg.l0 l0Var = new jg.l0(this, context, 26);
        this.B1 = l0Var;
        this.b.addView(l0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.j1.setEmptyView(this.B1);
        this.B1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(23));
        p80 p80Var = new p80(context, null);
        this.n1 = p80Var;
        p80Var.setLines(1);
        this.n1.setSingleLine(true);
        org.telegram.ui.ActionBar.a7.V(this.n1, org.telegram.ui.ActionBar.t6.j5, this.I0);
        this.n1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.H(this.n1, org.telegram.ui.ActionBar.t6.k5, this.I0);
        this.n1.setEllipsize(TextUtils.TruncateAt.END);
        this.n1.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f));
        this.n1.setGravity(16);
        this.n1.setTypeface(org.telegram.messenger.i0.o());
        this.b.addView(this.n1, w7.b6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xj, this.I0), false, this.I0);
        this.o1 = t0Var;
        t0Var.setLongClickEnabled(false);
        this.o1.setSubMenuOpenSide(2);
        this.o1.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.t0 t0Var2 = this.o1;
        int i13 = org.telegram.ui.ActionBar.t6.Bj;
        org.telegram.ui.ActionBar.a7.R(t0Var2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i13), this.I0);
        this.b.addView(this.o1, w7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.o1.e(1, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131744864, null));
        this.o1.e(2, R.drawable.msg_link, org.telegram.messenger.cd.L0(2131751762, null));
        this.o1.setOnClickListener(new kw0(this, 1));
        this.o1.setDelegate(new lw0(this));
        this.o1.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        this.o1.setVisibility(this.M1 != null ? 0 : 8);
        this.B1.addView(new RadialProgressView(context, null), w7.b6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.i0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.a7.i(i11, view2, this.I0);
        this.b.addView(viewArr[1], layoutParams2);
        f6 f6Var = new f6(context, false, false, false);
        this.q1 = f6Var;
        int i14 = org.telegram.ui.ActionBar.t6.h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i14, this.I0);
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(w02, org.telegram.ui.ActionBar.t6.w0(i15, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        f6Var.setBackground(i02);
        org.telegram.ui.ActionBar.a7.k(f6Var, i02, N, N2, p6Var);
        f6 f6Var2 = this.q1;
        int i16 = org.telegram.ui.ActionBar.t6.n5;
        this.b2 = i16;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i16, this.I0);
        this.q1.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.q1.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        this.q1.setTypeface(org.telegram.messenger.i0.o());
        this.q1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.s1 = frameLayout;
        frameLayout.addView(this.q1, w7.b6.c(48.0f, -1));
        this.b.addView(this.s1, w7.b6.e(-1, -2, 83));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(24.0f), context, this.I0, false);
        this.r1 = x0Var;
        x0Var.setIcon(R.raw.unlock_icon);
        this.r1.setVisibility(4);
        this.b.addView(this.r1, w7.b6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.t1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.t1.setSoundEffectsEnabled(false);
        this.b.addView(this.t1, w7.b6.c(-1.0f, -1));
        this.t1.setOnClickListener(new kw0(this, 2));
        g9 g9Var = new g9(context);
        this.w1 = g9Var;
        g9Var.setAspectFit(true);
        this.w1.setLayerNum(7);
        this.t1.addView(this.w1);
        TextView textView = new TextView(context);
        this.x1 = textView;
        textView.setTextSize(1, 30.0f);
        this.x1.setGravity(85);
        this.t1.addView(this.x1);
        TextView textView2 = new TextView(context);
        this.u1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(this.u1, i16, this.I0);
        org.telegram.ui.ActionBar.a7.R(this.u1, org.telegram.ui.ActionBar.t6.i0(org.telegram.ui.ActionBar.t6.w0(i14, this.I0), org.telegram.ui.ActionBar.t6.w0(i15, this.I0)), org.telegram.ui.ActionBar.a7.N(i14), org.telegram.ui.ActionBar.a7.N(i15), this.I0);
        this.u1.setGravity(17);
        this.u1.setPadding(org.telegram.messenger.i0.L(29.0f), 0, org.telegram.messenger.i0.L(29.0f), 0);
        this.u1.setTypeface(org.telegram.messenger.i0.o());
        this.t1.addView(this.u1, w7.b6.e(-1, 48, 83));
        this.u1.setOnClickListener(new kw0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.i0.L(48.0f);
        View view3 = new View(context);
        this.v1 = view3;
        org.telegram.ui.ActionBar.a7.i(i11, view3, this.I0);
        this.t1.addView(this.v1, layoutParams3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        if (this.O1 != null) {
            org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.U1);
            org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.V1);
        }
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.k1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.H1;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.M1 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
            if (this.J1 == null && (str = this.M1.short_name) != null) {
                this.J1 = b02.p0(str);
            }
            if (this.J1 == null) {
                this.J1 = b02.o0(this.M1.id);
            }
            if (this.J1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.M1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new t20(4, this, b02));
            } else {
                if (this.k1 != null) {
                    a1();
                    Z0();
                    this.k1.f();
                }
                Y0();
                b02.q1(this.J1);
                J0();
            }
        }
        if (this.J1 != null) {
            this.Y1 = !r0.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.jz jzVar) {
        int indexOf = this.P1.indexOf(jzVar);
        if (indexOf >= 0) {
            this.P1.remove(indexOf);
            this.k1.s(indexOf);
            if (this.P1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i10, boolean z10) {
        if (this.N1 != null) {
            return;
        }
        View[] viewArr = this.A1;
        if ((!z10 || viewArr[i10].getTag() == null) && (z10 || viewArr[i10].getTag() != null)) {
            return;
        }
        viewArr[i10].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[i10].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.z1;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i10], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new qw0(this, i10, z10));
        animatorSetArr[i10].start();
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i10) {
        V0(onClickListener, str, i10, -1, -1);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        o6 o6Var = new o6(this, 6);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.r0};
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        if (this.k1.r.N1 != null) {
            org.telegram.ui.Cells.w3.a(arrayList, o6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.o1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.q1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        f6 f6Var = this.q1;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(f6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.q1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.b2));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.u1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            f6 f6Var = this.q1;
            this.b2 = i10;
            org.telegram.ui.ActionBar.a7.Z(f6Var, i10, this.I0);
        }
        this.q1.c(str, false, true);
        this.q1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.j1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.B1.getLayoutParams();
        if (onClickListener == null) {
            this.q1.setAlpha(0.0f);
        } else if (i11 < 0 || i12 < 0) {
            f6 f6Var2 = this.q1;
            int i13 = org.telegram.ui.ActionBar.t6.h5;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i13, this.I0);
            int i14 = org.telegram.ui.ActionBar.t6.q7;
            org.telegram.ui.ActionBar.a7.R(f6Var2, org.telegram.ui.ActionBar.t6.i0(w02, org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i14, this.I0))), org.telegram.ui.ActionBar.a7.N(i13), org.telegram.ui.ActionBar.a7.L(0.1f, i14), this.I0);
            this.s1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L = org.telegram.messenger.i0.L(48.0f);
            marginLayoutParams2.bottomMargin = L;
            marginLayoutParams3.bottomMargin = L;
            marginLayoutParams4.bottomMargin = L;
            if (this.q1.getAlpha() < 1.0f) {
                org.telegram.messenger.z20.m(this.q1.animate().alpha(1.0f), gr.h, 240L);
            }
        } else {
            f6 f6Var3 = this.q1;
            int L2 = org.telegram.messenger.i0.L(24.0f);
            int w03 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
            int w04 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
            org.telegram.ui.ActionBar.a7.R(f6Var3, org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, w03, w04, w04), org.telegram.ui.ActionBar.a7.N(i11), org.telegram.ui.ActionBar.a7.N(i12), this.I0);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, this.s1, this.I0);
            int L3 = org.telegram.messenger.i0.L(8.0f);
            marginLayoutParams.bottomMargin = L3;
            marginLayoutParams.rightMargin = L3;
            marginLayoutParams.topMargin = L3;
            marginLayoutParams.leftMargin = L3;
            int L4 = org.telegram.messenger.i0.L(64.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.q1.getAlpha() < 1.0f) {
                org.telegram.messenger.z20.m(this.q1.animate().alpha(1.0f), gr.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void W0(int i10) {
        this.V1 = i10;
        if (this.N1 == null) {
            float f7 = i10;
            this.n1.setTranslationY(f7);
            if (this.O1 == null) {
                this.o1.setTranslationY(f7);
            }
            this.A1[0].setTranslationY(f7);
        }
        this.b.invalidate();
    }

    public final void X0(boolean z10) {
        this.k1.getClass();
        this.n1.setHighlightColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.l5, this.I0));
        this.t1.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0) & (-536870913));
        this.o1.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xj, this.I0));
        this.o1.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.I0), false);
        this.o1.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.I0), true);
        this.o1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I5, this.I0));
        this.o1.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.I0));
        if (this.p1 != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, this.I0);
            this.p1.d(w02, w02);
            this.p1.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            if (this.p1.getRightIcon() != null && w02 != this.l2) {
                this.l2 = w02;
                this.p1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.t6.h1() && this.k2 == null) {
                ArrayList V = V();
                this.k2 = V;
                int size = V.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.c7) this.k2.get(i10)).g = null;
                }
            }
            int size2 = this.k2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) this.k2.get(i11);
                c7Var.e(org.telegram.ui.ActionBar.t6.w0(c7Var.e, this.I0), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.t6.h1() || this.k2 == null) {
            return;
        }
        this.k2 = null;
    }

    public final void Y0() {
        if (this.b == null || org.telegram.messenger.d20.i(this.a).q()) {
            return;
        }
        org.telegram.messenger.jj.V3(this.J1);
    }

    public final void Z0() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String G;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        if (this.n1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        int i10 = 1;
        int i11 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.O1;
            if (arrayList3 == null) {
                U0(new kw0(this, 14), org.telegram.messenger.cd.L0(2131752041, null), org.telegram.ui.ActionBar.t6.n5);
                return;
            }
            p80 p80Var = this.n1;
            ArrayList arrayList4 = this.P1;
            p80Var.setText(org.telegram.messenger.cd.G(arrayList4 != null ? arrayList4.size() : arrayList3.size(), "Stickers", new Object[0]));
            HashMap hashMap = this.Q1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.cd.L0(2131749238, null), org.telegram.ui.ActionBar.t6.q5);
                this.q1.setEnabled(false);
                return;
            } else {
                kw0 kw0Var = new kw0(this, 13);
                ArrayList arrayList5 = this.P1;
                U0(kw0Var, org.telegram.messenger.cd.a0("ImportStickers", null, 2131749251, org.telegram.messenger.cd.G(arrayList5 != null ? arrayList5.size() : arrayList3.size(), "Stickers", new Object[0])), org.telegram.ui.ActionBar.t6.n5);
                this.q1.setEnabled(true);
                return;
            }
        }
        CharSequence m10 = org.telegram.messenger.k6.m(this.J1.set.title, this.n1.getPaint().getFontMetricsInt(), false, null, 0);
        try {
            if (this.i1 == null) {
                this.i1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
            }
            Matcher matcher = this.i1.matcher(m10);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(m10);
                }
                int start = matcher.start();
                int end = matcher.end();
                if (this.J1.set.title.charAt(start) != '@') {
                    start++;
                }
                spannableStringBuilder.setSpan(new f4(m10.subSequence(start + 1, end).toString(), i10, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                m10 = spannableStringBuilder;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.n1.setText(m10);
        int i12 = 5;
        if (Q0()) {
            int measuredWidth = this.j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.q.x;
            }
            this.k1.d = Math.max(1, measuredWidth / org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 60.0f : 45.0f));
        } else {
            this.k1.d = 5;
        }
        this.D1.y1(this.k1.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.J1;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || org.telegram.messenger.d20.i(this.a).q() || this.U1 != null) {
            this.r1.setVisibility(4);
        } else if (this.J1.documents != null) {
            for (int i13 = 0; i13 < this.J1.documents.size(); i13++) {
                if (!org.telegram.messenger.jj.m3(this.J1.documents.get(i13))) {
                    this.r1.setVisibility(0);
                    this.q1.setBackground(null);
                    U0(null, null, -1);
                    this.r1.b(org.telegram.messenger.cd.L0(2131743890, null), new kw0(this, i11), false);
                    return;
                }
            }
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.J1;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z10 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !b02.B0(stickerSet.id, true);
        } else {
            ArrayList s02 = b02.s0(5);
            for (int i14 = 0; s02 != null && i14 < s02.size(); i14++) {
                if (s02.get(i14) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i14)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i14)).set.id == this.J1.set.id) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            z10 = !z11;
        }
        org.telegram.ui.f60 f60Var = this.U1;
        if (f60Var != null) {
            kw0 kw0Var2 = new kw0(this, i12);
            boolean z12 = f60Var.a;
            String L0 = f60Var.c.N ? org.telegram.messenger.cd.L0(z12 ? 2131746325 : 2131745561, null) : org.telegram.messenger.cd.L0(z12 ? 2131746324 : 2131745560, null);
            boolean z13 = this.U1.a;
            V0(kw0Var2, L0, z13 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.Gi, !z13 ? org.telegram.ui.ActionBar.t6.Ci : -1, z13 ? -1 : org.telegram.ui.ActionBar.t6.Ei);
            return;
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.J1;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i10 = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i10 = 0;
            }
            if (!b02.W[i10]) {
                b02.B(i10);
                V0(null, "", -1, -1, -1);
                return;
            }
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.J1;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.cd.G(arrayList6 == null ? 0 : arrayList6.size(), "AddManyMasksCount", new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                G = org.telegram.messenger.cd.G((tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), "AddManyStickersCount", new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.cd.G(arrayList7 == null ? 0 : arrayList7.size(), "AddManyEmojiCount", new Object[0]);
            }
            V0(new kw0(this, 9), G, org.telegram.ui.ActionBar.t6.Gi, org.telegram.ui.ActionBar.t6.Ci, org.telegram.ui.ActionBar.t6.Ei);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.J1;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            String L02 = z14 ? org.telegram.messenger.cd.L0(this.I1 ? 2131751355 : 2131751222, null) : stickerSet8.masks ? org.telegram.messenger.cd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]) : stickerSet8.emojis ? org.telegram.messenger.cd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.cd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
            if (z14) {
                V0(new kw0(this, 10), L02, org.telegram.ui.ActionBar.t6.Gi, org.telegram.ui.ActionBar.t6.Ci, org.telegram.ui.ActionBar.t6.Ei);
            } else if (this.J1.set.official) {
                U0(new kw0(this, 11), L02, org.telegram.ui.ActionBar.t6.q7);
            } else {
                U0(new kw0(this, 12), L02, org.telegram.ui.ActionBar.t6.q7);
            }
        }
        this.k1.f();
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.i0.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.i0.p);
        if (this.O1 != null) {
            this.u1.setText(org.telegram.messenger.cd.L0(2131749237, null));
            org.telegram.ui.ActionBar.a7.V(this.u1, org.telegram.ui.ActionBar.t6.q7, this.I0);
            float f7 = min;
            this.w1.setLayoutParams(w7.b6.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.x1.setLayoutParams(w7.b6.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.u1.setVisibility(0);
            this.v1.setVisibility(0);
            return;
        }
        if (this.S1 == null || ((tL_messages_stickerSet = this.J1) != null && tL_messages_stickerSet.set.masks)) {
            this.u1.setText(org.telegram.messenger.cd.L0(2131752041, null));
            this.w1.setLayoutParams(w7.b6.e(min, min, 17));
            this.x1.setLayoutParams(w7.b6.e(min, min, 17));
            this.u1.setVisibility(8);
            this.v1.setVisibility(8);
            return;
        }
        this.u1.setText(org.telegram.messenger.cd.L0(2131745606, null));
        float f10 = min;
        this.w1.setLayoutParams(w7.b6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.x1.setLayoutParams(w7.b6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.u1.setVisibility(0);
        this.v1.setVisibility(0);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            ag.b1 b1Var = this.j1;
            if (b1Var != null) {
                int childCount = b1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.j1.getChildAt(i12).invalidate();
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.U1) {
            HashMap hashMap = this.Q1;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) hashMap.get(str);
            if (jzVar != null) {
                jzVar.a(this.a, (TLRPC.InputFile) objArr[1], new jg(this, str, jzVar, 25));
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.V1) {
            HashMap hashMap2 = this.Q1;
            if (hashMap2 == null) {
                return;
            }
            org.telegram.messenger.jz jzVar2 = (org.telegram.messenger.jz) hashMap2.remove((String) objArr[0]);
            if (jzVar2 != null) {
                S0(jzVar2);
            }
            if (this.Q1.isEmpty()) {
                Z0();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.x0) {
            if (this.M1 != null) {
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
                String str2 = this.M1.short_name;
                r5 = str2 != null ? b02.p0(str2) : null;
                if (r5 == null) {
                    r5 = b02.o0(this.M1.id);
                }
            }
            if (r5 != null && r5 != this.J1) {
                this.J1 = r5;
                R0();
            }
            Z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public void dismiss() {
        super.dismiss();
        this.c2.E(false);
        Runnable runnable = this.j2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.W1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.W1, true);
            this.W1 = 0;
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        if (this.O1 != null) {
            ArrayList arrayList = this.P1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) this.P1.get(i10);
                    if (!jzVar.c) {
                        org.telegram.messenger.b8.G(this.a).b(jzVar.a, false);
                    }
                    if (jzVar.e) {
                        new File(jzVar.a).delete();
                    }
                }
            }
            org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.U1);
            org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.V1);
        }
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.x0);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 4);
    }

    @Override // org.telegram.ui.ActionBar.z2, org.telegram.ui.ActionBar.g2
    public final void o(Runnable runnable) {
        this.j2 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.lt.p().E) {
            org.telegram.ui.lt.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        wb.a((FrameLayout) this.b, new k7(this, 4));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        wb.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0);
            if (this.r0 != null && w02 != this.m2) {
                this.m2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 4);
    }

    public cx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.p6) null, false);
        this.z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.c2 = new j2.f(6);
        this.d2 = new rw0(this);
        O();
        this.E1 = (Activity) context;
        this.O1 = arrayList;
        this.R1 = str;
        Utilities.e.c(new jg(this, arrayList, arrayList2, 29));
        P0(context);
    }

    public cx0(Context context, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, zw0 zw0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.c2 = new j2.f(6);
        this.d2 = new rw0(this);
        O();
        this.S1 = zw0Var;
        this.M1 = inputStickerSet;
        this.J1 = tL_messages_stickerSet;
        this.C1 = k2Var;
        R0();
        P0(context);
    }
}
