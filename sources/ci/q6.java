package ci;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public abstract class q6 extends bw0 implements qg.r1, qg.h, qg.n1, zv0, hc {
    public final qg.g1 A0;
    public final pg.t1 A1;
    public final qg.k1 B0;
    public boolean B1;
    public final Bitmap C0;
    public o1.k C1;
    public final pg.w1 D0;
    public float D1;
    public final DispatchQueue E0;
    public final Paint E1;
    public final MediaController.CropState F0;
    public final int F1;
    public boolean G0;
    public final d6 G1;
    public uv0 H0;
    public org.telegram.ui.ActionBar.m1 H1;
    public boolean I0;
    public o6 I1;
    public qg.j J0;
    public Rect J1;
    public boolean K0;
    public Runnable K1;
    public int L0;
    public Runnable L1;
    public boolean M0;
    public final kc M1;
    public final boolean N0;
    public AnimatorSet N1;
    public final f6 O0;
    public final s5 O1;
    public final h6 P0;
    public l8 P1;
    public final k6 Q0;
    public ArrayList Q1;
    public final j6 R0;
    public int R1;
    public final FrameLayout S0;
    public int S1;
    public final l6 T0;
    public pg.x T1;
    public final p5 U0;
    public final boolean U1;
    public final FrameLayout V0;
    public final File V1;
    public w5 W0;
    public final boolean W1;
    public final View X0;
    public final boolean X1;
    public int Y0;
    public boolean Y1;
    public int Z0;
    public qk0 Z1;
    public float a1;
    public qg.b2 a2;
    public ValueAnimator b1;
    public float b2;
    public boolean c1;
    public boolean c2;
    public final qg.x1 d1;
    public boolean d2;
    public final xa.c e1;
    public org.telegram.ui.Components.ja e2;
    public final int f1;
    public final a7 f2;
    public BigInteger g1;
    public final b7 g2;
    public TextView h1;
    public boolean h2;
    public TextView i1;
    public ObjectAnimator i2;
    public TextView j1;
    public final float[] j2;
    public final qg.s1 k1;
    public y5 k2;
    public final qg.p1 l1;
    public boolean l2;
    public final qg.u1 m1;
    public boolean m2;
    public final ImageView n1;
    public boolean n2;
    public final TextView o1;
    public final int[] o2;
    public final TextView p1;
    public lz p2;
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
    public final q5 w1;
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
    public q6(android.content.Context r30, boolean r31, java.io.File r32, boolean r33, boolean r34, ci.kc r35, android.app.Activity r36, int r37, android.graphics.Bitmap r38, android.graphics.Bitmap r39, int r40, java.util.ArrayList r41, ci.l8 r42, int r43, int r44, org.telegram.messenger.MediaController.CropState r45, org.telegram.ui.Components.ja r46, org.telegram.ui.ActionBar.d6 r47, ci.a7 r48, ci.b7 r49) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.<init>(android.content.Context, boolean, java.io.File, boolean, boolean, ci.kc, android.app.Activity, int, android.graphics.Bitmap, android.graphics.Bitmap, int, java.util.ArrayList, ci.l8, int, int, org.telegram.messenger.MediaController$CropState, org.telegram.ui.Components.ja, org.telegram.ui.ActionBar.d6, ci.a7, ci.b7):void");
    }

    public static void G0(qg.v2 v2Var, int i10) {
        v2Var.setAlign(i10);
        int i11 = 2;
        v2Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        v2Var.getEditText().setTextAlignment(i11);
    }

    public static void Z(nb nbVar, pg.u0 u0Var, Integer num) {
        u0Var.h(num.intValue(), true);
        u0Var.g();
        nbVar.setNewColor(num.intValue());
        nbVar.w1.setSelectedColorIndex(u0Var.d());
        nbVar.T1 = null;
    }

    public static /* synthetic */ void a0(nb nbVar, Integer num) {
        nbVar.setNewColor(num.intValue());
        nbVar.I0(false);
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

    private uv0 getPaintingSize() {
        uv0 uv0Var = this.H0;
        if (uv0Var != null) {
            return uv0Var;
        }
        uv0 uv0Var2 = new uv0(1080.0f, 1920.0f);
        this.H0 = uv0Var2;
        return uv0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 >= j6Var.getChildCount()) {
                return;
            }
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.o2) {
                ImageReceiver imageReceiver = ((qg.o2) childAt).x0;
                ij0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        pg.t1 t1Var = this.A1;
        int i11 = t1Var.a;
        t1Var.a = i10;
        E0(t1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new c5(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.L0 = i10;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setType(i10);
        }
        pg.u0 e = pg.u0.e(this.F1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.l1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        w5 w5Var = new w5(this, context);
        this.W0 = w5Var;
        w5Var.setClipToPadding(false);
        this.W0.setOrientation(0);
        this.T0.addView(this.W0, w7.y5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.h1;
        int i10 = org.telegram.ui.ActionBar.h6.i6;
        d6 d6Var = this.G1;
        textView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 7, -1));
        this.h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.h1.setTextColor(-1);
        this.h1.setTextSize(1, 14.0f);
        this.h1.setGravity(1);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setSingleLine();
        final int i11 = 0;
        this.h1.setOnClickListener(new View.OnClickListener(this) { // from class: ci.v4
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
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.l2 = true;
                            q6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.addView(this.h1, w7.y5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.i1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.i1.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 7, -1));
        this.i1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i12 = 1;
        this.i1.setOnClickListener(new View.OnClickListener(this) { // from class: ci.v4
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
                        if (!(q6Var2.J0 instanceof qg.v2)) {
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
        this.W0.addView(this.i1, w7.y5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.j1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.j1.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 7, -1));
        this.j1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.j1.setTextColor(-1);
        this.j1.setTextSize(1, 14.0f);
        this.j1.setGravity(1);
        this.j1.setTypeface(AndroidUtilities.bold());
        this.j1.setAlpha(0.6f);
        this.j1.setSingleLine();
        final int i13 = 2;
        this.j1.setOnClickListener(new View.OnClickListener(this) { // from class: ci.v4
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
                        if (!(q6Var2.J0 instanceof qg.v2)) {
                            q6Var2.l2 = true;
                            q6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.addView(this.j1, w7.y5.l(1.0f, 0, -2));
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

    public final void A0() {
        final int i10 = this.Y0;
        R0(1);
        postDelayed(new ai.f(this, 8), 350L);
        y5 y5Var = new y5(this, getContext(), this.G1, i10);
        this.k2 = y5Var;
        kc kcVar = this.M1;
        Objects.requireNonNull(kcVar);
        y5Var.w = new bi.v(kcVar, 6);
        final boolean[] zArr = {true};
        y5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ci.n5
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
        y5Var.y = new h5(this);
        y5Var.q0(new o5(this, zArr, y5Var, 0));
        y5Var.show();
        z0(true);
    }

    public final void B0(qg.j jVar) {
        this.D0.b(jVar.getUUID(), new e5(this, jVar, 0));
    }

    @Override // qg.h
    public final int[] C(qg.j jVar) {
        int i10 = (int) jVar.getPosition().x;
        int[] iArr = this.o2;
        iArr[0] = i10;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void C0(qg.j jVar) {
        qg.j jVar2 = this.J0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            D0(null, true);
            if (jVar instanceof qg.v2) {
                ValueAnimator valueAnimator = this.b1;
                if (valueAnimator != null && this.Z0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.R0.removeView(jVar);
        g0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            pg.w1 w1Var = this.D0;
            w1Var.b.remove(uuid);
            w1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(w1Var, 13));
        }
        qg.x1 x1Var = this.d1;
        xa.c cVar = this.e1;
        x1Var.setValueOverride(cVar);
        x1Var.setShowPreview(true);
        float f7 = cVar.get();
        pg.t1 t1Var = this.A1;
        t1Var.c = f7;
        E0(t1Var, null, false);
        if (this.n2 || !(jVar instanceof qg.c2)) {
            return;
        }
        lc lcVar = ((nb) this).A2;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.s(null, null, true);
        }
        nb nbVar = lcVar.v1;
        if (nbVar != null) {
            nbVar.q0();
        }
        bc bcVar = lcVar.c1;
        if (bcVar != null) {
            bcVar.setHasRoundVideo(false);
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null) {
            File file = l8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.K1.o0 = null;
            }
            if (lcVar.K1.p0 != null) {
                try {
                    new File(lcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                lcVar.K1.p0 = null;
            }
        }
    }

    @Override // qg.n1
    public final void D() {
        P0(true);
    }

    public final boolean D0(qg.j jVar, boolean z10) {
        boolean z11;
        wc wcVar;
        wc wcVar2;
        qk0 qk0Var;
        int i10;
        boolean z12 = jVar instanceof qg.v2;
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
            qg.v2 v2Var = (qg.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            qg.p1 p1Var = this.l1;
            p1Var.setAlignment(i11);
            pg.k0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                p1Var.setTypeface(typeface.a);
            }
            p1Var.e(v2Var.getType(), true);
            this.U0.invalidate();
        }
        qg.j jVar2 = this.J0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.d0) {
                    if (jVar instanceof qg.u0) {
                        qg.u0 u0Var = (qg.u0) jVar;
                        u0Var.setType((u0Var.getType() + 1) % u0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof qg.w2) {
                        qg.w2 w2Var = (qg.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof qg.r0) {
                        qg.r0 r0Var = (qg.r0) jVar;
                        qg.p0 p0Var = r0Var.q0;
                        if (p0Var.e()) {
                            p0Var.setPreviewType(p0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        r0Var.setType(r0Var.getNextType());
                        return true;
                    }
                    if (!this.K0) {
                        if (jVar instanceof qg.v2) {
                            this.M0 = true;
                            r0();
                            return true;
                        }
                        if (!(jVar instanceof qg.b2)) {
                            M0(jVar2);
                            return true;
                        }
                        qg.b2 b2Var = (qg.b2) jVar;
                        if (this.c2 && this.a2 == jVar) {
                            b2Var.q(true);
                            return true;
                        }
                        qg.b2 b2Var2 = this.a2;
                        if (b2Var2 != null && b2Var2 != b2Var && (qk0Var = this.Z1) != null) {
                            qk0Var.animate().alpha(0.0f).setListener(new u5(qk0Var, 0));
                            this.Z1 = null;
                            this.c2 = false;
                            this.b2 = 0.0f;
                        }
                        if (this.Z1 == null) {
                            qk0 qk0Var2 = new qk0(2, this.F1, getContext(), LaunchActivity.R(), new ai.x3(6, new ai.d()));
                            this.Z1 = qk0Var2;
                            org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(this.e2, qk0Var2, 0, false);
                            this.Z1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.M1.addView(this.Z1, w7.y5.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.k(-16777216, 120));
                            qk0 qk0Var3 = this.Z1;
                            cf.c cVar = new cf.c();
                            cVar.e = this;
                            cVar.c = naVar;
                            cVar.d = paint;
                            cVar.b = new Path();
                            qk0Var3.setDelegate(cVar);
                            this.Z1.p(null, null, true);
                        }
                        this.Z1.setFragment(LaunchActivity.R());
                        this.a2 = b2Var;
                        O0(true);
                        return true;
                    }
                    if (jVar2 instanceof qg.v2) {
                        AndroidUtilities.showKeyboard(((qg.v2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            qg.j jVar3 = this.J0;
            if (jVar3 instanceof qg.v2) {
                qg.v2 v2Var2 = (qg.v2) jVar3;
                qg.u2 u2Var = v2Var2.q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.K0 = false;
                    AndroidUtilities.hideKeyboard(((qg.v2) this.J0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof qg.c2) && (wcVar2 = ((nb) this).A2.Z0) != null) {
                wcVar2.l(false);
            }
            z11 = true;
        }
        qg.j jVar4 = this.J0;
        this.J0 = jVar;
        if ((jVar4 instanceof qg.v2) && TextUtils.isEmpty(((qg.v2) jVar4).getText())) {
            C0(jVar4);
        }
        qg.j jVar5 = this.J0;
        if (jVar4 != jVar5 && (jVar5 instanceof qg.c2) && (wcVar = ((nb) this).A2.Z0) != null) {
            wcVar.l(true);
        }
        qg.j jVar6 = this.J0;
        xa.c cVar2 = this.e1;
        pg.t1 t1Var = this.A1;
        qg.x1 x1Var = this.d1;
        if (jVar6 != null) {
            k6 k6Var = this.Q0;
            jVar6.m0 = k6Var;
            jVar6.l(k6Var, true);
            qg.j jVar7 = this.J0;
            if (jVar7 instanceof qg.v2) {
                qg.v2 v2Var3 = (qg.v2) jVar7;
                v2Var3.getSwatch().c = t1Var.c;
                v2Var3.z0 = false;
                F0(v2Var3.getSwatch());
                x1Var.setValueOverride(new t5(v2Var3, (int) (this.H0.a / 9.0f), 0));
                x1Var.setShowPreview(false);
            } else {
                x1Var.setValueOverride(cVar2);
                x1Var.setShowPreview(true);
                t1Var.c = cVar2.get();
                E0(t1Var, null, false);
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
            x1Var.setValueOverride(cVar2);
            x1Var.setShowPreview(true);
            t1Var.c = cVar2.get();
            E0(t1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(pg.t1 t1Var, Integer num, boolean z10) {
        pg.t1 t1Var2 = this.A1;
        if (t1Var2 != t1Var) {
            t1Var2.a = t1Var.a;
            t1Var2.b = t1Var.b;
            t1Var2.c = t1Var.c;
            int i10 = this.F1;
            pg.u0.e(i10).h(t1Var.a, true);
            pg.u0.e(i10).j(t1Var.c);
        }
        int i11 = t1Var.a;
        f6 f6Var = this.O0;
        f6Var.setColor(i11);
        f6Var.setBrushSize(t1Var.c);
        int i12 = t1Var2.a;
        int i13 = 0;
        if (num == null || num.intValue() == i12) {
            l6 l6Var = this.T0;
            if (l6Var != null) {
                l6Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new w4(this, num, i12, i13));
            duration.start();
        }
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            ((qg.v2) jVar).setSwatch(new pg.t1(t1Var.b, t1Var.c, t1Var.a));
            return;
        }
        if (z10 && (jVar instanceof qg.u0)) {
            ((qg.u0) jVar).setColor(t1Var.a);
            ((qg.u0) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.w2)) {
            ((qg.w2) jVar).setColor(t1Var.a);
            ((qg.w2) this.J0).setType(3);
        } else if (z10 && (jVar instanceof qg.r0)) {
            ((qg.r0) jVar).setColor(t1Var.a);
            ((qg.r0) this.J0).setType(0);
        }
    }

    public final void F0(pg.t1 t1Var) {
        E0(t1Var, null, false);
    }

    @Override // org.telegram.ui.Components.zv0
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
        s5 s5Var = this.O1;
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
                s5Var.a();
                requestLayout();
            }
        }
        if (this.x2 == i10 && this.y2 == z10) {
            return;
        }
        this.x2 = i10;
        this.y2 = z10;
        boolean z13 = this.r2;
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            this.r2 = ((qg.v2) jVar).getEditText().isFocused() && s5Var.c();
        } else {
            this.r2 = false;
        }
        if (this.r2 && this.q2) {
            J0(0);
        }
        if (this.t2 != 0 && !(z11 = this.r2) && z11 != z13 && !this.q2) {
            this.t2 = 0;
            s5Var.a();
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
        qg.j jVar;
        ArrayList arrayList = this.Q1;
        if (arrayList == null) {
            return;
        }
        l8 l8Var = this.P1;
        this.P1 = null;
        this.Q1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i11 >= size) {
                j6Var.setVisibility(0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                c6 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    n02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i10 = i11;
                jVar = n02;
            } else if (b10 == 1) {
                qg.v2 o02 = o0(z10);
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
                pg.t1 swatch = o02.getSwatch();
                swatch.a = mediaEntity.color;
                o02.setSwatch(swatch);
                jVar = o02;
            } else {
                i10 = i11;
                if (b10 == 2) {
                    qg.y1 k02 = k0(mediaEntity.text, false);
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
                    jVar = k02;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = l8Var.v;
                    boolean z11 = l8Var.K;
                    this.l2 = true;
                    qg.j b6Var = new b6(this, getContext(), e0(), arrayList3, this.e2, z11, this.f2);
                    b6Var.setDelegate(this);
                    j6Var.addView(b6Var);
                    g0();
                    jVar = b6Var;
                    if (mediaEntity.viewWidth > 0) {
                        jVar = b6Var;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = b6Var.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            jVar = b6Var;
                        }
                    }
                } else if (b10 == 3) {
                    qg.u0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                    int i14 = mediaEntity.color;
                    if (i14 != 0) {
                        j02.setColor(i14);
                    }
                    j02.setType(mediaEntity.subType);
                    jVar = j02;
                } else if (b10 == 8) {
                    kd kdVar = mediaEntity.weather;
                    if (kdVar == null) {
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        qg.w2 p02 = p0(kdVar);
                        int i15 = mediaEntity.color;
                        if (i15 != 0) {
                            p02.setColor(i15);
                        }
                        p02.setType(mediaEntity.subType);
                        jVar = p02;
                    }
                } else if (b10 == 7) {
                    qg.r0 i02 = i0(mediaEntity.linkSettings);
                    qg.p0 p0Var = i02.q0;
                    int i16 = mediaEntity.color;
                    if (i16 != 0) {
                        i02.setColor(i16);
                    }
                    boolean e = p0Var.e();
                    int i17 = p0Var.h;
                    int i18 = p0Var.f;
                    if (e) {
                        p0Var.setPreviewType(mediaEntity.subType);
                    }
                    byte b11 = mediaEntity.subType;
                    if (b11 == -1) {
                        i02.setType(3);
                        p0Var.d();
                        mediaEntity.viewWidth = ((int) Math.ceil(p0Var.a0)) + i18 + i18;
                        mediaEntity.viewHeight = ((int) Math.ceil(p0Var.b0)) + i17 + i17;
                        PointF position = i02.getPosition();
                        position.y = (this.S1 * 0.3f) + position.y;
                        i02.setPosition(position);
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        i02.setType(b11);
                        jVar = i02;
                    }
                } else if (b10 == 4) {
                    qg.b2 l02 = l0(false);
                    l02.s(zg.o0.d(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        l02.r(false);
                    }
                    jVar = l02;
                    if (mediaEntity.mediaArea.dark) {
                        l02.q(false);
                        jVar = l02;
                    }
                } else {
                    if (b10 == 5 && l8Var.o0 != null) {
                        qg.c2 m0 = m0(l8Var.p0, false);
                        lc lcVar = ((nb) this).A2;
                        zb zbVar = lcVar.X0;
                        if (zbVar != null) {
                            zbVar.w = m0;
                            s71 s71Var = zbVar.x;
                            if (s71Var != null) {
                                s71Var.V(m0.u0);
                            }
                        }
                        bc bcVar = lcVar.c1;
                        if (bcVar != null) {
                            bcVar.setHasRoundVideo(true);
                        }
                        jVar = m0;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z12 = !m0.r0;
                            m0.r0 = z12;
                            m0.s0.f(z12, true);
                            m0.invalidate();
                            jVar = m0;
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
            this.C1.b(new o1.g() { // from class: ci.x4
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    q6 q6Var = q6.this;
                    l6 l6Var = q6Var.T0;
                    float f11 = f7 / 1000.0f;
                    q6Var.D1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(q6Var.D1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(q6Var.D1, 0.25f) / 0.25f));
                    q5 q5Var = q6Var.w1;
                    float f13 = q6Var.D1;
                    boolean z11 = z10;
                    q5Var.y1(f13, z11);
                    qg.k1 k1Var = q6Var.B0;
                    k1Var.setProgress(q6Var.D1);
                    qg.g1 g1Var = q6Var.A0;
                    g1Var.setProgress(q6Var.D1);
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
                        k1Var.setAlpha(AndroidUtilities.lerp(f16, f15, f14));
                        g1Var.setAlpha(AndroidUtilities.lerp(f16, z11 ? 1.0f : 0.0f, f14));
                        l6Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    l6Var.invalidate();
                    if (view == q6Var.l1) {
                        q6Var.U0.invalidate();
                    }
                }
            });
            this.C1.a(new y4(this, z10, i10));
            this.C1.f();
            if (z10) {
                q5 q5Var = this.w1;
                q5Var.setVisibility(0);
                q5Var.setSelectedColorIndex(pg.u0.e(this.F1).d());
            }
        }
    }

    public final void J0(int i10) {
        qg.p1 p1Var = this.l1;
        s5 s5Var = this.O1;
        int i11 = 1;
        if (i10 == 1) {
            lz lzVar = this.p2;
            boolean z10 = lzVar != null && lzVar.getVisibility() == 0;
            lz lzVar2 = this.p2;
            kc kcVar = this.M1;
            if (lzVar2 != null && lzVar2.c1 != UserConfig.selectedAccount) {
                kcVar.removeView(lzVar2);
                this.p2 = null;
            }
            if (this.p2 == null) {
                lz lzVar3 = new lz(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.p2 = lzVar3;
                lzVar3.w2 = false;
                lzVar3.U0 = true;
                lzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.p2.setForseMultiwindowLayout(true);
                }
                this.p2.setDelegate(new e6(this));
                kcVar.addView(this.p2);
            }
            this.p2.setVisibility(0);
            this.q2 = true;
            lz lzVar4 = this.p2;
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
            int paddingUnderContainer = kcVar.getPaddingUnderContainer() + (point.x > point.y ? this.w2 : this.v2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            lzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                qg.j jVar = this.J0;
                if (jVar instanceof qg.v2) {
                    AndroidUtilities.hideKeyboard(((qg.v2) jVar).getEditText());
                }
            }
            this.t2 = paddingUnderContainer;
            s5Var.a();
            requestLayout();
            bh emojiButton = p1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            if (!z10) {
                if (this.r2) {
                    this.u2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t2, 0.0f);
                    ofFloat.addUpdateListener(new z4(this, i11));
                    ofFloat.addListener(new v5(this, i11));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                    ofFloat.start();
                }
            }
        } else {
            bh emojiButton2 = p1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(zg.e, true);
            }
            lz lzVar5 = this.p2;
            if (lzVar5 != null) {
                this.q2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    lzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.t2 = 0;
                s5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(qg.r0 r0Var) {
        u8 u8Var = new u8(getContext(), this.G1, this.g2, new ai.g3(4, this, r0Var));
        if (r0Var != null) {
            qg.o0 o0Var = r0Var.u0;
            u8Var.c0 = true;
            org.telegram.ui.Cells.j3 j3Var = u8Var.Z;
            org.telegram.ui.Cells.j3 j3Var2 = u8Var.Y;
            if (o0Var != null) {
                u8Var.g0 = o0Var.d;
                u8Var.h0 = false;
                j3Var2.setText(o0Var.c);
                j3Var.setText(o0Var.b);
                u8Var.m0 = !TextUtils.isEmpty(o0Var.b);
                u8Var.n0 = o0Var.f;
                u8Var.o0 = o0Var.e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                u8Var.n0 = true;
                u8Var.o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = u8Var.b0;
            dVar.g(string, false, true);
            q8 q8Var = u8Var.X;
            if (q8Var != null) {
                q8Var.N(false);
            }
            dVar.setEnabled(u8Var.V(j3Var2.getText().toString()));
            u8Var.c0 = false;
        }
        u8Var.setOnDismissListener(new l5(this, 1));
        u8Var.show();
        z0(true);
    }

    public final void L0(qg.u0 u0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        wi wiVar = new wi(getContext(), new z5(this, callback2), false, true, false, this.G1);
        wiVar.Z1 = new a6();
        yh yhVar = wiVar.x1;
        if (u0Var != null && (messageMedia = u0Var.u0) != null && (geoPoint = messageMedia.geo) != null) {
            wiVar.x2 = new double[]{geoPoint.lat, geoPoint._long};
            wiVar.O = true;
            yhVar.setVisibility(8);
        } else if (this.U1) {
            wiVar.v2 = this.W1;
            wiVar.w2 = this.V1;
            wiVar.O = true;
            yhVar.setVisibility(8);
        } else {
            wiVar.O = true;
            yhVar.setVisibility(8);
        }
        wiVar.setOnDismissListener(new l5(this, 0));
        wiVar.r1();
        wiVar.show();
    }

    public final void M0(qg.j jVar) {
        if (jVar instanceof qg.f1) {
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
        j6 j6Var = this.R0;
        float scaleX2 = j6Var.getScaleX() * scaleX;
        float scaleY = j6Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new e5(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, q6 q6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.m1 m1Var = this.H1;
        if (m1Var != null && m1Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            o6 o6Var = new o6(this, getContext());
            this.I1 = o6Var;
            o6Var.setAnimationEnabled(true);
            this.I1.setOnTouchListener(new g5(this, 0));
            this.I1.setDispatchKeyEventListener(new h5(this));
            this.I1.setShownFromBottom(true);
        }
        o6 o6Var2 = this.I1;
        o6Var2.W = z10;
        o6Var2.d();
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
            this.H1.setOnDismissListener(new i5(this, 0));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
        this.H1.setFocusable(true);
        int measuredWidth = i11 - (this.I1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.I1.getMeasuredHeight();
        this.H1.showAtLocation(q6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.m1.i(this.I1);
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
                    this.Z1.animate().alpha(0.0f).setDuration(150L).setListener(new v5(this, i10)).start();
                    return;
                }
                this.d2 = true;
                this.M1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b2, z10 ? 1.0f : 0.0f);
                this.Z1.setTransitionProgress(this.b2);
                ofFloat.addUpdateListener(new z4(this, 2));
                ofFloat.addListener(new ai.n(11, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(rr.g);
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
                qg.u1 u1Var = this.m1;
                u1Var.setAlpha(0.0f);
                u1Var.setVisibility(0);
            }
            int i10 = 1;
            this.v1.b(new ai.qa(i10, this));
            this.v1.a(new y4(this, z10, i10));
            this.v1.f();
        }
    }

    public final PointF Q0(qg.j jVar) {
        float f7;
        MediaController.CropState cropState = this.F0;
        float f10 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                j6 j6Var = this.R0;
                if (i11 >= j6Var.getChildCount()) {
                    break;
                }
                View childAt = j6Var.getChildAt(i11);
                if (!(childAt instanceof qg.j) || (childAt instanceof qg.f1)) {
                    f7 = f11;
                } else {
                    PointF position2 = ((qg.j) childAt).getPosition();
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

    @Override // org.telegram.ui.Components.bw0, org.telegram.ui.Components.aw0
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
        pg.u0 e = pg.u0.e(i12);
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
        int c10 = pg.u0.e(i12).c();
        pg.t1 t1Var = this.A1;
        t1Var.a = c10;
        E0(t1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.b1 = duration;
        duration.setInterpolator(rr.f);
        this.b1.addUpdateListener(new ai.x4(this, viewGroup3, viewGroup4, i13));
        this.b1.addListener(new x5(this, viewGroup3, viewGroup4, i10, 0));
        this.b1.start();
    }

    public final void S0() {
        s5 s5Var = this.O1;
        qg.p1 p1Var = this.l1;
        if (p1Var != null) {
            if (s5Var.c()) {
                p1Var.a(R.drawable.input_smile);
            } else if (this.q2) {
                p1Var.a(R.drawable.input_keyboard);
            } else {
                p1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = s5Var.c() || this.q2;
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.o1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.n1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.q1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.p1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        qg.j jVar;
        ObjectAnimator objectAnimator = this.i2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.O0.getParent();
        if (view == null) {
            return;
        }
        s5 s5Var = this.O1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!s5Var.c() || s5Var.d) && this.t2 <= 0) || (jVar = this.J0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.i2 = ofFloat;
        ofFloat.setDuration(350L);
        this.i2.setInterpolator(rr.h);
        this.i2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z10;
        if (this.J0 instanceof qg.v2) {
            s5 s5Var = this.O1;
            if ((s5Var.c() || this.t2 > 0) && !s5Var.d) {
                z10 = true;
                View view = this.X0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new bi.f(3, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.X0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new bi.f(3, this, z10)).start();
    }

    @Override // qg.r1, qg.n1
    public final void a() {
        I0(true);
    }

    @Override // qg.r1
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        qg.x1 x1Var = this.d1;
        if (z10 || (mVar instanceof pg.d)) {
            x1Var.b(0.4f, 1.75f);
        } else {
            x1Var.b(0.05f, 1.0f);
        }
        x1Var.setDrawCenter(!(mVar instanceof pg.l));
        f6 f6Var = this.O0;
        if (f6Var.getCurrentBrush() instanceof pg.l) {
            this.c1 = true;
        }
        f6Var.setBrush(mVar);
        pg.t1 t1Var = this.A1;
        int i10 = t1Var.a;
        t1Var.a = pg.u0.e(this.F1).c();
        t1Var.c = this.e1.get();
        E0(t1Var, Integer.valueOf(i10), false);
        this.P0.invalidate();
    }

    @Override // qg.h
    public final boolean d(qg.j jVar) {
        return D0(jVar, true);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ai.ba(17, this, view)).start();
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

    @Override // org.telegram.ui.Components.aw0, org.telegram.ui.ActionBar.x5
    public final void e() {
        this.E1.setColor(-15132391);
    }

    public final PointF e0() {
        j6 j6Var = this.R0;
        int measuredWidth = j6Var.getMeasuredWidth();
        int measuredHeight = j6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.S1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // qg.n1
    public final void f() {
        setTextType((this.L0 + 1) % 4);
    }

    public abstract boolean f0(ai.o8 o8Var);

    @Override // qg.n1
    public final void g(int i10) {
        qg.j jVar = this.J0;
        if (jVar instanceof qg.v2) {
            G0((qg.v2) jVar, i10);
            pg.u0 e = pg.u0.e(this.F1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void g0() {
        boolean z10 = this.W1;
        j6 j6Var = this.R0;
        boolean z11 = true;
        if (!z10 && !this.Y1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= j6Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = j6Var.getChildAt(i10);
                boolean z12 = childAt instanceof qg.v2;
                int i11 = this.F1;
                if (z12) {
                    CharSequence text = ((qg.v2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.z5.class)) {
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.q5.f(i11, z5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.q5.h(i11).e(document);
                            }
                            if (l8.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof qg.o2) {
                    TLRPC.Document sticker = ((qg.o2) childAt).getSticker();
                    if (l8.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i10++;
                    }
                } else if (childAt instanceof qg.c2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        for (int i12 = 0; i12 < j6Var.getChildCount(); i12++) {
            View childAt2 = j6Var.getChildAt(i12);
            if (childAt2 instanceof qg.j) {
                ((qg.j) childAt2).setIsVideo(z11);
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

    @Override // org.telegram.ui.Components.bw0, org.telegram.ui.Components.aw0
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
        j6 j6Var = this.R0;
        int childCount = j6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.o2) {
                TLRPC.Document sticker = ((qg.o2) childAt).getSticker();
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
            } else if (childAt instanceof qg.v2) {
                CharSequence text = ((qg.v2) childAt).getText();
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

    public pg.f1 getRenderView() {
        return this.O0;
    }

    public qg.j getSelectedEntity() {
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

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, this.G1));
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

    public final qg.r0 i0(qg.o0 o0Var) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j6 j6Var = this.R0;
        float measuredWidth = j6Var.getMeasuredWidth() <= 0 ? this.R1 : j6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        qg.r0 r0Var = new qg.r0(getContext(), Q0, this.F1, o0Var, measuredWidth / 360.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            r0Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            r0Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.a) != -47814) {
            r0Var.setColor(i10);
        }
        r0Var.setDelegate(this);
        r0Var.setMaxWidth(dp);
        j6Var.addView(r0Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            r0Var.j(1.0f / cropState.cropScale);
            r0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return r0Var;
    }

    public final qg.u0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j6 j6Var = this.R0;
        float measuredWidth = j6Var.getMeasuredWidth() <= 0 ? this.R1 : j6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        qg.u0 u0Var = new qg.u0(getContext(), Q0, this.F1, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            u0Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            u0Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.a) != -47814) {
            u0Var.setColor(i10);
        }
        u0Var.setDelegate(this);
        u0Var.setMaxWidth(dp);
        j6Var.addView(u0Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            u0Var.j(1.0f / cropState.cropScale);
            u0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return u0Var;
    }

    public final qg.y1 k0(String str, boolean z10) {
        float f7;
        uv0 uv0Var;
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
        j6 j6Var = this.R0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.R1, j6Var.getMeasuredWidth()) * 0.5d);
            uv0Var = new uv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.S1, j6Var.getMeasuredHeight()) * 0.5d);
            uv0Var = new uv0(f7 * floor2, floor2);
        }
        uv0 uv0Var2 = uv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = uv0Var2.a;
            uv0Var2.a = uv0Var2.b;
            uv0Var2.b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        qg.y1 y1Var = new qg.y1(context, e02, uv0Var2, str, intValue);
        y1Var.setDelegate(this);
        j6Var.addView(y1Var);
        g0();
        return y1Var;
    }

    public final qg.b2 l0(boolean z10) {
        String str;
        uv0 uv0Var = new uv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        j6 j6Var = this.R0;
        if (j6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < j6Var.getChildCount(); i10++) {
                    View childAt = j6Var.getChildAt(i10);
                    if (v7.a7.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (j6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (j6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, j6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, j6Var.getMeasuredHeight(), 0.0f);
            }
        }
        qg.b2 b2Var = new qg.b2(getContext(), e02);
        b2Var.r0 = new ai.ob(b2Var);
        b2Var.s0 = new ai.ob(b2Var);
        b2Var.t0 = new zg.f0(b2Var);
        b2Var.u0 = new zg.f0(b2Var);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(b2Var);
        b2Var.w0 = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(b2Var);
        b2Var.x0 = e6Var2;
        b2Var.z0 = 1.0f;
        b2Var.q0 = uv0Var;
        e6Var2.d(1.0f, true);
        e6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        zg.f0 f0Var = b2Var.t0;
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
        zg.o0 b10 = zg.o0.b(str);
        b2Var.v0 = b10;
        f0Var.e(b10);
        b2Var.k();
        b2Var.setDelegate(this);
        j6Var.addView(b2Var);
        g0();
        if (z10) {
            B0(b2Var);
            D0(b2Var, true);
        }
        return b2Var;
    }

    @Override // ci.hc
    public final boolean m(MotionEvent motionEvent) {
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

    public final qg.c2 m0(String str, boolean z10) {
        this.l2 = true;
        this.n2 = true;
        q0();
        j6 j6Var = this.R0;
        int measuredWidth = j6Var.getMeasuredWidth();
        j6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.R1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        uv0 uv0Var = new uv0(floor, floor);
        qg.c2 c2Var = new qg.c2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (uv0Var.b / 2.0f) + AndroidUtilities.dp(72.0f)), uv0Var, str);
        c2Var.setDelegate(this);
        j6Var.addView(c2Var);
        g0();
        if (z10) {
            B0(c2Var);
            post(new u4(this, c2Var, 0));
        }
        this.n2 = false;
        return c2Var;
    }

    public final c6 n0(Object obj, TLRPC.Document document) {
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
        c6 c6Var = new c6(this, context, p6Var.a, p6Var.c, p6Var.b, new uv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = c6Var.x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        c6Var.setDelegate(this);
        this.R0.addView(c6Var);
        g0();
        return c6Var;
    }

    public final qg.v2 o0(boolean z10) {
        uv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        qg.v2 v2Var = new qg.v2(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.A1, this.L0);
        float f7 = paintingSize.a / 9.0f;
        f5 f5Var = new f5(this, 0);
        v2Var.w0 = (int) (0.5f * f7);
        v2Var.x0 = (int) (f7 * 2.0f);
        v2Var.y0 = f5Var;
        float f10 = Q0.x;
        j6 j6Var = this.R0;
        if (f10 == j6Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.R1 - AndroidUtilities.dp(32.0f));
        int i10 = this.F1;
        v2Var.setTypeface(pg.u0.e(i10).j);
        v2Var.setType(pg.u0.e(i10).h);
        j6Var.addView(v2Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            B0(v2Var);
            v2Var.q();
            D0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.K0 = true;
            int i11 = pg.u0.e(i10).g;
            qg.p1 p1Var = this.l1;
            p1Var.d(i11, true);
            p1Var.setOutlineType(pg.u0.e(i10).h);
        }
        return v2Var;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        qk0 qk0Var = this.Z1;
        if (qk0Var != null) {
            AndroidUtilities.removeFromParent(qk0Var);
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
        qg.j jVar = this.J0;
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
            w0();
            this.G0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final qg.w2 p0(kd kdVar) {
        int i10;
        this.l2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        j6 j6Var = this.R0;
        float measuredWidth = j6Var.getMeasuredWidth() <= 0 ? this.R1 : j6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        qg.w2 w2Var = new qg.w2(getContext(), Q0, this.F1, kdVar, measuredWidth / 240.0f, dp);
        if (Q0.x == j6Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (Q0.y == j6Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        pg.t1 t1Var = this.A1;
        if (t1Var != null && (i10 = t1Var.a) != -47814) {
            w2Var.setColor(i10);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        j6Var.addView(w2Var, w7.y5.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.F0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w2Var;
    }

    @Override // qg.h
    public final boolean q() {
        return !(this.J0 instanceof qg.f1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 >= j6Var.getChildCount()) {
                return;
            }
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.c2) {
                if (this.J0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(rr.h).withEndAction(new u4(this, (qg.c2) childAt, 1)).start();
            }
            i10++;
        }
    }

    @Override // qg.h
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

    public final qg.f1 s0() {
        int i10 = 0;
        while (true) {
            j6 j6Var = this.R0;
            if (i10 >= j6Var.getChildCount()) {
                return null;
            }
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.f1) {
                return (qg.f1) childAt;
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
            j6 j6Var = this.R0;
            if (i10 >= j6Var.getChildCount()) {
                return;
            }
            View childAt = j6Var.getChildAt(i10);
            if (childAt instanceof qg.o2) {
                ImageReceiver imageReceiver = ((qg.o2) childAt).x0;
                ij0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.N(Math.round(((j3 % lottieAnimation.r()) / lottieAnimation.r()) * lottieAnimation.e[0]), true, false);
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

    @Override // qg.n1
    public final void t() {
        if (!this.r2 && !this.q2) {
            this.l2 = true;
            o0(true);
            return;
        }
        if (this.q2) {
            qg.j jVar = this.J0;
            if (jVar instanceof qg.v2) {
                this.O1.e = true;
                AndroidUtilities.showKeyboard(((qg.v2) jVar).getEditText());
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
    public final Bitmap t0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, l8 l8Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i10;
        int i11;
        j6 j6Var;
        int i12;
        int i13;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view2;
        int i14;
        qg.f1 f1Var;
        org.telegram.ui.t5 t5Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.w0 w0Var;
        yh.z3 z3Var;
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
        qg.v2 v2Var;
        boolean z20;
        q6 q6Var = this;
        f6 f6Var = q6Var.O0;
        int i15 = 0;
        byte b10 = 1;
        j6 j6Var2 = q6Var.R0;
        if (z10) {
            createBitmap = f6Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, j6Var2.getMeasuredWidth()), Math.max(1, j6Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                q6Var.g1 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < j6Var2.getChildCount(); i10++) {
                    if (j6Var2.getChildAt(i10) instanceof qg.j) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    int childCount = j6Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        View childAt = j6Var2.getChildAt(i16);
                        if (childAt instanceof qg.j) {
                            qg.j jVar = (qg.j) childAt;
                            jVar.getPosition();
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof qg.v2;
                                int i17 = q6Var.F1;
                                if (z21) {
                                    mediaEntity.type = b10;
                                    qg.v2 v2Var2 = (qg.v2) jVar;
                                    CharSequence text = v2Var2.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned = (Spanned) text;
                                        v2Var = v2Var2;
                                        org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(i15, text.length(), org.telegram.ui.Components.z5.class);
                                        if (z5VarArr != null) {
                                            int i18 = 0;
                                            while (i18 < z5VarArr.length) {
                                                org.telegram.ui.Components.z5 z5Var = z5VarArr[i18];
                                                org.telegram.ui.Components.z5[] z5VarArr2 = z5VarArr;
                                                TLRPC.Document document = z5Var.document;
                                                int i19 = i18;
                                                j6 j6Var3 = j6Var2;
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
                                                j6Var2 = j6Var3;
                                                i16 = i21;
                                            }
                                        }
                                    } else {
                                        v2Var = v2Var2;
                                    }
                                    j6Var = j6Var2;
                                    i14 = childCount;
                                    i13 = i16;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) v2Var.getType();
                                    mediaEntity.color = v2Var.getSwatch().a;
                                    mediaEntity.fontSize = v2Var.getTextSize();
                                    mediaEntity.textTypeface = v2Var.getTypeface();
                                    mediaEntity.textAlign = v2Var.getAlign();
                                } else {
                                    j6Var = j6Var2;
                                    i14 = childCount;
                                    i13 = i16;
                                    if (jVar instanceof qg.o2) {
                                        mediaEntity.type = (byte) 0;
                                        qg.o2 o2Var = (qg.o2) jVar;
                                        uv0 baseSize = o2Var.getBaseSize();
                                        mediaEntity.width = baseSize.a;
                                        mediaEntity.height = baseSize.b;
                                        mediaEntity.document = o2Var.getSticker();
                                        mediaEntity.parentObject = o2Var.getParentObject();
                                        TLRPC.Document sticker = o2Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || x0(sticker)) {
                                            boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                            r20 = (isAnimatedStickerDocument2 || x0(sticker)) ? o2Var.getDuration() : 5000L;
                                            if (r20 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r20);
                                                q6Var.g1 = q6Var.g1.multiply(valueOf2).divide(q6Var.g1.gcd(valueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (o2Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof qg.y1) {
                                        qg.y1 y1Var = (qg.y1) jVar;
                                        mediaEntity.type = (byte) 2;
                                        uv0 baseSize2 = y1Var.getBaseSize();
                                        mediaEntity.width = baseSize2.a;
                                        mediaEntity.height = baseSize2.b;
                                        mediaEntity.text = y1Var.q(i17);
                                        mediaEntity.crop = y1Var.G0;
                                        if (y1Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof qg.u0) {
                                        qg.u0 u0Var = (qg.u0) jVar;
                                        qg.t0 t0Var = u0Var.q0;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) u0Var.getType();
                                        mediaEntity.width = t0Var.getWidth();
                                        mediaEntity.height = t0Var.getHeight();
                                        mediaEntity.text = t0Var.getText();
                                        mediaEntity.color = u0Var.r0 ? u0Var.getColor() : 0;
                                        mediaEntity.density = t0Var.y;
                                        mediaEntity.media = u0Var.u0;
                                        TL_stories.MediaArea mediaArea2 = u0Var.v0;
                                        mediaEntity.mediaArea = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = t0Var.getCodeEmojiDocument();
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
                                    } else if (jVar instanceof qg.w2) {
                                        qg.w2 w2Var = (qg.w2) jVar;
                                        qg.t0 t0Var2 = w2Var.q0;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) w2Var.getType();
                                        mediaEntity.width = t0Var2.getWidth();
                                        mediaEntity.height = t0Var2.getHeight();
                                        mediaEntity.text = t0Var2.getText();
                                        mediaEntity.color = w2Var.r0 ? w2Var.getColor() : 0;
                                        mediaEntity.density = t0Var2.y;
                                        mediaEntity.weather = w2Var.u0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = w2Var.u0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = t0Var2.f.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = t0Var2.getCodeEmojiDocument();
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
                                        mediaEntity.width = (view.getWidth() * scaleX) / j6Var.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY) / j6Var.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / j6Var.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y3) / j6Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10) / j6Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3) / j6Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / j6Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / j6Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof qg.f1) {
                                            z18 = z16;
                                            if (jVar instanceof qg.o2) {
                                                float imageAspectRatio = ((qg.o2) jVar).x0.getImageAspectRatio();
                                                float f7 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                float f10 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                float measuredWidth = j6Var.getMeasuredWidth() / j6Var.getMeasuredHeight();
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
                                                if (mediaArea3 != null && (((z19 = jVar instanceof qg.u0)) || (jVar instanceof qg.w2) || (jVar instanceof qg.r0) || (jVar instanceof qg.b2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f13 = mediaEntity.x;
                                                    float f14 = mediaEntity.width;
                                                    mediaAreaCoordinates2.x = ((f14 / 2.0f) + f13) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z19) {
                                                        qg.t0 t0Var3 = ((qg.u0) jVar).q0;
                                                        mediaAreaCoordinates2.w = ok.x(t0Var3.I * 2 * scaleX, j6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = ok.x(t0Var3.J * 2 * scaleY, j6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof qg.w2) {
                                                        qg.t0 t0Var4 = ((qg.w2) jVar).q0;
                                                        mediaAreaCoordinates2.w = ok.x(t0Var4.I * 2 * scaleX, j6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = ok.x(t0Var4.J * 2 * scaleY, j6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof qg.r0) {
                                                        qg.p0 p0Var = ((qg.r0) jVar).q0;
                                                        mediaAreaCoordinates2.w = ok.x(p0Var.f * 2 * scaleX, j6Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = ok.x(p0Var.h * 2 * scaleY, j6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof qg.b2) {
                                                        qg.b2 b2Var = (qg.b2) jVar;
                                                        float padding = ((b2Var.getPadding() * 2) * scaleX) / j6Var.getMeasuredWidth();
                                                        float padding2 = ((b2Var.getPadding() * 2) * scaleX) / j6Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((qg.u0) jVar).q0.getRadius();
                                                    } else if (jVar instanceof qg.w2) {
                                                        radius = ((qg.w2) jVar).q0.getRadius();
                                                    } else if (jVar instanceof qg.r0) {
                                                        radius = ((qg.r0) jVar).q0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            qg.f1 f1Var2 = (qg.f1) jVar;
                                            qg.y0 y0Var = f1Var2.r0;
                                            org.telegram.ui.t5 t5Var2 = f1Var2.q0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z18 = z16;
                                            double r10 = f1Var2.r(rectF);
                                            rectF.offset(t5Var2.getX(), t5Var2.getY());
                                            rectF.offset(y0Var.getX(), y0Var.getY());
                                            mediaEntity.mediaArea.coordinates.x = (((rectF.centerX() * scaleX) + ok.b(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / j6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + ok.b(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y3)) / j6Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / j6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / j6Var.getMeasuredHeight()) * 100.0f;
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
                                        if (jVar instanceof qg.r0) {
                                            qg.r0 r0Var = (qg.r0) jVar;
                                            qg.p0 p0Var2 = r0Var.q0;
                                            mediaEntity.type = (byte) 7;
                                            if (p0Var2.e()) {
                                                mediaEntity.subType = (byte) p0Var2.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) r0Var.getType();
                                            }
                                            mediaEntity.width = p0Var2.getWidth();
                                            mediaEntity.height = p0Var2.getHeight();
                                            mediaEntity.color = r0Var.t0 ? r0Var.getColor() : 0;
                                            mediaEntity.density = p0Var2.e;
                                            mediaEntity.linkSettings = r0Var.u0;
                                            boolean z22 = p0Var2.R;
                                            if (z22) {
                                                ImageReceiver imageReceiver5 = p0Var2.T;
                                                if (z22 && imageReceiver5.hasImageLoaded() && imageReceiver5.getBitmap() != null) {
                                                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver5.getBitmap()), imageReceiver5.getImageKey(), false);
                                                }
                                                qg.o0 o0Var = mediaEntity.linkSettings;
                                                o0Var.a |= 4;
                                                o0Var.i = p0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            qg.o0 o0Var2 = r0Var.u0;
                                            if (o0Var2 != null) {
                                                TLRPC.WebPage webPage = o0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? r0Var.u0.c : r0Var.u0.d.url;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof qg.b2) {
                                                qg.b2 b2Var2 = (qg.b2) jVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                zg.o0 currentReaction = b2Var2.getCurrentReaction();
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
                                                mediaArea4.dark = b2Var2.r0.a == 1;
                                                mediaArea4.flipped = b2Var2.y0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof qg.c2) {
                                                qg.c2 c2Var = (qg.c2) jVar;
                                                uv0 baseSize3 = c2Var.getBaseSize();
                                                mediaEntity.width = baseSize3.a;
                                                mediaEntity.height = baseSize3.b;
                                                mediaEntity.type = (byte) 5;
                                                if (l8Var != null) {
                                                    mediaEntity.text = l8Var.o0.getAbsolutePath();
                                                    mediaEntity.roundOffset = l8Var.r0;
                                                    long j3 = l8Var.q0;
                                                    mediaEntity.roundDuration = j3;
                                                    float f15 = j3;
                                                    mediaEntity.roundLeft = (long) (l8Var.s0 * f15);
                                                    mediaEntity.roundRight = (long) (l8Var.t0 * f15);
                                                }
                                                mediaEntity.subType = (byte) 4;
                                                if (c2Var.r0) {
                                                    mediaEntity.subType = (byte) (4 | 2);
                                                }
                                            } else if (jVar instanceof qg.f1) {
                                                qg.f1 f1Var3 = (qg.f1) jVar;
                                                org.telegram.ui.t5 t5Var3 = f1Var3.q0;
                                                ArrayList arrayList3 = f1Var3.s0;
                                                qg.y0 y0Var2 = f1Var3.r0;
                                                mediaEntity.type = (byte) 6;
                                                int width = f1Var3.getWidth();
                                                mediaEntity.viewWidth = width;
                                                mediaEntity.width = width;
                                                int height = f1Var3.getHeight();
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
                                                            if (i25 >= y0Var2.getChildCount()) {
                                                                w0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = y0Var2.getChildAt(i25);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                                                w0Var = (org.telegram.ui.Cells.w0) childAt2;
                                                                break;
                                                            }
                                                            i25++;
                                                        }
                                                        if (w0Var == null || (z3Var = w0Var.F0) == null || (imageReceiver3 = z3Var.d) == null) {
                                                            f1Var = f1Var3;
                                                            i12 = i14;
                                                            t5Var = t5Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (l8Var != null) {
                                                                    Matrix matrix = l8Var.n0;
                                                                    if (l8Var.K) {
                                                                        matrix.reset();
                                                                        if (y0Var2.getChildCount() == 1) {
                                                                            view3 = y0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.u1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.u1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, l8Var.k0), imageReceiver2.getImageHeight() / Math.max(1, l8Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.getCenterX() - ((l8Var.k0 * max) / 2.0f), imageReceiver2.getCenterY() - ((l8Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(t5Var.getX(), t5Var.getY());
                                                                                    matrix.postTranslate(y0Var2.getX(), y0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(f1Var.getScaleX(), f1Var.getScaleY(), f1Var.getPivotX(), f1Var.getPivotY());
                                                                                    matrix.postRotate(f1Var.getRotation(), f1Var.getPivotX(), f1Var.getPivotY());
                                                                                    matrix.postTranslate(f1Var.getX(), f1Var.getY());
                                                                                    matrix.postScale(1.0f / j6Var.getWidth(), 1.0f / j6Var.getHeight());
                                                                                    matrix.postScale(l8Var.i0, l8Var.j0);
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
                                                            mediaEntity.width = (view.getWidth() * scaleX) / j6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY2) / j6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / j6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y32) / j6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102) / j6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32) / j6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / j6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / j6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof qg.f1) {
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
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) yh.s5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float dp = AndroidUtilities.dp(110.0f);
                                                                f1Var = f1Var3;
                                                                float centerX = imageReceiver3.getCenterX() + w0Var.getX() + y0Var2.getX() + w0Var.D0;
                                                                float centerY = imageReceiver3.getCenterY() + w0Var.getY() + y0Var2.getY() + w0Var.E0;
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
                                                                    ij0 lottieAnimation = imageReceiver4.getLottieAnimation();
                                                                    if (lottieAnimation != null && (isAnimatedStickerDocument5 || x0(document2))) {
                                                                        r20 = lottieAnimation.r();
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
                                                                mediaEntity2.width = (dp * scaleX2) / j6Var.getMeasuredWidth();
                                                                mediaEntity2.height = (dp * scaleY3) / j6Var.getMeasuredHeight();
                                                                mediaEntity2.x = (childAt.getWidth() / 2.0f) + x11;
                                                                mediaEntity2.y = (childAt.getHeight() / 2.0f) + y10;
                                                                i12 = i14;
                                                                float b11 = ok.b(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                float b12 = ok.b(childAt.getHeight(), 2.0f, scaleY3, centerY * scaleY3);
                                                                t5Var = t5Var3;
                                                                view = childAt;
                                                                double d10 = mediaEntity2.x;
                                                                double d11 = b11;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double cos = Math.cos(rotation) * d11;
                                                                double d12 = b12;
                                                                mediaEntity2.x = (float) ((cos - (Math.sin(rotation) * d12)) + d10);
                                                                float cos2 = (float) ((Math.cos(rotation) * d12) + (Math.sin(rotation) * d11) + mediaEntity2.y);
                                                                float f16 = (-dp) / 2.0f;
                                                                float f17 = (f16 * scaleX2) + mediaEntity2.x;
                                                                mediaEntity2.x = f17;
                                                                mediaEntity2.y = (f16 * scaleY3) + cos2;
                                                                mediaEntity2.x = f17 / j6Var.getMeasuredWidth();
                                                                mediaEntity2.y /= j6Var.getMeasuredHeight();
                                                                mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mediaEntity2.scale = scaleX2;
                                                                arrayList.add(mediaEntity2);
                                                            } else {
                                                                f1Var = f1Var3;
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
                                                            mediaEntity.width = (view.getWidth() * scaleX) / j6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY22) / j6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / j6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y322) / j6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022) / j6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322) / j6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / j6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / j6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof qg.f1) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                f1Var = f1Var3;
                                                i12 = i14;
                                                t5Var = t5Var3;
                                                view = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i17).getInputChannel(-l8.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    Boolean D = l8.D(messageObject);
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
                                                mediaEntity.width = (view.getWidth() * scaleX) / j6Var.getMeasuredWidth();
                                                mediaEntity.height = (view.getHeight() * scaleY222) / j6Var.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / j6Var.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y3222) / j6Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10222) / j6Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3222) / j6Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / j6Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / j6Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (jVar instanceof qg.f1) {
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
                                            mediaEntity.width = (view.getWidth() * scaleX) / j6Var.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY2222) / j6Var.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / j6Var.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y32222) / j6Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102222) / j6Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32222) / j6Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / j6Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / j6Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (jVar instanceof qg.f1) {
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
                                mediaEntity.width = (view.getWidth() * scaleX) / j6Var.getMeasuredWidth();
                                mediaEntity.height = (view.getHeight() * scaleY22222) / j6Var.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / j6Var.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y322222) / j6Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022222) / j6Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322222) / j6Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / j6Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / j6Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof qg.f1) {
                                }
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                j6Var = j6Var2;
                                i12 = childCount;
                                i13 = i16;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / j6Var.getMeasuredWidth();
                                int i27 = 0;
                                while (i27 < 2) {
                                    Canvas canvas3 = i27 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i27 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.x * j6Var.getMeasuredWidth(), mediaEntity.y * j6Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * j6Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * j6Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof qg.v2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof qg.f1) {
                                                qg.f1 f1Var4 = (qg.f1) view2;
                                                qg.y0 y0Var3 = f1Var4.r0;
                                                boolean z23 = true;
                                                f1Var4.u0 = true;
                                                int i28 = 0;
                                                while (i28 < y0Var3.getChildCount()) {
                                                    View childAt3 = y0Var3.getChildAt(i28);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.u1) {
                                                        ((org.telegram.ui.Cells.u1) childAt3).pe = z23;
                                                    }
                                                    i28++;
                                                    z23 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z24 = false;
                                                f1Var4.u0 = false;
                                                int i29 = 0;
                                                while (i29 < y0Var3.getChildCount()) {
                                                    View childAt4 = y0Var3.getChildAt(i29);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.u1) {
                                                        ((org.telegram.ui.Cells.u1) childAt4).pe = z24;
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
                                            } catch (Exception e) {
                                                FileLog.e(e);
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
                                    j6Var2 = j6Var;
                                    i15 = 0;
                                    b10 = 1;
                                }
                            }
                        } else {
                            j6Var = j6Var2;
                            i12 = childCount;
                            i13 = i16;
                        }
                        i16 = i13 + 1;
                        q6Var = this;
                        childCount = i12;
                        j6Var2 = j6Var;
                        i15 = 0;
                        b10 = 1;
                    }
                }
                return bitmap;
            }
            Bitmap c10 = f6Var.c(false, false);
            createBitmap = c10 != null ? Bitmap.createBitmap(c10.getWidth(), c10.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        q6Var.g1 = BigInteger.ONE;
        i11 = 0;
        while (i10 < j6Var2.getChildCount()) {
        }
        if (i11 > 0) {
        }
        return bitmap;
    }

    @Override // qg.h
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

    @Override // qg.r1
    public final pg.u0 v() {
        return pg.u0.e(this.F1);
    }

    public final void v0(boolean z10) {
        int i10 = 0;
        if (this.q2) {
            J0(0);
        }
        if (z10) {
            lz lzVar = this.p2;
            if (lzVar == null || lzVar.getVisibility() != 0) {
                w0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.p2.getMeasuredHeight());
            ofFloat.addUpdateListener(new z4(this, i10));
            this.s2 = true;
            ofFloat.addListener(new v5(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
            ofFloat.start();
        }
    }

    public final void w0() {
        lz lzVar;
        if (!this.q2 && (lzVar = this.p2) != null && lzVar.getVisibility() != 8) {
            this.p2.setVisibility(8);
        }
        int i10 = this.t2;
        this.t2 = 0;
        if (i10 != 0) {
            this.O1.a();
        }
    }

    @Override // qg.r1
    public final void y() {
        N0(new f5(this, 3), this, 53, 0, getHeight(), false);
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

    @Override // qg.h
    public final void z(qg.j jVar) {
        O0(false);
        M0(jVar);
    }

    public abstract void z0(boolean z10);

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}
