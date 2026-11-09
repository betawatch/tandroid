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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class zv0 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int n2 = 0;
    public final View[] A1;
    public bi.e5 B1;
    public final org.telegram.ui.ActionBar.f2 C1;
    public ei.h D1;
    public final Activity E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public TLRPC.TL_messages_stickerSet J1;
    public TLRPC.Document K1;
    public org.telegram.messenger.zy L1;
    public TLRPC.InputStickerSet M1;
    public ArrayList N1;
    public final ArrayList O1;
    public ArrayList P1;
    public HashMap Q1;
    public final String R1;
    public final wv0 S1;
    public xv0 T1;
    public org.telegram.ui.i50 U1;
    public int V1;
    public int W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean a2;
    public int b2;
    public final a8.b8 c2;
    public final ov0 d2;
    public ng e2;
    public String f2;
    public int g2;
    public boolean h2;
    public Pattern i1;
    public String i2;
    public bi.q1 j1;
    public Runnable j2;
    public vv0 k1;
    public ArrayList k2;
    public v4.y l1;
    public int l2;
    public TLRPC.Document m1;
    public int m2;
    public x70 n1;
    public org.telegram.ui.ActionBar.r0 o1;
    public org.telegram.ui.ActionBar.z0 p1;
    public j6 q1;
    public ug.p0 r1;
    public FrameLayout s1;
    public FrameLayout t1;
    public TextView u1;
    public View v1;
    public l9 w1;
    public TextView x1;
    public k y1;
    public final AnimatorSet[] z1;

    public zv0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.c2 = new a8.b8(6);
        this.d2 = new ov0(this);
        this.I0 = g6Var;
        N();
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
        org.telegram.ui.ro0 ro0Var = (org.telegram.ui.ro0) this;
        this.W1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(ro0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.ld(21, ro0Var, tL_messages_getAttachedStickers), 12));
        P0(context);
    }

    public static void I0(zv0 zv0Var) {
        if (zv0Var.j1.getChildCount() <= 0) {
            zv0Var.W0(zv0Var.j1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < zv0Var.j1.getChildCount(); i11++) {
            View childAt = zv0Var.j1.getChildAt(i11);
            zv0Var.j1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            zv0Var.T0(0, true);
        } else {
            int top = view.getTop();
            zv0Var.T0(0, false);
            i7 = top;
        }
        zv0Var.T0(1, true);
        if (zv0Var.V1 != i7) {
            zv0Var.W0(i7);
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

    @Override // org.telegram.ui.ActionBar.v2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.l5));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final void J0() {
        if (this.J1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.qp.s1(this.a).x0(this.J1);
            this.J1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z9) {
        if (z9) {
            textView.setText(org.telegram.messenger.id.M0(2131749235, null));
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.w6, this.I0);
            this.h2 = true;
            this.f2 = str;
            return;
        }
        ng ngVar = this.e2;
        if (ngVar != null) {
            org.telegram.messenger.g0.r(ngVar);
            this.e2 = null;
            this.f2 = null;
            if (this.g2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.g2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.id.M0(2131749237, null));
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q5, this.I0);
            return;
        }
        this.h2 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(org.telegram.messenger.id.M0(2131749233, null));
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.p7, this.I0);
                return;
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(org.telegram.messenger.id.M0(2131749237, null));
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.p7, this.I0);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(org.telegram.messenger.id.M0(2131749231, null));
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.p7, this.I0);
        } else {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.id.M0(2131749232, null));
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.p7, this.I0);
                return;
            }
            textView.setText(org.telegram.messenger.id.M0(2131749234, null));
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.F6, this.I0);
            this.f2 = str;
            ng ngVar2 = new ng(this, str, textView, 28);
            this.e2 = ngVar2;
            org.telegram.messenger.g0.i3(ngVar2, 300L);
        }
    }

    public final void L0() {
        if (this.I1) {
            this.l1.h(null);
            this.I1 = false;
            this.c2.q(true);
            org.telegram.messenger.g0.d0(this.j1, new di.e(15));
            this.o1.postDelayed(new kv0(this, 0), 200L);
            this.q1.c(org.telegram.messenger.id.M0(2131751221, null), true, true);
        }
    }

    public final void N0() {
        if (this.I1) {
            return;
        }
        this.l1.h(this.j1);
        int i7 = 1;
        this.I1 = true;
        a8.b8 b8Var = this.c2;
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
            ofFloat.addUpdateListener(new yv0(b8Var, i11, 3));
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
            ofFloat2.addUpdateListener(new yv0(b8Var, i11, 4));
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
            ofFloat3.addUpdateListener(new yv0(b8Var, i11, 5));
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
        org.telegram.messenger.g0.d0(this.j1, new di.e(16));
        this.o1.postDelayed(new kv0(this, i7), 200L);
        this.q1.c(org.telegram.messenger.id.M0(2131751354, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.t1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new f60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        rv0 rv0Var = new rv0(this, context);
        this.b = rv0Var;
        rv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.t0;
        viewGroup.setPadding(i7, 0, i7, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.A1;
        viewArr[0] = view;
        int i10 = org.telegram.ui.ActionBar.l6.V5;
        org.telegram.ui.ActionBar.s6.h(i10, view, this.I0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        int i11 = 27;
        bi.q1 q1Var = new bi.q1(i11, context, this);
        this.j1 = q1Var;
        q1Var.setTag(14);
        bi.q1 q1Var2 = this.j1;
        getContext();
        ei.h hVar = new ei.h(this);
        this.D1 = hVar;
        q1Var2.setLayoutManager(hVar);
        this.D1.O = new ai.l(this, 10);
        this.l1 = new v4.y(new sv0(this));
        bi.q1 q1Var3 = this.j1;
        vv0 vv0Var = new vv0(this, context);
        this.k1 = vv0Var;
        q1Var3.setAdapter(vv0Var);
        this.j1.setVerticalScrollBarEnabled(false);
        this.j1.i(new di.k(12));
        this.j1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.j1.setClipToPadding(false);
        this.j1.setEnabled(true);
        org.telegram.ui.ActionBar.s6.H(this.j1, org.telegram.ui.ActionBar.l6.A5, this.I0);
        this.j1.setOnTouchListener(new zj(this, 6));
        this.j1.setOnScrollListener(new ui(this, 18));
        k kVar = new k(this, 16);
        this.y1 = kVar;
        this.j1.setOnItemClickListener(kVar);
        this.b.addView(this.j1, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.e5 e5Var = new bi.e5(i11, context, this);
        this.B1 = e5Var;
        this.b.addView(e5Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.j1.setEmptyView(this.B1);
        this.B1.setOnTouchListener(new ei.b(24));
        x70 x70Var = new x70(context, null);
        this.n1 = x70Var;
        x70Var.setLines(1);
        this.n1.setSingleLine(true);
        org.telegram.ui.ActionBar.s6.U(this.n1, org.telegram.ui.ActionBar.l6.j5, this.I0);
        this.n1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.s6.G(this.n1, org.telegram.ui.ActionBar.l6.k5, this.I0);
        this.n1.setEllipsize(TextUtils.TruncateAt.END);
        this.n1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.n1.setGravity(16);
        this.n1.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.n1, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.xj, this.I0), false, this.I0);
        this.o1 = r0Var;
        r0Var.setLongClickEnabled(false);
        this.o1.setSubMenuOpenSide(2);
        this.o1.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.o1;
        int i12 = org.telegram.ui.ActionBar.l6.Bj;
        org.telegram.ui.ActionBar.s6.Q(r0Var2, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i12, this.I0), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i12), this.I0);
        this.b.addView(this.o1, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.o1.e(1, R.drawable.msg_share, org.telegram.messenger.id.M0(2131744846, null));
        this.o1.e(2, R.drawable.msg_link, org.telegram.messenger.id.M0(2131751762, null));
        this.o1.setOnClickListener(new iv0(this, 1));
        this.o1.setDelegate(new jv0(this));
        this.o1.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        this.o1.setVisibility(this.M1 != null ? 0 : 8);
        this.B1.addView(new RadialProgressView(context, null), c8.ha.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.s6.h(i10, view2, this.I0);
        this.b.addView(viewArr[1], layoutParams2);
        j6 j6Var = new j6(context, false, false, false);
        this.q1 = j6Var;
        int i13 = org.telegram.ui.ActionBar.l6.h5;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i13, this.I0);
        int i14 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.l6.i0(w02, org.telegram.ui.ActionBar.l6.w0(i14, this.I0));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i14);
        org.telegram.ui.ActionBar.g6 g6Var = this.I0;
        j6Var.setBackground(i02);
        org.telegram.ui.ActionBar.s6.j(j6Var, i02, M, M2, g6Var);
        j6 j6Var2 = this.q1;
        int i15 = org.telegram.ui.ActionBar.l6.n5;
        this.b2 = i15;
        org.telegram.ui.ActionBar.s6.Y(j6Var2, i15, this.I0);
        this.q1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.q1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.q1.setTypeface(org.telegram.messenger.g0.o());
        this.q1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.s1 = frameLayout;
        frameLayout.addView(this.q1, c8.ha.c(48.0f, -1));
        this.b.addView(this.s1, c8.ha.e(-1, -2, 83));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(24.0f), context, this.I0, false);
        this.r1 = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.r1.setVisibility(4);
        this.b.addView(this.r1, c8.ha.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.t1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.t1.setSoundEffectsEnabled(false);
        this.b.addView(this.t1, c8.ha.c(-1.0f, -1));
        this.t1.setOnClickListener(new iv0(this, 2));
        l9 l9Var = new l9(context);
        this.w1 = l9Var;
        l9Var.setAspectFit(true);
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
        org.telegram.ui.ActionBar.s6.U(this.u1, i15, this.I0);
        org.telegram.ui.ActionBar.s6.Q(this.u1, org.telegram.ui.ActionBar.l6.i0(org.telegram.ui.ActionBar.l6.w0(i13, this.I0), org.telegram.ui.ActionBar.l6.w0(i14, this.I0)), org.telegram.ui.ActionBar.s6.M(i13), org.telegram.ui.ActionBar.s6.M(i14), this.I0);
        this.u1.setGravity(17);
        this.u1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.u1.setTypeface(org.telegram.messenger.g0.o());
        this.t1.addView(this.u1, c8.ha.e(-1, 48, 83));
        this.u1.setOnClickListener(new iv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.v1 = view3;
        org.telegram.ui.ActionBar.s6.h(i10, view3, this.I0);
        this.t1.addView(this.v1, layoutParams3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        if (this.O1 != null) {
            org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.x0);
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
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ld(20, this, b02));
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

    public final void S0(org.telegram.messenger.zy zyVar) {
        int indexOf = this.P1.indexOf(zyVar);
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

    public final void T0(int i7, boolean z9) {
        if (this.N1 != null) {
            return;
        }
        View[] viewArr = this.A1;
        if ((!z9 || viewArr[i7].getTag() == null) && (z9 || viewArr[i7].getTag() != null)) {
            return;
        }
        viewArr[i7].setTag(z9 ? null : 1);
        if (z9) {
            viewArr[i7].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.z1;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i7] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i7], (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        animatorSetArr[i7].setDuration(150L);
        animatorSetArr[i7].addListener(new nv0(this, i7, z9));
        animatorSetArr[i7].start();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 6);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.r0};
        int i7 = org.telegram.ui.ActionBar.l6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.u6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.wj));
        if (this.k1.r.N1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.o1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.q1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        j6 j6Var = this.q1;
        int i10 = org.telegram.ui.ActionBar.l6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(j6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.q1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, this.b2));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.u1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        return arrayList;
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i7) {
        V0(onClickListener, str, i7, -1, -1);
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            j6 j6Var = this.q1;
            this.b2 = i7;
            org.telegram.ui.ActionBar.s6.Y(j6Var, i7, this.I0);
        }
        this.q1.c(str, false, true);
        this.q1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.j1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.B1.getLayoutParams();
        if (onClickListener == null) {
            this.q1.setAlpha(0.0f);
        } else if (i10 < 0 || i11 < 0) {
            j6 j6Var2 = this.q1;
            int i12 = org.telegram.ui.ActionBar.l6.h5;
            int w02 = org.telegram.ui.ActionBar.l6.w0(i12, this.I0);
            int i13 = org.telegram.ui.ActionBar.l6.q7;
            org.telegram.ui.ActionBar.s6.Q(j6Var2, org.telegram.ui.ActionBar.l6.i0(w02, org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(i13, this.I0))), org.telegram.ui.ActionBar.s6.M(i12), org.telegram.ui.ActionBar.s6.K(0.1f, i13), this.I0);
            this.s1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L;
            marginLayoutParams3.bottomMargin = L;
            marginLayoutParams4.bottomMargin = L;
            if (this.q1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.q1.animate().alpha(1.0f), xq.h, 240L);
            }
        } else {
            j6 j6Var3 = this.q1;
            int L2 = org.telegram.messenger.g0.L(24.0f);
            int w03 = org.telegram.ui.ActionBar.l6.w0(i10, this.I0);
            int w04 = org.telegram.ui.ActionBar.l6.w0(i11, this.I0);
            org.telegram.ui.ActionBar.s6.Q(j6Var3, org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, w03, w04, w04), org.telegram.ui.ActionBar.s6.M(i10), org.telegram.ui.ActionBar.s6.M(i11), this.I0);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, this.s1, this.I0);
            int L3 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L3;
            marginLayoutParams.rightMargin = L3;
            marginLayoutParams.topMargin = L3;
            marginLayoutParams.leftMargin = L3;
            int L4 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.q1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.q1.animate().alpha(1.0f), xq.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void W0(int i7) {
        this.V1 = i7;
        if (this.N1 == null) {
            float f10 = i7;
            this.n1.setTranslationY(f10);
            if (this.O1 == null) {
                this.o1.setTranslationY(f10);
            }
            this.A1[0].setTranslationY(f10);
        }
        this.b.invalidate();
    }

    public final void X0(boolean z9) {
        this.k1.getClass();
        this.n1.setHighlightColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.l5, this.I0));
        this.t1.setBackgroundColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, this.I0) & (-536870913));
        this.o1.setIconColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.xj, this.I0));
        this.o1.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, this.I0), false);
        this.o1.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.F8, this.I0), true);
        this.o1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.I5, this.I0));
        this.o1.H(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, this.I0));
        if (this.p1 != null) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q7, this.I0);
            this.p1.d(w02, w02);
            this.p1.setSelectorColor(org.telegram.ui.ActionBar.l6.r1(0.1f, w02));
            if (this.p1.getRightIcon() != null && w02 != this.l2) {
                this.l2 = w02;
                this.p1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z9) {
            if (org.telegram.ui.ActionBar.l6.h1() && this.k2 == null) {
                ArrayList U = U();
                this.k2 = U;
                int size = U.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.u6) this.k2.get(i7)).g = null;
                }
            }
            int size2 = this.k2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.k2.get(i10);
                u6Var.e(org.telegram.ui.ActionBar.l6.w0(u6Var.e, this.I0), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.l6.h1() || this.k2 == null) {
            return;
        }
        this.k2 = null;
    }

    public final void Y0() {
        if (this.b == null || org.telegram.messenger.p10.i(this.a).q()) {
            return;
        }
        org.telegram.messenger.ij.V3(this.J1);
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
        if (this.n1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        int i7 = 1;
        int i10 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.O1;
            if (arrayList3 == null) {
                U0(new iv0(this, 14), org.telegram.messenger.id.M0(2131752041, null), org.telegram.ui.ActionBar.l6.n5);
                return;
            }
            x70 x70Var = this.n1;
            ArrayList arrayList4 = this.P1;
            x70Var.setText(org.telegram.messenger.id.G(arrayList4 != null ? arrayList4.size() : arrayList3.size(), "Stickers", new Object[0]));
            HashMap hashMap = this.Q1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.id.M0(2131749229, null), org.telegram.ui.ActionBar.l6.q5);
                this.q1.setEnabled(false);
                return;
            } else {
                iv0 iv0Var = new iv0(this, 13);
                ArrayList arrayList5 = this.P1;
                U0(iv0Var, org.telegram.messenger.id.a0("ImportStickers", null, 2131749242, org.telegram.messenger.id.G(arrayList5 != null ? arrayList5.size() : arrayList3.size(), "Stickers", new Object[0])), org.telegram.ui.ActionBar.l6.n5);
                this.q1.setEnabled(true);
                return;
            }
        }
        CharSequence m10 = org.telegram.messenger.i6.m(this.J1.set.title, this.n1.getPaint().getFontMetricsInt(), false, null, 0);
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
                spannableStringBuilder.setSpan(new i4(m10.subSequence(start + 1, end).toString(), i7, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                m10 = spannableStringBuilder;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.n1.setText(m10);
        int i11 = 5;
        if (Q0()) {
            int measuredWidth = this.j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.q.x;
            }
            this.k1.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f));
        } else {
            this.k1.d = 5;
        }
        this.D1.y1(this.k1.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.J1;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || org.telegram.messenger.p10.i(this.a).q() || this.U1 != null) {
            this.r1.setVisibility(4);
        } else if (this.J1.documents != null) {
            for (int i12 = 0; i12 < this.J1.documents.size(); i12++) {
                if (!org.telegram.messenger.ij.m3(this.J1.documents.get(i12))) {
                    this.r1.setVisibility(0);
                    this.q1.setBackground(null);
                    U0(null, null, -1);
                    this.r1.b(org.telegram.messenger.id.M0(2131743865, null), new iv0(this, i10), false);
                    return;
                }
            }
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.J1;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z9 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !b02.B0(stickerSet.id, true);
        } else {
            ArrayList s02 = b02.s0(5);
            for (int i13 = 0; s02 != null && i13 < s02.size(); i13++) {
                if (s02.get(i13) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i13)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i13)).set.id == this.J1.set.id) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            z9 = !z10;
        }
        org.telegram.ui.i50 i50Var = this.U1;
        if (i50Var != null) {
            iv0 iv0Var2 = new iv0(this, i11);
            boolean z11 = i50Var.a;
            String M0 = i50Var.c.N ? org.telegram.messenger.id.M0(z11 ? 2131746310 : 2131745544, null) : org.telegram.messenger.id.M0(z11 ? 2131746309 : 2131745543, null);
            boolean z12 = this.U1.a;
            V0(iv0Var2, M0, z12 ? org.telegram.ui.ActionBar.l6.q7 : org.telegram.ui.ActionBar.l6.Gi, !z12 ? org.telegram.ui.ActionBar.l6.Ci : -1, z12 ? -1 : org.telegram.ui.ActionBar.l6.Ei);
            return;
        }
        if (z9) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.J1;
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
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.J1;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.id.G(arrayList6 == null ? 0 : arrayList6.size(), "AddManyMasksCount", new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                G = org.telegram.messenger.id.G((tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), "AddManyStickersCount", new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.id.G(arrayList7 == null ? 0 : arrayList7.size(), "AddManyEmojiCount", new Object[0]);
            }
            V0(new iv0(this, 9), G, org.telegram.ui.ActionBar.l6.Gi, org.telegram.ui.ActionBar.l6.Ci, org.telegram.ui.ActionBar.l6.Ei);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.J1;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z13 = stickerSet8.creator;
            String M02 = z13 ? org.telegram.messenger.id.M0(this.I1 ? 2131751354 : 2131751221, null) : stickerSet8.masks ? org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]) : stickerSet8.emojis ? org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
            if (z13) {
                V0(new iv0(this, 10), M02, org.telegram.ui.ActionBar.l6.Gi, org.telegram.ui.ActionBar.l6.Ci, org.telegram.ui.ActionBar.l6.Ei);
            } else if (this.J1.set.official) {
                U0(new iv0(this, 11), M02, org.telegram.ui.ActionBar.l6.q7);
            } else {
                U0(new iv0(this, 12), M02, org.telegram.ui.ActionBar.l6.q7);
            }
        }
        this.k1.f();
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.p);
        if (this.O1 != null) {
            this.u1.setText(org.telegram.messenger.id.M0(2131749228, null));
            org.telegram.ui.ActionBar.s6.U(this.u1, org.telegram.ui.ActionBar.l6.q7, this.I0);
            float f10 = min;
            this.w1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.x1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.u1.setVisibility(0);
            this.v1.setVisibility(0);
            return;
        }
        if (this.S1 == null || ((tL_messages_stickerSet = this.J1) != null && tL_messages_stickerSet.set.masks)) {
            this.u1.setText(org.telegram.messenger.id.M0(2131752041, null));
            this.w1.setLayoutParams(c8.ha.e(min, min, 17));
            this.x1.setLayoutParams(c8.ha.e(min, min, 17));
            this.u1.setVisibility(8);
            this.v1.setVisibility(8);
            return;
        }
        this.u1.setText(org.telegram.messenger.id.M0(2131745589, null));
        float f11 = min;
        this.w1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.x1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.u1.setVisibility(0);
        this.v1.setVisibility(0);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            bi.q1 q1Var = this.j1;
            if (q1Var != null) {
                int childCount = q1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.j1.getChildAt(i11).invalidate();
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.U1) {
            HashMap hashMap = this.Q1;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) hashMap.get(str);
            if (zyVar != null) {
                zyVar.a(this.a, (TLRPC.InputFile) objArr[1], new ng(this, str, zyVar, 25));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.V1) {
            HashMap hashMap2 = this.Q1;
            if (hashMap2 == null) {
                return;
            }
            org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) hashMap2.remove((String) objArr[0]);
            if (zyVar2 != null) {
                S0(zyVar2);
            }
            if (this.Q1.isEmpty()) {
                Z0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.x0) {
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

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        super.dismiss();
        this.c2.q(false);
        Runnable runnable = this.j2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.W1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.W1, true);
            this.W1 = 0;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        if (this.O1 != null) {
            ArrayList arrayList = this.P1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.P1.get(i7);
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

    @Override // org.telegram.ui.ActionBar.v2, org.telegram.ui.ActionBar.b2
    public final void n(Runnable runnable) {
        this.j2 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ms.p().E) {
            org.telegram.ui.ms.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        cc.a((FrameLayout) this.b, new ch.v(this, 9));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        cc.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, this.I0);
            if (this.r0 != null && w02 != this.m2) {
                this.m2 = w02;
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

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 4);
    }

    public zv0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.g6) null, false);
        this.z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.c2 = new a8.b8(6);
        this.d2 = new ov0(this);
        N();
        this.E1 = (Activity) context;
        this.O1 = arrayList;
        this.R1 = str;
        Utilities.e.c(new ng(this, arrayList, arrayList2, 29));
        P0(context);
    }

    public zv0(Context context, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, wv0 wv0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.c2 = new a8.b8(6);
        this.d2 = new ov0(this);
        N();
        this.S1 = wv0Var;
        this.M1 = inputStickerSet;
        this.J1 = tL_messages_stickerSet;
        this.C1 = f2Var;
        R0();
        P0(context);
    }
}
