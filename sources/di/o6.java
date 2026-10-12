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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class o6 extends pw0 implements rg.s1, rg.h, rg.o1, nw0, gc {
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
    public final c6 G1;
    public iw0 H0;
    public org.telegram.ui.ActionBar.m1 H1;
    public boolean I0;
    public m6 I1;
    public rg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final jc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final e6 O0;
    public final r5 O1;
    public final g6 P0;
    public k8 P1;
    public final j6 Q0;
    public ArrayList Q1;
    public final i6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final k6 T0;
    public qg.x T1;
    public final o5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public v5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public gl0 Z1;
    public float a1;
    public rg.c2 a2;
    public ValueAnimator b1;
    public float b2;
    public boolean c1;
    public boolean c2;
    public final rg.y1 d1;
    public boolean d2;
    public final k6.h e1;
    public org.telegram.ui.Components.la e2;
    public final int f1;
    public final z6 f2;
    public BigInteger g1;
    public final a7 g2;
    public TextView h1;
    public boolean h2;
    public TextView i1;
    public ObjectAnimator i2;
    public TextView j1;
    public final float[] j2;
    public final rg.t1 k1;
    public x5 k2;
    public final rg.q1 l1;
    public boolean l2;
    public final rg.v1 m1;
    public boolean m2;
    public final ImageView n1;
    public boolean n2;
    public final TextView o1;
    public final int[] o2;
    public final TextView p1;
    public wz p2;
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
    public final p5 w1;
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
    public o6(android.content.Context r30, boolean r31, java.io.File r32, boolean r33, boolean r34, di.jc r35, android.app.Activity r36, int r37, android.graphics.Bitmap r38, android.graphics.Bitmap r39, int r40, java.util.ArrayList r41, di.k8 r42, int r43, int r44, org.telegram.messenger.MediaController.CropState r45, org.telegram.ui.Components.la r46, org.telegram.ui.ActionBar.c6 r47, di.z6 r48, di.a7 r49) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di.o6.<init>(android.content.Context, boolean, java.io.File, boolean, boolean, di.jc, android.app.Activity, int, android.graphics.Bitmap, android.graphics.Bitmap, int, java.util.ArrayList, di.k8, int, int, org.telegram.messenger.MediaController$CropState, org.telegram.ui.Components.la, org.telegram.ui.ActionBar.c6, di.z6, di.a7):void");
    }

    public static void F0(rg.x2 x2Var, int i10) {
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

    public static void Z(mb mbVar, qg.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        mbVar.setNewColor(num.intValue());
        mbVar.w1.setSelectedColorIndex(s0Var.d());
        mbVar.T1 = null;
    }

    public static /* synthetic */ void a0(mb mbVar, Integer num) {
        mbVar.setNewColor(num.intValue());
        mbVar.H0(false);
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

    private iw0 getPaintingSize() {
        iw0 iw0Var = this.H0;
        if (iw0Var != null) {
            return iw0Var;
        }
        iw0 iw0Var2 = new iw0(1080.0f, 1920.0f);
        this.H0 = iw0Var2;
        return iw0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 >= i6Var.getChildCount()) {
                return;
            }
            View childAt = i6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                ImageReceiver imageReceiver = ((rg.q2) childAt).x0;
                yj0 lottieAnimation = imageReceiver.getLottieAnimation();
                org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
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
        D0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new b5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            ((rg.x2) jVar).setType(i10);
        }
        qg.s0 e = qg.s0.e(this.F1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        v5 v5Var = new v5(this, context);
        this.W0 = v5Var;
        v5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.a6.a(40.0f, 52.0f, 0.0f, 52.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        this.h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.h1;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        c6 c6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), 7, -1));
        this.h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.h1.setTextColor(-1);
        this.h1.setTextSize(1, 14.0f);
        this.h1.setGravity(1);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setSingleLine();
        final int i11 = 0;
        this.h1.setOnClickListener(new View.OnClickListener(this) { // from class: di.u4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o6 o6Var = this.b;
                        if (!o6Var.K0) {
                            o6Var.Q0(0);
                            break;
                        } else {
                            o6Var.C0(null, true);
                            break;
                        }
                    case 1:
                        this.b.z0();
                        break;
                    default:
                        o6 o6Var2 = this.b;
                        o6Var2.Q0(2);
                        if (!(o6Var2.J0 instanceof rg.x2)) {
                            o6Var2.l2 = true;
                            o6Var2.n0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.addView(this.h1, w7.a6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.i1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), 7, -1));
        this.i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i12 = 1;
        this.i1.setOnClickListener(new View.OnClickListener(this) { // from class: di.u4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        o6 o6Var = this.b;
                        if (!o6Var.K0) {
                            o6Var.Q0(0);
                            break;
                        } else {
                            o6Var.C0(null, true);
                            break;
                        }
                    case 1:
                        this.b.z0();
                        break;
                    default:
                        o6 o6Var2 = this.b;
                        o6Var2.Q0(2);
                        if (!(o6Var2.J0 instanceof rg.x2)) {
                            o6Var2.l2 = true;
                            o6Var2.n0(true);
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
        this.W0.addView(this.i1, w7.a6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.j1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), 7, -1));
        this.j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.j1.setTextColor(-1);
        this.j1.setTextSize(1, 14.0f);
        this.j1.setGravity(1);
        this.j1.setTypeface(AndroidUtilities.bold());
        this.j1.setAlpha(0.6f);
        this.j1.setSingleLine();
        final int i13 = 2;
        this.j1.setOnClickListener(new View.OnClickListener(this) { // from class: di.u4
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        o6 o6Var = this.b;
                        if (!o6Var.K0) {
                            o6Var.Q0(0);
                            break;
                        } else {
                            o6Var.C0(null, true);
                            break;
                        }
                    case 1:
                        this.b.z0();
                        break;
                    default:
                        o6 o6Var2 = this.b;
                        o6Var2.Q0(2);
                        if (!(o6Var2.J0 instanceof rg.x2)) {
                            o6Var2.l2 = true;
                            o6Var2.n0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.addView(this.j1, w7.a6.l(1.0f, 0, -2));
    }

    public static boolean w0(TLRPC.Document document) {
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
        M0(new e5(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0(rg.j jVar) {
        this.D0.b(jVar.getUUID(), new d5(this, jVar, 0));
    }

    public final void B0(rg.j jVar) {
        rg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            C0(null, true);
            if (jVar instanceof rg.x2) {
                ValueAnimator valueAnimator = this.b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                Q0(0);
            }
        }
        this.R0.removeView(jVar);
        f0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            qg.t1 t1Var = this.D0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(t1Var, 18));
        }
        rg.y1 y1Var = this.d1;
        k6.h hVar = this.e1;
        y1Var.setValueOverride(hVar);
        y1Var.setShowPreview(true);
        float f7 = hVar.get();
        qg.q1 q1Var = this.A1;
        q1Var.c = f7;
        D0(q1Var, null, false);
        if (this.n2 || !(jVar instanceof rg.d2)) {
            return;
        }
        kc kcVar = ((mb) this).A2;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.s(null, null, true);
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            mbVar.p0();
        }
        ac acVar = kcVar.c1;
        if (acVar != null) {
            acVar.setHasRoundVideo(false);
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null) {
            File file = k8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.K1.o0 = null;
            }
            if (kcVar.K1.p0 != null) {
                try {
                    new File(kcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                kcVar.K1.p0 = null;
            }
        }
    }

    public final boolean C0(rg.j jVar, boolean z10) {
        boolean z11;
        uc ucVar;
        uc ucVar2;
        gl0 gl0Var;
        int i10;
        boolean z12 = jVar instanceof rg.x2;
        int i11 = 2;
        if (z12 && (((i10 = this.Z0) == -1 && this.Y0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.b1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.B1) {
                H0(false);
            }
            Q0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            rg.x2 x2Var = (rg.x2) jVar;
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
        rg.j jVar2 = this.J0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.d0) {
                    if (jVar instanceof rg.v0) {
                        rg.v0 v0Var = (rg.v0) jVar;
                        v0Var.setType((v0Var.getType() + 1) % v0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof rg.y2) {
                        rg.y2 y2Var = (rg.y2) jVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof rg.s0) {
                        rg.s0 s0Var = (rg.s0) jVar;
                        rg.q0 q0Var = s0Var.q0;
                        if (q0Var.e()) {
                            q0Var.setPreviewType(q0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        s0Var.setType(s0Var.getNextType());
                        return true;
                    }
                    if (!this.K0) {
                        if (jVar instanceof rg.x2) {
                            this.M0 = true;
                            q0();
                            return true;
                        }
                        if (!(jVar instanceof rg.c2)) {
                            L0(jVar2);
                            return true;
                        }
                        rg.c2 c2Var = (rg.c2) jVar;
                        if (this.c2 && this.a2 == jVar) {
                            c2Var.q(true);
                            return true;
                        }
                        rg.c2 c2Var2 = this.a2;
                        if (c2Var2 != null && c2Var2 != c2Var && (gl0Var = this.Z1) != null) {
                            gl0Var.animate().alpha(0.0f).setListener(new t5(gl0Var, 0));
                            this.Z1 = null;
                            this.c2 = false;
                            this.b2 = 0.0f;
                        }
                        if (this.Z1 == null) {
                            gl0 gl0Var2 = new gl0(2, this.F1, getContext(), LaunchActivity.R(), new bi.n3(6, new bi.b()));
                            this.Z1 = gl0Var2;
                            org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(this.e2, gl0Var2, 0, false);
                            this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.M1.addView(this.Z1, w7.a6.a(96.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.k(-16777216, 120));
                            gl0 gl0Var3 = this.Z1;
                            com.google.android.gms.internal.cast.z5 z5Var = new com.google.android.gms.internal.cast.z5();
                            z5Var.e = this;
                            z5Var.a = paVar;
                            z5Var.d = paint;
                            z5Var.c = new Path();
                            gl0Var3.setDelegate(z5Var);
                            this.Z1.p(null, null, true);
                        }
                        this.Z1.setFragment(LaunchActivity.R());
                        this.a2 = c2Var;
                        N0(true);
                        return true;
                    }
                    if (jVar2 instanceof rg.x2) {
                        AndroidUtilities.showKeyboard(((rg.x2) jVar2).getFocusedView());
                        u0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            rg.j jVar3 = this.J0;
            if (jVar3 instanceof rg.x2) {
                rg.x2 x2Var2 = (rg.x2) jVar3;
                rg.w2 w2Var = x2Var2.q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((rg.x2) this.J0).getFocusedView());
                    u0(false);
                }
            } else if ((jVar3 instanceof rg.d2) && (ucVar2 = ((mb) this).A2.Z0) != null) {
                ucVar2.l(false);
            }
            z11 = true;
        }
        rg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof rg.x2) && TextUtils.isEmpty(((rg.x2) jVar4).getText())) {
            B0(jVar4);
        }
        rg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof rg.d2) && (ucVar = ((mb) this).A2.Z0) != null) {
            ucVar.l(true);
        }
        rg.j jVar6 = this.J0;
        k6.h hVar = this.e1;
        qg.q1 q1Var2 = this.A1;
        rg.y1 y1Var = this.d1;
        if (jVar6 != null) {
            j6 j6Var = this.Q0;
            jVar6.m0 = j6Var;
            jVar6.l(j6Var, true);
            rg.j jVar7 = this.J0;
            if (jVar7 instanceof rg.x2) {
                rg.x2 x2Var3 = (rg.x2) jVar7;
                x2Var3.getSwatch().c = q1Var2.c;
                x2Var3.z0 = false;
                E0(x2Var3.getSwatch());
                y1Var.setValueOverride(new s5(x2Var3, (int) (this.H0.a / 9.0f), 0));
                y1Var.setShowPreview(false);
            } else {
                y1Var.setValueOverride(hVar);
                y1Var.setShowPreview(true);
                q1Var2.c = hVar.get();
                D0(q1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.b1;
            if (valueAnimator2 != null && this.Z0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.B1) {
                H0(false);
            }
            Q0(0);
            y1Var.setValueOverride(hVar);
            y1Var.setShowPreview(true);
            q1Var2.c = hVar.get();
            D0(q1Var2, null, false);
            z13 = z11;
        }
        T0();
        return z13;
    }

    @Override // rg.o1
    public final void D() {
        O0(true);
    }

    public final void D0(qg.q1 q1Var, Integer num, boolean z10) {
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
        e6 e6Var = this.O0;
        e6Var.setColor(i11);
        e6Var.setBrushSize(q1Var.c);
        int i12 = q1Var2.a;
        int i13 = 0;
        if (num == null || num.intValue() == i12) {
            k6 k6Var = this.T0;
            if (k6Var != null) {
                k6Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new v4(this, num, i12, i13));
            duration.start();
        }
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            ((rg.x2) jVar).setSwatch(new qg.q1(q1Var.b, q1Var.c, q1Var.a));
            return;
        }
        if (z10 && (jVar instanceof rg.v0)) {
            ((rg.v0) jVar).setColor(q1Var.a);
            ((rg.v0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.y2)) {
            ((rg.y2) jVar).setColor(q1Var.a);
            ((rg.y2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof rg.s0)) {
            ((rg.s0) jVar).setColor(q1Var.a);
            ((rg.s0) this.J0).setType(0);
        }
    }

    public final void E0(qg.q1 q1Var) {
        D0(q1Var, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, android.view.ViewGroup, di.i6] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    public final void G0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        rg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList == null) {
            return;
        }
        k8 k8Var = this.P1;
        this.P1 = null;
        this.Q1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ?? r13 = this.R0;
            if (i11 >= size) {
                r13.setVisibility(z10 ? 1 : 0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                b6 m0 = m0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    m0.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i10 = i11;
                jVar = m0;
            } else if (b10 == 1) {
                rg.x2 n02 = n0(z10);
                n02.setType(mediaEntity.subType);
                n02.setTypeface(mediaEntity.textTypeface);
                n02.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                for (?? r52 = z10; r52 < size2; r52++) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(r52);
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(emojiEntity.document_id, 1.0f, n02.getFontMetricsInt());
                    int i12 = emojiEntity.offset;
                    spannableString.setSpan(b6Var, i12, emojiEntity.length + i12, 33);
                    i11 = i11;
                }
                i10 = i11;
                CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, n02.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                n02.setText(replaceEmoji);
                F0(n02, mediaEntity.textAlign);
                qg.q1 swatch = n02.getSwatch();
                swatch.a = mediaEntity.color;
                n02.setSwatch(swatch);
                jVar = n02;
            } else {
                i10 = i11;
                if (b10 == 2) {
                    rg.z1 j02 = j0(mediaEntity.text, false);
                    j02.G0 = mediaEntity.crop;
                    j02.B0 = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        j02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        j02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = j02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    jVar = j02;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = k8Var.v;
                    boolean z11 = k8Var.K;
                    this.l2 = true;
                    rg.j a6Var = new a6(this, getContext(), e0(), arrayList3, this.e2, z11, this.f2);
                    a6Var.setDelegate(this);
                    r13.addView(a6Var);
                    f0();
                    jVar = a6Var;
                    if (mediaEntity.viewWidth > 0) {
                        jVar = a6Var;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = a6Var.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            jVar = a6Var;
                        }
                    }
                } else if (b10 == 3) {
                    rg.v0 i02 = i0(mediaEntity.media, mediaEntity.mediaArea);
                    int i13 = mediaEntity.color;
                    if (i13 != 0) {
                        i02.setColor(i13);
                    }
                    i02.setType(mediaEntity.subType);
                    jVar = i02;
                } else if (b10 == 8) {
                    id idVar = mediaEntity.weather;
                    if (idVar == null) {
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        rg.y2 o02 = o0(idVar);
                        int i14 = mediaEntity.color;
                        if (i14 != 0) {
                            o02.setColor(i14);
                        }
                        o02.setType(mediaEntity.subType);
                        jVar = o02;
                    }
                } else if (b10 == 7) {
                    rg.s0 h02 = h0(mediaEntity.linkSettings);
                    rg.q0 q0Var = h02.q0;
                    int i15 = mediaEntity.color;
                    if (i15 != 0) {
                        h02.setColor(i15);
                    }
                    boolean e = q0Var.e();
                    int i16 = q0Var.h;
                    int i17 = q0Var.f;
                    if (e) {
                        q0Var.setPreviewType(mediaEntity.subType);
                    }
                    byte b11 = mediaEntity.subType;
                    if (b11 == -1) {
                        h02.setType(3);
                        q0Var.d();
                        mediaEntity.viewWidth = ((int) Math.ceil(q0Var.a0)) + i17 + i17;
                        mediaEntity.viewHeight = ((int) Math.ceil(q0Var.b0)) + i16 + i16;
                        PointF position = h02.getPosition();
                        position.y = (this.S1 * 0.3f) + position.y;
                        h02.setPosition(position);
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        h02.setType(b11);
                        jVar = h02;
                    }
                } else if (b10 == 4) {
                    rg.c2 k02 = k0(false);
                    k02.s(ah.i1.d(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        k02.r(false);
                    }
                    jVar = k02;
                    if (mediaEntity.mediaArea.dark) {
                        k02.q(false);
                        jVar = k02;
                    }
                } else {
                    if (b10 == 5 && k8Var.o0 != null) {
                        rg.d2 l02 = l0(k8Var.p0, false);
                        kc kcVar = ((mb) this).A2;
                        yb ybVar = kcVar.X0;
                        if (ybVar != null) {
                            ybVar.w = l02;
                            h81 h81Var = ybVar.x;
                            if (h81Var != null) {
                                h81Var.V(l02.u0);
                            }
                        }
                        ac acVar = kcVar.c1;
                        if (acVar != null) {
                            acVar.setHasRoundVideo(true);
                        }
                        jVar = l02;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z12 = !l02.r0;
                            l02.r0 = z12;
                            l02.s0.f(z12, true);
                            l02.invalidate();
                            jVar = l02;
                        }
                    }
                    i11 = i10 + 1;
                    z10 = false;
                }
            }
            jVar.setX((mediaEntity.x * this.R1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            jVar.setY((mediaEntity.y * this.S1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
            jVar.setScale(mediaEntity.scale);
            jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
            i11 = i10 + 1;
            z10 = false;
        }
    }

    @Override // org.telegram.ui.Components.nw0
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
        r5 r5Var = this.O1;
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
                r5Var.a();
                requestLayout();
            }
        }
        if (this.x2 == i10 && this.y2 == z10) {
            return;
        }
        this.x2 = i10;
        this.y2 = z10;
        boolean z13 = this.r2;
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            this.r2 = ((rg.x2) jVar).getEditText().isFocused() && r5Var.c();
        } else {
            this.r2 = false;
        }
        if (this.r2 && this.q2) {
            I0(0);
        }
        if (this.t2 != 0 && !(z11 = this.r2) && z11 != z13 && !this.q2) {
            this.t2 = 0;
            r5Var.a();
            requestLayout();
        }
        T0();
        if (z13 && !this.r2 && this.t2 > 0 && this.u2) {
            this.u2 = false;
        }
        R0();
    }

    public final void H0(final boolean z10) {
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
            this.C1.b(new o1.g() { // from class: di.w4
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    o6 o6Var = o6.this;
                    k6 k6Var = o6Var.T0;
                    float f11 = f7 / 1000.0f;
                    o6Var.D1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(o6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(o6Var.D1, 0.25f) / 0.25f));
                    p5 p5Var = o6Var.w1;
                    float f13 = o6Var.D1;
                    boolean z11 = z10;
                    p5Var.z1(f13, z11);
                    rg.l1 l1Var = o6Var.B0;
                    l1Var.setProgress(o6Var.D1);
                    rg.h1 h1Var = o6Var.A0;
                    h1Var.setProgress(o6Var.D1);
                    o6Var.W0.setTranslationY(AndroidUtilities.dp(32.0f) * o6Var.D1);
                    AnimatorSet animatorSet = o6Var.N1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f14 = o6Var.D1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        float f15 = z11 ? 1.0f : 0.0f;
                        float f16 = alpha;
                        l1Var.setAlpha(AndroidUtilities.lerp(f16, f15, f14));
                        h1Var.setAlpha(AndroidUtilities.lerp(f16, z11 ? 1.0f : 0.0f, f14));
                        k6Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    k6Var.invalidate();
                    if (view == o6Var.l1) {
                        o6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new x4(this, z10, i10));
            this.C1.h();
            if (z10) {
                p5 p5Var = this.w1;
                p5Var.setVisibility(0);
                p5Var.setSelectedColorIndex(qg.s0.e(this.F1).d());
            }
        }
    }

    public final void I0(int i10) {
        rg.q1 q1Var = this.l1;
        r5 r5Var = this.O1;
        int i11 = 1;
        if (i10 == 1) {
            wz wzVar = this.p2;
            boolean z10 = wzVar != null && wzVar.getVisibility() == 0;
            wz wzVar2 = this.p2;
            jc jcVar = this.M1;
            if (wzVar2 != null && wzVar2.c1 != UserConfig.selectedAccount) {
                jcVar.removeView(wzVar2);
                this.p2 = null;
            }
            if (this.p2 == null) {
                wz wzVar3 = new wz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.p2 = wzVar3;
                wzVar3.w2 = false;
                wzVar3.U0 = true;
                wzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.p2.setForseMultiwindowLayout(true);
                }
                this.p2.setDelegate(new d6(this));
                jcVar.addView(this.p2);
            }
            this.p2.setVisibility(0);
            this.q2 = true;
            wz wzVar4 = this.p2;
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
            int paddingUnderContainer = jcVar.getPaddingUnderContainer() + (point.x > point.y ? this.w2 : this.v2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            wzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                rg.j jVar = this.J0;
                if (jVar instanceof rg.x2) {
                    AndroidUtilities.hideKeyboard(((rg.x2) jVar).getEditText());
                }
            }
            this.t2 = paddingUnderContainer;
            r5Var.a();
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
                    ofFloat.addUpdateListener(new y4(this, i11));
                    ofFloat.addListener(new u5(this, i11));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                    ofFloat.start();
                }
            }
        } else {
            bh emojiButton2 = q1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(zg.e, true);
            }
            wz wzVar5 = this.p2;
            if (wzVar5 != null) {
                this.q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.t2 = 0;
                r5Var.a();
            }
            requestLayout();
        }
        R0();
    }

    public final void J0(rg.s0 s0Var) {
        t8 t8Var = new t8(getContext(), this.G1, this.g2, new bi.v2(4, this, s0Var));
        if (s0Var != null) {
            rg.p0 p0Var = s0Var.u0;
            t8Var.c0 = true;
            org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
            org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
            if (p0Var != null) {
                t8Var.g0 = p0Var.d;
                t8Var.h0 = false;
                j3Var2.setText(p0Var.c);
                j3Var.setText(p0Var.b);
                t8Var.m0 = !TextUtils.isEmpty(p0Var.b);
                t8Var.n0 = p0Var.f;
                t8Var.o0 = p0Var.e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                t8Var.n0 = true;
                t8Var.o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = t8Var.b0;
            dVar.g(string, false, true);
            p8 p8Var = t8Var.X;
            if (p8Var != null) {
                p8Var.N(false);
            }
            dVar.setEnabled(t8Var.W(j3Var2.getText().toString()));
            t8Var.c0 = false;
        }
        t8Var.setOnDismissListener(new k5(this, 1));
        t8Var.show();
        y0(true);
    }

    public final void K0(rg.v0 v0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        vi viVar = new vi(getContext(), new y5(this, callback2), false, true, false, this.G1);
        viVar.c2 = new z5();
        xh xhVar = viVar.A1;
        if (v0Var != null && (messageMedia = v0Var.u0) != null && (geoPoint = messageMedia.geo) != null) {
            viVar.A2 = new double[]{geoPoint.lat, geoPoint._long};
            viVar.O = true;
            xhVar.setVisibility(8);
        } else if (this.U1) {
            viVar.y2 = this.W1;
            viVar.z2 = this.V1;
            viVar.O = true;
            xhVar.setVisibility(8);
        } else {
            viVar.O = true;
            xhVar.setVisibility(8);
        }
        viVar.setOnDismissListener(new k5(this, 0));
        viVar.t1();
        viVar.show();
    }

    public final void L0(rg.j jVar) {
        if (jVar instanceof rg.g1) {
            org.telegram.ui.ActionBar.m1 m1Var = this.H1;
            if (m1Var == null || !m1Var.isShowing()) {
                return;
            }
            this.H1.d(true);
            return;
        }
        int[] iArr = this.o2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        i6 i6Var = this.R0;
        float scaleX2 = i6Var.getScaleX() * scaleX;
        float scaleY = i6Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        M0(new d5(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void M0(Runnable runnable, o6 o6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.m1 m1Var = this.H1;
        if (m1Var != null && m1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            m6 m6Var = new m6(this, getContext());
            this.I1 = m6Var;
            m6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new f5(this, 0));
            this.I1.setDispatchKeyEventListener(new g5(this));
            this.I1.setShownFromBottom(true);
        }
        m6 m6Var2 = this.I1;
        m6Var2.W = z10;
        m6Var2.d();
        runnable.run();
        if (this.H1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.I1, -2, -2);
            this.H1 = m1Var2;
            m1Var2.b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new h5(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(o6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.m1.i(this.I1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            m6 m6Var3 = this.I1;
            m6Var3.setBackgroundDrawable(new org.telegram.ui.Components.oa(new org.telegram.ui.Components.pa(this.e2, m6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.I1.setBackgroundDrawable(mutate);
            this.I1.setBackgroundColor(-14145495);
        }
    }

    public final void N0(boolean z10) {
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
                    this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new u5(this, i10)).start();
                    return;
                }
                this.d2 = true;
                this.M1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b2, z10 ? 1.0f : 0.0f);
                this.Z1.setTransitionProgress(this.b2);
                ofFloat.addUpdateListener(new y4(this, 2));
                ofFloat.addListener(new ah.p0(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(es.g);
                ofFloat.start();
            }
        }
    }

    public final void O0(boolean z10) {
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
            this.v1.b(new bi.aa(i10, this));
            this.v1.a(new x4(this, z10, i10));
            this.v1.h();
        }
    }

    public final PointF P0(rg.j jVar) {
        float f7;
        float f10;
        MediaController.CropState cropState = this.F0;
        float f11 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        float f12 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f13 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                i6 i6Var = this.R0;
                if (i11 >= i6Var.getChildCount()) {
                    break;
                }
                View childAt = i6Var.getChildAt(i11);
                if (!(childAt instanceof rg.j) || (childAt instanceof rg.g1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((rg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * f7;
                        z10 = true;
                    }
                }
                i11++;
                f13 = f10;
                f12 = f7;
            }
            float f14 = f12;
            float f15 = f13;
            if (!z10) {
                break;
            }
            i10++;
            e02 = new PointF(e02.x + f11, e02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return e02;
    }

    public final void Q0(int i10) {
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
        qg.s0 e = qg.s0.e(i12);
        int i13 = 1;
        boolean z10 = i10 == 2;
        if (e.l != z10) {
            e.l = z10;
            if (z10) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c10 = qg.s0.e(i12).c();
        qg.q1 q1Var = this.A1;
        q1Var.a = c10;
        D0(q1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.b1 = duration;
        duration.setInterpolator(es.f);
        this.b1.addUpdateListener(new bi.l4(this, viewGroup3, viewGroup4, i13));
        this.b1.addListener(new w5(this, viewGroup3, viewGroup4, i10, 0));
        this.b1.start();
    }

    @Override // org.telegram.ui.Components.pw0, org.telegram.ui.Components.ow0
    public final int R() {
        return this.O1.l - this.M1.getBottomPadding2();
    }

    public final void R0() {
        r5 r5Var = this.O1;
        rg.q1 q1Var = this.l1;
        if (q1Var != null) {
            if (r5Var.c()) {
                q1Var.a(R.drawable.input_smile);
            } else if (this.q2) {
                q1Var.a(R.drawable.input_keyboard);
            } else {
                q1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = r5Var.c() || this.q2;
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.p1, z10, false, 1.0f, true, null);
    }

    public final void S0() {
        rg.j jVar;
        ObjectAnimator objectAnimator = this.i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        r5 r5Var = this.O1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!r5Var.c() || r5Var.d) && this.t2 <= 0) || (jVar = this.J0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.i2.setInterpolator(es.h);
        this.i2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0() {
        boolean z10;
        if (this.J0 instanceof rg.x2) {
            r5 r5Var = this.O1;
            if ((r5Var.c() || this.t2 > 0) && !r5Var.d) {
                z10 = true;
                View view = this.X0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ah.t(4, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.X0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ah.t(4, this, z10)).start();
    }

    @Override // rg.s1, rg.o1
    public final void a() {
        H0(true);
    }

    @Override // rg.o1
    public final void c() {
        setTextType((this.L0 + 1) % 4);
    }

    @Override // org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.x5
    public final void d() {
        this.E1.setColor(-15132391);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bi.u8(28, this, view)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // rg.o1
    public final void e(int i10) {
        rg.j jVar = this.J0;
        if (jVar instanceof rg.x2) {
            F0((rg.x2) jVar, i10);
            qg.s0 e = qg.s0.e(this.F1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF e0() {
        i6 i6Var = this.R0;
        int measuredWidth = i6Var.getMeasuredWidth();
        int measuredHeight = i6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void f0() {
        boolean z10 = this.W1;
        i6 i6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= i6Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = i6Var.getChildAt(i10);
                boolean z12 = childAt instanceof rg.x2;
                int i11 = this.F1;
                if (z12) {
                    CharSequence text = ((rg.x2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.b6 b6Var : (org.telegram.ui.Components.b6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.b6.class)) {
                            TLRPC.Document document = b6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.s5.f(i11, b6Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.s5.h(i11).e(document);
                            }
                            if (k8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof rg.q2) {
                    TLRPC.Document sticker = ((rg.q2) childAt).getSticker();
                    if (k8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
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
        for (int i12 = 0; i12 < i6Var.getChildCount(); i12++) {
            View childAt2 = i6Var.getChildAt(i12);
            if (childAt2 instanceof rg.j) {
                ((rg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    public final TextView g0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, this.G1));
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

    @Override // org.telegram.ui.Components.pw0, org.telegram.ui.Components.ow0
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
        org.telegram.ui.Components.b6[] b6VarArr;
        i6 i6Var = this.R0;
        int childCount = i6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = i6Var.getChildAt(i10);
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
                if ((text instanceof Spanned) && (b6VarArr = (org.telegram.ui.Components.b6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.b6.class)) != null) {
                    for (org.telegram.ui.Components.b6 b6Var : b6VarArr) {
                        if (b6Var != null) {
                            TLRPC.Document document = b6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.s5.f(this.F1, b6Var.getDocumentId());
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

    public rg.j getSelectedEntity() {
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

    @Override // rg.h
    public final void h(rg.j jVar) {
        N0(false);
        L0(jVar);
    }

    public final rg.s0 h0(rg.p0 p0Var) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        i6 i6Var = this.R0;
        float measuredWidth = i6Var.getMeasuredWidth() <= 0 ? this.R1 : i6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        rg.s0 s0Var = new rg.s0(getContext(), P0, this.F1, p0Var, measuredWidth / 360.0f, dp);
        if (P0.x == i6Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            s0Var.setColor(i10);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(dp);
        i6Var.addView(s0Var, w7.a6.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    public final rg.v0 i0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        i6 i6Var = this.R0;
        float measuredWidth = i6Var.getMeasuredWidth() <= 0 ? this.R1 : i6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        rg.v0 v0Var = new rg.v0(getContext(), P0, this.F1, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (P0.x == i6Var.getMeasuredWidth() / 2.0f) {
            v0Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            v0Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            v0Var.setColor(i10);
        }
        v0Var.setDelegate(this);
        v0Var.setMaxWidth(dp);
        i6Var.addView(v0Var, w7.a6.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            v0Var.j(1.0f / cropState.cropScale);
            v0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return v0Var;
    }

    public final rg.z1 j0(String str, boolean z10) {
        float f7;
        iw0 iw0Var;
        this.l2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        i6 i6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, i6Var.getMeasuredWidth()) * 0.5d);
            iw0Var = new iw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, i6Var.getMeasuredHeight()) * 0.5d);
            iw0Var = new iw0(f7 * floor2, floor2);
        }
        iw0 iw0Var2 = iw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iw0Var2.a;
            iw0Var2.a = iw0Var2.b;
            iw0Var2.b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        rg.z1 z1Var = new rg.z1(context, e02, iw0Var2, str, intValue);
        z1Var.setDelegate(this);
        i6Var.addView(z1Var);
        f0();
        return z1Var;
    }

    public final rg.c2 k0(boolean z10) {
        String str;
        iw0 iw0Var = new iw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        i6 i6Var = this.R0;
        if (i6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < i6Var.getChildCount(); i10++) {
                    View childAt = i6Var.getChildAt(i10);
                    if (v7.f7.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (i6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (i6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, i6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, i6Var.getMeasuredHeight(), 0.0f);
            }
        }
        rg.c2 c2Var = new rg.c2(getContext(), e02);
        c2Var.r0 = new bi.ya(c2Var);
        c2Var.s0 = new bi.ya(c2Var);
        c2Var.t0 = new ah.y0(c2Var);
        c2Var.u0 = new ah.y0(c2Var);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(c2Var);
        c2Var.w0 = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(c2Var);
        c2Var.x0 = g6Var2;
        c2Var.z0 = 1.0f;
        c2Var.q0 = iw0Var;
        g6Var2.d(1.0f, true);
        g6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ah.y0 y0Var = c2Var.t0;
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
        ah.i1 b10 = ah.i1.b(str);
        c2Var.v0 = b10;
        y0Var.e(b10);
        c2Var.k();
        c2Var.setDelegate(this);
        i6Var.addView(c2Var);
        f0();
        if (z10) {
            A0(c2Var);
            C0(c2Var, true);
        }
        return c2Var;
    }

    @Override // di.gc
    public final boolean l(MotionEvent motionEvent) {
        if (this.m2) {
            return false;
        }
        if (this.J0 != null) {
            C0(null, true);
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y3);
        this.O0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final rg.d2 l0(String str, boolean z10) {
        this.l2 = true;
        this.n2 = true;
        p0();
        i6 i6Var = this.R0;
        int measuredWidth = i6Var.getMeasuredWidth();
        i6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        iw0 iw0Var = new iw0(floor, floor);
        rg.d2 d2Var = new rg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (iw0Var.b / 2.0f) + AndroidUtilities.dp(72.0f)), iw0Var, str);
        d2Var.setDelegate(this);
        i6Var.addView(d2Var);
        f0();
        if (z10) {
            A0(d2Var);
            post(new t4(this, d2Var, 0));
        }
        this.n2 = false;
        return d2Var;
    }

    public final b6 m0(Object obj, TLRPC.Document document) {
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
        n6 n6Var = new n6(e0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        b6 b6Var = new b6(this, context, n6Var.a, n6Var.c, n6Var.b, new iw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = b6Var.x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        b6Var.setDelegate(this);
        this.R0.addView(b6Var);
        f0();
        return b6Var;
    }

    public final rg.x2 n0(boolean z10) {
        iw0 paintingSize = getPaintingSize();
        PointF P0 = P0(null);
        rg.x2 x2Var = new rg.x2(getContext(), P0, (int) (paintingSize.a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.a / 9.0f;
        e5 e5Var = new e5(this, 0);
        x2Var.w0 = (int) (0.5f * f7);
        x2Var.x0 = (int) (f7 * 2.0f);
        x2Var.y0 = e5Var;
        float f10 = P0.x;
        i6 i6Var = this.R0;
        if (f10 == i6Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        x2Var.setTypeface(qg.s0.e(i10).j);
        x2Var.setType(qg.s0.e(i10).h);
        i6Var.addView(x2Var, w7.a6.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            A0(x2Var);
            x2Var.q();
            C0(x2Var, false);
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
        e6 e6Var = this.O0;
        if (e6Var.getCurrentBrush() instanceof qg.l) {
            this.c1 = true;
        }
        e6Var.setBrush(mVar);
        qg.q1 q1Var = this.A1;
        int i10 = q1Var.a;
        q1Var.a = qg.s0.e(this.F1).c();
        q1Var.c = this.e1.get();
        D0(q1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    public final rg.y2 o0(id idVar) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        i6 i6Var = this.R0;
        float measuredWidth = i6Var.getMeasuredWidth() <= 0 ? this.R1 : i6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        rg.y2 y2Var = new rg.y2(getContext(), P0, this.F1, idVar, measuredWidth / 240.0f, dp);
        if (P0.x == i6Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (P0.y == i6Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        qg.q1 q1Var = this.A1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        i6Var.addView(y2Var, w7.a6.d(-2.0f, -2));
        f0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            y2Var.j(1.0f / cropState.cropScale);
            y2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return y2Var;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        gl0 gl0Var = this.Z1;
        if (gl0Var != null) {
            AndroidUtilities.removeFromParent(gl0Var);
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
        rg.j jVar = this.J0;
        if (jVar != null) {
            jVar.m();
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
            v0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        v0();
    }

    public final void p0() {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 >= i6Var.getChildCount()) {
                return;
            }
            View childAt = i6Var.getChildAt(i10);
            if (childAt instanceof rg.d2) {
                if (this.J0 == childAt) {
                    C0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(es.h).withEndAction(new t4(this, (rg.d2) childAt, 1)).start();
            }
            i10++;
        }
    }

    @Override // rg.h
    public final boolean q() {
        return !(this.J0 instanceof rg.g1);
    }

    public abstract void q0();

    @Override // rg.h
    public final boolean r() {
        return !this.K0;
    }

    public final rg.g1 r0() {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 >= i6Var.getChildCount()) {
                return null;
            }
            View childAt = i6Var.getChildAt(i10);
            if (childAt instanceof rg.g1) {
                return (rg.g1) childAt;
            }
            i10++;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G0) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap s0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, k8 k8Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i10;
        int i11;
        i6 i6Var;
        int i12;
        int i13;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        byte b10;
        int i14;
        Canvas canvas;
        View view2;
        int i15;
        rg.g1 g1Var;
        org.telegram.ui.x5 x5Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.x0 x0Var;
        zh.t3 t3Var;
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
        o6 o6Var = this;
        e6 e6Var = o6Var.O0;
        int i16 = 0;
        byte b11 = 1;
        i6 i6Var2 = o6Var.R0;
        if (z10) {
            createBitmap = e6Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, i6Var2.getMeasuredWidth()), Math.max(1, i6Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                o6Var.g1 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < i6Var2.getChildCount(); i10++) {
                    if (i6Var2.getChildAt(i10) instanceof rg.j) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    int childCount = i6Var2.getChildCount();
                    int i17 = 0;
                    while (i17 < childCount) {
                        View childAt = i6Var2.getChildAt(i17);
                        if (childAt instanceof rg.j) {
                            rg.j jVar = (rg.j) childAt;
                            jVar.getPosition();
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof rg.x2;
                                int i18 = o6Var.F1;
                                if (z21) {
                                    mediaEntity.type = b11;
                                    rg.x2 x2Var2 = (rg.x2) jVar;
                                    CharSequence text = x2Var2.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned = (Spanned) text;
                                        x2Var = x2Var2;
                                        org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spanned.getSpans(i16, text.length(), org.telegram.ui.Components.b6.class);
                                        if (b6VarArr != null) {
                                            int i19 = i16;
                                            while (i19 < b6VarArr.length) {
                                                org.telegram.ui.Components.b6 b6Var = b6VarArr[i19];
                                                org.telegram.ui.Components.b6[] b6VarArr2 = b6VarArr;
                                                TLRPC.Document document = b6Var.document;
                                                int i20 = i19;
                                                i6 i6Var3 = i6Var2;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.s5.f(i18, b6Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.s5.h(i18).e(document);
                                                }
                                                VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                                int i21 = childCount;
                                                int i22 = i17;
                                                emojiEntity.document_id = b6Var.getDocumentId();
                                                emojiEntity.document = document;
                                                emojiEntity.offset = spanned.getSpanStart(b6Var);
                                                emojiEntity.length = spanned.getSpanEnd(b6Var) - emojiEntity.offset;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(i18).getPathToAttach(document, true).getAbsolutePath();
                                                int i23 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                        break;
                                                    }
                                                    FileLoader fileLoader = FileLoader.getInstance(i18);
                                                    TLRPC.PhotoSize photoSize = document.thumbs.get(i23);
                                                    int i24 = i23;
                                                    z20 = true;
                                                    emojiEntity.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                    int i25 = i24 + 1;
                                                    if (i25 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    i23 = i25;
                                                }
                                                z20 = true;
                                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z20);
                                                if (isAnimatedStickerDocument || w0(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | (isAnimatedStickerDocument ? (byte) 1 : (byte) 4));
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    o6Var.g1 = o6Var.g1.multiply(valueOf).divide(o6Var.g1.gcd(valueOf));
                                                }
                                                i19 = i20 + 1;
                                                childCount = i21;
                                                b6VarArr = b6VarArr2;
                                                i6Var2 = i6Var3;
                                                i17 = i22;
                                            }
                                        }
                                    } else {
                                        x2Var = x2Var2;
                                    }
                                    i6Var = i6Var2;
                                    i15 = childCount;
                                    i13 = i17;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) x2Var.getType();
                                    mediaEntity.color = x2Var.getSwatch().a;
                                    mediaEntity.fontSize = x2Var.getTextSize();
                                    mediaEntity.textTypeface = x2Var.getTypeface();
                                    mediaEntity.textAlign = x2Var.getAlign();
                                } else {
                                    i6Var = i6Var2;
                                    i15 = childCount;
                                    i13 = i17;
                                    if (jVar instanceof rg.q2) {
                                        mediaEntity.type = (byte) 0;
                                        rg.q2 q2Var = (rg.q2) jVar;
                                        iw0 baseSize = q2Var.getBaseSize();
                                        mediaEntity.width = baseSize.a;
                                        mediaEntity.height = baseSize.b;
                                        mediaEntity.document = q2Var.getSticker();
                                        mediaEntity.parentObject = q2Var.getParentObject();
                                        TLRPC.Document sticker = q2Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || w0(sticker)) {
                                            boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                            r20 = (isAnimatedStickerDocument2 || w0(sticker)) ? q2Var.getDuration() : 5000L;
                                            if (r20 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r20);
                                                o6Var.g1 = o6Var.g1.multiply(valueOf2).divide(o6Var.g1.gcd(valueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (q2Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof rg.z1) {
                                        rg.z1 z1Var = (rg.z1) jVar;
                                        mediaEntity.type = (byte) 2;
                                        iw0 baseSize2 = z1Var.getBaseSize();
                                        mediaEntity.width = baseSize2.a;
                                        mediaEntity.height = baseSize2.b;
                                        mediaEntity.text = z1Var.q(i18);
                                        mediaEntity.crop = z1Var.G0;
                                        if (z1Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof rg.v0) {
                                        rg.v0 v0Var = (rg.v0) jVar;
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
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i18).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (isAnimatedStickerDocument3 || w0(emojiEntity2.document)) {
                                                emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (jVar instanceof rg.y2) {
                                        rg.y2 y2Var = (rg.y2) jVar;
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
                                            emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i18).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, true);
                                            if (isAnimatedStickerDocument4 || w0(emojiEntity3.document)) {
                                                emojiEntity3.subType = (byte) (emojiEntity3.subType | (isAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity3);
                                        }
                                        i12 = i15;
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
                                        mediaEntity.width = (view.getWidth() * scaleX) / i6Var.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY) / i6Var.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / i6Var.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y3) / i6Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10) / i6Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3) / i6Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / i6Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / i6Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof rg.g1) {
                                            z18 = z16;
                                            if (jVar instanceof rg.q2) {
                                                float imageAspectRatio = ((rg.q2) jVar).x0.getImageAspectRatio();
                                                float f7 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                float f10 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                float measuredWidth = i6Var.getMeasuredWidth() / i6Var.getMeasuredHeight();
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
                                                if (mediaArea3 != null && (((z19 = jVar instanceof rg.v0)) || (jVar instanceof rg.y2) || (jVar instanceof rg.s0) || (jVar instanceof rg.c2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f13 = mediaEntity.x;
                                                    float f14 = mediaEntity.width;
                                                    mediaAreaCoordinates2.x = ((f14 / 2.0f) + f13) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z19) {
                                                        rg.u0 u0Var3 = ((rg.v0) jVar).q0;
                                                        mediaAreaCoordinates2.w = yh.x(u0Var3.I * 2 * scaleX, i6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = yh.x(u0Var3.J * 2 * scaleY, i6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof rg.y2) {
                                                        rg.u0 u0Var4 = ((rg.y2) jVar).q0;
                                                        mediaAreaCoordinates2.w = yh.x(u0Var4.I * 2 * scaleX, i6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = yh.x(u0Var4.J * 2 * scaleY, i6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof rg.s0) {
                                                        rg.q0 q0Var = ((rg.s0) jVar).q0;
                                                        mediaAreaCoordinates2.w = yh.x(q0Var.f * 2 * scaleX, i6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = yh.x(q0Var.h * 2 * scaleY, i6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof rg.c2) {
                                                        rg.c2 c2Var = (rg.c2) jVar;
                                                        float padding = ((c2Var.getPadding() * 2) * scaleX) / i6Var.getMeasuredWidth();
                                                        float padding2 = ((c2Var.getPadding() * 2) * scaleX) / i6Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((rg.v0) jVar).q0.getRadius();
                                                    } else if (jVar instanceof rg.y2) {
                                                        radius = ((rg.y2) jVar).q0.getRadius();
                                                    } else if (jVar instanceof rg.s0) {
                                                        radius = ((rg.s0) jVar).q0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            rg.g1 g1Var2 = (rg.g1) jVar;
                                            rg.z0 z0Var = g1Var2.r0;
                                            org.telegram.ui.x5 x5Var2 = g1Var2.q0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z18 = z16;
                                            double r10 = g1Var2.r(rectF);
                                            rectF.offset(x5Var2.getX(), x5Var2.getY());
                                            rectF.offset(z0Var.getX(), z0Var.getY());
                                            mediaEntity.mediaArea.coordinates.x = (((rectF.centerX() * scaleX) + yh.b(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / i6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + yh.b(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y3)) / i6Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / i6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / i6Var.getMeasuredHeight()) * 100.0f;
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
                                        if (jVar instanceof rg.s0) {
                                            rg.s0 s0Var = (rg.s0) jVar;
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
                                            if (jVar instanceof rg.c2) {
                                                rg.c2 c2Var2 = (rg.c2) jVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                ah.i1 currentReaction = c2Var2.getCurrentReaction();
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
                                            } else if (jVar instanceof rg.d2) {
                                                rg.d2 d2Var = (rg.d2) jVar;
                                                iw0 baseSize3 = d2Var.getBaseSize();
                                                mediaEntity.width = baseSize3.a;
                                                mediaEntity.height = baseSize3.b;
                                                mediaEntity.type = (byte) 5;
                                                if (k8Var != null) {
                                                    mediaEntity.text = k8Var.o0.getAbsolutePath();
                                                    mediaEntity.roundOffset = k8Var.r0;
                                                    long j10 = k8Var.q0;
                                                    mediaEntity.roundDuration = j10;
                                                    float f15 = j10;
                                                    mediaEntity.roundLeft = (long) (k8Var.s0 * f15);
                                                    mediaEntity.roundRight = (long) (k8Var.t0 * f15);
                                                }
                                                mediaEntity.subType = (byte) 4;
                                                if (d2Var.r0) {
                                                    mediaEntity.subType = (byte) (4 | 2);
                                                }
                                            } else if (jVar instanceof rg.g1) {
                                                rg.g1 g1Var3 = (rg.g1) jVar;
                                                org.telegram.ui.x5 x5Var3 = g1Var3.q0;
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
                                                        int i26 = 0;
                                                        while (true) {
                                                            if (i26 >= z0Var2.getChildCount()) {
                                                                x0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = z0Var2.getChildAt(i26);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.x0) {
                                                                x0Var = (org.telegram.ui.Cells.x0) childAt2;
                                                                break;
                                                            }
                                                            i26++;
                                                        }
                                                        if (x0Var == null || (t3Var = x0Var.H0) == null || (imageReceiver3 = t3Var.d) == null) {
                                                            g1Var = g1Var3;
                                                            i12 = i15;
                                                            x5Var = x5Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (k8Var != null) {
                                                                    Matrix matrix = k8Var.n0;
                                                                    if (k8Var.K) {
                                                                        matrix.reset();
                                                                        if (z0Var2.getChildCount() == 1) {
                                                                            view3 = z0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.u1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.u1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, k8Var.k0), imageReceiver2.getImageHeight() / Math.max(1, k8Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.getCenterX() - ((k8Var.k0 * max) / 2.0f), imageReceiver2.getCenterY() - ((k8Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(x5Var.getX(), x5Var.getY());
                                                                                    matrix.postTranslate(z0Var2.getX(), z0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(g1Var.getScaleX(), g1Var.getScaleY(), g1Var.getPivotX(), g1Var.getPivotY());
                                                                                    matrix.postRotate(g1Var.getRotation(), g1Var.getPivotX(), g1Var.getPivotY());
                                                                                    matrix.postTranslate(g1Var.getX(), g1Var.getY());
                                                                                    matrix.postScale(1.0f / i6Var.getWidth(), 1.0f / i6Var.getHeight());
                                                                                    matrix.postScale(k8Var.i0, k8Var.j0);
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
                                                            mediaEntity.width = (view.getWidth() * scaleX) / i6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY2) / i6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / i6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y32) / i6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102) / i6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32) / i6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / i6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / i6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof rg.g1) {
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
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) zh.n5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float dp = AndroidUtilities.dp(110.0f);
                                                                g1Var = g1Var3;
                                                                float centerX = imageReceiver3.getCenterX() + x0Var.getX() + z0Var2.getX() + x0Var.F0;
                                                                float centerY = imageReceiver3.getCenterY() + x0Var.getY() + z0Var2.getY() + x0Var.G0;
                                                                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                imageReceiver4 = imageReceiver3;
                                                                mediaEntity2.type = (byte) 0;
                                                                mediaEntity2.width = dp;
                                                                mediaEntity2.height = dp;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                mediaEntity2.document = document2;
                                                                mediaEntity2.parentObject = starGift;
                                                                mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                                                                if (MessageObject.isAnimatedStickerDocument(document2, true) || w0(document2)) {
                                                                    boolean isAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document2, true);
                                                                    mediaEntity2.subType = (byte) (mediaEntity2.subType | (isAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                    yj0 lottieAnimation = imageReceiver4.getLottieAnimation();
                                                                    if (lottieAnimation != null && (isAnimatedStickerDocument5 || w0(document2))) {
                                                                        r20 = lottieAnimation.r();
                                                                    }
                                                                    if (r20 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r20);
                                                                        o6Var.g1 = o6Var.g1.multiply(valueOf3).divide(o6Var.g1.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y10 = childAt.getY();
                                                                int i27 = (int) dp;
                                                                mediaEntity2.viewWidth = i27;
                                                                mediaEntity2.viewHeight = i27;
                                                                mediaEntity2.width = (dp * scaleX2) / i6Var.getMeasuredWidth();
                                                                mediaEntity2.height = (dp * scaleY3) / i6Var.getMeasuredHeight();
                                                                mediaEntity2.x = (childAt.getWidth() / 2.0f) + x11;
                                                                mediaEntity2.y = (childAt.getHeight() / 2.0f) + y10;
                                                                i12 = i15;
                                                                float b12 = yh.b(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                float b13 = yh.b(childAt.getHeight(), 2.0f, scaleY3, centerY * scaleY3);
                                                                x5Var = x5Var3;
                                                                view = childAt;
                                                                double d10 = mediaEntity2.x;
                                                                double d11 = b12;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double cos = Math.cos(rotation) * d11;
                                                                double d12 = b13;
                                                                mediaEntity2.x = (float) ((cos - (Math.sin(rotation) * d12)) + d10);
                                                                float cos2 = (float) ((Math.cos(rotation) * d12) + (Math.sin(rotation) * d11) + mediaEntity2.y);
                                                                float f16 = (-dp) / 2.0f;
                                                                float f17 = (f16 * scaleX2) + mediaEntity2.x;
                                                                mediaEntity2.x = f17;
                                                                mediaEntity2.y = (f16 * scaleY3) + cos2;
                                                                mediaEntity2.x = f17 / i6Var.getMeasuredWidth();
                                                                mediaEntity2.y /= i6Var.getMeasuredHeight();
                                                                mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mediaEntity2.scale = scaleX2;
                                                                arrayList.add(mediaEntity2);
                                                            } else {
                                                                g1Var = g1Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                i12 = i15;
                                                                x5Var = x5Var3;
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
                                                            mediaEntity.width = (view.getWidth() * scaleX) / i6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY22) / i6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / i6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y322) / i6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022) / i6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322) / i6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / i6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / i6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof rg.g1) {
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
                                                i12 = i15;
                                                x5Var = x5Var3;
                                                view = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i18).getInputChannel(-k8.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    Boolean D = k8.D(messageObject);
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
                                                mediaEntity.width = (view.getWidth() * scaleX) / i6Var.getMeasuredWidth();
                                                mediaEntity.height = (view.getHeight() * scaleY222) / i6Var.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / i6Var.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y3222) / i6Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10222) / i6Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3222) / i6Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / i6Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / i6Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (jVar instanceof rg.g1) {
                                                }
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            i12 = i15;
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
                                            mediaEntity.width = (view.getWidth() * scaleX) / i6Var.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY2222) / i6Var.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / i6Var.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y32222) / i6Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102222) / i6Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32222) / i6Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / i6Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / i6Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (jVar instanceof rg.g1) {
                                            }
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea != null) {
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        }
                                        i12 = i15;
                                        b10 = 1;
                                        i14 = 0;
                                    }
                                }
                                i12 = i15;
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
                                mediaEntity.width = (view.getWidth() * scaleX) / i6Var.getMeasuredWidth();
                                mediaEntity.height = (view.getHeight() * scaleY22222) / i6Var.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / i6Var.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y322222) / i6Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022222) / i6Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322222) / i6Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / i6Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / i6Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof rg.g1) {
                                }
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                i6Var = i6Var2;
                                i12 = childCount;
                                i13 = i17;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / i6Var.getMeasuredWidth();
                                int i28 = 0;
                                while (i28 < 2) {
                                    Canvas canvas3 = i28 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i28 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.x * i6Var.getMeasuredWidth(), mediaEntity.y * i6Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * i6Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * i6Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof rg.x2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof rg.g1) {
                                                rg.g1 g1Var4 = (rg.g1) view2;
                                                rg.z0 z0Var3 = g1Var4.r0;
                                                boolean z23 = true;
                                                g1Var4.u0 = true;
                                                int i29 = 0;
                                                while (i29 < z0Var3.getChildCount()) {
                                                    View childAt3 = z0Var3.getChildAt(i29);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.u1) {
                                                        ((org.telegram.ui.Cells.u1) childAt3).pe = z23;
                                                    }
                                                    i29++;
                                                    z23 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z24 = false;
                                                g1Var4.u0 = false;
                                                int i30 = 0;
                                                while (i30 < z0Var3.getChildCount()) {
                                                    View childAt4 = z0Var3.getChildAt(i30);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.u1) {
                                                        ((org.telegram.ui.Cells.u1) childAt4).pe = z24;
                                                    }
                                                    i30++;
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
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            createBitmap2.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i28++;
                                    view = view2;
                                    canvas2 = canvas;
                                }
                                if (imageReceiver != null) {
                                    b10 = 1;
                                    i14 = 0;
                                    imageReceiver.setVisible(true, false);
                                }
                            }
                            b10 = 1;
                            i14 = 0;
                        } else {
                            i14 = i16;
                            i6Var = i6Var2;
                            i12 = childCount;
                            i13 = i17;
                            b10 = b11;
                        }
                        i17 = i13 + 1;
                        o6Var = this;
                        b11 = b10;
                        i16 = i14;
                        childCount = i12;
                        i6Var2 = i6Var;
                    }
                }
                return bitmap;
            }
            Bitmap c10 = e6Var.c(false, false);
            createBitmap = c10 != null ? Bitmap.createBitmap(c10.getWidth(), c10.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        o6Var.g1 = BigInteger.ONE;
        i11 = 0;
        while (i10 < i6Var2.getChildCount()) {
        }
        if (i11 > 0) {
        }
        return bitmap;
    }

    public void setBlurManager(org.telegram.ui.Components.la laVar) {
        this.e2 = laVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.m2 != z10) {
            this.m2 = z10;
            if (z10) {
                C0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            i6 i6Var = this.R0;
            if (i10 >= i6Var.getChildCount()) {
                return;
            }
            View childAt = i6Var.getChildAt(i10);
            if (childAt instanceof rg.q2) {
                ImageReceiver imageReceiver = ((rg.q2) childAt).x0;
                yj0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.N(Math.round(((j10 % lottieAnimation.r()) / lottieAnimation.r()) * lottieAnimation.e[0]), true, false);
                }
            }
            i10++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.Y1) {
            this.Y1 = z10;
            f0();
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
            n0(true);
            return;
        }
        if (this.q2) {
            rg.j jVar = this.J0;
            if (jVar instanceof rg.x2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((rg.x2) jVar).getEditText());
            }
        }
        I0(!this.q2 ? 1 : 0);
    }

    public final boolean t0() {
        return this.D0.a() || this.l2;
    }

    @Override // rg.h
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

    public final void u0(boolean z10) {
        int i10 = 0;
        if (this.q2) {
            I0(0);
        }
        if (z10) {
            wz wzVar = this.p2;
            if (wzVar == null || wzVar.getVisibility() != 0) {
                v0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.p2.getMeasuredHeight());
            ofFloat.addUpdateListener(new y4(this, i10));
            this.s2 = true;
            ofFloat.addListener(new u5(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
            ofFloat.start();
        }
    }

    @Override // rg.h
    public final boolean v(rg.j jVar) {
        return C0(jVar, true);
    }

    public final void v0() {
        wz wzVar;
        if (!this.q2 && (wzVar = this.p2) != null && wzVar.getVisibility() != 8) {
            this.p2.setVisibility(8);
        }
        int i10 = this.t2;
        this.t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override // rg.h
    public final int[] w(rg.j jVar) {
        int i10 = (int) jVar.getPosition().x;
        int[] iArr = this.o2;
        iArr[0] = i10;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override // rg.s1
    public final qg.s0 x() {
        return qg.s0.e(this.F1);
    }

    public final boolean x0() {
        if (this.c2) {
            if (this.Z1.getReactionsWindow() == null || this.Z1.getReactionsWindow().q) {
                N0(false);
                return true;
            }
            this.Z1.e();
            return true;
        }
        if (this.B1) {
            H0(false);
            return true;
        }
        if (this.q2) {
            u0(true);
            return true;
        }
        if (!this.K0) {
            return false;
        }
        if (!this.M0) {
            C0(null, true);
            return true;
        }
        this.M0 = false;
        this.O1.b(true);
        return false;
    }

    public abstract void y0(boolean z10);

    public final void z0() {
        final int i10 = this.Y0;
        Q0(1);
        postDelayed(new ah.j(this, 9), 350L);
        x5 x5Var = new x5(this, getContext(), this.G1, i10);
        this.k2 = x5Var;
        jc jcVar = this.M1;
        Objects.requireNonNull(jcVar);
        x5Var.w = new ci.u(jcVar, 6);
        final boolean[] zArr = {true};
        x5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: di.m5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o6 o6Var = o6.this;
                o6Var.k2 = null;
                if (zArr[0]) {
                    o6Var.y0(false);
                }
                o6Var.Q0(i10);
            }
        });
        x5Var.y = new g5(this);
        x5Var.r0(new n5(this, zArr, x5Var, 0));
        x5Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f7) {
    }
}
