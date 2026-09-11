package di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public abstract class q6 extends pv0 implements rg.s1, rg.i, rg.o1, nv0, lc {
    public final rg.h1 A0;
    public final qg.q1 A1;
    public final rg.l1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final qg.t1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final e6 G1;
    public iv0 H0;
    public org.telegram.ui.ActionBar.n1 H1;
    public boolean I0;
    public o6 I1;
    public rg.k J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final oc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final g6 O0;
    public final t5 O1;
    public final i6 P0;
    public o8 P1;
    public final l6 Q0;
    public ArrayList Q1;
    public final k6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final m6 T0;
    public qg.x T1;
    public final q5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public x5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public fk0 Z1;
    public float a1;
    public rg.c2 a2;
    public ValueAnimator b1;
    public float b2;
    public boolean c1;
    public boolean c2;
    public final rg.y1 d1;
    public boolean d2;
    public final xa.c e1;
    public org.telegram.ui.Components.ja e2;
    public final int f1;
    public final c7 f2;
    public BigInteger g1;
    public final d7 g2;
    public TextView h1;
    public boolean h2;
    public TextView i1;
    public ObjectAnimator i2;
    public TextView j1;
    public final float[] j2;
    public final rg.t1 k1;
    public z5 k2;
    public final rg.q1 l1;
    public boolean l2;
    public final rg.v1 m1;
    public boolean m2;
    public final ImageView n1;
    public boolean n2;
    public final TextView o1;
    public final int[] o2;
    public final TextView p1;
    public kz p2;
    public final TextView q1;
    public boolean q2;
    public final Paint r1;
    public boolean r2;
    public final Paint s1;
    public boolean s2;
    public float t1;
    public int t2;
    public boolean u1;
    public boolean u2;
    public o1.k v1;
    public int v2;
    public final r5 w1;
    public int w2;
    public final Paint x1;
    public int x2;
    public final Paint y1;
    public boolean y2;
    public final Paint z1;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public q6(android.content.Context r30, boolean r31, java.io.File r32, boolean r33, boolean r34, di.oc r35, android.app.Activity r36, int r37, android.graphics.Bitmap r38, android.graphics.Bitmap r39, int r40, java.util.ArrayList r41, di.o8 r42, int r43, int r44, org.telegram.messenger.MediaController.CropState r45, org.telegram.ui.Components.ja r46, org.telegram.ui.ActionBar.f6 r47, di.c7 r48, di.d7 r49) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di.q6.<init>(android.content.Context, boolean, java.io.File, boolean, boolean, di.oc, android.app.Activity, int, android.graphics.Bitmap, android.graphics.Bitmap, int, java.util.ArrayList, di.o8, int, int, org.telegram.messenger.MediaController$CropState, org.telegram.ui.Components.ja, org.telegram.ui.ActionBar.f6, di.c7, di.d7):void");
    }

    public static void G0(rg.x2 x2Var, int i10) {
        x2Var.setAlign(i10);
        int i11 = 2;
        x2Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        x2Var.getEditText().setTextAlignment(i11);
    }

    public static void Z(rb rbVar, qg.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        rbVar.setNewColor(num.intValue());
        rbVar.w1.setSelectedColorIndex(s0Var.d());
        rbVar.T1 = null;
    }

    public static /* synthetic */ void a0(rb rbVar, Integer num) {
        rbVar.setNewColor(num.intValue());
        rbVar.I0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.Y0 == 2 ? this.l1 : this.k1;
    }

    private int getFrameRotation() {
        int i10 = this.f1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private iv0 getPaintingSize() {
        iv0 iv0Var = this.H0;
        if (iv0Var != null) {
            return iv0Var;
        }
        iv0 iv0Var2 = new iv0(1080.0f, 1920.0f);
        this.H0 = iv0Var2;
        return iv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 >= k6Var.getChildCount()) {
                return;
            }
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                ImageReceiver imageReceiver = ((rg.q2) childAt).x0;
                xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
                boolean z11 = !z10;
                imageReceiver.setAllowStartLottieAnimation(z11);
                imageReceiver.setAllowStartAnimation(z11);
                if (lottieAnimation != null) {
                    if (z10) {
                        lottieAnimation.stop();
                    } else {
                        lottieAnimation.start();
                    }
                } else if (animation != null) {
                    animation.y = z10;
                    if (z10) {
                        animation.x(false);
                    }
                    if (z10) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        qg.q1 q1Var = this.A1;
        int i11 = q1Var.a;
        q1Var.a = i10;
        E0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new d5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            ((rg.x2) kVar).setType(i10);
        }
        qg.s0 e7 = qg.s0.e(this.F1);
        e7.h = i10;
        e7.a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        x5 x5Var = new x5(this, context);
        this.W0 = x5Var;
        x5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.x5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.h1;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        e6 e6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.h1.setTextColor(-1);
        this.h1.setTextSize(1, 14.0f);
        this.h1.setGravity(1);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setSingleLine();
        final int i11 = 0;
        this.h1.setOnClickListener(new View.OnClickListener(this) { // from class: di.w4
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q6 q6Var = this.b;
                        if (!q6Var.K0) {
                            q6Var.R0(0);
                            break;
                        } else {
                            q6Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        q6 q6Var2 = this.b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof rg.x2)) {
                            q6Var2.l2 = true;
                            q6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.addView(this.h1, w7.x5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.i1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i12 = 1;
        this.i1.setOnClickListener(new View.OnClickListener(this) { // from class: di.w4
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        q6 q6Var = this.b;
                        if (!q6Var.K0) {
                            q6Var.R0(0);
                            break;
                        } else {
                            q6Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        q6 q6Var2 = this.b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof rg.x2)) {
                            q6Var2.l2 = true;
                            q6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.i1.setTextColor(-1);
        this.i1.setTextSize(1, 14.0f);
        this.i1.setGravity(1);
        this.i1.setTypeface(AndroidUtilities.bold());
        this.i1.setAlpha(0.6f);
        this.i1.setSingleLine();
        this.W0.addView(this.i1, w7.x5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.j1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), 7, -1));
        this.j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.j1.setTextColor(-1);
        this.j1.setTextSize(1, 14.0f);
        this.j1.setGravity(1);
        this.j1.setTypeface(AndroidUtilities.bold());
        this.j1.setAlpha(0.6f);
        this.j1.setSingleLine();
        final int i13 = 2;
        this.j1.setOnClickListener(new View.OnClickListener(this) { // from class: di.w4
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        q6 q6Var = this.b;
                        if (!q6Var.K0) {
                            q6Var.R0(0);
                            break;
                        } else {
                            q6Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        q6 q6Var2 = this.b;
                        q6Var2.R0(2);
                        if (!(q6Var2.J0 instanceof rg.x2)) {
                            q6Var2.l2 = true;
                            q6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.addView(this.j1, w7.x5.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // rg.s1
    public final void A() {
        N0(new g5(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.Y0;
        R0(1);
        postDelayed(new ah.j(this, 9), 350L);
        z5 z5Var = new z5(this, getContext(), this.G1, i10);
        this.k2 = z5Var;
        oc ocVar = this.M1;
        Objects.requireNonNull(ocVar);
        z5Var.w = new ci.u(ocVar, 6);
        final boolean[] zArr = {true};
        z5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: di.o5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q6 q6Var = q6.this;
                q6Var.k2 = null;
                if (zArr[0]) {
                    q6Var.z0(false);
                }
                q6Var.R0(i10);
            }
        });
        z5Var.y = new i5(this);
        z5Var.q0(new p5(this, zArr, z5Var, 0));
        z5Var.show();
        z0(true);
    }

    public final void B0(rg.k kVar) {
        this.D0.b(kVar.getUUID(), new f5(this, kVar, 0));
    }

    public final void C0(rg.k kVar) {
        rg.k kVar2 = this.J0;
        if (kVar == kVar2 && kVar2 != null) {
            kVar2.l(kVar2.m0, false);
            D0(null, true);
            if (kVar instanceof rg.x2) {
                ValueAnimator valueAnimator = this.b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.R0.removeView(kVar);
        g0();
        if (kVar != null) {
            UUID uuid = kVar.getUUID();
            qg.t1 t1Var = this.D0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(t1Var, 15));
        }
        rg.y1 y1Var = this.d1;
        xa.c cVar = this.e1;
        y1Var.setValueOverride(cVar);
        y1Var.setShowPreview(true);
        float f7 = cVar.get();
        qg.q1 q1Var = this.A1;
        q1Var.c = f7;
        E0(q1Var, null, false);
        if (this.n2 || !(kVar instanceof rg.d2)) {
            return;
        }
        pc pcVar = ((rb) this).A2;
        dc dcVar = pcVar.X0;
        if (dcVar != null) {
            dcVar.s(null, null, true);
        }
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            rbVar.q0();
        }
        fc fcVar = pcVar.c1;
        if (fcVar != null) {
            fcVar.setHasRoundVideo(false);
        }
        o8 o8Var = pcVar.K1;
        if (o8Var != null) {
            File file = o8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                pcVar.K1.o0 = null;
            }
            if (pcVar.K1.p0 != null) {
                try {
                    new File(pcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                pcVar.K1.p0 = null;
            }
        }
    }

    @Override // rg.o1
    public final void D() {
        P0(true);
    }

    public final boolean D0(rg.k kVar, boolean z10) {
        boolean z11;
        zc zcVar;
        zc zcVar2;
        fk0 fk0Var;
        int i10;
        boolean z12 = kVar instanceof rg.x2;
        int i11 = 2;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.b1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            rg.x2 x2Var = (rg.x2) kVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            rg.q1 q1Var = this.l1;
            q1Var.setAlignment(i11);
            qg.j0 typeface = x2Var.getTypeface();
            if (typeface != null) {
                q1Var.setTypeface(typeface.a);
            }
            q1Var.e(x2Var.getType(), true);
            this.U0.invalidate();
        }
        rg.k kVar2 = this.J0;
        if (kVar2 == null) {
            z11 = false;
        } else {
            if (kVar2 == kVar) {
                if (!kVar.d0) {
                    if (kVar instanceof rg.v0) {
                        rg.v0 v0Var = (rg.v0) kVar;
                        v0Var.setType((v0Var.getType() + 1) % v0Var.getTypesCount());
                        return true;
                    }
                    if (kVar instanceof rg.y2) {
                        rg.y2 y2Var = (rg.y2) kVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    }
                    if (kVar instanceof rg.s0) {
                        rg.s0 s0Var = (rg.s0) kVar;
                        rg.q0 q0Var = s0Var.q0;
                        if (q0Var.e()) {
                            q0Var.setPreviewType(q0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        s0Var.setType(s0Var.getNextType());
                        return true;
                    }
                    if (!this.K0) {
                        if (kVar instanceof rg.x2) {
                            this.M0 = true;
                            r0();
                            return true;
                        }
                        if (!(kVar instanceof rg.c2)) {
                            M0(kVar2);
                            return true;
                        }
                        rg.c2 c2Var = (rg.c2) kVar;
                        if (this.c2 && this.a2 == kVar) {
                            c2Var.q(true);
                            return true;
                        }
                        rg.c2 c2Var2 = this.a2;
                        if (c2Var2 != null && c2Var2 != c2Var && (fk0Var = this.Z1) != null) {
                            fk0Var.animate().alpha(0.0f).setListener(new v5(fk0Var, 0));
                            this.Z1 = null;
                            this.c2 = false;
                            this.b2 = 0.0f;
                        }
                        if (this.Z1 == null) {
                            fk0 fk0Var2 = new fk0(2, this.F1, getContext(), LaunchActivity.R(), new bi.k3(6, new bi.b()));
                            this.Z1 = fk0Var2;
                            org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(this.e2, fk0Var2, 0, false);
                            this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.M1.addView(this.Z1, w7.x5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.k(-16777216, 120));
                            fk0 fk0Var3 = this.Z1;
                            cf.c cVar = new cf.c();
                            cVar.e = this;
                            cVar.c = naVar;
                            cVar.d = paint;
                            cVar.b = new Path();
                            fk0Var3.setDelegate(cVar);
                            this.Z1.p(null, null, true);
                        }
                        this.Z1.setFragment(LaunchActivity.R());
                        this.a2 = c2Var;
                        O0(true);
                        return true;
                    }
                    if (kVar2 instanceof rg.x2) {
                        AndroidUtilities.showKeyboard(((rg.x2) kVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            kVar2.l(kVar2.m0, false);
            rg.k kVar3 = this.J0;
            if (kVar3 instanceof rg.x2) {
                rg.x2 x2Var2 = (rg.x2) kVar3;
                rg.w2 w2Var = x2Var2.q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((rg.x2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((kVar3 instanceof rg.d2) && (zcVar2 = ((rb) this).A2.Z0) != null) {
                zcVar2.l(false);
            }
            z11 = true;
        }
        rg.k kVar4 = this.J0;
        this.J0 = kVar;
        if ((kVar4 instanceof rg.x2) && TextUtils.isEmpty(((rg.x2) kVar4).getText())) {
            C0(kVar4);
        }
        rg.k kVar5 = this.J0;
        if (kVar4 != kVar5 && (kVar5 instanceof rg.d2) && (zcVar = ((rb) this).A2.Z0) != null) {
            zcVar.l(true);
        }
        rg.k kVar6 = this.J0;
        xa.c cVar2 = this.e1;
        qg.q1 q1Var2 = this.A1;
        rg.y1 y1Var = this.d1;
        if (kVar6 != null) {
            l6 l6Var = this.Q0;
            kVar6.m0 = l6Var;
            kVar6.l(l6Var, true);
            rg.k kVar7 = this.J0;
            if (kVar7 instanceof rg.x2) {
                rg.x2 x2Var3 = (rg.x2) kVar7;
                x2Var3.getSwatch().c = q1Var2.c;
                x2Var3.z0 = false;
                F0(x2Var3.getSwatch());
                y1Var.setValueOverride(new u5(x2Var3, (int) (this.H0.a / 9.0f), 0));
                y1Var.setShowPreview(false);
            } else {
                y1Var.setValueOverride(cVar2);
                y1Var.setShowPreview(true);
                q1Var2.c = cVar2.get();
                E0(q1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                I0(false);
            }
            R0(0);
            y1Var.setValueOverride(cVar2);
            y1Var.setShowPreview(true);
            q1Var2.c = cVar2.get();
            E0(q1Var2, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(qg.q1 q1Var, Integer num, boolean z10) {
        qg.q1 q1Var2 = this.A1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i10 = this.F1;
            qg.s0.e(i10).h(q1Var.a, true);
            qg.s0.e(i10).j(q1Var.c);
        }
        int i11 = q1Var.a;
        g6 g6Var = this.O0;
        g6Var.setColor(i11);
        g6Var.setBrushSize(q1Var.c);
        int i12 = q1Var2.a;
        int i13 = 0;
        if (num == null || num.intValue() == i12) {
            m6 m6Var = this.T0;
            if (m6Var != null) {
                m6Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new x4(this, num, i12, i13));
            duration.start();
        }
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            ((rg.x2) kVar).setSwatch(new qg.q1(q1Var.b, q1Var.c, q1Var.a));
            return;
        }
        if (z10 && (kVar instanceof rg.v0)) {
            ((rg.v0) kVar).setColor(q1Var.a);
            ((rg.v0) this.J0).setType(3);
        } else if (z10 && (kVar instanceof rg.y2)) {
            ((rg.y2) kVar).setColor(q1Var.a);
            ((rg.y2) this.J0).setType(3);
        } else if (z10 && (kVar instanceof rg.s0)) {
            ((rg.s0) kVar).setColor(q1Var.a);
            ((rg.s0) this.J0).setType(0);
        }
    }

    public final void F0(qg.q1 q1Var) {
        E0(q1Var, null, false);
    }

    @Override // org.telegram.ui.Components.nv0
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.r2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.w2).commit();
            } else {
                this.v2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.v2).commit();
            }
        }
        boolean z12 = this.q2;
        t5 t5Var = this.O1;
        if (z12) {
            int paddingUnderContainer = this.M1.getPaddingUnderContainer() + (z10 ? this.w2 : this.v2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.p2.setLayoutParams(layoutParams);
                this.t2 = layoutParams.height;
                t5Var.a();
                requestLayout();
            }
        }
        if (this.x2 == i10 && this.y2 == z10) {
            return;
        }
        this.x2 = i10;
        this.y2 = z10;
        boolean z13 = this.r2;
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            this.r2 = ((rg.x2) kVar).getEditText().isFocused() && t5Var.c();
        } else {
            this.r2 = false;
        }
        if (this.r2 && this.q2) {
            J0(0);
        }
        if (this.t2 != 0 && !(z11 = this.r2) && z11 != z13 && !this.q2) {
            this.t2 = 0;
            t5Var.a();
            requestLayout();
        }
        U0();
        if (z13 && !this.r2 && this.t2 > 0 && this.u2) {
            this.u2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        rg.k kVar;
        ArrayList arrayList = this.Q1;
        if (arrayList == null) {
            return;
        }
        o8 o8Var = this.P1;
        this.P1 = null;
        this.Q1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i11 >= size) {
                k6Var.setVisibility(0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                d6 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    n02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i10 = i11;
                kVar = n02;
            } else if (b10 == 1) {
                rg.x2 o02 = o0(z10);
                o02.setType(mediaEntity.subType);
                o02.setTypeface(mediaEntity.textTypeface);
                o02.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                    i12++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                    int i13 = emojiEntity2.offset;
                    spannableString.setSpan(z5Var, i13, emojiEntity2.length + i13, 33);
                    i11 = i11;
                }
                i10 = i11;
                CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, o02.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                o02.setText(replaceEmoji);
                G0(o02, mediaEntity.textAlign);
                qg.q1 swatch = o02.getSwatch();
                swatch.a = mediaEntity.color;
                o02.setSwatch(swatch);
                kVar = o02;
            } else {
                i10 = i11;
                if (b10 == 2) {
                    rg.z1 k02 = k0(mediaEntity.text, false);
                    k02.G0 = mediaEntity.crop;
                    k02.B0 = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        k02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        k02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = k02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    kVar = k02;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = o8Var.v;
                    boolean z11 = o8Var.K;
                    this.l2 = true;
                    rg.k c6Var = new c6(this, getContext(), e0(), arrayList3, this.e2, z11, this.f2);
                    c6Var.setDelegate(this);
                    k6Var.addView(c6Var);
                    g0();
                    kVar = c6Var;
                    if (mediaEntity.viewWidth > 0) {
                        kVar = c6Var;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = c6Var.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            kVar = c6Var;
                        }
                    }
                } else if (b10 == 3) {
                    rg.v0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                    int i14 = mediaEntity.color;
                    if (i14 != 0) {
                        j02.setColor(i14);
                    }
                    j02.setType(mediaEntity.subType);
                    kVar = j02;
                } else if (b10 == 8) {
                    nd ndVar = mediaEntity.weather;
                    if (ndVar == null) {
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        rg.y2 p02 = p0(ndVar);
                        int i15 = mediaEntity.color;
                        if (i15 != 0) {
                            p02.setColor(i15);
                        }
                        p02.setType(mediaEntity.subType);
                        kVar = p02;
                    }
                } else if (b10 == 7) {
                    rg.s0 i02 = i0(mediaEntity.linkSettings);
                    rg.q0 q0Var = i02.q0;
                    int i16 = mediaEntity.color;
                    if (i16 != 0) {
                        i02.setColor(i16);
                    }
                    boolean e7 = q0Var.e();
                    int i17 = q0Var.h;
                    int i18 = q0Var.f;
                    if (e7) {
                        q0Var.setPreviewType(mediaEntity.subType);
                    }
                    byte b11 = mediaEntity.subType;
                    if (b11 == -1) {
                        i02.setType(3);
                        q0Var.d();
                        mediaEntity.viewWidth = ((int) Math.ceil(q0Var.a0)) + i18 + i18;
                        mediaEntity.viewHeight = ((int) Math.ceil(q0Var.b0)) + i17 + i17;
                        PointF position = i02.getPosition();
                        position.y = (this.S1 * 0.3f) + position.y;
                        i02.setPosition(position);
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        i02.setType(b11);
                        kVar = i02;
                    }
                } else if (b10 == 4) {
                    rg.c2 l02 = l0(false);
                    l02.s(ah.j1.d(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        l02.r(false);
                    }
                    kVar = l02;
                    if (mediaEntity.mediaArea.dark) {
                        l02.q(false);
                        kVar = l02;
                    }
                } else {
                    if (b10 == 5 && o8Var.o0 != null) {
                        rg.d2 m0 = m0(o8Var.p0, false);
                        pc pcVar = ((rb) this).A2;
                        dc dcVar = pcVar.X0;
                        if (dcVar != null) {
                            dcVar.w = m0;
                            g71 g71Var = dcVar.x;
                            if (g71Var != null) {
                                g71Var.V(m0.u0);
                            }
                        }
                        fc fcVar = pcVar.c1;
                        if (fcVar != null) {
                            fcVar.setHasRoundVideo(true);
                        }
                        kVar = m0;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z12 = !m0.r0;
                            m0.r0 = z12;
                            m0.s0.f(z12, true);
                            m0.invalidate();
                            kVar = m0;
                        }
                    }
                    i11 = i10 + 1;
                    z10 = false;
                }
            }
            kVar.setX((mediaEntity.x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            kVar.setY((mediaEntity.y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            kVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + kVar.getX(), (mediaEntity.viewHeight / 2.0f) + kVar.getY()));
            kVar.setScale(mediaEntity.scale);
            kVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
            i11 = i10 + 1;
            z10 = false;
        }
    }

    public final void I0(final boolean z10) {
        if (this.B1 != z10) {
            this.B1 = z10;
            o1.k kVar = this.C1;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = new o1.k(new o1.j(z10 ? 0.0f : 1000.0f));
            this.C1 = kVar2;
            o1.l lVar = new o1.l();
            lVar.i = z10 ? 1000.0f : 0.0f;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            int i10 = 0;
            final boolean[] zArr = {this.O1.c() || this.t2 > 0};
            final float translationY = this.T0.getTranslationY();
            final float alpha = this.B0.getAlpha();
            final ViewGroup barView = getBarView();
            this.C1.b(new o1.g() { // from class: di.y4
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    q6 q6Var = q6.this;
                    m6 m6Var = q6Var.T0;
                    float f11 = f7 / 1000.0f;
                    q6Var.D1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(q6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(q6Var.D1, 0.25f) / 0.25f));
                    r5 r5Var = q6Var.w1;
                    float f13 = q6Var.D1;
                    boolean z11 = z10;
                    r5Var.x1(f13, z11);
                    rg.l1 l1Var = q6Var.B0;
                    l1Var.setProgress(q6Var.D1);
                    rg.h1 h1Var = q6Var.A0;
                    h1Var.setProgress(q6Var.D1);
                    q6Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * q6Var.D1);
                    AnimatorSet animatorSet = q6Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f14 = q6Var.D1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        float f15 = z11 ? 1.0f : 0.0f;
                        float f16 = alpha;
                        l1Var.setAlpha(AndroidUtilities.lerp(f16, f15, f14));
                        h1Var.setAlpha(AndroidUtilities.lerp(f16, z11 ? 1.0f : 0.0f, f14));
                        m6Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    m6Var.invalidate();
                    if (view == q6Var.l1) {
                        q6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new z4(this, z10, i10));
            this.C1.f();
            if (z10) {
                r5 r5Var = this.w1;
                r5Var.setVisibility(0);
                r5Var.setSelectedColorIndex(qg.s0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        rg.q1 q1Var = this.l1;
        t5 t5Var = this.O1;
        int i11 = 1;
        if (i10 == 1) {
            kz kzVar = this.p2;
            boolean z10 = kzVar != null && kzVar.getVisibility() == 0;
            kz kzVar2 = this.p2;
            oc ocVar = this.M1;
            if (kzVar2 != null && kzVar2.c1 != UserConfig.selectedAccount) {
                ocVar.removeView(kzVar2);
                this.p2 = null;
            }
            if (this.p2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.p2 = kzVar3;
                kzVar3.x2 = false;
                kzVar3.U0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.p2.setForseMultiwindowLayout(true);
                }
                this.p2.setDelegate(new f6(this));
                ocVar.addView(this.p2);
            }
            this.p2.setVisibility(0);
            this.q2 = true;
            kz kzVar4 = this.p2;
            if (this.v2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.v2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.v2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.w2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.w2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = ocVar.getPaddingUnderContainer() + (point.x > point.y ? this.w2 : this.v2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                rg.k kVar = this.J0;
                if (kVar instanceof rg.x2) {
                    AndroidUtilities.hideKeyboard(((rg.x2) kVar).getEditText());
                }
            }
            this.t2 = paddingUnderContainer;
            t5Var.a();
            requestLayout();
            bh emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            if (!z10) {
                if (this.r2) {
                    this.u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t2, 0.0f);
                    ofFloat.addUpdateListener(new a5(this, i11));
                    ofFloat.addListener(new w5(this, i11));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                    ofFloat.start();
                }
            }
        } else {
            bh emojiButton2 = q1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(zg.e, true);
            }
            kz kzVar5 = this.p2;
            if (kzVar5 != null) {
                this.q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.t2 = 0;
                t5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(rg.s0 s0Var) {
        x8 x8Var = new x8(getContext(), this.G1, this.g2, new m2(3, this, s0Var));
        if (s0Var != null) {
            rg.p0 p0Var = s0Var.u0;
            x8Var.c0 = true;
            org.telegram.ui.Cells.i3 i3Var = x8Var.Z;
            org.telegram.ui.Cells.i3 i3Var2 = x8Var.Y;
            if (p0Var != null) {
                x8Var.g0 = p0Var.d;
                x8Var.h0 = false;
                i3Var2.setText(p0Var.c);
                i3Var.setText(p0Var.b);
                x8Var.m0 = !TextUtils.isEmpty(p0Var.b);
                x8Var.n0 = p0Var.f;
                x8Var.o0 = p0Var.e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                x8Var.n0 = true;
                x8Var.o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = x8Var.b0;
            dVar.g(string, false, true);
            t8 t8Var = x8Var.X;
            if (t8Var != null) {
                t8Var.N(false);
            }
            dVar.setEnabled(x8Var.V(i3Var2.getText().toString()));
            x8Var.c0 = false;
        }
        x8Var.setOnDismissListener(new m5(this, 1));
        x8Var.show();
        z0(true);
    }

    public final void L0(rg.v0 v0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        vi viVar = new vi(getContext(), new a6(this, callback2), false, true, false, this.G1);
        viVar.Z1 = new b6();
        xh xhVar = viVar.x1;
        if (v0Var != null && (messageMedia = v0Var.u0) != null && (geoPoint = messageMedia.geo) != null) {
            viVar.x2 = new double[]{geoPoint.lat, geoPoint._long};
            viVar.O = true;
            xhVar.setVisibility(8);
        } else if (this.U1) {
            viVar.v2 = this.W1;
            viVar.w2 = this.V1;
            viVar.O = true;
            xhVar.setVisibility(8);
        } else {
            viVar.O = true;
            xhVar.setVisibility(8);
        }
        viVar.setOnDismissListener(new m5(this, 0));
        viVar.r1();
        viVar.show();
    }

    public final void M0(rg.k kVar) {
        if (kVar instanceof rg.g1) {
            org.telegram.ui.ActionBar.n1 n1Var = this.H1;
            if (n1Var == null || !n1Var.isShowing()) {
                return;
            }
            this.H1.d(true);
            return;
        }
        int[] iArr = this.o2;
        kVar.getLocationInWindow(iArr);
        float scaleX = kVar.getScaleX() * kVar.getWidth();
        k6 k6Var = this.R0;
        float scaleX2 = k6Var.getScaleX() * scaleX;
        float scaleY = k6Var.getScaleY() * kVar.getScaleY() * kVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new f5(this, kVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, q6 q6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.n1 n1Var = this.H1;
        if (n1Var != null && n1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            o6 o6Var = new o6(this, getContext());
            this.I1 = o6Var;
            o6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new h5(this, 0));
            this.I1.setDispatchKeyEventListener(new i5(this));
            this.I1.setShownFromBottom(true);
        }
        o6 o6Var2 = this.I1;
        o6Var2.W = z10;
        o6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.I1, -2, -2);
            this.H1 = n1Var2;
            n1Var2.b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new j5(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(q6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.n1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            o6 o6Var3 = this.I1;
            o6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ma(new org.telegram.ui.Components.na(this.e2, o6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.I1.setBackgroundDrawable(mutate);
            this.I1.setBackgroundColor(-14145495);
        }
    }

    public final void O0(boolean z10) {
        if (this.c2 != z10) {
            if (z10 || this.Z1 != null) {
                this.c2 = z10;
                int i10 = 0;
                if (z10) {
                    this.Z1.n();
                    this.Z1.setVisibility(0);
                    this.Z1.setSelectedReaction(this.a2.getCurrentReaction());
                    this.Z1.getParent().bringChildToFront(this.Z1);
                } else {
                    this.a2 = null;
                }
                if (!z10) {
                    if (this.Z1.getReactionsWindow() != null) {
                        this.Z1.getReactionsWindow().e();
                    }
                    this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new w5(this, i10)).start();
                    return;
                }
                this.d2 = true;
                this.M1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b2, z10 ? 1.0f : 0.0f);
                this.Z1.setTransitionProgress(this.b2);
                ofFloat.addUpdateListener(new a5(this, 2));
                ofFloat.addListener(new ah.q0(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(pr.g);
                ofFloat.start();
            }
        }
    }

    public final void P0(boolean z10) {
        if (this.u1 != z10) {
            this.u1 = z10;
            o1.k kVar = this.v1;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = new o1.k(new o1.j(z10 ? 0.0f : 1000.0f));
            this.v1 = kVar2;
            o1.l lVar = new o1.l();
            lVar.i = z10 ? 1000.0f : 0.0f;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            if (z10) {
                rg.v1 v1Var = this.m1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            int i10 = 1;
            this.v1.b(new bi.x9(i10, this));
            this.v1.a(new z4(this, z10, i10));
            this.v1.f();
        }
    }

    public final PointF Q0(rg.k kVar) {
        float f7;
        MediaController.CropState cropState = this.F0;
        float f10 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (kVar != null) {
            PointF position = kVar.getPosition();
            float min = Math.min(kVar.getHeight(), kVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                k6 k6Var = this.R0;
                if (i11 >= k6Var.getChildCount()) {
                    break;
                }
                View childAt = k6Var.getChildAt(i11);
                if (!(childAt instanceof rg.k) || (childAt instanceof rg.g1)) {
                    f7 = f11;
                } else {
                    PointF position2 = ((rg.k) childAt).getPosition();
                    f7 = f11;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f7) {
                        f10 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z10 = true;
                    }
                }
                i11++;
                f11 = f7;
            }
            float f12 = f11;
            if (!z10) {
                break;
            }
            i10++;
            e02 = new PointF(e02.x + f10, e02.y + f10);
            f11 = f12;
        }
        return e02;
    }

    @Override // org.telegram.ui.Components.pv0, org.telegram.ui.Components.ov0
    public final int R() {
        return this.O1.l - this.M1.getBottomPadding2();
    }

    public final void R0(int i10) {
        if (this.Y0 == i10 || this.Z0 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.b1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.Y0;
        ViewGroup viewGroup = this.l1;
        ViewGroup viewGroup2 = this.k1;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.Z0 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.F1;
        qg.s0 e7 = qg.s0.e(i12);
        int i13 = 1;
        boolean z10 = i10 == 2;
        if (e7.l != z10) {
            e7.l = z10;
            if (z10) {
                e7.i(-1, false);
            } else {
                e7.i(e7.a.getInt("brush", 0), false);
            }
        }
        int c10 = qg.s0.e(i12).c();
        qg.q1 q1Var = this.A1;
        q1Var.a = c10;
        E0(q1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.b1 = duration;
        duration.setInterpolator(pr.f);
        this.b1.addUpdateListener(new bi.i4(this, viewGroup3, viewGroup4, i13));
        this.b1.addListener(new y5(this, viewGroup3, viewGroup4, i10, 0));
        this.b1.start();
    }

    public final void S0() {
        t5 t5Var = this.O1;
        rg.q1 q1Var = this.l1;
        if (q1Var != null) {
            if (t5Var.c()) {
                q1Var.a(R.drawable.input_smile);
            } else if (this.q2) {
                q1Var.a(R.drawable.input_keyboard);
            } else {
                q1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = t5Var.c() || this.q2;
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        rg.k kVar;
        ObjectAnimator objectAnimator = this.i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        t5 t5Var = this.O1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!t5Var.c() || t5Var.d) && this.t2 <= 0) || (kVar = this.J0) == null) ? 0.0f : view.getScaleY() * (-(kVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.i2.setInterpolator(pr.h);
        this.i2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z10;
        if (this.J0 instanceof rg.x2) {
            t5 t5Var = this.O1;
            if ((t5Var.c() || this.t2 > 0) && !t5Var.d) {
                z10 = true;
                View view = this.X0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ah.u(4, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.X0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ah.u(4, this, z10)).start();
    }

    @Override // rg.s1, rg.o1
    public final void a() {
        I0(true);
    }

    @Override // rg.o1
    public final void c() {
        setTextType((this.L0 + 1) % 4);
    }

    @Override // org.telegram.ui.Components.ov0, org.telegram.ui.ActionBar.z5
    public final void d() {
        this.E1.setColor(-15132391);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bi.s8(26, this, view)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        MediaController.CropState cropState;
        if ((view == this.O0 || view == this.P0 || view == this.R0 || view == this.Q0) && (cropState = this.F0) != null) {
            canvas.save();
            r1 = this.N0 ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // rg.o1
    public final void e(int i10) {
        rg.k kVar = this.J0;
        if (kVar instanceof rg.x2) {
            G0((rg.x2) kVar, i10);
            qg.s0 e7 = qg.s0.e(this.F1);
            e7.g = i10;
            e7.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF e0() {
        k6 k6Var = this.R0;
        int measuredWidth = k6Var.getMeasuredWidth();
        int measuredHeight = k6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public abstract boolean f0(ah.g gVar);

    public final void g0() {
        boolean z10 = this.W1;
        k6 k6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= k6Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = k6Var.getChildAt(i10);
                boolean z12 = childAt instanceof rg.x2;
                int i11 = this.F1;
                if (z12) {
                    CharSequence text = ((rg.x2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) {
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.q5.f(i11, z5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.q5.h(i11).e(document);
                            }
                            if (o8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof rg.q2) {
                    TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                    if (o8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i10++;
                    }
                } else if (childAt instanceof rg.d2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        for (int i12 = 0; i12 < k6Var.getChildCount(); i12++) {
            View childAt2 = k6Var.getChildAt(i12);
            if (childAt2 instanceof rg.k) {
                ((rg.k) childAt2).setIsVideo(z11);
            }
        }
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.O0.c(true, false);
    }

    public View getBottomLayout() {
        return this.T0;
    }

    public View getCancelView() {
        return this.A0;
    }

    @Override // org.telegram.ui.Components.pv0, org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.B0;
    }

    public View getEntitiesView() {
        return this.R0;
    }

    public long getLcm() {
        return this.g1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.z5[] z5VarArr;
        k6 k6Var = this.R0;
        int childCount = k6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof rg.x2) {
                CharSequence text = ((rg.x2) childAt).getText();
                if ((text instanceof Spanned) && (z5VarArr = (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) != null) {
                    for (org.telegram.ui.Components.z5 z5Var : z5VarArr) {
                        if (z5Var != null) {
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.q5.f(this.F1, z5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.O0, this.P0, this.R0, this.Q0);
    }

    public View getRenderInputView() {
        return this.P0;
    }

    public qg.c1 getRenderView() {
        return this.O0;
    }

    public rg.k getSelectedEntity() {
        return this.J0;
    }

    public View getSelectionEntitiesView() {
        return this.Q0;
    }

    public View getTextDimView() {
        return this.X0;
    }

    public View getTopLayout() {
        return this.S0;
    }

    public View getWeightChooserView() {
        return this.d1;
    }

    @Override // rg.i
    public final void h(rg.k kVar) {
        O0(false);
        M0(kVar);
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.G1));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final rg.s0 i0(rg.p0 p0Var) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        k6 k6Var = this.R0;
        float measuredWidth = k6Var.getMeasuredWidth() <= 0 ? this.R1 : k6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        rg.s0 s0Var = new rg.s0(getContext(), Q0, this.F1, p0Var, measuredWidth / 360.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            s0Var.setColor(i10);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(dp);
        k6Var.addView(s0Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    public final rg.v0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        k6 k6Var = this.R0;
        float measuredWidth = k6Var.getMeasuredWidth() <= 0 ? this.R1 : k6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        rg.v0 v0Var = new rg.v0(getContext(), Q0, this.F1, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            v0Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            v0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            v0Var.setColor(i10);
        }
        v0Var.setDelegate(this);
        v0Var.setMaxWidth(dp);
        k6Var.addView(v0Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            v0Var.j(1.0f / cropState.cropScale);
            v0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return v0Var;
    }

    public final rg.z1 k0(String str, boolean z10) {
        float f7;
        iv0 iv0Var;
        this.l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e7) {
            FileLog.e(e7);
            f7 = 1.0f;
        }
        k6 k6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, k6Var.getMeasuredWidth()) * 0.5d);
            iv0Var = new iv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, k6Var.getMeasuredHeight()) * 0.5d);
            iv0Var = new iv0(f7 * floor2, floor2);
        }
        iv0 iv0Var2 = iv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iv0Var2.a;
            iv0Var2.a = iv0Var2.b;
            iv0Var2.b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        rg.z1 z1Var = new rg.z1(context, e02, iv0Var2, str, intValue);
        z1Var.setDelegate(this);
        k6Var.addView(z1Var);
        g0();
        return z1Var;
    }

    @Override // di.lc
    public final boolean l(MotionEvent motionEvent) {
        if (this.m2) {
            return false;
        }
        if (this.J0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.O0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final rg.c2 l0(boolean z10) {
        String str;
        iv0 iv0Var = new iv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        k6 k6Var = this.R0;
        if (k6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < k6Var.getChildCount(); i10++) {
                    View childAt = k6Var.getChildAt(i10);
                    if (v7.z6.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (k6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (k6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, k6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, k6Var.getMeasuredHeight(), 0.0f);
            }
        }
        rg.c2 c2Var = new rg.c2(getContext(), e02);
        c2Var.r0 = new bi.va(c2Var);
        c2Var.s0 = new bi.va(c2Var);
        c2Var.t0 = new ah.z0(c2Var);
        c2Var.u0 = new ah.z0(c2Var);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(c2Var);
        c2Var.w0 = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(c2Var);
        c2Var.x0 = e6Var2;
        c2Var.z0 = 1.0f;
        c2Var.q0 = iv0Var;
        e6Var2.d(1.0f, true);
        e6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ah.z0 z0Var = c2Var.t0;
        int i11 = 0;
        while (true) {
            if (i11 >= reactionsList.size()) {
                str = reactionsList.get(0).reaction;
                break;
            }
            if (reactionsList.get(i11).title.equals("Red Heart")) {
                str = reactionsList.get(i11).reaction;
                break;
            }
            i11++;
        }
        ah.j1 b10 = ah.j1.b(str);
        c2Var.v0 = b10;
        z0Var.e(b10);
        c2Var.k();
        c2Var.setDelegate(this);
        k6Var.addView(c2Var);
        g0();
        if (z10) {
            B0(c2Var);
            D0(c2Var, true);
        }
        return c2Var;
    }

    public final rg.d2 m0(String str, boolean z10) {
        this.l2 = true;
        this.n2 = true;
        q0();
        k6 k6Var = this.R0;
        int measuredWidth = k6Var.getMeasuredWidth();
        k6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        iv0 iv0Var = new iv0(floor, floor);
        rg.d2 d2Var = new rg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (iv0Var.b / 2.0f) + AndroidUtilities.dp(72.0f)), iv0Var, str);
        d2Var.setDelegate(this);
        k6Var.addView(d2Var);
        g0();
        if (z10) {
            B0(d2Var);
            post(new v4(this, d2Var, 0));
        }
        this.n2 = false;
        return d2Var;
    }

    public final d6 n0(Object obj, TLRPC.Document document) {
        float f7;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            f7 = -(cropState.transformRotation + cropState.cropRotate);
            f10 = 0.75f / cropState.cropScale;
        } else {
            f7 = 0.0f;
        }
        p6 p6Var = new p6(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        d6 d6Var = new d6(this, context, p6Var.a, p6Var.c, p6Var.b, new iv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = d6Var.x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        d6Var.setDelegate(this);
        this.R0.addView(d6Var);
        g0();
        return d6Var;
    }

    @Override // rg.s1
    public final void o(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        rg.y1 y1Var = this.d1;
        if (z10 || (mVar instanceof qg.d)) {
            y1Var.b(0.4f, 1.75f);
        } else {
            y1Var.b(0.05f, 1.0f);
        }
        y1Var.setDrawCenter(!(mVar instanceof qg.l));
        g6 g6Var = this.O0;
        if (g6Var.getCurrentBrush() instanceof qg.l) {
            this.c1 = true;
        }
        g6Var.setBrush(mVar);
        qg.q1 q1Var = this.A1;
        int i10 = q1Var.a;
        q1Var.a = qg.s0.e(this.F1).c();
        q1Var.c = this.e1.get();
        E0(q1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final rg.x2 o0(boolean z10) {
        iv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        rg.x2 x2Var = new rg.x2(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.a / 9.0f;
        g5 g5Var = new g5(this, 0);
        x2Var.w0 = (int) (0.5f * f7);
        x2Var.x0 = (int) (f7 * 2.0f);
        x2Var.y0 = g5Var;
        float f10 = Q0.x;
        k6 k6Var = this.R0;
        if (f10 == k6Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        x2Var.setTypeface(qg.s0.e(i10).j);
        x2Var.setType(qg.s0.e(i10).h);
        k6Var.addView(x2Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            B0(x2Var);
            x2Var.q();
            D0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.K0 = true;
            int i11 = qg.s0.e(i10).g;
            rg.q1 q1Var = this.l1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(qg.s0.e(i10).h);
        }
        return x2Var;
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        fk0 fk0Var = this.Z1;
        if (fk0Var != null) {
            AndroidUtilities.removeFromParent(fk0Var);
            this.Z1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.G0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.C0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f7)) > currentActionBarHeight2) {
            Math.floor((r3 * f7) / currentActionBarHeight);
        }
        float f10 = this.H0.a;
        rg.k kVar = this.J0;
        if (kVar != null) {
            kVar.m();
        }
        measureChild(this.T0, i10, i11);
        measureChild(this.d1, i10, i11);
        measureChild(this.V0, i10, i11);
        measureChild(this.U0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.t2 - this.M1.getPaddingUnderContainer(), R()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.S0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.G0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.q2 && !this.s2) {
            this.G0 = true;
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final rg.y2 p0(nd ndVar) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        k6 k6Var = this.R0;
        float measuredWidth = k6Var.getMeasuredWidth() <= 0 ? this.R1 : k6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        rg.y2 y2Var = new rg.y2(getContext(), Q0, this.F1, ndVar, measuredWidth / 240.0f, dp);
        if (Q0.x == k6Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (Q0.y == k6Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        k6Var.addView(y2Var, w7.x5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            y2Var.j(1.0f / cropState.cropScale);
            y2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return y2Var;
    }

    @Override // rg.i
    public final boolean q() {
        return !(this.J0 instanceof rg.g1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 >= k6Var.getChildCount()) {
                return;
            }
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof rg.d2) {
                if (this.J0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(pr.h).withEndAction(new v4(this, (rg.d2) childAt, 1)).start();
            }
            i10++;
        }
    }

    @Override // rg.i
    public final boolean r() {
        return !this.K0;
    }

    public abstract void r0();

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G0) {
            return;
        }
        super.requestLayout();
    }

    public final rg.g1 s0() {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 >= k6Var.getChildCount()) {
                return null;
            }
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof rg.g1) {
                return (rg.g1) childAt;
            }
            i10++;
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ja jaVar) {
        this.e2 = jaVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.m2 != z10) {
            this.m2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i10 = 0;
        while (true) {
            k6 k6Var = this.R0;
            if (i10 >= k6Var.getChildCount()) {
                return;
            }
            View childAt = k6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                ImageReceiver imageReceiver = ((rg.q2) childAt).x0;
                xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.L(Math.round(((j3 % lottieAnimation.p()) / lottieAnimation.p()) * lottieAnimation.e[0]), true, false);
                }
            }
            i10++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.Y1) {
            this.Y1 = z10;
            g0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.L1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.K1 = runnable;
    }

    @Override // rg.o1
    public final void t() {
        if (!this.r2 && !this.q2) {
            this.l2 = true;
            o0(true);
            return;
        }
        if (this.q2) {
            rg.k kVar = this.J0;
            if (kVar instanceof rg.x2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((rg.x2) kVar).getEditText());
            }
        }
        J0(!this.q2 ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap t0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, o8 o8Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i10;
        int i11;
        k6 k6Var;
        int i12;
        int i13;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view2;
        int i14;
        rg.g1 g1Var;
        org.telegram.ui.t5 t5Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.w0 w0Var;
        zh.y3 y3Var;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z18;
        boolean z19;
        float radius;
        double d;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        rg.x2 x2Var;
        boolean z20;
        q6 q6Var = this;
        g6 g6Var = q6Var.O0;
        int i15 = 0;
        byte b10 = 1;
        k6 k6Var2 = q6Var.R0;
        if (z10) {
            createBitmap = g6Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, k6Var2.getMeasuredWidth()), Math.max(1, k6Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                q6Var.g1 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < k6Var2.getChildCount(); i10++) {
                    if (k6Var2.getChildAt(i10) instanceof rg.k) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    int childCount = k6Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        View childAt = k6Var2.getChildAt(i16);
                        if (childAt instanceof rg.k) {
                            rg.k kVar = (rg.k) childAt;
                            kVar.getPosition();
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                boolean z21 = kVar instanceof rg.x2;
                                int i17 = q6Var.F1;
                                if (z21) {
                                    mediaEntity.type = b10;
                                    rg.x2 x2Var2 = (rg.x2) kVar;
                                    CharSequence text = x2Var2.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned = (Spanned) text;
                                        x2Var = x2Var2;
                                        org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(i15, text.length(), org.telegram.ui.Components.z5.class);
                                        if (z5VarArr != null) {
                                            int i18 = 0;
                                            while (i18 < z5VarArr.length) {
                                                org.telegram.ui.Components.z5 z5Var = z5VarArr[i18];
                                                org.telegram.ui.Components.z5[] z5VarArr2 = z5VarArr;
                                                TLRPC.Document document = z5Var.document;
                                                int i19 = i18;
                                                k6 k6Var3 = k6Var2;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.q5.f(i17, z5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.q5.h(i17).e(document);
                                                }
                                                VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                                int i20 = childCount;
                                                int i21 = i16;
                                                emojiEntity.document_id = z5Var.getDocumentId();
                                                emojiEntity.document = document;
                                                emojiEntity.offset = spanned.getSpanStart(z5Var);
                                                emojiEntity.length = spanned.getSpanEnd(z5Var) - emojiEntity.offset;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(i17).getPathToAttach(document, true).getAbsolutePath();
                                                int i22 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                        break;
                                                    }
                                                    FileLoader fileLoader = FileLoader.getInstance(i17);
                                                    TLRPC.PhotoSize photoSize = document.thumbs.get(i22);
                                                    int i23 = i22;
                                                    z20 = true;
                                                    emojiEntity.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                    int i24 = i23 + 1;
                                                    if (i24 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    i22 = i24;
                                                }
                                                z20 = true;
                                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z20);
                                                if (isAnimatedStickerDocument || x0(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | (isAnimatedStickerDocument ? (byte) 1 : (byte) 4));
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    q6Var.g1 = q6Var.g1.multiply(valueOf).divide(q6Var.g1.gcd(valueOf));
                                                }
                                                i18 = i19 + 1;
                                                childCount = i20;
                                                z5VarArr = z5VarArr2;
                                                k6Var2 = k6Var3;
                                                i16 = i21;
                                            }
                                        }
                                    } else {
                                        x2Var = x2Var2;
                                    }
                                    k6Var = k6Var2;
                                    i14 = childCount;
                                    i13 = i16;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) x2Var.getType();
                                    mediaEntity.color = x2Var.getSwatch().a;
                                    mediaEntity.fontSize = x2Var.getTextSize();
                                    mediaEntity.textTypeface = x2Var.getTypeface();
                                    mediaEntity.textAlign = x2Var.getAlign();
                                } else {
                                    k6Var = k6Var2;
                                    i14 = childCount;
                                    i13 = i16;
                                    if (kVar instanceof rg.q2) {
                                        mediaEntity.type = (byte) 0;
                                        rg.q2 q2Var = (rg.q2) kVar;
                                        iv0 baseSize = q2Var.getBaseSize();
                                        mediaEntity.width = baseSize.a;
                                        mediaEntity.height = baseSize.b;
                                        mediaEntity.document = q2Var.getSticker();
                                        mediaEntity.parentObject = q2Var.getParentObject();
                                        TLRPC.Document sticker = q2Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || x0(sticker)) {
                                            boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                            r20 = (isAnimatedStickerDocument2 || x0(sticker)) ? q2Var.getDuration() : 5000L;
                                            if (r20 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r20);
                                                q6Var.g1 = q6Var.g1.multiply(valueOf2).divide(q6Var.g1.gcd(valueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (q2Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (kVar instanceof rg.z1) {
                                        rg.z1 z1Var = (rg.z1) kVar;
                                        mediaEntity.type = (byte) 2;
                                        iv0 baseSize2 = z1Var.getBaseSize();
                                        mediaEntity.width = baseSize2.a;
                                        mediaEntity.height = baseSize2.b;
                                        mediaEntity.text = z1Var.q(i17);
                                        mediaEntity.crop = z1Var.G0;
                                        if (z1Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (kVar instanceof rg.v0) {
                                        rg.v0 v0Var = (rg.v0) kVar;
                                        rg.u0 u0Var = v0Var.q0;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) v0Var.getType();
                                        mediaEntity.width = u0Var.getWidth();
                                        mediaEntity.height = u0Var.getHeight();
                                        mediaEntity.text = u0Var.getText();
                                        mediaEntity.color = v0Var.r0 ? v0Var.getColor() : 0;
                                        mediaEntity.density = u0Var.y;
                                        mediaEntity.media = v0Var.u0;
                                        TL_stories.MediaArea mediaArea2 = v0Var.v0;
                                        mediaEntity.mediaArea = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = u0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity2.document_id = codeEmojiDocument.id;
                                            emojiEntity2.document = codeEmojiDocument;
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i17).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (isAnimatedStickerDocument3 || x0(emojiEntity2.document)) {
                                                emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (kVar instanceof rg.y2) {
                                        rg.y2 y2Var = (rg.y2) kVar;
                                        rg.u0 u0Var2 = y2Var.q0;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) y2Var.getType();
                                        mediaEntity.width = u0Var2.getWidth();
                                        mediaEntity.height = u0Var2.getHeight();
                                        mediaEntity.text = u0Var2.getText();
                                        mediaEntity.color = y2Var.r0 ? y2Var.getColor() : 0;
                                        mediaEntity.density = u0Var2.y;
                                        mediaEntity.weather = y2Var.u0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = y2Var.u0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = u0Var2.f.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = u0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity3.document_id = codeEmojiDocument2.id;
                                            emojiEntity3.document = codeEmojiDocument2;
                                            emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i17).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, true);
                                            if (isAnimatedStickerDocument4 || x0(emojiEntity3.document)) {
                                                emojiEntity3.subType = (byte) (emojiEntity3.subType | (isAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity3);
                                        }
                                        i12 = i14;
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(mediaEntity);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y3 = view.getY();
                                        mediaEntity.viewWidth = view.getWidth();
                                        mediaEntity.viewHeight = view.getHeight();
                                        mediaEntity.width = (view.getWidth() * scaleX) / k6Var.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY) / k6Var.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / k6Var.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y3) / k6Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10) / k6Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3) / k6Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / k6Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / k6Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (kVar instanceof rg.g1) {
                                            z18 = z16;
                                            if (kVar instanceof rg.q2) {
                                                float imageAspectRatio = ((rg.q2) kVar).x0.getImageAspectRatio();
                                                float f7 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                float f10 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                float measuredWidth = k6Var.getMeasuredWidth() / k6Var.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f11 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f11;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f10 - (f11 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f12 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f12;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f7 - (f12 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = mediaEntity.mediaArea;
                                                if (mediaArea3 != null && (((z19 = kVar instanceof rg.v0)) || (kVar instanceof rg.y2) || (kVar instanceof rg.s0) || (kVar instanceof rg.c2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f13 = mediaEntity.x;
                                                    float f14 = mediaEntity.width;
                                                    mediaAreaCoordinates2.x = ((f14 / 2.0f) + f13) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z19) {
                                                        rg.u0 u0Var3 = ((rg.v0) kVar).q0;
                                                        mediaAreaCoordinates2.w = vl.u(u0Var3.I * 2 * scaleX, k6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = vl.u(u0Var3.J * 2 * scaleY, k6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (kVar instanceof rg.y2) {
                                                        rg.u0 u0Var4 = ((rg.y2) kVar).q0;
                                                        mediaAreaCoordinates2.w = vl.u(u0Var4.I * 2 * scaleX, k6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = vl.u(u0Var4.J * 2 * scaleY, k6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (kVar instanceof rg.s0) {
                                                        rg.q0 q0Var = ((rg.s0) kVar).q0;
                                                        mediaAreaCoordinates2.w = vl.u(q0Var.f * 2 * scaleX, k6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = vl.u(q0Var.h * 2 * scaleY, k6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (kVar instanceof rg.c2) {
                                                        rg.c2 c2Var = (rg.c2) kVar;
                                                        float padding = ((c2Var.getPadding() * 2) * scaleX) / k6Var.getMeasuredWidth();
                                                        float padding2 = ((c2Var.getPadding() * 2) * scaleX) / k6Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((rg.v0) kVar).q0.getRadius();
                                                    } else if (kVar instanceof rg.y2) {
                                                        radius = ((rg.y2) kVar).q0.getRadius();
                                                    } else if (kVar instanceof rg.s0) {
                                                        radius = ((rg.s0) kVar).q0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            rg.g1 g1Var2 = (rg.g1) kVar;
                                            rg.z0 z0Var = g1Var2.r0;
                                            org.telegram.ui.t5 t5Var2 = g1Var2.q0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z18 = z16;
                                            double r10 = g1Var2.r(rectF);
                                            rectF.offset(t5Var2.getX(), t5Var2.getY());
                                            rectF.offset(z0Var.getX(), z0Var.getY());
                                            mediaEntity.mediaArea.coordinates.x = (((rectF.centerX() * scaleX) + vl.c(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / k6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + vl.c(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y3)) / k6Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / k6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / k6Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z14 = z17;
                                        z15 = z18;
                                    } else {
                                        if (kVar instanceof rg.s0) {
                                            rg.s0 s0Var = (rg.s0) kVar;
                                            rg.q0 q0Var2 = s0Var.q0;
                                            mediaEntity.type = (byte) 7;
                                            if (q0Var2.e()) {
                                                mediaEntity.subType = (byte) q0Var2.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) s0Var.getType();
                                            }
                                            mediaEntity.width = q0Var2.getWidth();
                                            mediaEntity.height = q0Var2.getHeight();
                                            mediaEntity.color = s0Var.t0 ? s0Var.getColor() : 0;
                                            mediaEntity.density = q0Var2.e;
                                            mediaEntity.linkSettings = s0Var.u0;
                                            boolean z22 = q0Var2.R;
                                            if (z22) {
                                                ImageReceiver imageReceiver5 = q0Var2.T;
                                                if (z22 && imageReceiver5.hasImageLoaded() && imageReceiver5.getBitmap() != null) {
                                                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver5.getBitmap()), imageReceiver5.getImageKey(), false);
                                                }
                                                rg.p0 p0Var = mediaEntity.linkSettings;
                                                p0Var.a |= 4;
                                                p0Var.i = q0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            rg.p0 p0Var2 = s0Var.u0;
                                            if (p0Var2 != null) {
                                                TLRPC.WebPage webPage = p0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? s0Var.u0.c : s0Var.u0.d.url;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (kVar instanceof rg.c2) {
                                                rg.c2 c2Var2 = (rg.c2) kVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                ah.j1 currentReaction = c2Var2.getCurrentReaction();
                                                if (currentReaction.f != null) {
                                                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                                                    tL_reactionEmoji.emoticon = currentReaction.f;
                                                    tL_reactionCustomEmoji = tL_reactionEmoji;
                                                } else {
                                                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                                                    tL_reactionCustomEmoji2.document_id = currentReaction.g;
                                                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                                                }
                                                tL_mediaAreaSuggestedReaction.reaction = tL_reactionCustomEmoji;
                                                TL_stories.MediaArea mediaArea4 = mediaEntity.mediaArea;
                                                mediaArea4.dark = c2Var2.r0.a == 1;
                                                mediaArea4.flipped = c2Var2.y0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (kVar instanceof rg.d2) {
                                                rg.d2 d2Var = (rg.d2) kVar;
                                                iv0 baseSize3 = d2Var.getBaseSize();
                                                mediaEntity.width = baseSize3.a;
                                                mediaEntity.height = baseSize3.b;
                                                mediaEntity.type = (byte) 5;
                                                if (o8Var != null) {
                                                    mediaEntity.text = o8Var.o0.getAbsolutePath();
                                                    mediaEntity.roundOffset = o8Var.r0;
                                                    long j3 = o8Var.q0;
                                                    mediaEntity.roundDuration = j3;
                                                    float f15 = j3;
                                                    mediaEntity.roundLeft = (long) (o8Var.s0 * f15);
                                                    mediaEntity.roundRight = (long) (o8Var.t0 * f15);
                                                }
                                                mediaEntity.subType = (byte) 4;
                                                if (d2Var.r0) {
                                                    mediaEntity.subType = (byte) (4 | 2);
                                                }
                                            } else if (kVar instanceof rg.g1) {
                                                rg.g1 g1Var3 = (rg.g1) kVar;
                                                org.telegram.ui.t5 t5Var3 = g1Var3.q0;
                                                ArrayList arrayList3 = g1Var3.s0;
                                                rg.z0 z0Var2 = g1Var3.r0;
                                                mediaEntity.type = (byte) 6;
                                                int width = g1Var3.getWidth();
                                                mediaEntity.viewWidth = width;
                                                mediaEntity.width = width;
                                                int height = g1Var3.getHeight();
                                                mediaEntity.viewHeight = height;
                                                mediaEntity.height = height;
                                                MessageObject messageObject = arrayList3.size() > 0 ? (MessageObject) arrayList3.get(0) : null;
                                                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i25 = 0;
                                                        while (true) {
                                                            if (i25 >= z0Var2.getChildCount()) {
                                                                w0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = z0Var2.getChildAt(i25);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                                                w0Var = (org.telegram.ui.Cells.w0) childAt2;
                                                                break;
                                                            }
                                                            i25++;
                                                        }
                                                        if (w0Var == null || (y3Var = w0Var.F0) == null || (imageReceiver3 = y3Var.d) == null) {
                                                            g1Var = g1Var3;
                                                            i12 = i14;
                                                            t5Var = t5Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (o8Var != null) {
                                                                    Matrix matrix = o8Var.n0;
                                                                    if (o8Var.K) {
                                                                        matrix.reset();
                                                                        if (z0Var2.getChildCount() == 1) {
                                                                            view3 = z0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.t1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.t1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, o8Var.k0), imageReceiver2.getImageHeight() / Math.max(1, o8Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.getCenterX() - ((o8Var.k0 * max) / 2.0f), imageReceiver2.getCenterY() - ((o8Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(t5Var.getX(), t5Var.getY());
                                                                                    matrix.postTranslate(z0Var2.getX(), z0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(g1Var.getScaleX(), g1Var.getScaleY(), g1Var.getPivotX(), g1Var.getPivotY());
                                                                                    matrix.postRotate(g1Var.getRotation(), g1Var.getPivotX(), g1Var.getPivotY());
                                                                                    matrix.postTranslate(g1Var.getX(), g1Var.getY());
                                                                                    matrix.postScale(1.0f / k6Var.getWidth(), 1.0f / k6Var.getHeight());
                                                                                    matrix.postScale(o8Var.i0, o8Var.j0);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            view3 = null;
                                                                        }
                                                                        imageReceiver2 = null;
                                                                        if (imageReceiver2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                                z16 = false;
                                                            } else {
                                                                z16 = true;
                                                            }
                                                            z17 = true;
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y32 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / k6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY2) / k6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / k6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y32) / k6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102) / k6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32) / k6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / k6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / k6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (kVar instanceof rg.g1) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        } else {
                                                            imageReceiver3.setVisible(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) zh.s5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float dp = AndroidUtilities.dp(110.0f);
                                                                g1Var = g1Var3;
                                                                float centerX = imageReceiver3.getCenterX() + w0Var.getX() + z0Var2.getX() + w0Var.D0;
                                                                float centerY = imageReceiver3.getCenterY() + w0Var.getY() + z0Var2.getY() + w0Var.E0;
                                                                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                imageReceiver4 = imageReceiver3;
                                                                mediaEntity2.type = (byte) 0;
                                                                mediaEntity2.width = dp;
                                                                mediaEntity2.height = dp;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                mediaEntity2.document = document2;
                                                                mediaEntity2.parentObject = starGift;
                                                                mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                                                                if (MessageObject.isAnimatedStickerDocument(document2, true) || x0(document2)) {
                                                                    boolean isAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document2, true);
                                                                    mediaEntity2.subType = (byte) (mediaEntity2.subType | (isAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                    xi0 lottieAnimation = imageReceiver4.getLottieAnimation();
                                                                    if (lottieAnimation != null && (isAnimatedStickerDocument5 || x0(document2))) {
                                                                        r20 = lottieAnimation.p();
                                                                    }
                                                                    if (r20 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r20);
                                                                        q6Var.g1 = q6Var.g1.multiply(valueOf3).divide(q6Var.g1.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y10 = childAt.getY();
                                                                int i26 = (int) dp;
                                                                mediaEntity2.viewWidth = i26;
                                                                mediaEntity2.viewHeight = i26;
                                                                mediaEntity2.width = (dp * scaleX2) / k6Var.getMeasuredWidth();
                                                                mediaEntity2.height = (dp * scaleY3) / k6Var.getMeasuredHeight();
                                                                mediaEntity2.x = (childAt.getWidth() / 2.0f) + x11;
                                                                mediaEntity2.y = (childAt.getHeight() / 2.0f) + y10;
                                                                i12 = i14;
                                                                float c10 = vl.c(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                float c11 = vl.c(childAt.getHeight(), 2.0f, scaleY3, centerY * scaleY3);
                                                                t5Var = t5Var3;
                                                                view = childAt;
                                                                double d10 = mediaEntity2.x;
                                                                double d11 = c10;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double cos = Math.cos(rotation) * d11;
                                                                double d12 = c11;
                                                                mediaEntity2.x = (float) ((cos - (Math.sin(rotation) * d12)) + d10);
                                                                float cos2 = (float) ((Math.cos(rotation) * d12) + (Math.sin(rotation) * d11) + mediaEntity2.y);
                                                                float f16 = (-dp) / 2.0f;
                                                                float f17 = (f16 * scaleX2) + mediaEntity2.x;
                                                                mediaEntity2.x = f17;
                                                                mediaEntity2.y = (f16 * scaleY3) + cos2;
                                                                mediaEntity2.x = f17 / k6Var.getMeasuredWidth();
                                                                mediaEntity2.y /= k6Var.getMeasuredHeight();
                                                                mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mediaEntity2.scale = scaleX2;
                                                                arrayList.add(mediaEntity2);
                                                            } else {
                                                                g1Var = g1Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                i12 = i14;
                                                                t5Var = t5Var3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y322 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / k6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY22) / k6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / k6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y322) / k6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022) / k6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322) / k6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / k6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / k6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (kVar instanceof rg.g1) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                g1Var = g1Var3;
                                                i12 = i14;
                                                t5Var = t5Var3;
                                                view = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i17).getInputChannel(-o8.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    Boolean D = o8.D(messageObject);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z12) {
                                                }
                                                z17 = true;
                                                arrayList.add(mediaEntity);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y3222 = view.getY();
                                                mediaEntity.viewWidth = view.getWidth();
                                                mediaEntity.viewHeight = view.getHeight();
                                                mediaEntity.width = (view.getWidth() * scaleX) / k6Var.getMeasuredWidth();
                                                mediaEntity.height = (view.getHeight() * scaleY222) / k6Var.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / k6Var.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y3222) / k6Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10222) / k6Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3222) / k6Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / k6Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / k6Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (kVar instanceof rg.g1) {
                                                }
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            i12 = i14;
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(mediaEntity);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y32222 = view.getY();
                                            mediaEntity.viewWidth = view.getWidth();
                                            mediaEntity.viewHeight = view.getHeight();
                                            mediaEntity.width = (view.getWidth() * scaleX) / k6Var.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY2222) / k6Var.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / k6Var.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y32222) / k6Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102222) / k6Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32222) / k6Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / k6Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / k6Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (kVar instanceof rg.g1) {
                                            }
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea != null) {
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        }
                                        i12 = i14;
                                    }
                                }
                                i12 = i14;
                                view = childAt;
                                z16 = false;
                                z17 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y322222 = view.getY();
                                mediaEntity.viewWidth = view.getWidth();
                                mediaEntity.viewHeight = view.getHeight();
                                mediaEntity.width = (view.getWidth() * scaleX) / k6Var.getMeasuredWidth();
                                mediaEntity.height = (view.getHeight() * scaleY22222) / k6Var.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / k6Var.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y322222) / k6Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022222) / k6Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322222) / k6Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / k6Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / k6Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (kVar instanceof rg.g1) {
                                }
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                k6Var = k6Var2;
                                i12 = childCount;
                                i13 = i16;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / k6Var.getMeasuredWidth();
                                int i27 = 0;
                                while (i27 < 2) {
                                    Canvas canvas3 = i27 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i27 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.x * k6Var.getMeasuredWidth(), mediaEntity.y * k6Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * k6Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * k6Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof rg.x2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof rg.g1) {
                                                rg.g1 g1Var4 = (rg.g1) view2;
                                                rg.z0 z0Var3 = g1Var4.r0;
                                                boolean z23 = true;
                                                g1Var4.u0 = true;
                                                int i28 = 0;
                                                while (i28 < z0Var3.getChildCount()) {
                                                    View childAt3 = z0Var3.getChildAt(i28);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                                                        ((org.telegram.ui.Cells.t1) childAt3).oe = z23;
                                                    }
                                                    i28++;
                                                    z23 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z24 = false;
                                                g1Var4.u0 = false;
                                                int i29 = 0;
                                                while (i29 < z0Var3.getChildCount()) {
                                                    View childAt4 = z0Var3.getChildAt(i29);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                                        ((org.telegram.ui.Cells.t1) childAt4).oe = z24;
                                                    }
                                                    i29++;
                                                    z24 = false;
                                                }
                                            } else {
                                                view2.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                            int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                            Bitmap createBitmap2 = Bitmaps.createBitmap(scaleX3, scaleY4, Bitmap.Config.ARGB_8888);
                                            Canvas canvas4 = new Canvas(createBitmap2);
                                            canvas = canvas2;
                                            canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                            view2.draw(canvas4);
                                            canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                            canvas3.drawBitmap(createBitmap2, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                            try {
                                                canvas4.setBitmap(null);
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                            }
                                            createBitmap2.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i27++;
                                    view = view2;
                                    canvas2 = canvas;
                                }
                                if (imageReceiver != null) {
                                    imageReceiver.setVisible(true, false);
                                    i16 = i13 + 1;
                                    q6Var = this;
                                    childCount = i12;
                                    k6Var2 = k6Var;
                                    i15 = 0;
                                    b10 = 1;
                                }
                            }
                        } else {
                            k6Var = k6Var2;
                            i12 = childCount;
                            i13 = i16;
                        }
                        i16 = i13 + 1;
                        q6Var = this;
                        childCount = i12;
                        k6Var2 = k6Var;
                        i15 = 0;
                        b10 = 1;
                    }
                }
                return bitmap;
            }
            Bitmap c12 = g6Var.c(false, false);
            createBitmap = c12 != null ? Bitmap.createBitmap(c12.getWidth(), c12.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        q6Var.g1 = BigInteger.ONE;
        i11 = 0;
        while (i10 < k6Var2.getChildCount()) {
        }
        if (i11 > 0) {
        }
        return bitmap;
    }

    @Override // rg.i
    public final void u(float f7, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.O0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f7 - view2.getX()) - view.getLeft();
        float y3 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y3 - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    public final boolean u0() {
        return this.D0.a() || this.l2;
    }

    @Override // rg.i
    public final boolean v(rg.k kVar) {
        return D0(kVar, true);
    }

    public final void v0(boolean z10) {
        int i10 = 0;
        if (this.q2) {
            J0(0);
        }
        if (z10) {
            kz kzVar = this.p2;
            if (kzVar == null || kzVar.getVisibility() != 0) {
                w0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.p2.getMeasuredHeight());
            ofFloat.addUpdateListener(new a5(this, i10));
            this.s2 = true;
            ofFloat.addListener(new w5(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
            ofFloat.start();
        }
    }

    @Override // rg.i
    public final int[] w(rg.k kVar) {
        int i10 = (int) kVar.getPosition().x;
        int[] iArr = this.o2;
        iArr[0] = i10;
        iArr[1] = (int) kVar.getPosition().y;
        return iArr;
    }

    public final void w0() {
        kz kzVar;
        if (!this.q2 && (kzVar = this.p2) != null && kzVar.getVisibility() != 8) {
            this.p2.setVisibility(8);
        }
        int i10 = this.t2;
        this.t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override // rg.s1
    public final qg.s0 x() {
        return qg.s0.e(this.F1);
    }

    public final boolean y0() {
        if (this.c2) {
            if (this.Z1.getReactionsWindow() == null || this.Z1.getReactionsWindow().q) {
                O0(false);
                return true;
            }
            this.Z1.e();
            return true;
        }
        if (this.B1) {
            I0(false);
            return true;
        }
        if (this.q2) {
            v0(true);
            return true;
        }
        if (!this.K0) {
            return false;
        }
        if (!this.M0) {
            D0(null, true);
            return true;
        }
        this.M0 = false;
        this.O1.b(true);
        return false;
    }

    public abstract void z0(boolean z10);

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f7) {
    }
}
