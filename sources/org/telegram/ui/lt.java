package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lt {
    public static TextPaint f0;
    public static volatile lt g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.lc0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public uc1 O;
    public org.telegram.ui.Components.fb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final gt U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.jz X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public org.telegram.ui.ActionBar.p6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public org.telegram.ui.Components.c11 j;
    public org.telegram.ui.ActionBar.k1 k;
    public jt l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final hi.b s;
    public final tg.b t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public l0 y;
    public fg.i z;
    public float e = 0.0f;
    public i0.c q = i0.c.e;

    public lt() {
        hi.b bVar = new hi.b();
        this.s = bVar;
        this.t = new tg.b(bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.i0.L(200.0f);
        this.N = new Paint(1);
        this.U = new gt(this);
    }

    public static /* synthetic */ void a(lt ltVar, Bitmap bitmap, Bitmap bitmap2) {
        hi.b bVar = ltVar.s;
        Paint paint = ltVar.N;
        ltVar.A.O0(true, false);
        ltVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        yg.d.c(bVar, ltVar.y);
        ltVar.t.d();
        ltVar.e0 = false;
        fg.i iVar = ltVar.z;
        if (iVar != null) {
            iVar.invalidate();
        }
    }

    public static boolean g(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f7;
        int i10;
        float f10;
        int i11;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ih.r rVar;
        String str2;
        ih.r rVar2;
        jt jtVar = ltVar.l;
        if (jtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = jtVar.d();
        TLRPC.PollAnswer g10 = ltVar.l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.jj.F1(d, g10.option);
        boolean z10 = F1 != null && F1.voters > 0 && org.telegram.messenger.jj.A(d);
        boolean z11 = (org.telegram.messenger.jj.W4(d) || d.poll.closed || ltVar.l.c()) ? false : true;
        boolean z12 = !z11 && org.telegram.messenger.jj.D(d);
        if (z10) {
            ih.r rVar3 = new ih.r(ltVar.r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ltVar.c0);
            org.telegram.ui.Components.z60 z60Var = new org.telegram.ui.Components.z60(actionBarPopupWindow$ActionBarPopupWindowLayout, ltVar.c0);
            View view = z60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i12 = org.telegram.ui.ActionBar.t6.E8;
            z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i12, ltVar.c0)));
            tg.b bVar = ltVar.t;
            wg.d k10 = w7.b9.k(ltVar.c0);
            if (view != null) {
                rVar = rVar3;
                str2 = null;
                vg.f c10 = bVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            } else {
                rVar = rVar3;
                str2 = null;
            }
            z60Var.c(R.drawable.ic_ab_back, org.telegram.messenger.cd.L0(2131753756, str2), new rh(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            z60Var.k();
            org.telegram.messenger.jj y3 = ltVar.l.y();
            Activity activity = ltVar.w;
            if ((activity instanceof LaunchActivity) && y3 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                org.telegram.ui.ActionBar.k2 lastFragment = (launchActivity.M() == null || launchActivity.M().getLastFragment() == null) ? null : launchActivity.M().getLastFragment();
                if (lastFragment != null) {
                    org.telegram.ui.Components.u51 a2 = rVar.a(lastFragment, org.telegram.messenger.jj.B0(y3.k), y3.f1(), g10.option, F1.voters, new org.telegram.ui.Components.vg(14, ltVar, lastFragment));
                    rVar2 = rVar;
                    z60Var.q(a2);
                    rVar2.setText(org.telegram.messenger.cd.G(F1.voters, "PollVotesCount", new Object[0]));
                    rVar2.a.d(F1.recent_voters, false);
                    rVar2.setLayoutParams(w7.b6.o(-1, 48));
                    int i13 = org.telegram.ui.ActionBar.t6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i13, ltVar.c0), 12, 0);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                    org.telegram.ui.ActionBar.p6 p6Var = ltVar.c0;
                    rVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.a7.k(rVar2, a02, null, N, p6Var);
                    rVar2.setOnClickListener(new bh.f(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar2);
                    View h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ltVar.c0);
                    h1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    org.telegram.ui.ActionBar.a7.j(h1Var, org.telegram.ui.ActionBar.a7.L(0.06f, i12), ltVar.c0);
                    i10 = -1;
                    h1Var.setLayoutParams(w7.b6.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(h1Var);
                }
            }
            rVar2 = rVar;
            rVar2.setText(org.telegram.messenger.cd.G(F1.voters, "PollVotesCount", new Object[0]));
            rVar2.a.d(F1.recent_voters, false);
            rVar2.setLayoutParams(w7.b6.o(-1, 48));
            int i132 = org.telegram.ui.ActionBar.t6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i132, ltVar.c0), 12, 0);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i132);
            org.telegram.ui.ActionBar.p6 p6Var2 = ltVar.c0;
            rVar2.setBackground(a022);
            org.telegram.ui.ActionBar.a7.k(rVar2, a022, null, N2, p6Var2);
            rVar2.setOnClickListener(new bh.f(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(rVar2);
            View h1Var2 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ltVar.c0);
            h1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            org.telegram.ui.ActionBar.a7.j(h1Var2, org.telegram.ui.ActionBar.a7.L(0.06f, i12), ltVar.c0);
            i10 = -1;
            h1Var2.setLayoutParams(w7.b6.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(h1Var2);
        } else {
            f7 = 0.06f;
            i10 = -1;
        }
        if (z11) {
            i11 = i10;
            str = null;
            f10 = f7;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.cd.L0(2131747171, null), false, ltVar.c0).setOnClickListener(new zs(ltVar, 2));
        } else {
            f10 = f7;
            i11 = i10;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, org.telegram.messenger.cd.L0(2131743850, str), false, ltVar.c0).setOnClickListener(new zs(ltVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View h1Var3 = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ltVar.c0);
            h1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.a7.j(h1Var3, org.telegram.ui.ActionBar.a7.L(f10, org.telegram.ui.ActionBar.t6.E8), ltVar.c0);
            h1Var3.setLayoutParams(w7.b6.o(i11, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(h1Var3);
        }
        return z10 || z11 || z12;
    }

    public static lt p() {
        lt ltVar;
        lt ltVar2 = g0;
        if (ltVar2 != null) {
            return ltVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                ltVar = g0;
                if (ltVar == null) {
                    ltVar = new lt();
                    g0 = ltVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ltVar;
    }

    public final void m() {
        if (this.w == null || this.K) {
            return;
        }
        org.telegram.messenger.i0.r(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        org.telegram.messenger.i0.h3(new ws(this, 0), 200L);
        uc1 uc1Var = this.O;
        if (uc1Var != null) {
            uc1Var.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.gr.f).start();
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 8);
    }

    public final void n() {
        sg.b0 reactionsWindow;
        org.telegram.ui.Components.fb fbVar = this.P;
        if (fbVar != null && (reactionsWindow = fbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.k1 k1Var = this.k;
        if (k1Var != null) {
            k1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.z20.m(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.i0.L(-12.0f)), org.telegram.ui.Components.gr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.tk0 tk0Var, jt jtVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        this.l = jtVar;
        if (jtVar != null) {
            this.m = jtVar.j();
            this.n = this.l.o();
        }
        jt jtVar2 = this.l;
        if ((jtVar2 == null || jtVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = tk0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = tk0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y3 || bottom < y3 || left > x10 || right < x10) {
                    i11++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.d8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.d8) childAt).a.L()) {
                            imageReceiver.J0(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                        if (((org.telegram.ui.Cells.b8) childAt).a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.a.n() != null) {
                                int i12 = h2Var.P;
                                if (i12 == 6) {
                                    imageReceiver.J0(0);
                                    i10 = 0;
                                } else if (i12 == 2 && h2Var.w) {
                                    imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.vu) {
                            imageReceiver.J0(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.ey) || ((org.telegram.ui.Components.ey) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.rx0) && (((org.telegram.ui.Components.rx0) childAt).b instanceof org.telegram.ui.Components.f5)) {
                                imageReceiver.J0(0);
                            }
                            i10 = -1;
                        } else {
                            imageReceiver.J0(0);
                        }
                    }
                    if (i10 != -1) {
                        this.a = x10;
                        this.b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.c11 c11Var = new org.telegram.ui.Components.c11(this, tk0Var, i10, p6Var, 1);
                        this.j = c11Var;
                        org.telegram.messenger.i0.h3(c11Var, 200L);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.tk0 tk0Var, Object obj, jt jtVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        int i11;
        jt jtVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = jtVar;
        if (jtVar != null) {
            this.m = jtVar.j();
            this.n = this.l.o();
        }
        jt jtVar3 = this.l;
        int i12 = 0;
        if ((jtVar3 == null || jtVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                org.telegram.messenger.i0.h3(new xs(i12, tk0Var, obj), 150L);
                org.telegram.ui.Components.c11 c11Var = this.j;
                if (c11Var != null) {
                    org.telegram.messenger.i0.r(c11Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    m();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.d8) {
                            ((org.telegram.ui.Cells.d8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.b8) {
                            ((org.telegram.ui.Cells.b8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.h2) {
                            ((org.telegram.ui.Cells.h2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x10 = (int) motionEvent.getX();
                            int y3 = (int) motionEvent.getY();
                            int childCount = tk0Var.getChildCount();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    break;
                                }
                                View childAt = tk0Var.getChildAt(i13);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y3 || bottom < y3 || left > x10 || right < x10) {
                                    i13++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.d8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.J0(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                                        imageReceiver.J0(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                                            int i14 = h2Var.P;
                                            if (i14 == 6) {
                                                imageReceiver.J0(0);
                                                i11 = 0;
                                            } else if (i14 == 2 && h2Var.w) {
                                                imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
                                                i11 = 1;
                                            } else {
                                                i11 = -1;
                                            }
                                            i10 = i11;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.vu) {
                                                imageReceiver.J0(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.ey) || ((org.telegram.ui.Components.ey) childAt).getSpan() == null) {
                                                i10 = -1;
                                            } else {
                                                imageReceiver.J0(0);
                                            }
                                            i10 = 2;
                                        }
                                        if (i10 != -1 && childAt != this.h) {
                                            jtVar2 = this.l;
                                            if (jtVar2 != null) {
                                                jtVar2.s();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.d8)) {
                                                ((org.telegram.ui.Cells.d8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.b8) {
                                                ((org.telegram.ui.Cells.b8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.h2) {
                                                ((org.telegram.ui.Cells.h2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            o();
                                            org.telegram.messenger.i0.W3(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.d8)) {
                                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                                TLRPC.Document sticker = d8Var.getSticker();
                                                org.telegram.messenger.jz stickerPath = d8Var.getStickerPath();
                                                String V = org.telegram.messenger.jj.V(d8Var.getSticker(), null, Integer.valueOf(this.r));
                                                jt jtVar4 = this.l;
                                                s(sticker, stickerPath, V, jtVar4 != null ? jtVar4.F(false) : null, null, i10, d8Var.D, d8Var.getParentObject(), p6Var, 0);
                                                d8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.b8) {
                                                org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view2;
                                                TLRPC.Document sticker2 = b8Var.getSticker();
                                                String V2 = org.telegram.messenger.jj.V(b8Var.getSticker(), null, Integer.valueOf(this.r));
                                                jt jtVar5 = this.l;
                                                s(sticker2, null, V2, jtVar5 != null ? jtVar5.F(false) : null, null, i10, false, b8Var.getParentObject(), p6Var, 0);
                                                b8Var.setScaled(true);
                                                this.i = b8Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.h2) {
                                                org.telegram.ui.Cells.h2 h2Var2 = (org.telegram.ui.Cells.h2) view2;
                                                TLRPC.Document document2 = h2Var2.getDocument();
                                                jt jtVar6 = this.l;
                                                s(document2, null, null, jtVar6 != null ? jtVar6.F(true) : null, h2Var2.getBotInlineResult(), i10, false, h2Var2.getBotInlineResult() != null ? h2Var2.getInlineBot() : h2Var2.getParentObject(), p6Var, 0);
                                                if (i10 != 1 || this.m) {
                                                    h2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.vu) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.vu) view2).getDocument();
                                                if (document3 != null) {
                                                    s(document3, null, org.telegram.messenger.jj.V(document3, null, Integer.valueOf(this.r)), null, null, i10, false, null, p6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.ey) {
                                                org.telegram.ui.Components.o5 span = ((org.telegram.ui.Components.ey) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.f5.e(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    s(document, null, org.telegram.messenger.jj.V(document, null, Integer.valueOf(this.r)), null, null, i10, false, null, p6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.rx0) {
                                                Drawable drawable = ((org.telegram.ui.Components.rx0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.f5 ? ((org.telegram.ui.Components.f5) drawable).e : null;
                                                if (document5 != null) {
                                                    s(document5, null, org.telegram.messenger.jj.V(document5, null, Integer.valueOf(this.r)), null, null, i10, false, null, p6Var, 0);
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                Vibrator vibrator = (Vibrator) this.z.getContext().getSystemService("vibrator");
                                                if (this.d0 == null) {
                                                    this.d0 = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                                                }
                                                vibrator.cancel();
                                                vibrator.vibrate(this.d0);
                                                return true;
                                            }
                                        }
                                    }
                                    i10 = 0;
                                    if (i10 != -1) {
                                        jtVar2 = this.l;
                                        if (jtVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.d8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        o();
                                        org.telegram.messenger.i0.W3(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.d8)) {
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                    }
                                }
                            }
                        } else if (!this.K) {
                            if (this.F == 1.0f) {
                                if (this.c == -10000.0f) {
                                    this.c = motionEvent.getY();
                                    this.d = 0.0f;
                                    this.e = 0.0f;
                                    return true;
                                }
                                float y10 = motionEvent.getY();
                                float f7 = (y10 - this.c) + this.d;
                                this.d = f7;
                                this.c = y10;
                                if (f7 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f7 < (-org.telegram.messenger.i0.L(60.0f))) {
                                    this.d = -org.telegram.messenger.i0.L(60.0f);
                                }
                                float f10 = this.d;
                                float L = org.telegram.messenger.i0.L(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f10) * 0.55f) / L) + 1.0f))) * L)) * (f10 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-org.telegram.messenger.i0.L(55.0f))) {
                                    gt gtVar = this.U;
                                    org.telegram.messenger.i0.r(gtVar);
                                    gtVar.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        org.telegram.messenger.i0.r(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > org.telegram.messenger.i0.L(10.0f)) {
                        org.telegram.messenger.i0.r(this.j);
                        this.j = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(TLRPC.Document document, org.telegram.messenger.jz jzVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ?? r14;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver4;
        ImageReceiver imageReceiver5;
        String str3;
        int i12;
        boolean z11;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = p6Var;
        this.p = z10;
        this.G = null;
        this.u.setColor((org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)) > 0.721f ? 1 : (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.o1 = null;
        ImageReceiver imageReceiver7 = this.B;
        gt gtVar = this.U;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && jzVar == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(org.telegram.messenger.i0.L(24.0f));
            }
            imageReceiver.f();
            this.S = false;
            if (document != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= document.attributes.size()) {
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                    int i14 = i13;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    } else {
                        i13 = i14 + 1;
                    }
                }
                if (str != null) {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                    this.G = new StaticLayout(org.telegram.messenger.i0.J2(TextUtils.ellipsize(org.telegram.messenger.k6.m(str, f0.getFontMetricsInt(), false, null, 0), f0, org.telegram.messenger.i0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.i0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                }
                if (inputStickerSet != null || i10 == 2) {
                    org.telegram.messenger.i0.r(gtVar);
                    str3 = "…";
                    org.telegram.messenger.i0.h3(gtVar, i11 > 0 ? i11 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.r).m0(inputStickerSet, true);
                if (m0 != null && m0.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                if (org.telegram.messenger.jj.O4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.r0(org.telegram.messenger.ic.b(document), null, org.telegram.messenger.ic.c(w9, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.t0(org.telegram.messenger.ic.b(document), null, org.telegram.messenger.ic.c(w9, document), null, "webp", this.a0, 1);
                    if (org.telegram.messenger.jj.X3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.t0(org.telegram.messenger.ic.d(org.telegram.messenger.jj.G1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (org.telegram.messenger.jj.C4(document)) {
                            imageReceiver6.o1 = org.telegram.ui.ActionBar.t6.o0(p6Var);
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(org.telegram.messenger.i0.J2(TextUtils.ellipsize(org.telegram.messenger.k6.m(documentAttribute2.alt, f0.getFontMetricsInt(), false, null, 0), f0, org.telegram.messenger.i0.L(200.0f), TextUtils.TruncateAt.END), "", str3), f0, org.telegram.messenger.i0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i15++;
                            }
                        }
                    }
                }
                imageReceiver = imageReceiver4;
                if (org.telegram.messenger.jj.C4(document)) {
                }
                if (this.G == null) {
                }
            } else if (jzVar != null) {
                imageReceiver6.o0(jzVar.a, null, null, jzVar.e ? "tgs" : null, 0L);
                if (jzVar.g != null) {
                    if (this.C == null) {
                        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0(this.z.getContext());
                        this.C = lc0Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(lc0Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(jzVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(org.telegram.messenger.i0.J2(TextUtils.ellipsize(org.telegram.messenger.k6.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, org.telegram.messenger.i0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.i0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                org.telegram.messenger.i0.r(gtVar);
                org.telegram.messenger.i0.h3(gtVar, i11 > 0 ? i11 : 1300L);
                if (imageReceiver3.B() == null) {
                    i12 = 0;
                    imageReceiver3.B().M(0);
                } else {
                    i12 = 0;
                }
                if (this.S && imageReceiver2.B() != null) {
                    imageReceiver2.B().M(i12);
                }
                this.V = i10;
                this.W = document;
                this.X = jzVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = p6Var;
                this.z.invalidate();
                if (this.E) {
                    org.telegram.messenger.i0.f2(this.w);
                    try {
                        if (this.y.getParent() != null) {
                            ((WindowManager) this.w.getSystemService("window")).removeView(this.y);
                        }
                        z11 = true;
                    } catch (Exception e) {
                        z11 = true;
                        org.telegram.messenger.f8.g(e, true);
                    }
                    ((WindowManager) this.w.getSystemService("window")).addView(this.y, this.x);
                    this.E = z11;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = org.telegram.messenger.jj.J0(document);
                org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(document);
                b10.p = 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.u0(b10, null, org.telegram.messenger.ic.d(J0, document), null, org.telegram.messenger.ic.c(w10, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.r0(b10, null, org.telegram.messenger.ic.c(w10, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.u0(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(botInlineResult.content)), null, org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(botInlineResult.thumb)), null, org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.r0(org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(botInlineResult.content)), null, org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            org.telegram.messenger.i0.r(gtVar);
            org.telegram.messenger.i0.h3(gtVar, 2000L);
        }
        imageReceiver2 = imageReceiver;
        imageReceiver3 = imageReceiver6;
        if (imageReceiver3.B() == null) {
        }
        if (this.S) {
            imageReceiver2.B().M(i12);
        }
        this.V = i10;
        this.W = document;
        this.X = jzVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = p6Var;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void t() {
        org.telegram.ui.Components.c11 c11Var = this.j;
        if (c11Var != null) {
            org.telegram.messenger.i0.r(c11Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(jt jtVar) {
        this.l = jtVar;
        if (jtVar != null) {
            this.m = jtVar.j();
            this.n = this.l.o();
        }
    }

    public final void v(Activity activity) {
        int i10 = org.telegram.messenger.d20.s0;
        this.r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i10;
        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i11 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i11;
        imageReceiver2.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.y = new l0(this, activity, 6);
        zg.h hVar = new zg.h(this.y);
        l0 l0Var = this.y;
        tg.b bVar = this.t;
        bVar.f = hVar;
        bVar.g = l0Var;
        bVar.e = new je.b();
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.y;
        ys ysVar = new ys(this);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(l0Var2, ysVar);
        fg.i iVar = new fg.i(this, activity);
        this.z = iVar;
        iVar.setFocusable(false);
        this.y.addView(this.z, w7.b6.e(-1, -1, 51));
        this.z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.vp.r1(this.r);
        this.I = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.i0.m(layoutParams);
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(this.z);
        imageReceiver2.R0 = true;
        imageReceiver2.J0 = true;
        imageReceiver2.H0(this.z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.d8)) {
            return false;
        }
        Activity W = org.telegram.messenger.i0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = d8Var;
        TLRPC.Document sticker = d8Var.getSticker();
        org.telegram.messenger.jz stickerPath = d8Var.getStickerPath();
        String V = org.telegram.messenger.jj.V(d8Var.getSticker(), null, Integer.valueOf(this.r));
        jt jtVar = this.l;
        s(sticker, stickerPath, V, jtVar != null ? jtVar.F(false) : null, null, 0, d8Var.D, d8Var.getParentObject(), this.c0, 0);
        gt gtVar = this.U;
        org.telegram.messenger.i0.r(gtVar);
        org.telegram.messenger.i0.h3(gtVar, 16L);
        d8Var.setScaled(true);
        return true;
    }
}
