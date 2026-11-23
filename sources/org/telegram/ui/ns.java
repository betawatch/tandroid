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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ns {
    public static TextPaint f0;
    public static volatile ns g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.ec0 C;
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
    public k0 O;
    public org.telegram.ui.Components.pb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final js U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.ty X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public org.telegram.ui.ActionBar.h6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public org.telegram.ui.Components.lp0 j;
    public org.telegram.ui.ActionBar.g1 k;
    public ls l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final ui.b s;
    public final dh.c t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public k0 y;
    public ai.l0 z;
    public float e = 0.0f;
    public i0.b q = i0.b.e;

    public ns() {
        ui.b bVar = new ui.b();
        this.s = bVar;
        this.t = new dh.c(bVar, bVar, bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new js(this);
    }

    public static /* synthetic */ void a(ns nsVar, Bitmap bitmap, Bitmap bitmap2) {
        ui.b bVar = nsVar.s;
        Paint paint = nsVar.N;
        nsVar.A.O0(true, false);
        nsVar.v = bitmap;
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
        ih.d.c(bVar, nsVar.y);
        nsVar.t.d();
        nsVar.e0 = false;
        ai.l0 l0Var = nsVar.z;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public static boolean g(ns nsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f10;
        int i7;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.n nVar;
        String str2;
        sh.n nVar2;
        ls lsVar = nsVar.l;
        if (lsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = lsVar.d();
        TLRPC.PollAnswer g10 = nsVar.l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = org.telegram.messenger.gj.E1(d, g10.option);
        boolean z10 = E1 != null && E1.voters > 0 && org.telegram.messenger.gj.A(d);
        boolean z11 = (org.telegram.messenger.gj.W4(d) || d.poll.closed || nsVar.l.c()) ? false : true;
        boolean z12 = !z11 && org.telegram.messenger.gj.D(d);
        if (z10) {
            sh.n nVar3 = new sh.n(nsVar.r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.c0);
            org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(actionBarPopupWindow$ActionBarPopupWindowLayout, nsVar.c0);
            View view = a70Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.m6.E8;
            a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i11, nsVar.c0)));
            dh.c cVar = nsVar.t;
            gh.e l10 = c8.i0.l(nsVar.c0);
            if (view != null) {
                nVar = nVar3;
                str2 = null;
                fh.g c10 = cVar.c(view, null, true);
                c10.p(l10);
                view.setBackground(c10);
            } else {
                nVar = nVar3;
                str2 = null;
            }
            a70Var.c(R.drawable.ic_ab_back, org.telegram.messenger.hd.N0(2131753753, str2), new bh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            a70Var.k();
            org.telegram.messenger.gj z13 = nsVar.l.z();
            Activity activity = nsVar.w;
            int i12 = 12;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                org.telegram.ui.ActionBar.g2 lastFragment = (launchActivity.M() == null || launchActivity.M().getLastFragment() == null) ? null : launchActivity.M().getLastFragment();
                if (lastFragment != null) {
                    org.telegram.ui.Components.h51 a10 = nVar.a(lastFragment, org.telegram.messenger.gj.B0(z13.k), z13.e1(), g10.option, E1.voters, new org.telegram.ui.Components.rh(i12, nsVar, lastFragment));
                    nVar2 = nVar;
                    a70Var.q(a10);
                    nVar2.setText(org.telegram.messenger.hd.G(E1.voters, "PollVotesCount", new Object[0]));
                    nVar2.a.d(E1.recent_voters, false);
                    nVar2.setLayoutParams(c8.ma.o(-1, 48));
                    int i13 = org.telegram.ui.ActionBar.m6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i13, nsVar.c0), 12, 0);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                    org.telegram.ui.ActionBar.h6 h6Var = nsVar.c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.t6.j(nVar2, a02, null, M, h6Var);
                    nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.c0);
                    d1Var.setTag(R.id.fit_width_tag, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.t6.i(d1Var, org.telegram.ui.ActionBar.t6.K(0.06f, i11), nsVar.c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ma.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.hd.G(E1.voters, "PollVotesCount", new Object[0]));
            nVar2.a.d(E1.recent_voters, false);
            nVar2.setLayoutParams(c8.ma.o(-1, 48));
            int i132 = org.telegram.ui.ActionBar.m6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i132, nsVar.c0), 12, 0);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i132);
            org.telegram.ui.ActionBar.h6 h6Var2 = nsVar.c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.t6.j(nVar2, a022, null, M2, h6Var2);
            nVar2.setOnClickListener(new ci.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 24));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), nsVar.c0);
            d1Var2.setTag(R.id.fit_width_tag, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.t6.i(d1Var2, org.telegram.ui.ActionBar.t6.K(0.06f, i11), nsVar.c0);
            i7 = -1;
            d1Var2.setLayoutParams(c8.ma.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z11) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.hd.N0(2131746962, null), false, nsVar.c0).setOnClickListener(new cs(nsVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, org.telegram.messenger.hd.N0(2131743579, str), false, nsVar.c0).setOnClickListener(new cs(nsVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), nsVar.c0);
            d1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.t6.i(d1Var3, org.telegram.ui.ActionBar.t6.K(f11, org.telegram.ui.ActionBar.m6.E8), nsVar.c0);
            d1Var3.setLayoutParams(c8.ma.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        return z10 || z11 || z12;
    }

    public static ns p() {
        ns nsVar;
        ns nsVar2 = g0;
        if (nsVar2 != null) {
            return nsVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                nsVar = g0;
                if (nsVar == null) {
                    nsVar = new ns();
                    g0 = nsVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nsVar;
    }

    public final void m() {
        if (this.w == null || this.K) {
            return;
        }
        org.telegram.messenger.g0.r(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        org.telegram.messenger.g0.h3(new as(this, 0), 200L);
        k0 k0Var = this.O;
        if (k0Var != null) {
            k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.nr.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.nr.f).start();
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.k1, 8);
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.pb pbVar = this.P;
        if (pbVar != null && (reactionsWindow = pbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.g1 g1Var = this.k;
        if (g1Var != null) {
            g1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.o10.o(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.nr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.ek0 ek0Var, ls lsVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        this.l = lsVar;
        if (lsVar != null) {
            this.m = lsVar.j();
            this.n = this.l.o();
        }
        ls lsVar2 = this.l;
        if ((lsVar2 == null || lsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = ek0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ek0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y10 || bottom < y10 || left > x10 || right < x10) {
                    i10++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.a8) childAt).a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                        if (((org.telegram.ui.Cells.y7) childAt).a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.i2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                            if (i2Var.a.n() != null) {
                                int i11 = i2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && i2Var.w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.xu) {
                            imageReceiver.J0(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.cy) || ((org.telegram.ui.Components.cy) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.zw0) && (((org.telegram.ui.Components.zw0) childAt).b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.J0(0);
                            }
                            i7 = -1;
                        } else {
                            imageReceiver.J0(0);
                        }
                    }
                    if (i7 != -1) {
                        this.a = x10;
                        this.b = y10;
                        this.h = childAt;
                        org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(this, ek0Var, i7, h6Var, 8);
                        this.j = lp0Var;
                        org.telegram.messenger.g0.h3(lp0Var, 200L);
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
    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.ek0 ek0Var, Object obj, ls lsVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        int i10;
        ls lsVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = lsVar;
        if (lsVar != null) {
            this.m = lsVar.j();
            this.n = this.l.o();
        }
        ls lsVar3 = this.l;
        if ((lsVar3 == null || lsVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.fm0(29, ek0Var, obj), 150L);
                org.telegram.ui.Components.lp0 lp0Var = this.j;
                if (lp0Var != null) {
                    org.telegram.messenger.g0.r(lp0Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    m();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.a8) {
                            ((org.telegram.ui.Cells.a8) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.y7) {
                            ((org.telegram.ui.Cells.y7) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.i2) {
                            ((org.telegram.ui.Cells.i2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x10 = (int) motionEvent.getX();
                            int y10 = (int) motionEvent.getY();
                            int childCount = ek0Var.getChildCount();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= childCount) {
                                    break;
                                }
                                View childAt = ek0Var.getChildAt(i11);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y10 || bottom < y10 || left > x10 || right < x10) {
                                    i11++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.a8;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.J0(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                                        imageReceiver.J0(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.i2) {
                                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                                            int i12 = i2Var.Q;
                                            if (i12 == 6) {
                                                imageReceiver.J0(0);
                                                i10 = 0;
                                            } else if (i12 == 2 && i2Var.w) {
                                                imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                                i10 = 1;
                                            } else {
                                                i10 = -1;
                                            }
                                            i7 = i10;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.xu) {
                                                imageReceiver.J0(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.cy) || ((org.telegram.ui.Components.cy) childAt).getSpan() == null) {
                                                i7 = -1;
                                            } else {
                                                imageReceiver.J0(0);
                                            }
                                            i7 = 2;
                                        }
                                        if (i7 != -1 && childAt != this.h) {
                                            lsVar2 = this.l;
                                            if (lsVar2 != null) {
                                                lsVar2.s();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.a8)) {
                                                ((org.telegram.ui.Cells.a8) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.y7) {
                                                ((org.telegram.ui.Cells.y7) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.i2) {
                                                ((org.telegram.ui.Cells.i2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            o();
                                            org.telegram.messenger.g0.V3(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.a8)) {
                                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                                TLRPC.Document sticker = a8Var.getSticker();
                                                org.telegram.messenger.ty stickerPath = a8Var.getStickerPath();
                                                String V = org.telegram.messenger.gj.V(a8Var.getSticker(), null, Integer.valueOf(this.r));
                                                ls lsVar4 = this.l;
                                                s(sticker, stickerPath, V, lsVar4 != null ? lsVar4.G(false) : null, null, i7, a8Var.E, a8Var.getParentObject(), h6Var, 0);
                                                a8Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.y7) {
                                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                                TLRPC.Document sticker2 = y7Var.getSticker();
                                                String V2 = org.telegram.messenger.gj.V(y7Var.getSticker(), null, Integer.valueOf(this.r));
                                                ls lsVar5 = this.l;
                                                s(sticker2, null, V2, lsVar5 != null ? lsVar5.G(false) : null, null, i7, false, y7Var.getParentObject(), h6Var, 0);
                                                y7Var.setScaled(true);
                                                this.i = y7Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.i2) {
                                                org.telegram.ui.Cells.i2 i2Var2 = (org.telegram.ui.Cells.i2) view2;
                                                TLRPC.Document document2 = i2Var2.getDocument();
                                                ls lsVar6 = this.l;
                                                s(document2, null, null, lsVar6 != null ? lsVar6.G(true) : null, i2Var2.getBotInlineResult(), i7, false, i2Var2.getBotInlineResult() != null ? i2Var2.getInlineBot() : i2Var2.getParentObject(), h6Var, 0);
                                                if (i7 != 1 || this.m) {
                                                    i2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.xu) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.xu) view2).getDocument();
                                                if (document3 != null) {
                                                    s(document3, null, org.telegram.messenger.gj.V(document3, null, Integer.valueOf(this.r)), null, null, i7, false, null, h6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.cy) {
                                                org.telegram.ui.Components.y5 span = ((org.telegram.ui.Components.cy) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.p5.e(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    s(document, null, org.telegram.messenger.gj.V(document, null, Integer.valueOf(this.r)), null, null, i7, false, null, h6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.zw0) {
                                                Drawable drawable = ((org.telegram.ui.Components.zw0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.p5 ? ((org.telegram.ui.Components.p5) drawable).e : null;
                                                if (document5 != null) {
                                                    s(document5, null, org.telegram.messenger.gj.V(document5, null, Integer.valueOf(this.r)), null, null, i7, false, null, h6Var, 0);
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
                                    i7 = 0;
                                    if (i7 != -1) {
                                        lsVar2 = this.l;
                                        if (lsVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.a8)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        o();
                                        org.telegram.messenger.g0.V3(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.a8)) {
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
                                float y11 = motionEvent.getY();
                                float f10 = (y11 - this.c) + this.d;
                                this.d = f10;
                                this.c = y11;
                                if (f10 > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f10 < (-org.telegram.messenger.g0.L(60.0f))) {
                                    this.d = -org.telegram.messenger.g0.L(60.0f);
                                }
                                float f11 = this.d;
                                float L = org.telegram.messenger.g0.L(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f11) * 0.55f) / L) + 1.0f))) * L)) * (f11 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-org.telegram.messenger.g0.L(55.0f))) {
                                    js jsVar = this.U;
                                    org.telegram.messenger.g0.r(jsVar);
                                    jsVar.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        org.telegram.messenger.g0.r(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > org.telegram.messenger.g0.L(10.0f)) {
                        org.telegram.messenger.g0.r(this.j);
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
    public final void s(TLRPC.Document document, org.telegram.messenger.ty tyVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i7, boolean z10, Object obj, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ?? r14;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver4;
        ImageReceiver imageReceiver5;
        String str3;
        int i11;
        boolean z11;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = h6Var;
        this.p = z10;
        this.G = null;
        this.u.setColor((org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)) > 0.721f ? 1 : (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.p1 = null;
        ImageReceiver imageReceiver7 = this.B;
        js jsVar = this.U;
        if (i7 == 0 || i7 == 2 || i7 == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && tyVar == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(org.telegram.messenger.g0.L(24.0f));
            }
            imageReceiver.f();
            this.S = false;
            if (document != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= document.attributes.size()) {
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                    int i13 = i12;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    } else {
                        i12 = i13 + 1;
                    }
                }
                if (str != null) {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.j6.m(str, f0.getFontMetricsInt(), false, null, 0), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                }
                if (inputStickerSet != null || i7 == 2) {
                    org.telegram.messenger.g0.r(jsVar);
                    str3 = "…";
                    org.telegram.messenger.g0.h3(jsVar, i10 > 0 ? i10 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(this.r).o0(inputStickerSet, true);
                if (o02 != null && o02.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (org.telegram.messenger.gj.O4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.r0(org.telegram.messenger.gc.b(document), null, org.telegram.messenger.gc.c(w10, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.t0(org.telegram.messenger.gc.b(document), null, org.telegram.messenger.gc.c(w10, document), null, "webp", this.a0, 1);
                    if (org.telegram.messenger.gj.X3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.t0(org.telegram.messenger.gc.d(org.telegram.messenger.gj.F1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (org.telegram.messenger.gj.C4(document)) {
                            imageReceiver6.p1 = org.telegram.ui.ActionBar.m6.o0(h6Var);
                        }
                        if (this.G == null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i14);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.j6.m(documentAttribute2.alt, f0.getFontMetricsInt(), false, null, 0), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", str3), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                }
                imageReceiver = imageReceiver4;
                if (org.telegram.messenger.gj.C4(document)) {
                }
                if (this.G == null) {
                }
            } else if (tyVar != null) {
                imageReceiver6.o0(tyVar.a, null, null, tyVar.e ? "tgs" : null, 0L);
                if (tyVar.g != null) {
                    if (this.C == null) {
                        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(this.z.getContext());
                        this.C = ec0Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(ec0Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(tyVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.j6.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                org.telegram.messenger.g0.r(jsVar);
                org.telegram.messenger.g0.h3(jsVar, i10 > 0 ? i10 : 1300L);
                if (imageReceiver3.B() == null) {
                    i11 = 0;
                    imageReceiver3.B().M(0);
                } else {
                    i11 = 0;
                }
                if (this.S && imageReceiver2.B() != null) {
                    imageReceiver2.B().M(i11);
                }
                this.V = i7;
                this.W = document;
                this.X = tyVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = h6Var;
                this.z.invalidate();
                if (this.E) {
                    org.telegram.messenger.g0.f2(this.w);
                    try {
                        if (this.y.getParent() != null) {
                            ((WindowManager) this.w.getSystemService("window")).removeView(this.y);
                        }
                        z11 = true;
                    } catch (Exception e10) {
                        z11 = true;
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    ((WindowManager) this.w.getSystemService("window")).addView(this.y, this.x);
                    this.E = z11;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.j1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = org.telegram.messenger.gj.J0(document);
                org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document);
                b10.p = 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.u0(b10, null, org.telegram.messenger.gc.d(J0, document), null, org.telegram.messenger.gc.c(w11, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.r0(b10, null, org.telegram.messenger.gc.c(w11, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.u0(org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(botInlineResult.content)), null, org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(botInlineResult.thumb)), null, org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.r0(org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(botInlineResult.content)), null, org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            org.telegram.messenger.g0.r(jsVar);
            org.telegram.messenger.g0.h3(jsVar, 2000L);
        }
        imageReceiver2 = imageReceiver;
        imageReceiver3 = imageReceiver6;
        if (imageReceiver3.B() == null) {
        }
        if (this.S) {
            imageReceiver2.B().M(i11);
        }
        this.V = i7;
        this.W = document;
        this.X = tyVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = h6Var;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void t() {
        org.telegram.ui.Components.lp0 lp0Var = this.j;
        if (lp0Var != null) {
            org.telegram.messenger.g0.r(lp0Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.i2) {
                ((org.telegram.ui.Cells.i2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(ls lsVar) {
        this.l = lsVar;
        if (lsVar != null) {
            this.m = lsVar.j();
            this.n = this.l.o();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.k10.t0;
        this.r = i7;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i7;
        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i10 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i10;
        imageReceiver2.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.y = new k0(6, activity, this);
        jh.k kVar = new jh.k(this.y);
        k0 k0Var = this.y;
        dh.c cVar = this.t;
        cVar.h = kVar;
        cVar.i = k0Var;
        cVar.g = new xe.b();
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.y;
        bs bsVar = new bs(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var2, bsVar);
        ai.l0 l0Var = new ai.l0(this, activity);
        this.z = l0Var;
        l0Var.setFocusable(false);
        this.y.addView(this.z, c8.ma.e(-1, -1, 51));
        this.z.setOnTouchListener(new c0(this, 1));
        org.telegram.messenger.np.u1(this.r);
        this.I = org.telegram.messenger.np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.H0(this.z);
    }

    public final void w() {
        this.T = null;
    }

    public final boolean x(View view) {
        if (!(view instanceof org.telegram.ui.Cells.a8)) {
            return false;
        }
        Activity W = org.telegram.messenger.g0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.a8) {
            ((org.telegram.ui.Cells.a8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.y7) {
            ((org.telegram.ui.Cells.y7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.i2) {
            ((org.telegram.ui.Cells.i2) view2).setScaled(false);
        }
        this.h = a8Var;
        TLRPC.Document sticker = a8Var.getSticker();
        org.telegram.messenger.ty stickerPath = a8Var.getStickerPath();
        String V = org.telegram.messenger.gj.V(a8Var.getSticker(), null, Integer.valueOf(this.r));
        ls lsVar = this.l;
        s(sticker, stickerPath, V, lsVar != null ? lsVar.G(false) : null, null, 0, a8Var.E, a8Var.getParentObject(), this.c0, 0);
        js jsVar = this.U;
        org.telegram.messenger.g0.r(jsVar);
        org.telegram.messenger.g0.h3(jsVar, 16L);
        a8Var.setScaled(true);
        return true;
    }
}
