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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class bw0 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final /* synthetic */ int r2 = 0;
    public i9 A1;
    public TextView B1;
    public j C1;
    public final AnimatorSet[] D1;
    public final View[] E1;
    public bi.g2 F1;
    public final org.telegram.ui.ActionBar.e2 G1;
    public gi.g H1;
    public final Activity I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public TLRPC.TL_messages_stickerSet N1;
    public TLRPC.Document O1;
    public org.telegram.messenger.xy P1;
    public TLRPC.InputStickerSet Q1;
    public ArrayList R1;
    public final ArrayList S1;
    public ArrayList T1;
    public HashMap U1;
    public final String V1;
    public final yv0 W1;
    public zv0 X1;
    public org.telegram.ui.f50 Y1;
    public int Z1;
    public int a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public boolean e2;
    public int f2;
    public final a8.b8 g2;
    public final pv0 h2;
    public lv0 i2;
    public String j2;
    public int k2;
    public boolean l2;
    public Pattern m1;
    public String m2;
    public di.c1 n1;
    public Runnable n2;
    public xv0 o1;
    public ArrayList o2;
    public v4.y p1;
    public int p2;
    public TLRPC.Document q1;
    public int q2;
    public z70 r1;
    public org.telegram.ui.ActionBar.q0 s1;
    public org.telegram.ui.ActionBar.z0 t1;
    public h6 u1;
    public ug.q0 v1;
    public FrameLayout w1;
    public FrameLayout x1;
    public TextView y1;
    public View z1;

    public bw0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.e2 = true;
        this.g2 = new a8.b8(6);
        this.h2 = new pv0(this);
        this.J0 = e6Var;
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
        org.telegram.ui.no0 no0Var = (org.telegram.ui.no0) this;
        this.a2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.l1(no0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.v7(23, no0Var, tL_messages_getAttachedStickers), 13));
        P0(context);
    }

    public static void I0(bw0 bw0Var) {
        if (bw0Var.n1.getChildCount() <= 0) {
            bw0Var.W0(bw0Var.n1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < bw0Var.n1.getChildCount(); i11++) {
            View childAt = bw0Var.n1.getChildAt(i11);
            bw0Var.n1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view == null || view.getTop() < 0) {
            bw0Var.T0(0, true);
        } else {
            int top = view.getTop();
            bw0Var.T0(0, false);
            i7 = top;
        }
        bw0Var.T0(1, true);
        if (bw0Var.Z1 != i7) {
            bw0Var.W0(i7);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (e2Var == null) {
            return;
        }
        org.telegram.ui.an anVar = e2Var instanceof org.telegram.ui.an ? (org.telegram.ui.an) e2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (document == null || !document.mime_type.equals("image/webp")) {
            org.telegram.messenger.g0.i3(new ai.j(e2Var, tL_messages_stickerSet, document, anVar, z10, 11), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.w7.G(org.telegram.messenger.m10.t0);
        File J = org.telegram.messenger.w7.J(document, null, true, true);
        if (J == null || !J.exists()) {
            return;
        }
        org.telegram.messenger.g0.i3(new kg.o0(J, arrayList, e2Var, anVar, document, z10, tL_messages_stickerSet), 300L);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.l5));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void J0() {
        if (this.N1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.np.s1(this.a).x0(this.N1);
            this.N1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.hd.M0(2131749235, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.w6, this.J0);
            this.l2 = true;
            this.j2 = str;
            return;
        }
        lv0 lv0Var = this.i2;
        if (lv0Var != null) {
            org.telegram.messenger.g0.r(lv0Var);
            this.i2 = null;
            this.j2 = null;
            if (this.k2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.k2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.hd.M0(2131749237, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q5, this.J0);
            return;
        }
        int i7 = 0;
        this.l2 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(org.telegram.messenger.hd.M0(2131749233, null));
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p7, this.J0);
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(org.telegram.messenger.hd.M0(2131749237, null));
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p7, this.J0);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(org.telegram.messenger.hd.M0(2131749231, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p7, this.J0);
        } else {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.hd.M0(2131749232, null));
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p7, this.J0);
                return;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131749234, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.F6, this.J0);
            this.j2 = str;
            lv0 lv0Var2 = new lv0(this, str, textView, i7);
            this.i2 = lv0Var2;
            org.telegram.messenger.g0.i3(lv0Var2, 300L);
        }
    }

    public final void L0() {
        if (this.M1) {
            this.p1.h(null);
            this.M1 = false;
            this.g2.q(true);
            org.telegram.messenger.g0.d0(this.n1, new fi.e(15));
            this.s1.postDelayed(new kv0(this, 0), 200L);
            this.u1.c(org.telegram.messenger.hd.M0(2131751221, null), true, true);
        }
    }

    public final void N0() {
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
            long nextFloat = (long) (Utilities.b.nextFloat() * org.telegram.messenger.ns.X4);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new aw0(b8Var, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = org.telegram.messenger.ns.X4;
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
            ofFloat2.addUpdateListener(new aw0(b8Var, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (org.telegram.messenger.ns.X4 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[z11 ? 1 : 0] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new aw0(b8Var, i11, 5));
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
        this.s1.postDelayed(new kv0(this, i7), 200L);
        this.u1.c(org.telegram.messenger.hd.M0(2131751354, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.x1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new h60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        sv0 sv0Var = new sv0(this, context);
        this.b = sv0Var;
        sv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.u0;
        viewGroup.setPadding(i7, 0, i7, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.E1;
        viewArr[0] = view;
        int i10 = org.telegram.ui.ActionBar.j6.V5;
        org.telegram.ui.ActionBar.q6.h(i10, view, this.J0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        di.c1 c1Var = new di.c1(27, context, this);
        this.n1 = c1Var;
        c1Var.setTag(14);
        di.c1 c1Var2 = this.n1;
        getContext();
        gi.g gVar = new gi.g(this);
        this.H1 = gVar;
        c1Var2.setLayoutManager(gVar);
        this.H1.O = new bi.y1(this, 13);
        this.p1 = new v4.y(new tv0(this));
        di.c1 c1Var3 = this.n1;
        xv0 xv0Var = new xv0(this, context);
        this.o1 = xv0Var;
        c1Var3.setAdapter(xv0Var);
        this.n1.setVerticalScrollBarEnabled(false);
        this.n1.i(new fi.k(12));
        this.n1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setEnabled(true);
        org.telegram.ui.ActionBar.q6.H(this.n1, org.telegram.ui.ActionBar.j6.A5, this.J0);
        this.n1.setOnTouchListener(new hk(this, 6));
        this.n1.setOnScrollListener(new ri(this, 20));
        j jVar = new j(this, 16);
        this.C1 = jVar;
        this.n1.setOnItemClickListener(jVar);
        this.b.addView(this.n1, c8.ja.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.g2 g2Var = new bi.g2(28, context, this);
        this.F1 = g2Var;
        this.b.addView(g2Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.n1.setEmptyView(this.F1);
        this.F1.setOnTouchListener(new gi.a(25));
        z70 z70Var = new z70(context, null);
        this.r1 = z70Var;
        z70Var.setLines(1);
        this.r1.setSingleLine(true);
        org.telegram.ui.ActionBar.q6.U(this.r1, org.telegram.ui.ActionBar.j6.j5, this.J0);
        this.r1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.q6.G(this.r1, org.telegram.ui.ActionBar.j6.k5, this.J0);
        this.r1.setEllipsize(TextUtils.TruncateAt.END);
        this.r1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.r1.setGravity(16);
        this.r1.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(this.r1, c8.ja.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Aj, this.J0), false, this.J0);
        this.s1 = q0Var;
        q0Var.setLongClickEnabled(false);
        this.s1.setSubMenuOpenSide(2);
        this.s1.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.s1;
        int i11 = org.telegram.ui.ActionBar.j6.Ej;
        org.telegram.ui.ActionBar.q6.Q(q0Var2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, this.J0), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i11), this.J0);
        this.b.addView(this.s1, c8.ja.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.s1.e(1, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131744846, null));
        this.s1.e(2, R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null));
        this.s1.setOnClickListener(new iv0(this, 1));
        this.s1.setDelegate(new jv0(this));
        this.s1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        this.s1.setVisibility(this.Q1 != null ? 0 : 8);
        this.F1.addView(new RadialProgressView(context, null), c8.ja.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.q6.h(i10, view2, this.J0);
        this.b.addView(viewArr[1], layoutParams2);
        h6 h6Var = new h6(context, false, false, false);
        this.u1 = h6Var;
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i12, this.J0);
        int i13 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.j6.i0(w02, org.telegram.ui.ActionBar.j6.w0(i13, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        h6Var.setBackground(i02);
        org.telegram.ui.ActionBar.q6.j(h6Var, i02, M, M2, e6Var);
        h6 h6Var2 = this.u1;
        int i14 = org.telegram.ui.ActionBar.j6.n5;
        this.f2 = i14;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i14, this.J0);
        this.u1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.u1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.u1.setTypeface(org.telegram.messenger.g0.o());
        this.u1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w1 = frameLayout;
        frameLayout.addView(this.u1, c8.ja.c(48.0f, -1));
        this.b.addView(this.w1, c8.ja.e(-1, -2, 83));
        ug.q0 q0Var3 = new ug.q0(org.telegram.messenger.g0.L(24.0f), context, this.J0, false);
        this.v1 = q0Var3;
        q0Var3.setIcon(R.raw.unlock_icon);
        this.v1.setVisibility(4);
        this.b.addView(this.v1, c8.ja.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.x1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.x1.setSoundEffectsEnabled(false);
        this.b.addView(this.x1, c8.ja.c(-1.0f, -1));
        this.x1.setOnClickListener(new iv0(this, 2));
        i9 i9Var = new i9(context);
        this.A1 = i9Var;
        i9Var.setAspectFit(true);
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
        org.telegram.ui.ActionBar.q6.U(this.y1, i14, this.J0);
        org.telegram.ui.ActionBar.q6.Q(this.y1, org.telegram.ui.ActionBar.j6.i0(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), org.telegram.ui.ActionBar.j6.w0(i13, this.J0)), org.telegram.ui.ActionBar.q6.M(i12), org.telegram.ui.ActionBar.q6.M(i13), this.J0);
        this.y1.setGravity(17);
        this.y1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.y1.setTypeface(org.telegram.messenger.g0.o());
        this.x1.addView(this.y1, c8.ja.e(-1, 48, 83));
        this.y1.setOnClickListener(new iv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.z1 = view3;
        org.telegram.ui.ActionBar.q6.h(i10, view3, this.J0);
        this.x1.addView(this.z1, layoutParams3);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
        if (this.S1 != null) {
            org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.U1);
            org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.V1);
        }
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.o1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.L1;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.Q1 != null) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.a);
            if (this.N1 == null && (str = this.Q1.short_name) != null) {
                this.N1 = b02.p0(str);
            }
            if (this.N1 == null) {
                this.N1 = b02.o0(this.Q1.id);
            }
            if (this.N1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.Q1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.v7(22, this, b02));
            } else {
                if (this.o1 != null) {
                    a1();
                    Z0();
                    this.o1.f();
                }
                Y0();
                b02.q1(this.N1);
                J0();
            }
        }
        if (this.N1 != null) {
            this.c2 = !r0.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.xy xyVar) {
        int indexOf = this.T1.indexOf(xyVar);
        if (indexOf >= 0) {
            this.T1.remove(indexOf);
            this.o1.s(indexOf);
            if (this.T1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i7, boolean z10) {
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
        animatorSetArr[i7].addListener(new ov0(this, i7, z10));
        animatorSetArr[i7].start();
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i7) {
        V0(onClickListener, str, i7, -1, -1);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 6);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.s0};
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.s6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.zj));
        if (this.o1.r.R1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.s1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        h6 h6Var = this.u1;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(h6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.u1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f2));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.y1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.y1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            h6 h6Var = this.u1;
            this.f2 = i7;
            org.telegram.ui.ActionBar.q6.Y(h6Var, i7, this.J0);
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
            h6 h6Var2 = this.u1;
            int i12 = org.telegram.ui.ActionBar.j6.h5;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i12, this.J0);
            int i13 = org.telegram.ui.ActionBar.j6.q7;
            org.telegram.ui.ActionBar.q6.Q(h6Var2, org.telegram.ui.ActionBar.j6.i0(w02, org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i13, this.J0))), org.telegram.ui.ActionBar.q6.M(i12), org.telegram.ui.ActionBar.q6.K(0.1f, i13), this.J0);
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
                org.telegram.messenger.i20.n(this.u1.animate().alpha(1.0f), er.h, 240L);
            }
        } else {
            h6 h6Var3 = this.u1;
            int L2 = org.telegram.messenger.g0.L(24.0f);
            int w03 = org.telegram.ui.ActionBar.j6.w0(i10, this.J0);
            int w04 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
            org.telegram.ui.ActionBar.q6.Q(h6Var3, org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, w03, w04, w04), org.telegram.ui.ActionBar.q6.M(i10), org.telegram.ui.ActionBar.q6.M(i11), this.J0);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, this.w1, this.J0);
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
                org.telegram.messenger.i20.n(this.u1.animate().alpha(1.0f), er.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void W0(int i7) {
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

    public final void X0(boolean z10) {
        this.o1.getClass();
        this.r1.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.l5, this.J0));
        this.x1.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0) & (-536870913));
        this.s1.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Aj, this.J0));
        this.s1.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.J0), false);
        this.s1.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.J0), true);
        this.s1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I5, this.J0));
        this.s1.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.J0));
        if (this.t1 != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q7, this.J0);
            this.t1.d(w02, w02);
            this.t1.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
            if (this.t1.getRightIcon() != null && w02 != this.p2) {
                this.p2 = w02;
                this.t1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.j6.h1() && this.o2 == null) {
                ArrayList V = V();
                this.o2 = V;
                int size = V.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.s6) this.o2.get(i7)).g = null;
                }
            }
            int size2 = this.o2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.o2.get(i10);
                s6Var.e(org.telegram.ui.ActionBar.j6.w0(s6Var.e, this.J0), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.j6.h1() || this.o2 == null) {
            return;
        }
        this.o2 = null;
    }

    public final void Y0() {
        if (this.b == null || org.telegram.messenger.m10.i(this.a).q()) {
            return;
        }
        org.telegram.messenger.gj.V3(this.N1);
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
        if (this.r1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        int i7 = 1;
        int i10 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.S1;
            if (arrayList3 == null) {
                U0(new iv0(this, 14), org.telegram.messenger.hd.M0(2131752041, null), org.telegram.ui.ActionBar.j6.n5);
                return;
            }
            z70 z70Var = this.r1;
            ArrayList arrayList4 = this.T1;
            z70Var.setText(org.telegram.messenger.hd.G(arrayList4 != null ? arrayList4.size() : arrayList3.size(), "Stickers", new Object[0]));
            HashMap hashMap = this.U1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.hd.M0(2131749229, null), org.telegram.ui.ActionBar.j6.q5);
                this.u1.setEnabled(false);
                return;
            } else {
                iv0 iv0Var = new iv0(this, 13);
                ArrayList arrayList5 = this.T1;
                U0(iv0Var, org.telegram.messenger.hd.a0("ImportStickers", null, 2131749242, org.telegram.messenger.hd.G(arrayList5 != null ? arrayList5.size() : arrayList3.size(), "Stickers", new Object[0])), org.telegram.ui.ActionBar.j6.n5);
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
                spannableStringBuilder.setSpan(new g4(m10.subSequence(start + 1, end).toString(), i7, this), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                m10 = spannableStringBuilder;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.r1.setText(m10);
        int i11 = 5;
        if (Q0()) {
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
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || org.telegram.messenger.m10.i(this.a).q() || this.Y1 != null) {
            this.v1.setVisibility(4);
        } else if (this.N1.documents != null) {
            for (int i12 = 0; i12 < this.N1.documents.size(); i12++) {
                if (!org.telegram.messenger.gj.m3(this.N1.documents.get(i12))) {
                    this.v1.setVisibility(0);
                    this.u1.setBackground(null);
                    U0(null, null, -1);
                    this.v1.b(org.telegram.messenger.hd.M0(2131743865, null), new iv0(this, i10), false);
                    return;
                }
            }
        }
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.a);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.N1;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z10 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !b02.B0(stickerSet.id, true);
        } else {
            ArrayList s02 = b02.s0(5);
            for (int i13 = 0; s02 != null && i13 < s02.size(); i13++) {
                if (s02.get(i13) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i13)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i13)).set.id == this.N1.set.id) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            z10 = !z11;
        }
        org.telegram.ui.f50 f50Var = this.Y1;
        if (f50Var != null) {
            iv0 iv0Var2 = new iv0(this, i11);
            boolean z12 = f50Var.a;
            String M0 = f50Var.c.O ? org.telegram.messenger.hd.M0(z12 ? 2131746310 : 2131745544, null) : org.telegram.messenger.hd.M0(z12 ? 2131746309 : 2131745543, null);
            boolean z13 = this.Y1.a;
            V0(iv0Var2, M0, z13 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.Ji, !z13 ? org.telegram.ui.ActionBar.j6.Fi : -1, z13 ? -1 : org.telegram.ui.ActionBar.j6.Hi);
            return;
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.N1;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i7 = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i7 = 0;
            }
            if (!b02.X[i7]) {
                b02.B(i7);
                V0(null, "", -1, -1, -1);
                return;
            }
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.N1;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.hd.G(arrayList6 == null ? 0 : arrayList6.size(), "AddManyMasksCount", new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                G = org.telegram.messenger.hd.G((tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), "AddManyStickersCount", new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                G = org.telegram.messenger.hd.G(arrayList7 == null ? 0 : arrayList7.size(), "AddManyEmojiCount", new Object[0]);
            }
            V0(new iv0(this, 9), G, org.telegram.ui.ActionBar.j6.Ji, org.telegram.ui.ActionBar.j6.Fi, org.telegram.ui.ActionBar.j6.Hi);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.N1;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            String M02 = z14 ? org.telegram.messenger.hd.M0(this.M1 ? 2131751354 : 2131751221, null) : stickerSet8.masks ? org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]) : stickerSet8.emojis ? org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]) : org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
            if (z14) {
                V0(new iv0(this, 10), M02, org.telegram.ui.ActionBar.j6.Ji, org.telegram.ui.ActionBar.j6.Fi, org.telegram.ui.ActionBar.j6.Hi);
            } else if (this.N1.set.official) {
                U0(new iv0(this, 11), M02, org.telegram.ui.ActionBar.j6.q7);
            } else {
                U0(new iv0(this, 12), M02, org.telegram.ui.ActionBar.j6.q7);
            }
        }
        this.o1.f();
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.p);
        if (this.S1 != null) {
            this.y1.setText(org.telegram.messenger.hd.M0(2131749228, null));
            org.telegram.ui.ActionBar.q6.U(this.y1, org.telegram.ui.ActionBar.j6.q7, this.J0);
            float f10 = min;
            this.A1.setLayoutParams(c8.ja.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.ja.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.y1.setVisibility(0);
            this.z1.setVisibility(0);
            return;
        }
        if (this.W1 == null || ((tL_messages_stickerSet = this.N1) != null && tL_messages_stickerSet.set.masks)) {
            this.y1.setText(org.telegram.messenger.hd.M0(2131752041, null));
            this.A1.setLayoutParams(c8.ja.e(min, min, 17));
            this.B1.setLayoutParams(c8.ja.e(min, min, 17));
            this.y1.setVisibility(8);
            this.z1.setVisibility(8);
            return;
        }
        this.y1.setText(org.telegram.messenger.hd.M0(2131745589, null));
        float f11 = min;
        this.A1.setLayoutParams(c8.ja.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.B1.setLayoutParams(c8.ja.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.y1.setVisibility(0);
        this.z1.setVisibility(0);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.i4) {
            di.c1 c1Var = this.n1;
            if (c1Var != null) {
                int childCount = c1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.n1.getChildAt(i11).invalidate();
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.U1) {
            HashMap hashMap = this.U1;
            if (hashMap == null) {
                return;
            }
            String str = (String) objArr[0];
            org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) hashMap.get(str);
            if (xyVar != null) {
                xyVar.a(this.a, (TLRPC.InputFile) objArr[1], new yf(this, str, xyVar, 27));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.V1) {
            HashMap hashMap2 = this.U1;
            if (hashMap2 == null) {
                return;
            }
            org.telegram.messenger.xy xyVar2 = (org.telegram.messenger.xy) hashMap2.remove((String) objArr[0]);
            if (xyVar2 != null) {
                S0(xyVar2);
            }
            if (this.U1.isEmpty()) {
                Z0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.x0) {
            if (this.Q1 != null) {
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.a);
                String str2 = this.Q1.short_name;
                r5 = str2 != null ? b02.p0(str2) : null;
                if (r5 == null) {
                    r5 = b02.o0(this.Q1.id);
                }
            }
            if (r5 != null && r5 != this.N1) {
                this.N1 = r5;
                R0();
            }
            Z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
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
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        if (this.S1 != null) {
            ArrayList arrayList = this.T1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) this.T1.get(i7);
                    if (!xyVar.c) {
                        org.telegram.messenger.w7.G(this.a).b(xyVar.a, false);
                    }
                    if (xyVar.e) {
                        new File(xyVar.a).delete();
                    }
                }
            }
            org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.U1);
            org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.V1);
        }
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.x0);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 4);
    }

    @Override // org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public final void n(Runnable runnable) {
        this.n2 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        xb.a((FrameLayout) this.b, new bi.e1(this, 10));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        xb.h((FrameLayout) this.b);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0);
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

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.j1, 4);
    }

    public bw0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.e2 = true;
        this.g2 = new a8.b8(6);
        this.h2 = new pv0(this);
        O();
        this.I1 = (Activity) context;
        this.S1 = arrayList;
        this.V1 = str;
        Utilities.e.c(new lv0(this, arrayList, arrayList2, 1));
        P0(context);
    }

    public bw0(Context context, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, yv0 yv0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.e2 = true;
        this.g2 = new a8.b8(6);
        this.h2 = new pv0(this);
        O();
        this.W1 = yv0Var;
        this.Q1 = inputStickerSet;
        this.N1 = tL_messages_stickerSet;
        this.G1 = e2Var;
        R0();
        P0(context);
    }
}
