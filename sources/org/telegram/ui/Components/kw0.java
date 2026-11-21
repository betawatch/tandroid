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
import java.io.Serializable;
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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class kw0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public static final /* synthetic */ int r2 = 0;
    public q9 A1;
    public TextView B1;
    public o C1;
    public final AnimatorSet[] D1;
    public final View[] E1;
    public bi.e3 F1;
    public final org.telegram.ui.ActionBar.g2 G1;
    public gi.g H1;
    public final Activity I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public TLRPC.TL_messages_stickerSet N1;
    public TLRPC.Document O1;
    public org.telegram.messenger.sy P1;
    public TLRPC.InputStickerSet Q1;
    public ArrayList R1;
    public final ArrayList S1;
    public ArrayList T1;
    public HashMap U1;
    public final String V1;
    public final hw0 W1;
    public iw0 X1;
    public org.telegram.ui.i50 Y1;
    public int Z1;
    public int a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public boolean e2;
    public int f2;
    public final a8.b8 g2;
    public final zv0 h2;
    public es0 i2;
    public String j2;
    public int k2;
    public boolean l2;
    public Pattern m1;
    public String m2;
    public di.b1 n1;
    public Runnable n2;
    public gw0 o1;
    public ArrayList o2;
    public v4.z p1;
    public int p2;
    public TLRPC.Document q1;
    public int q2;
    public m80 r1;
    public org.telegram.ui.ActionBar.q0 s1;
    public org.telegram.ui.ActionBar.y0 t1;
    public o6 u1;
    public ug.r0 v1;
    public FrameLayout w1;
    public FrameLayout x1;
    public TextView y1;
    public View z1;

    public kw0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.e2 = true;
        this.g2 = new a8.b8(6);
        this.h2 = new zv0(this);
        this.J0 = h6Var;
        O();
        this.I1 = (Activity) context;
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
        org.telegram.ui.qo0 qo0Var = (org.telegram.ui.qo0) this;
        this.a2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.k2(qo0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.u7(23, qo0Var, tL_messages_getAttachedStickers), 13));
        Q0(context);
    }

    public static void J0(kw0 kw0Var) {
        if (kw0Var.n1.getChildCount() <= 0) {
            kw0Var.X0(kw0Var.n1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < kw0Var.n1.getChildCount(); i11++) {
            View childAt = kw0Var.n1.getChildAt(i11);
            kw0Var.n1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            kw0Var.U0(0, true);
        } else {
            int top = view.getTop();
            kw0Var.U0(0, false);
            i7 = top;
        }
        kw0Var.U0(1, true);
        if (kw0Var.Z1 != i7) {
            kw0Var.X0(i7);
        }
    }

    public static void N0(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (g2Var == null) {
            return;
        }
        org.telegram.ui.bn bnVar = g2Var instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) g2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (document == null || !document.mime_type.equals("image/webp")) {
            org.telegram.messenger.g0.h3(new ai.i(g2Var, tL_messages_stickerSet, document, bnVar, z10, 11), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.w7.G(org.telegram.messenger.j10.t0);
        File J = org.telegram.messenger.w7.J(document, null, true, true);
        if (J == null || !J.exists()) {
            return;
        }
        org.telegram.messenger.g0.h3(new kg.q0(J, arrayList, g2Var, bnVar, document, z10, tL_messages_stickerSet), 300L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l5));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void K0() {
        if (this.N1 != null) {
            TLRPC.TL_messages_stickerSet z02 = org.telegram.messenger.mp.u1(this.a).z0(this.N1);
            this.N1 = z02;
            if (z02 == null) {
                dismiss();
            }
        }
    }

    public final void L0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.gd.N0(2131749042, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.w6, this.J0);
            this.l2 = true;
            this.j2 = str;
            return;
        }
        es0 es0Var = this.i2;
        if (es0Var != null) {
            org.telegram.messenger.g0.r(es0Var);
            this.i2 = null;
            this.j2 = null;
            if (this.k2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.k2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.gd.N0(2131749044, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q5, this.J0);
            return;
        }
        this.l2 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(org.telegram.messenger.gd.N0(2131749040, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.J0);
                return;
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(org.telegram.messenger.gd.N0(2131749044, null));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.J0);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(org.telegram.messenger.gd.N0(2131749038, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.J0);
        } else {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.gd.N0(2131749039, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.J0);
                return;
            }
            textView.setText(org.telegram.messenger.gd.N0(2131749041, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.F6, this.J0);
            this.j2 = str;
            es0 es0Var2 = new es0(this, str, textView, 4);
            this.i2 = es0Var2;
            org.telegram.messenger.g0.h3(es0Var2, 300L);
        }
    }

    public final void M0() {
        if (this.M1) {
            this.p1.h(null);
            this.M1 = false;
            this.g2.q(true);
            org.telegram.messenger.g0.d0(this.n1, new fi.e(15));
            this.s1.postDelayed(new vv0(this, 0), 200L);
            this.u1.c(org.telegram.messenger.gd.N0(2131751209, null), true, true);
        }
    }

    public final void O0() {
        if (this.M1) {
            return;
        }
        this.p1.h(this.n1);
        int i7 = 1;
        this.M1 = true;
        a8.b8 b8Var = this.g2;
        boolean z10 = false;
        b8Var.q(false);
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) b8Var.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) b8Var.e).add(valueOf);
                ((ArrayList) b8Var.f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = (long) (Utilities.b.nextFloat() * org.telegram.messenger.ks.X4);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new jw0(b8Var, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = org.telegram.messenger.ks.X4;
            ofFloat.setDuration(j3);
            ofFloat.start();
            boolean z11 = z10;
            float L = org.telegram.messenger.g0.L(0.5f);
            float f11 = f10;
            float[] fArr = new float[5];
            fArr[z11 ? 1 : 0] = f11;
            fArr[1] = L;
            fArr[2] = f11;
            fArr[3] = -L;
            fArr[4] = f11;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new jw0(b8Var, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (org.telegram.messenger.ks.X4 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[z11 ? 1 : 0] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new jw0(b8Var, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) b8Var.a).add(ofFloat);
            ((ArrayList) b8Var.b).add(ofFloat2);
            ((ArrayList) b8Var.c).add(ofFloat3);
            i11++;
            f10 = f11;
            z10 = z11 ? 1 : 0;
        }
        org.telegram.messenger.g0.d0(this.n1, new fi.e(16));
        this.s1.postDelayed(new vv0(this, i7), 200L);
        this.u1.c(org.telegram.messenger.gd.N0(2131751342, null), true, true);
    }

    public final void P0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new s60(this, 24));
        animatorSet.start();
    }

    public final void Q0(Context context) {
        cw0 cw0Var = new cw0(this, context);
        this.b = cw0Var;
        cw0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.u0;
        viewGroup.setPadding(i7, 0, i7, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.E1;
        viewArr[0] = view;
        int i10 = org.telegram.ui.ActionBar.m6.V5;
        org.telegram.ui.ActionBar.t6.h(i10, view, this.J0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        di.b1 b1Var = new di.b1(27, context, this);
        this.n1 = b1Var;
        b1Var.setTag(14);
        di.b1 b1Var2 = this.n1;
        getContext();
        gi.g gVar = new gi.g(this);
        this.H1 = gVar;
        b1Var2.setLayoutManager(gVar);
        this.H1.O = new bi.w2(this, 13);
        this.p1 = new v4.z(new dw0(this));
        di.b1 b1Var3 = this.n1;
        gw0 gw0Var = new gw0(this, context);
        this.o1 = gw0Var;
        b1Var3.setAdapter(gw0Var);
        this.n1.setVerticalScrollBarEnabled(false);
        this.n1.i(new fi.k(12));
        this.n1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setEnabled(true);
        org.telegram.ui.ActionBar.t6.H(this.n1, org.telegram.ui.ActionBar.m6.A5, this.J0);
        this.n1.setOnTouchListener(new qk(this, 6));
        this.n1.setOnScrollListener(new oa(this, 21));
        o oVar = new o(this, 16);
        this.C1 = oVar;
        this.n1.setOnItemClickListener(oVar);
        this.b.addView(this.n1, c8.ma.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.e3 e3Var = new bi.e3(28, context, this);
        this.F1 = e3Var;
        this.b.addView(e3Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.n1.setEmptyView(this.F1);
        this.F1.setOnTouchListener(new gi.a(25));
        m80 m80Var = new m80(context, null);
        this.r1 = m80Var;
        m80Var.setLines(1);
        this.r1.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(this.r1, org.telegram.ui.ActionBar.m6.j5, this.J0);
        this.r1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.G(this.r1, org.telegram.ui.ActionBar.m6.k5, this.J0);
        this.r1.setEllipsize(TextUtils.TruncateAt.END);
        this.r1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.r1.setGravity(16);
        this.r1.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.r1, c8.ma.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Aj, this.J0), false, this.J0);
        this.s1 = q0Var;
        q0Var.setLongClickEnabled(false);
        this.s1.setSubMenuOpenSide(2);
        this.s1.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.s1;
        int i11 = org.telegram.ui.ActionBar.m6.Ej;
        org.telegram.ui.ActionBar.t6.Q(q0Var2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, this.J0), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i11), this.J0);
        this.b.addView(this.s1, c8.ma.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.s1.e(1, R.drawable.msg_share, org.telegram.messenger.gd.N0(2131744605, null));
        this.s1.e(2, R.drawable.msg_link, org.telegram.messenger.gd.N0(2131751750, null));
        this.s1.setOnClickListener(new tv0(this, 1));
        this.s1.setDelegate(new uv0(this));
        this.s1.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        this.s1.setVisibility(this.Q1 != null ? 0 : 8);
        this.F1.addView(new RadialProgressView(context, null), c8.ma.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.t6.h(i10, view2, this.J0);
        this.b.addView(viewArr[1], layoutParams2);
        o6 o6Var = new o6(context, false, false, false);
        this.u1 = o6Var;
        int i12 = org.telegram.ui.ActionBar.m6.h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i12, this.J0);
        int i13 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(w02, org.telegram.ui.ActionBar.m6.w0(i13, this.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        o6Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(o6Var, i02, M, M2, h6Var);
        o6 o6Var2 = this.u1;
        int i14 = org.telegram.ui.ActionBar.m6.n5;
        this.f2 = i14;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i14, this.J0);
        this.u1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.u1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.u1.setTypeface(org.telegram.messenger.g0.o());
        this.u1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w1 = frameLayout;
        frameLayout.addView(this.u1, c8.ma.c(48.0f, -1));
        this.b.addView(this.w1, c8.ma.e(-1, -2, 83));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(24.0f), context, this.J0, false);
        this.v1 = r0Var;
        r0Var.setIcon(R.raw.unlock_icon);
        this.v1.setVisibility(4);
        this.b.addView(this.v1, c8.ma.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.x1.setSoundEffectsEnabled(false);
        this.b.addView(this.x1, c8.ma.c(-1.0f, -1));
        this.x1.setOnClickListener(new tv0(this, 2));
        q9 q9Var = new q9(context);
        this.A1 = q9Var;
        q9Var.setAspectFit(true);
        this.A1.setLayerNum(7);
        this.x1.addView(this.A1);
        TextView textView = new TextView(context);
        this.B1 = textView;
        textView.setTextSize(1, 30.0f);
        this.B1.setGravity(85);
        this.x1.addView(this.B1);
        TextView textView2 = new TextView(context);
        this.y1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.y1, i14, this.J0);
        org.telegram.ui.ActionBar.t6.Q(this.y1, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), org.telegram.ui.ActionBar.m6.w0(i13, this.J0)), org.telegram.ui.ActionBar.t6.M(i12), org.telegram.ui.ActionBar.t6.M(i13), this.J0);
        this.y1.setGravity(17);
        this.y1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.y1.setTypeface(org.telegram.messenger.g0.o());
        this.x1.addView(this.y1, c8.ma.e(-1, 48, 83));
        this.y1.setOnClickListener(new tv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.z1 = view3;
        org.telegram.ui.ActionBar.t6.h(i10, view3, this.J0);
        this.x1.addView(this.z1, layoutParams3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        if (this.S1 != null) {
            org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.U1);
            org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.V1);
        }
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.x0);
        a1();
        b1();
        Z0();
        Y0(false);
        this.o1.f();
    }

    public final boolean R0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.L1;
        }
        return true;
    }

    public final void S0() {
        String str;
        if (this.Q1 != null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.a);
            if (this.N1 == null && (str = this.Q1.short_name) != null) {
                this.N1 = d02.r0(str);
            }
            if (this.N1 == null) {
                this.N1 = d02.q0(this.Q1.id);
            }
            if (this.N1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.Q1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.u7(22, this, d02));
            } else {
                if (this.o1 != null) {
                    b1();
                    a1();
                    this.o1.f();
                }
                Z0();
                d02.t1(this.N1);
                K0();
            }
        }
        if (this.N1 != null) {
            this.c2 = !r0.set.masks;
        }
        K0();
    }

    public final void T0(org.telegram.messenger.sy syVar) {
        int indexOf = this.T1.indexOf(syVar);
        if (indexOf >= 0) {
            this.T1.remove(indexOf);
            this.o1.s(indexOf);
            if (this.T1.isEmpty()) {
                dismiss();
            } else {
                a1();
            }
        }
    }

    public final void U0(int i7, boolean z10) {
        if (this.R1 != null) {
            return;
        }
        View[] viewArr = this.E1;
        if ((!z10 || viewArr[i7].getTag() == null) && (z10 || viewArr[i7].getTag() != null)) {
            return;
        }
        viewArr[i7].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[i7].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.D1;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i7] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i7], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[i7].setDuration(150L);
        animatorSetArr[i7].addListener(new yv0(this, i7, z10));
        animatorSetArr[i7].start();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 6);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.s0};
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.zj));
        if (this.o1.r.R1 != null) {
            org.telegram.ui.Cells.v3.a(arrayList, x6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        o6 o6Var = this.u1;
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(o6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.u1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, this.f2));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.y1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.y1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7) {
        W0(onClickListener, str, i7, -1, -1);
    }

    public final void W0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            o6 o6Var = this.u1;
            this.f2 = i7;
            org.telegram.ui.ActionBar.t6.Y(o6Var, i7, this.J0);
        }
        this.u1.c(str, false, true);
        this.u1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.n1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.F1.getLayoutParams();
        if (onClickListener == null) {
            this.u1.setAlpha(0.0f);
        } else if (i10 < 0 || i11 < 0) {
            o6 o6Var2 = this.u1;
            int i12 = org.telegram.ui.ActionBar.m6.h5;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i12, this.J0);
            int i13 = org.telegram.ui.ActionBar.m6.q7;
            org.telegram.ui.ActionBar.t6.Q(o6Var2, org.telegram.ui.ActionBar.m6.i0(w02, org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i13, this.J0))), org.telegram.ui.ActionBar.t6.M(i12), org.telegram.ui.ActionBar.t6.K(0.1f, i13), this.J0);
            this.w1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L;
            marginLayoutParams3.bottomMargin = L;
            marginLayoutParams4.bottomMargin = L;
            if (this.u1.getAlpha() < 1.0f) {
                org.telegram.messenger.n10.o(this.u1.animate().alpha(1.0f), nr.h, 240L);
            }
        } else {
            o6 o6Var3 = this.u1;
            int L2 = org.telegram.messenger.g0.L(24.0f);
            int w03 = org.telegram.ui.ActionBar.m6.w0(i10, this.J0);
            int w04 = org.telegram.ui.ActionBar.m6.w0(i11, this.J0);
            org.telegram.ui.ActionBar.t6.Q(o6Var3, org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, w03, w04, w04), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), this.J0);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, this.w1, this.J0);
            int L3 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L3;
            marginLayoutParams.rightMargin = L3;
            marginLayoutParams.topMargin = L3;
            marginLayoutParams.leftMargin = L3;
            int L4 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.u1.getAlpha() < 1.0f) {
                org.telegram.messenger.n10.o(this.u1.animate().alpha(1.0f), nr.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void X0(int i7) {
        this.Z1 = i7;
        if (this.R1 == null) {
            float f10 = i7;
            this.r1.setTranslationY(f10);
            if (this.S1 == null) {
                this.s1.setTranslationY(f10);
            }
            this.E1[0].setTranslationY(f10);
        }
        this.b.invalidate();
    }

    public final void Y0(boolean z10) {
        this.o1.getClass();
        this.r1.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.l5, this.J0));
        this.x1.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0) & (-536870913));
        this.s1.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Aj, this.J0));
        this.s1.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.J0), false);
        this.s1.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.J0), true);
        this.s1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, this.J0));
        this.s1.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.J0));
        if (this.t1 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, this.J0);
            this.t1.d(w02, w02);
            this.t1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            if (this.t1.getRightIcon() != null && w02 != this.p2) {
                this.p2 = w02;
                this.t1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.m6.h1() && this.o2 == null) {
                ArrayList V = V();
                this.o2 = V;
                int size = V.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.v6) this.o2.get(i7)).g = null;
                }
            }
            int size2 = this.o2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) this.o2.get(i10);
                v6Var.e(org.telegram.ui.ActionBar.m6.w0(v6Var.e, this.J0), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.m6.h1() || this.o2 == null) {
            return;
        }
        this.o2 = null;
    }

    public final void Z0() {
        if (this.b == null || org.telegram.messenger.j10.i(this.a).q()) {
            return;
        }
        org.telegram.messenger.fj.V3(this.N1);
    }

    public final void a1() {
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
        if (this.r1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        int i7 = 1;
        int i10 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.S1;
            if (arrayList3 == null) {
                V0(new tv0(this, 14), org.telegram.messenger.gd.N0(2131752029, null), org.telegram.ui.ActionBar.m6.n5);
                return;
            }
            m80 m80Var = this.r1;
            ArrayList arrayList4 = this.T1;
            m80Var.setText(org.telegram.messenger.gd.G(arrayList4 != null ? arrayList4.size() : arrayList3.size(), "Stickers", new Object[0]));
            HashMap hashMap = this.U1;
            if (hashMap != null && !hashMap.isEmpty()) {
                V0(null, org.telegram.messenger.gd.N0(2131749036, null), org.telegram.ui.ActionBar.m6.q5);
                this.u1.setEnabled(false);
                return;
            } else {
                tv0 tv0Var = new tv0(this, 13);
                ArrayList arrayList5 = this.T1;
                V0(tv0Var, org.telegram.messenger.gd.a0("ImportStickers", null, 2131749049, org.telegram.messenger.gd.G(arrayList5 != null ? arrayList5.size() : arrayList3.size(), "Stickers", new Object[0])), org.telegram.ui.ActionBar.m6.n5);
                this.u1.setEnabled(true);
                return;
            }
        }
        CharSequence m10 = org.telegram.messenger.j6.m(this.N1.set.title, this.r1.getPaint().getFontMetricsInt(), false, null, 0);
        try {
            if (this.m1 == null) {
                this.m1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
            }
            Matcher matcher = this.m1.matcher(m10);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(m10);
                }
                int start = matcher.start();
                int end = matcher.end();
                if (this.N1.set.title.charAt(start) != '@') {
                    start++;
                }
                spannableStringBuilder.setSpan(new p4(m10.subSequence(start + 1, end).toString(), i7, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                m10 = spannableStringBuilder;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.r1.setText(m10);
        int i11 = 5;
        if (R0()) {
            int measuredWidth = this.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.o1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
        } else {
            this.o1.d = 5;
        }
        this.H1.y1(this.o1.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.N1;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || org.telegram.messenger.j10.i(this.a).q() || this.Y1 != null) {
            this.v1.setVisibility(4);
        } else if (this.N1.documents != null) {
            for (int i12 = 0; i12 < this.N1.documents.size(); i12++) {
                if (!org.telegram.messenger.fj.m3(this.N1.documents.get(i12))) {
                    this.v1.setVisibility(0);
                    this.u1.setBackground(null);
                    V0(null, null, -1);
                    this.v1.b(org.telegram.messenger.gd.N0(2131743622, null), new tv0(this, i10), false);
                    return;
                }
            }
        }
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.a);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.N1;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z10 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !d02.E0(stickerSet.id, true);
        } else {
            ArrayList u02 = d02.u0(5);
            for (int i13 = 0; u02 != null && i13 < u02.size(); i13++) {
                if (u02.get(i13) != null && ((TLRPC.TL_messages_stickerSet) u02.get(i13)).set != null && ((TLRPC.TL_messages_stickerSet) u02.get(i13)).set.id == this.N1.set.id) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            z10 = !z11;
        }
        org.telegram.ui.i50 i50Var = this.Y1;
        if (i50Var != null) {
            tv0 tv0Var2 = new tv0(this, i11);
            boolean z12 = i50Var.a;
            String N0 = i50Var.c.O ? org.telegram.messenger.gd.N0(z12 ? 2131746114 : 2131745348, null) : org.telegram.messenger.gd.N0(z12 ? 2131746113 : 2131745347, null);
            boolean z13 = this.Y1.a;
            W0(tv0Var2, N0, z13 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.Ji, !z13 ? org.telegram.ui.ActionBar.m6.Fi : -1, z13 ? -1 : org.telegram.ui.ActionBar.m6.Hi);
            return;
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.N1;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i7 = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i7 = 0;
            }
            if (!d02.X[i7]) {
                d02.D(i7);
                W0(null, "", -1, -1, -1);
                return;
            }
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.N1;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.gd.G(arrayList6 == null ? 0 : arrayList6.size(), "AddManyMasksCount", new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                G = org.telegram.messenger.gd.G((tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), "AddManyStickersCount", new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.gd.G(arrayList7 == null ? 0 : arrayList7.size(), "AddManyEmojiCount", new Object[0]);
            }
            W0(new tv0(this, 9), G, org.telegram.ui.ActionBar.m6.Ji, org.telegram.ui.ActionBar.m6.Fi, org.telegram.ui.ActionBar.m6.Hi);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.N1;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            String N02 = z14 ? org.telegram.messenger.gd.N0(this.M1 ? 2131751342 : 2131751209, null) : stickerSet8.masks ? org.telegram.messenger.gd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]) : stickerSet8.emojis ? org.telegram.messenger.gd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.gd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
            if (z14) {
                W0(new tv0(this, 10), N02, org.telegram.ui.ActionBar.m6.Ji, org.telegram.ui.ActionBar.m6.Fi, org.telegram.ui.ActionBar.m6.Hi);
            } else if (this.N1.set.official) {
                V0(new tv0(this, 11), N02, org.telegram.ui.ActionBar.m6.q7);
            } else {
                V0(new tv0(this, 12), N02, org.telegram.ui.ActionBar.m6.q7);
            }
        }
        this.o1.f();
    }

    public final void b1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.p);
        if (this.S1 != null) {
            this.y1.setText(org.telegram.messenger.gd.N0(2131749035, null));
            org.telegram.ui.ActionBar.t6.U(this.y1, org.telegram.ui.ActionBar.m6.q7, this.J0);
            float f10 = min;
            this.A1.setLayoutParams(c8.ma.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.ma.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.y1.setVisibility(0);
            this.z1.setVisibility(0);
            return;
        }
        if (this.W1 == null || ((tL_messages_stickerSet = this.N1) != null && tL_messages_stickerSet.set.masks)) {
            this.y1.setText(org.telegram.messenger.gd.N0(2131752029, null));
            this.A1.setLayoutParams(c8.ma.e(min, min, 17));
            this.B1.setLayoutParams(c8.ma.e(min, min, 17));
            this.y1.setVisibility(8);
            this.z1.setVisibility(8);
            return;
        }
        this.y1.setText(org.telegram.messenger.gd.N0(2131745393, null));
        float f11 = min;
        this.A1.setLayoutParams(c8.ma.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.B1.setLayoutParams(c8.ma.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.y1.setVisibility(0);
        this.z1.setVisibility(0);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.l4) {
            di.b1 b1Var = this.n1;
            if (b1Var != null) {
                int childCount = b1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.n1.getChildAt(i11).invalidate();
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.U1) {
            HashMap hashMap = this.U1;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) hashMap.get(str);
            if (syVar != null) {
                syVar.a(this.a, (TLRPC.InputFile) objArr[1], new es0(this, str, syVar, 1));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.V1) {
            HashMap hashMap2 = this.U1;
            if (hashMap2 == null) {
                return;
            }
            org.telegram.messenger.sy syVar2 = (org.telegram.messenger.sy) hashMap2.remove((String) objArr[0]);
            if (syVar2 != null) {
                T0(syVar2);
            }
            if (this.U1.isEmpty()) {
                a1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.x0) {
            if (this.Q1 != null) {
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.a);
                String str2 = this.Q1.short_name;
                r5 = str2 != null ? d02.r0(str2) : null;
                if (r5 == null) {
                    r5 = d02.q0(this.Q1.id);
                }
            }
            if (r5 != null && r5 != this.N1) {
                this.N1 = r5;
                S0();
            }
            a1();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        super.dismiss();
        this.g2.q(false);
        Runnable runnable = this.n2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.a2 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.a2, true);
            this.a2 = 0;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        if (this.S1 != null) {
            ArrayList arrayList = this.T1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) this.T1.get(i7);
                    if (!syVar.c) {
                        org.telegram.messenger.w7.G(this.a).b(syVar.a, false);
                    }
                    if (syVar.e) {
                        new File(syVar.a).delete();
                    }
                }
            }
            org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.U1);
            org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.V1);
        }
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.x0);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 4);
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public final void n(Runnable runnable) {
        this.n2 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        gc.a((FrameLayout) this.b, new bi.i1(this, 10));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        gc.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        Y0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0);
            if (this.s0 != null && w02 != this.q2) {
                this.q2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 4);
    }

    public kw0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.e2 = true;
        this.g2 = new a8.b8(6);
        this.h2 = new zv0(this);
        O();
        this.I1 = (Activity) context;
        this.S1 = arrayList;
        this.V1 = str;
        Utilities.e.c(new es0((Object) this, (Object) arrayList, (Serializable) arrayList2, 5));
        Q0(context);
    }

    public kw0(Context context, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, hw0 hw0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.e2 = true;
        this.g2 = new a8.b8(6);
        this.h2 = new zv0(this);
        O();
        this.W1 = hw0Var;
        this.Q1 = inputStickerSet;
        this.N1 = tL_messages_stickerSet;
        this.G1 = g2Var;
        S0();
        Q0(context);
    }
}
