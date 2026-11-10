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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class yv0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int q2 = 0;
    public TextView A1;
    public j B1;
    public final AnimatorSet[] C1;
    public final View[] D1;
    public bi.e5 E1;
    public final org.telegram.ui.ActionBar.f2 F1;
    public ei.h G1;
    public final Activity H1;
    public int I1;
    public int J1;
    public boolean K1;
    public boolean L1;
    public TLRPC.TL_messages_stickerSet M1;
    public TLRPC.Document N1;
    public org.telegram.messenger.zy O1;
    public TLRPC.InputStickerSet P1;
    public ArrayList Q1;
    public final ArrayList R1;
    public ArrayList S1;
    public HashMap T1;
    public final String U1;
    public final vv0 V1;
    public wv0 W1;
    public org.telegram.ui.j50 X1;
    public int Y1;
    public int Z1;
    public boolean a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public int e2;
    public final a8.b8 f2;
    public final nv0 g2;
    public mg h2;
    public String i2;
    public int j2;
    public boolean k2;
    public Pattern l1;
    public String l2;
    public bi.q1 m1;
    public Runnable m2;
    public uv0 n1;
    public ArrayList n2;
    public v4.y o1;
    public int o2;
    public TLRPC.Document p1;
    public int p2;
    public w70 q1;
    public org.telegram.ui.ActionBar.r0 r1;
    public org.telegram.ui.ActionBar.z0 s1;
    public i6 t1;
    public ug.p0 u1;
    public FrameLayout v1;
    public FrameLayout w1;
    public TextView x1;
    public View y1;
    public k9 z1;

    public yv0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new a8.b8(6);
        this.g2 = new nv0(this);
        this.I0 = h6Var;
        N();
        this.H1 = (Activity) context;
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
        org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) this;
        this.Z1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(so0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.ld(21, so0Var, tL_messages_getAttachedStickers), 12));
        P0(context);
    }

    public static void I0(yv0 yv0Var) {
        if (yv0Var.m1.getChildCount() <= 0) {
            yv0Var.W0(yv0Var.m1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < yv0Var.m1.getChildCount(); i11++) {
            View childAt = yv0Var.m1.getChildAt(i11);
            yv0Var.m1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            yv0Var.T0(0, true);
        } else {
            int top = view.getTop();
            yv0Var.T0(0, false);
            i7 = top;
        }
        yv0Var.T0(1, true);
        if (yv0Var.Y1 != i7) {
            yv0Var.W0(i7);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (f2Var == null) {
            return;
        }
        org.telegram.ui.cn cnVar = f2Var instanceof org.telegram.ui.cn ? (org.telegram.ui.cn) f2Var : null;
        boolean z9 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (document == null || !document.mime_type.equals("image/webp")) {
            org.telegram.messenger.g0.i3(new fi.q1((Object) f2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) cnVar, z9, 10), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.w7.G(org.telegram.messenger.p10.s0);
        File J = org.telegram.messenger.w7.J(document, null, true, true);
        if (J == null || !J.exists()) {
            return;
        }
        org.telegram.messenger.g0.i3(new kg.o0(J, arrayList, f2Var, cnVar, document, z9, tL_messages_stickerSet), 300L);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l5));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void J0() {
        if (this.M1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.qp.s1(this.a).x0(this.M1);
            this.M1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z9) {
        if (z9) {
            textView.setText(org.telegram.messenger.id.M0(2131749235, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.w6, this.I0);
            this.k2 = true;
            this.i2 = str;
            return;
        }
        mg mgVar = this.h2;
        if (mgVar != null) {
            org.telegram.messenger.g0.r(mgVar);
            this.h2 = null;
            this.i2 = null;
            if (this.j2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.j2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.id.M0(2131749237, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q5, this.I0);
            return;
        }
        this.k2 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(org.telegram.messenger.id.M0(2131749233, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.I0);
                return;
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(org.telegram.messenger.id.M0(2131749237, null));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.I0);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(org.telegram.messenger.id.M0(2131749231, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.I0);
        } else {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.id.M0(2131749232, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.I0);
                return;
            }
            textView.setText(org.telegram.messenger.id.M0(2131749234, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.F6, this.I0);
            this.i2 = str;
            mg mgVar2 = new mg(this, str, textView, 28);
            this.h2 = mgVar2;
            org.telegram.messenger.g0.i3(mgVar2, 300L);
        }
    }

    public final void L0() {
        if (this.L1) {
            this.o1.h(null);
            this.L1 = false;
            this.f2.q(true);
            org.telegram.messenger.g0.d0(this.m1, new di.e(15));
            this.r1.postDelayed(new jv0(this, 0), 200L);
            this.t1.c(org.telegram.messenger.id.M0(2131751221, null), true, true);
        }
    }

    public final void N0() {
        if (this.L1) {
            return;
        }
        this.o1.h(this.m1);
        int i7 = 1;
        this.L1 = true;
        a8.b8 b8Var = this.f2;
        boolean z9 = false;
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
            long nextFloat = (long) (Utilities.b.nextFloat() * org.telegram.messenger.qs.X4);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new xv0(b8Var, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = org.telegram.messenger.qs.X4;
            ofFloat.setDuration(j3);
            ofFloat.start();
            boolean z10 = z9;
            float L = org.telegram.messenger.g0.L(0.5f);
            float f11 = f10;
            float[] fArr = new float[5];
            fArr[z10 ? 1 : 0] = f11;
            fArr[1] = L;
            fArr[2] = f11;
            fArr[3] = -L;
            fArr[4] = f11;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new xv0(b8Var, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (org.telegram.messenger.qs.X4 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[z10 ? 1 : 0] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new xv0(b8Var, i11, 5));
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
            z9 = z10 ? 1 : 0;
        }
        org.telegram.messenger.g0.d0(this.m1, new di.e(16));
        this.r1.postDelayed(new jv0(this, i7), 200L);
        this.t1.c(org.telegram.messenger.id.M0(2131751354, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new e60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        qv0 qv0Var = new qv0(this, context);
        this.b = qv0Var;
        qv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.t0;
        viewGroup.setPadding(i7, 0, i7, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.D1;
        viewArr[0] = view;
        int i10 = org.telegram.ui.ActionBar.m6.V5;
        org.telegram.ui.ActionBar.t6.h(i10, view, this.I0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        int i11 = 27;
        bi.q1 q1Var = new bi.q1(i11, context, this);
        this.m1 = q1Var;
        q1Var.setTag(14);
        bi.q1 q1Var2 = this.m1;
        getContext();
        ei.h hVar = new ei.h(this);
        this.G1 = hVar;
        q1Var2.setLayoutManager(hVar);
        this.G1.O = new ai.l(this, 10);
        this.o1 = new v4.y(new rv0(this));
        bi.q1 q1Var3 = this.m1;
        uv0 uv0Var = new uv0(this, context);
        this.n1 = uv0Var;
        q1Var3.setAdapter(uv0Var);
        this.m1.setVerticalScrollBarEnabled(false);
        this.m1.i(new di.k(12));
        this.m1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.m1.setClipToPadding(false);
        this.m1.setEnabled(true);
        org.telegram.ui.ActionBar.t6.H(this.m1, org.telegram.ui.ActionBar.m6.A5, this.I0);
        this.m1.setOnTouchListener(new yj(this, 6));
        this.m1.setOnScrollListener(new ti(this, 18));
        j jVar = new j(this, 16);
        this.B1 = jVar;
        this.m1.setOnItemClickListener(jVar);
        this.b.addView(this.m1, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.e5 e5Var = new bi.e5(i11, context, this);
        this.E1 = e5Var;
        this.b.addView(e5Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.m1.setEmptyView(this.E1);
        this.E1.setOnTouchListener(new ei.b(24));
        w70 w70Var = new w70(context, null);
        this.q1 = w70Var;
        w70Var.setLines(1);
        this.q1.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(this.q1, org.telegram.ui.ActionBar.m6.j5, this.I0);
        this.q1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.G(this.q1, org.telegram.ui.ActionBar.m6.k5, this.I0);
        this.q1.setEllipsize(TextUtils.TruncateAt.END);
        this.q1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.q1.setGravity(16);
        this.q1.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.q1, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, this.I0), false, this.I0);
        this.r1 = r0Var;
        r0Var.setLongClickEnabled(false);
        this.r1.setSubMenuOpenSide(2);
        this.r1.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.r1;
        int i12 = org.telegram.ui.ActionBar.m6.Bj;
        org.telegram.ui.ActionBar.t6.Q(r0Var2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i12), this.I0);
        this.b.addView(this.r1, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.r1.e(1, R.drawable.msg_share, org.telegram.messenger.id.M0(2131744846, null));
        this.r1.e(2, R.drawable.msg_link, org.telegram.messenger.id.M0(2131751762, null));
        this.r1.setOnClickListener(new hv0(this, 1));
        this.r1.setDelegate(new iv0(this));
        this.r1.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        this.r1.setVisibility(this.P1 != null ? 0 : 8);
        this.E1.addView(new RadialProgressView(context, null), c8.ha.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.t6.h(i10, view2, this.I0);
        this.b.addView(viewArr[1], layoutParams2);
        i6 i6Var = new i6(context, false, false, false);
        this.t1 = i6Var;
        int i13 = org.telegram.ui.ActionBar.m6.h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, this.I0);
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(w02, org.telegram.ui.ActionBar.m6.w0(i14, this.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        i6Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(i6Var, i02, M, M2, h6Var);
        i6 i6Var2 = this.t1;
        int i15 = org.telegram.ui.ActionBar.m6.n5;
        this.e2 = i15;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i15, this.I0);
        this.t1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.t1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.t1.setTypeface(org.telegram.messenger.g0.o());
        this.t1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.v1 = frameLayout;
        frameLayout.addView(this.t1, c8.ha.c(48.0f, -1));
        this.b.addView(this.v1, c8.ha.e(-1, -2, 83));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(24.0f), context, this.I0, false);
        this.u1 = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.u1.setVisibility(4);
        this.b.addView(this.u1, c8.ha.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.w1.setSoundEffectsEnabled(false);
        this.b.addView(this.w1, c8.ha.c(-1.0f, -1));
        this.w1.setOnClickListener(new hv0(this, 2));
        k9 k9Var = new k9(context);
        this.z1 = k9Var;
        k9Var.setAspectFit(true);
        this.z1.setLayerNum(7);
        this.w1.addView(this.z1);
        TextView textView = new TextView(context);
        this.A1 = textView;
        textView.setTextSize(1, 30.0f);
        this.A1.setGravity(85);
        this.w1.addView(this.A1);
        TextView textView2 = new TextView(context);
        this.x1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.x1, i15, this.I0);
        org.telegram.ui.ActionBar.t6.Q(this.x1, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.w0(i13, this.I0), org.telegram.ui.ActionBar.m6.w0(i14, this.I0)), org.telegram.ui.ActionBar.t6.M(i13), org.telegram.ui.ActionBar.t6.M(i14), this.I0);
        this.x1.setGravity(17);
        this.x1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.x1.setTypeface(org.telegram.messenger.g0.o());
        this.w1.addView(this.x1, c8.ha.e(-1, 48, 83));
        this.x1.setOnClickListener(new hv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.y1 = view3;
        org.telegram.ui.ActionBar.t6.h(i10, view3, this.I0);
        this.w1.addView(this.y1, layoutParams3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        if (this.R1 != null) {
            org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.n1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.K1;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.P1 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
            if (this.M1 == null && (str = this.P1.short_name) != null) {
                this.M1 = b02.p0(str);
            }
            if (this.M1 == null) {
                this.M1 = b02.o0(this.P1.id);
            }
            if (this.M1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.P1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ld(20, this, b02));
            } else {
                if (this.n1 != null) {
                    a1();
                    Z0();
                    this.n1.f();
                }
                Y0();
                b02.q1(this.M1);
                J0();
            }
        }
        if (this.M1 != null) {
            this.b2 = !r0.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.zy zyVar) {
        int indexOf = this.S1.indexOf(zyVar);
        if (indexOf >= 0) {
            this.S1.remove(indexOf);
            this.n1.s(indexOf);
            if (this.S1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i7, boolean z9) {
        if (this.Q1 != null) {
            return;
        }
        View[] viewArr = this.D1;
        if ((!z9 || viewArr[i7].getTag() == null) && (z9 || viewArr[i7].getTag() != null)) {
            return;
        }
        viewArr[i7].setTag(z9 ? null : 1);
        if (z9) {
            viewArr[i7].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.C1;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i7] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i7], (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        animatorSetArr[i7].setDuration(150L);
        animatorSetArr[i7].addListener(new mv0(this, i7, z9));
        animatorSetArr[i7].start();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        r6 r6Var = new r6(this, 6);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.r0};
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        if (this.n1.r.Q1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, r6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.r1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.t1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        i6 i6Var = this.t1;
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.t1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, this.e2));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.x1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.x1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        return arrayList;
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i7) {
        V0(onClickListener, str, i7, -1, -1);
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            i6 i6Var = this.t1;
            this.e2 = i7;
            org.telegram.ui.ActionBar.t6.Y(i6Var, i7, this.I0);
        }
        this.t1.c(str, false, true);
        this.t1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.D1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.m1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.E1.getLayoutParams();
        if (onClickListener == null) {
            this.t1.setAlpha(0.0f);
        } else if (i10 < 0 || i11 < 0) {
            i6 i6Var2 = this.t1;
            int i12 = org.telegram.ui.ActionBar.m6.h5;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i12, this.I0);
            int i13 = org.telegram.ui.ActionBar.m6.q7;
            org.telegram.ui.ActionBar.t6.Q(i6Var2, org.telegram.ui.ActionBar.m6.i0(w02, org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i13, this.I0))), org.telegram.ui.ActionBar.t6.M(i12), org.telegram.ui.ActionBar.t6.K(0.1f, i13), this.I0);
            this.v1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L;
            marginLayoutParams3.bottomMargin = L;
            marginLayoutParams4.bottomMargin = L;
            if (this.t1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.t1.animate().alpha(1.0f), wq.h, 240L);
            }
        } else {
            i6 i6Var3 = this.t1;
            int L2 = org.telegram.messenger.g0.L(24.0f);
            int w03 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
            int w04 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
            org.telegram.ui.ActionBar.t6.Q(i6Var3, org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, w03, w04, w04), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), this.I0);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, this.v1, this.I0);
            int L3 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L3;
            marginLayoutParams.rightMargin = L3;
            marginLayoutParams.topMargin = L3;
            marginLayoutParams.leftMargin = L3;
            int L4 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.t1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.t1.animate().alpha(1.0f), wq.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void W0(int i7) {
        this.Y1 = i7;
        if (this.Q1 == null) {
            float f10 = i7;
            this.q1.setTranslationY(f10);
            if (this.R1 == null) {
                this.r1.setTranslationY(f10);
            }
            this.D1[0].setTranslationY(f10);
        }
        this.b.invalidate();
    }

    public final void X0(boolean z9) {
        this.n1.getClass();
        this.q1.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.l5, this.I0));
        this.w1.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0) & (-536870913));
        this.r1.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, this.I0));
        this.r1.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.I0), false);
        this.r1.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.I0), true);
        this.r1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, this.I0));
        this.r1.H(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.I0));
        if (this.s1 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, this.I0);
            this.s1.d(w02, w02);
            this.s1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            if (this.s1.getRightIcon() != null && w02 != this.o2) {
                this.o2 = w02;
                this.s1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z9) {
            if (org.telegram.ui.ActionBar.m6.h1() && this.n2 == null) {
                ArrayList U = U();
                this.n2 = U;
                int size = U.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.v6) this.n2.get(i7)).g = null;
                }
            }
            int size2 = this.n2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) this.n2.get(i10);
                v6Var.e(org.telegram.ui.ActionBar.m6.w0(v6Var.e, this.I0), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.m6.h1() || this.n2 == null) {
            return;
        }
        this.n2 = null;
    }

    public final void Y0() {
        if (this.b == null || org.telegram.messenger.p10.i(this.a).q()) {
            return;
        }
        org.telegram.messenger.ij.V3(this.M1);
    }

    public final void Z0() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z9;
        TLRPC.StickerSet stickerSet;
        String G;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        TLRPC.StickerSet stickerSet6;
        boolean z10;
        TLRPC.StickerSet stickerSet7;
        if (this.q1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        int i7 = 1;
        int i10 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.R1;
            if (arrayList3 == null) {
                U0(new hv0(this, 14), org.telegram.messenger.id.M0(2131752041, null), org.telegram.ui.ActionBar.m6.n5);
                return;
            }
            w70 w70Var = this.q1;
            ArrayList arrayList4 = this.S1;
            w70Var.setText(org.telegram.messenger.id.G(arrayList4 != null ? arrayList4.size() : arrayList3.size(), "Stickers", new Object[0]));
            HashMap hashMap = this.T1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.id.M0(2131749229, null), org.telegram.ui.ActionBar.m6.q5);
                this.t1.setEnabled(false);
                return;
            } else {
                hv0 hv0Var = new hv0(this, 13);
                ArrayList arrayList5 = this.S1;
                U0(hv0Var, org.telegram.messenger.id.a0("ImportStickers", null, 2131749242, org.telegram.messenger.id.G(arrayList5 != null ? arrayList5.size() : arrayList3.size(), "Stickers", new Object[0])), org.telegram.ui.ActionBar.m6.n5);
                this.t1.setEnabled(true);
                return;
            }
        }
        CharSequence m10 = org.telegram.messenger.i6.m(this.M1.set.title, this.q1.getPaint().getFontMetricsInt(), false, null, 0);
        try {
            if (this.l1 == null) {
                this.l1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
            }
            Matcher matcher = this.l1.matcher(m10);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(m10);
                }
                int start = matcher.start();
                int end = matcher.end();
                if (this.M1.set.title.charAt(start) != '@') {
                    start++;
                }
                spannableStringBuilder.setSpan(new h4(m10.subSequence(start + 1, end).toString(), i7, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                m10 = spannableStringBuilder;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.q1.setText(m10);
        int i11 = 5;
        if (Q0()) {
            int measuredWidth = this.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.n1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
        } else {
            this.n1.d = 5;
        }
        this.G1.y1(this.n1.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.M1;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || org.telegram.messenger.p10.i(this.a).q() || this.X1 != null) {
            this.u1.setVisibility(4);
        } else if (this.M1.documents != null) {
            for (int i12 = 0; i12 < this.M1.documents.size(); i12++) {
                if (!org.telegram.messenger.ij.m3(this.M1.documents.get(i12))) {
                    this.u1.setVisibility(0);
                    this.t1.setBackground(null);
                    U0(null, null, -1);
                    this.u1.b(org.telegram.messenger.id.M0(2131743865, null), new hv0(this, i10), false);
                    return;
                }
            }
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.M1;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z9 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !b02.B0(stickerSet.id, true);
        } else {
            ArrayList s02 = b02.s0(5);
            for (int i13 = 0; s02 != null && i13 < s02.size(); i13++) {
                if (s02.get(i13) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i13)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i13)).set.id == this.M1.set.id) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            z9 = !z10;
        }
        org.telegram.ui.j50 j50Var = this.X1;
        if (j50Var != null) {
            hv0 hv0Var2 = new hv0(this, i11);
            boolean z11 = j50Var.a;
            String M0 = j50Var.c.N ? org.telegram.messenger.id.M0(z11 ? 2131746310 : 2131745544, null) : org.telegram.messenger.id.M0(z11 ? 2131746309 : 2131745543, null);
            boolean z12 = this.X1.a;
            V0(hv0Var2, M0, z12 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.Gi, !z12 ? org.telegram.ui.ActionBar.m6.Ci : -1, z12 ? -1 : org.telegram.ui.ActionBar.m6.Ei);
            return;
        }
        if (z9) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.M1;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i7 = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i7 = 0;
            }
            if (!b02.W[i7]) {
                b02.B(i7);
                V0(null, "", -1, -1, -1);
                return;
            }
        }
        if (z9) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.M1;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.id.G(arrayList6 == null ? 0 : arrayList6.size(), "AddManyMasksCount", new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                G = org.telegram.messenger.id.G((tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), "AddManyStickersCount", new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.id.G(arrayList7 == null ? 0 : arrayList7.size(), "AddManyEmojiCount", new Object[0]);
            }
            V0(new hv0(this, 9), G, org.telegram.ui.ActionBar.m6.Gi, org.telegram.ui.ActionBar.m6.Ci, org.telegram.ui.ActionBar.m6.Ei);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.M1;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z13 = stickerSet8.creator;
            String M02 = z13 ? org.telegram.messenger.id.M0(this.L1 ? 2131751354 : 2131751221, null) : stickerSet8.masks ? org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]) : stickerSet8.emojis ? org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
            if (z13) {
                V0(new hv0(this, 10), M02, org.telegram.ui.ActionBar.m6.Gi, org.telegram.ui.ActionBar.m6.Ci, org.telegram.ui.ActionBar.m6.Ei);
            } else if (this.M1.set.official) {
                U0(new hv0(this, 11), M02, org.telegram.ui.ActionBar.m6.q7);
            } else {
                U0(new hv0(this, 12), M02, org.telegram.ui.ActionBar.m6.q7);
            }
        }
        this.n1.f();
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.p);
        if (this.R1 != null) {
            this.x1.setText(org.telegram.messenger.id.M0(2131749228, null));
            org.telegram.ui.ActionBar.t6.U(this.x1, org.telegram.ui.ActionBar.m6.q7, this.I0);
            float f10 = min;
            this.z1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.A1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.x1.setVisibility(0);
            this.y1.setVisibility(0);
            return;
        }
        if (this.V1 == null || ((tL_messages_stickerSet = this.M1) != null && tL_messages_stickerSet.set.masks)) {
            this.x1.setText(org.telegram.messenger.id.M0(2131752041, null));
            this.z1.setLayoutParams(c8.ha.e(min, min, 17));
            this.A1.setLayoutParams(c8.ha.e(min, min, 17));
            this.x1.setVisibility(8);
            this.y1.setVisibility(8);
            return;
        }
        this.x1.setText(org.telegram.messenger.id.M0(2131745589, null));
        float f11 = min;
        this.z1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.A1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.x1.setVisibility(0);
        this.y1.setVisibility(0);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            bi.q1 q1Var = this.m1;
            if (q1Var != null) {
                int childCount = q1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.m1.getChildAt(i11).invalidate();
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.U1) {
            HashMap hashMap = this.T1;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) hashMap.get(str);
            if (zyVar != null) {
                zyVar.a(this.a, (TLRPC.InputFile) objArr[1], new mg(this, str, zyVar, 25));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.V1) {
            HashMap hashMap2 = this.T1;
            if (hashMap2 == null) {
                return;
            }
            org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) hashMap2.remove((String) objArr[0]);
            if (zyVar2 != null) {
                S0(zyVar2);
            }
            if (this.T1.isEmpty()) {
                Z0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.x0) {
            if (this.P1 != null) {
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
                String str2 = this.P1.short_name;
                r5 = str2 != null ? b02.p0(str2) : null;
                if (r5 == null) {
                    r5 = b02.o0(this.P1.id);
                }
            }
            if (r5 != null && r5 != this.M1) {
                this.M1 = r5;
                R0();
            }
            Z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        super.dismiss();
        this.f2.q(false);
        Runnable runnable = this.m2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.Z1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.Z1, true);
            this.Z1 = 0;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        if (this.R1 != null) {
            ArrayList arrayList = this.S1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.S1.get(i7);
                    if (!zyVar.c) {
                        org.telegram.messenger.w7.G(this.a).b(zyVar.a, false);
                    }
                    if (zyVar.e) {
                        new File(zyVar.a).delete();
                    }
                }
            }
            org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.b2
    public final void n(Runnable runnable) {
        this.m2 = runnable;
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
        bc.a((FrameLayout) this.b, new ch.v(this, 9));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        bc.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0);
            if (this.r0 != null && w02 != this.p2) {
                this.p2 = w02;
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
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 4);
    }

    public yv0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new a8.b8(6);
        this.g2 = new nv0(this);
        N();
        this.H1 = (Activity) context;
        this.R1 = arrayList;
        this.U1 = str;
        Utilities.e.c(new mg(this, arrayList, arrayList2, 29));
        P0(context);
    }

    public yv0(Context context, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, vv0 vv0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new a8.b8(6);
        this.g2 = new nv0(this);
        N();
        this.V1 = vv0Var;
        this.P1 = inputStickerSet;
        this.M1 = tL_messages_stickerSet;
        this.F1 = f2Var;
        R0();
        P0(context);
    }
}
