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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class is {
    public static TextPaint f0;
    public static volatile is g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.nb0 C;
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
    public l0 O;
    public org.telegram.ui.Components.jb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final es U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.ry X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public org.telegram.ui.ActionBar.e6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public org.telegram.ui.Components.zo0 j;
    public org.telegram.ui.ActionBar.f1 k;
    public gs l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final si.b s;
    public final eh.c t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public l0 y;
    public ai.c0 z;
    public float e = 0.0f;
    public i0.b q = i0.b.e;

    public is() {
        si.b bVar = new si.b();
        this.s = bVar;
        this.t = new eh.c(bVar, bVar, bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new es(this);
    }

    public static /* synthetic */ void a(is isVar, Bitmap bitmap, Bitmap bitmap2) {
        si.b bVar = isVar.s;
        Paint paint = isVar.N;
        isVar.A.O0(true, false);
        isVar.v = bitmap;
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
        jh.d.c(bVar, isVar.y);
        isVar.t.d();
        isVar.e0 = false;
        ai.c0 c0Var = isVar.z;
        if (c0Var != null) {
            c0Var.invalidate();
        }
    }

    public static boolean g(is isVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f10;
        int i3;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        th.n nVar;
        String str2;
        th.n nVar2;
        gs gsVar = isVar.l;
        if (gsVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = gsVar.d();
        TLRPC.PollAnswer g7 = isVar.l.g();
        if (d == null || d.poll == null || g7 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.zi.F1(d, g7.option);
        boolean z10 = F1 != null && F1.voters > 0 && org.telegram.messenger.zi.A(d);
        boolean z11 = (org.telegram.messenger.zi.X4(d) || d.poll.closed || isVar.l.c()) ? false : true;
        boolean z12 = !z11 && org.telegram.messenger.zi.D(d);
        if (z10) {
            th.n nVar3 = new th.n(isVar.r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), isVar.c0);
            org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(actionBarPopupWindow$ActionBarPopupWindowLayout, isVar.c0);
            View view = f60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.k6.E8;
            f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, isVar.c0)));
            eh.c cVar = isVar.t;
            hh.e k10 = b8.cd.k(isVar.c0);
            if (view != null) {
                nVar = nVar3;
                str2 = null;
                gh.g c2 = cVar.c(view, null, true);
                c2.p(k10);
                view.setBackground(c2);
            } else {
                nVar = nVar3;
                str2 = null;
            }
            f60Var.c(R.drawable.ic_ab_back, org.telegram.messenger.bd.M0(2131753756, str2), new xg(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            f60Var.k();
            org.telegram.messenger.zi z13 = isVar.l.z();
            Activity activity = isVar.w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                org.telegram.ui.ActionBar.d2 lastFragment = (launchActivity.M() == null || launchActivity.M().getLastFragment() == null) ? null : launchActivity.M().getLastFragment();
                if (lastFragment != null) {
                    org.telegram.ui.Components.l41 a10 = nVar.a(lastFragment, org.telegram.messenger.zi.B0(z13.k), z13.f1(), g7.option, F1.voters, new org.telegram.ui.Components.ei(11, isVar, lastFragment));
                    nVar2 = nVar;
                    f60Var.q(a10);
                    nVar2.setText(org.telegram.messenger.bd.G(F1.voters, "PollVotesCount", new Object[0]));
                    nVar2.a.d(F1.recent_voters, false);
                    nVar2.setLayoutParams(b8.mf.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.k6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, isVar.c0), 12, 0);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    org.telegram.ui.ActionBar.e6 e6Var = isVar.c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(nVar2, a02, null, N, e6Var);
                    nVar2.setOnClickListener(new bi.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View c1Var = new org.telegram.ui.ActionBar.c1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), isVar.c0);
                    c1Var.setTag(R.id.fit_width_tag, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.r6.j(c1Var, org.telegram.ui.ActionBar.r6.L(0.06f, i11), isVar.c0);
                    i3 = -1;
                    c1Var.setLayoutParams(b8.mf.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.bd.G(F1.voters, "PollVotesCount", new Object[0]));
            nVar2.a.d(F1.recent_voters, false);
            nVar2.setLayoutParams(b8.mf.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.k6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i122, isVar.c0), 12, 0);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i122);
            org.telegram.ui.ActionBar.e6 e6Var2 = isVar.c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.r6.k(nVar2, a022, null, N2, e6Var2);
            nVar2.setOnClickListener(new bi.q(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View c1Var2 = new org.telegram.ui.ActionBar.c1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), isVar.c0);
            c1Var2.setTag(R.id.fit_width_tag, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.r6.j(c1Var2, org.telegram.ui.ActionBar.r6.L(0.06f, i11), isVar.c0);
            i3 = -1;
            c1Var2.setLayoutParams(b8.mf.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c1Var2);
        } else {
            f10 = 0.06f;
            i3 = -1;
        }
        if (z11) {
            i10 = i3;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.bd.M0(2131747164, null), false, isVar.c0).setOnClickListener(new xr(isVar, 2));
        } else {
            f11 = f10;
            i10 = i3;
            str = null;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, org.telegram.messenger.bd.M0(2131743834, str), false, isVar.c0).setOnClickListener(new xr(isVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            View c1Var3 = new org.telegram.ui.ActionBar.c1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), isVar.c0);
            c1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.r6.j(c1Var3, org.telegram.ui.ActionBar.r6.L(f11, org.telegram.ui.ActionBar.k6.E8), isVar.c0);
            c1Var3.setLayoutParams(b8.mf.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(c1Var3);
        }
        return z10 || z11 || z12;
    }

    public static is p() {
        is isVar;
        is isVar2 = g0;
        if (isVar2 != null) {
            return isVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                isVar = g0;
                if (isVar == null) {
                    isVar = new is();
                    g0 = isVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return isVar;
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
        org.telegram.messenger.g0.i3(new vr(this, 0), 200L);
        l0 l0Var = this.O;
        if (l0Var != null) {
            l0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 8);
    }

    public final void n() {
        dh.a0 reactionsWindow;
        org.telegram.ui.Components.jb jbVar = this.P;
        if (jbVar != null && (reactionsWindow = jbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        o();
        m();
    }

    public final void o() {
        org.telegram.ui.ActionBar.f1 f1Var = this.k;
        if (f1Var != null) {
            f1Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.camera.q.l(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.xq.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.tj0 tj0Var, gs gsVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        this.l = gsVar;
        if (gsVar != null) {
            this.m = gsVar.j();
            this.n = this.l.p();
        }
        gs gsVar2 = this.l;
        if ((gsVar2 == null || gsVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            int childCount = tj0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tj0Var.getChildAt(i10);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top > y9 || bottom < y9 || left > x10 || right < x10) {
                    i10++;
                } else {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.y7;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.y7) childAt).a.L()) {
                            imageReceiver.J0(0);
                            i3 = 0;
                        }
                        i3 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                        if (((org.telegram.ui.Cells.w7) childAt).a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i3 = 0;
                        }
                        i3 = -1;
                    } else {
                        i3 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.a.n() != null) {
                                int i11 = h2Var.Q;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i3 = 0;
                                } else if (i11 == 2 && h2Var.w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i3 = 1;
                                }
                            }
                            i3 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.iu) {
                            imageReceiver.J0(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.nx) || ((org.telegram.ui.Components.nx) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.nw0) && (((org.telegram.ui.Components.nw0) childAt).b instanceof org.telegram.ui.Components.g5)) {
                                imageReceiver.J0(0);
                            }
                            i3 = -1;
                        } else {
                            imageReceiver.J0(0);
                        }
                    }
                    if (i3 != -1) {
                        this.a = x10;
                        this.b = y9;
                        this.h = childAt;
                        org.telegram.ui.Components.zo0 zo0Var = new org.telegram.ui.Components.zo0(this, tj0Var, i3, e6Var, 7);
                        this.j = zo0Var;
                        org.telegram.messenger.g0.i3(zo0Var, 200L);
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
    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.tj0 tj0Var, Object obj, gs gsVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        int i10;
        gs gsVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = gsVar;
        if (gsVar != null) {
            this.m = gsVar.j();
            this.n = this.l.p();
        }
        gs gsVar3 = this.l;
        if ((gsVar3 == null || gsVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.p11(12, tj0Var, obj), 150L);
                org.telegram.ui.Components.zo0 zo0Var = this.j;
                if (zo0Var != null) {
                    org.telegram.messenger.g0.r(zo0Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    m();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.y7) {
                            ((org.telegram.ui.Cells.y7) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.w7) {
                            ((org.telegram.ui.Cells.w7) view3).setScaled(false);
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
                            int y9 = (int) motionEvent.getY();
                            int childCount = tj0Var.getChildCount();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= childCount) {
                                    break;
                                }
                                View childAt = tj0Var.getChildAt(i11);
                                if (childAt == null) {
                                    break;
                                }
                                int top = childAt.getTop();
                                int bottom = childAt.getBottom();
                                int left = childAt.getLeft();
                                int right = childAt.getRight();
                                if (top > y9 || bottom < y9 || left > x10 || right < x10) {
                                    i11++;
                                } else {
                                    boolean z10 = childAt instanceof org.telegram.ui.Cells.y7;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z10) {
                                        imageReceiver.J0(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                                        imageReceiver.J0(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                                            int i12 = h2Var.Q;
                                            if (i12 == 6) {
                                                imageReceiver.J0(0);
                                                i10 = 0;
                                            } else if (i12 == 2 && h2Var.w) {
                                                imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                                i10 = 1;
                                            } else {
                                                i10 = -1;
                                            }
                                            i3 = i10;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.iu) {
                                                imageReceiver.J0(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.nx) || ((org.telegram.ui.Components.nx) childAt).getSpan() == null) {
                                                i3 = -1;
                                            } else {
                                                imageReceiver.J0(0);
                                            }
                                            i3 = 2;
                                        }
                                        if (i3 != -1 && childAt != this.h) {
                                            gsVar2 = this.l;
                                            if (gsVar2 != null) {
                                                gsVar2.t();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.y7)) {
                                                ((org.telegram.ui.Cells.y7) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.w7) {
                                                ((org.telegram.ui.Cells.w7) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.h2) {
                                                ((org.telegram.ui.Cells.h2) view).setScaled(false);
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            o();
                                            org.telegram.messenger.g0.X3(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof org.telegram.ui.Cells.y7)) {
                                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                                TLRPC.Document sticker = y7Var.getSticker();
                                                org.telegram.messenger.ry stickerPath = y7Var.getStickerPath();
                                                String V = org.telegram.messenger.zi.V(y7Var.getSticker(), null, Integer.valueOf(this.r));
                                                gs gsVar4 = this.l;
                                                s(sticker, stickerPath, V, gsVar4 != null ? gsVar4.F(false) : null, null, i3, y7Var.E, y7Var.getParentObject(), e6Var, 0);
                                                y7Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.w7) {
                                                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view2;
                                                TLRPC.Document sticker2 = w7Var.getSticker();
                                                String V2 = org.telegram.messenger.zi.V(w7Var.getSticker(), null, Integer.valueOf(this.r));
                                                gs gsVar5 = this.l;
                                                s(sticker2, null, V2, gsVar5 != null ? gsVar5.F(false) : null, null, i3, false, w7Var.getParentObject(), e6Var, 0);
                                                w7Var.setScaled(true);
                                                this.i = w7Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.h2) {
                                                org.telegram.ui.Cells.h2 h2Var2 = (org.telegram.ui.Cells.h2) view2;
                                                TLRPC.Document document2 = h2Var2.getDocument();
                                                gs gsVar6 = this.l;
                                                s(document2, null, null, gsVar6 != null ? gsVar6.F(true) : null, h2Var2.getBotInlineResult(), i3, false, h2Var2.getBotInlineResult() != null ? h2Var2.getInlineBot() : h2Var2.getParentObject(), e6Var, 0);
                                                if (i3 != 1 || this.m) {
                                                    h2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.iu) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.iu) view2).getDocument();
                                                if (document3 != null) {
                                                    s(document3, null, org.telegram.messenger.zi.V(document3, null, Integer.valueOf(this.r)), null, null, i3, false, null, e6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.nx) {
                                                org.telegram.ui.Components.p5 span = ((org.telegram.ui.Components.nx) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.g5.e(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    s(document, null, org.telegram.messenger.zi.V(document, null, Integer.valueOf(this.r)), null, null, i3, false, null, e6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.nw0) {
                                                Drawable drawable = ((org.telegram.ui.Components.nw0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.g5 ? ((org.telegram.ui.Components.g5) drawable).e : null;
                                                if (document5 != null) {
                                                    s(document5, null, org.telegram.messenger.zi.V(document5, null, Integer.valueOf(this.r)), null, null, i3, false, null, e6Var, 0);
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
                                    i3 = 0;
                                    if (i3 != -1) {
                                        gsVar2 = this.l;
                                        if (gsVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.y7)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        o();
                                        org.telegram.messenger.g0.X3(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.y7)) {
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
                                float f10 = (y10 - this.c) + this.d;
                                this.d = f10;
                                this.c = y10;
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
                                    es esVar = this.U;
                                    org.telegram.messenger.g0.r(esVar);
                                    esVar.run();
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
    public final void s(TLRPC.Document document, org.telegram.messenger.ry ryVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i3, boolean z10, Object obj, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
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
        this.c0 = e6Var;
        this.p = z10;
        this.G = null;
        this.u.setColor((org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var)) > 0.721f ? 1 : (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.p1 = null;
        ImageReceiver imageReceiver7 = this.B;
        es esVar = this.U;
        if (i3 == 0 || i3 == 2 || i3 == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && ryVar == null) {
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
                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.i6.m(str, f0.getFontMetricsInt(), false, null, 0), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                }
                if (inputStickerSet != null || i3 == 2) {
                    org.telegram.messenger.g0.r(esVar);
                    str3 = "…";
                    org.telegram.messenger.g0.i3(esVar, i10 > 0 ? i10 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(this.r).m0(inputStickerSet, true);
                if (m0 != null && m0.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (org.telegram.messenger.zi.P4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.r0(org.telegram.messenger.ac.b(document), null, org.telegram.messenger.ac.c(w10, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.t0(org.telegram.messenger.ac.b(document), null, org.telegram.messenger.ac.c(w10, document), null, "webp", this.a0, 1);
                    if (org.telegram.messenger.zi.Y3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.t0(org.telegram.messenger.ac.d(org.telegram.messenger.zi.G1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (org.telegram.messenger.zi.D4(document)) {
                            imageReceiver6.p1 = org.telegram.ui.ActionBar.k6.o0(e6Var);
                        }
                        if (this.G == null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i14);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.i6.m(documentAttribute2.alt, f0.getFontMetricsInt(), false, null, 0), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", str3), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                }
                imageReceiver = imageReceiver4;
                if (org.telegram.messenger.zi.D4(document)) {
                }
                if (this.G == null) {
                }
            } else if (ryVar != null) {
                imageReceiver6.o0(ryVar.a, null, null, ryVar.e ? "tgs" : null, 0L);
                if (ryVar.g != null) {
                    if (this.C == null) {
                        org.telegram.ui.Components.nb0 nb0Var = new org.telegram.ui.Components.nb0(this.z.getContext());
                        this.C = nb0Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(nb0Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(ryVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.i6.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                org.telegram.messenger.g0.r(esVar);
                org.telegram.messenger.g0.i3(esVar, i10 > 0 ? i10 : 1300L);
                if (imageReceiver3.B() == null) {
                    i11 = 0;
                    imageReceiver3.B().M(0);
                } else {
                    i11 = 0;
                }
                if (this.S && imageReceiver2.B() != null) {
                    imageReceiver2.B().M(i11);
                }
                this.V = i3;
                this.W = document;
                this.X = ryVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = e6Var;
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
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = org.telegram.messenger.zi.J0(document);
                org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document);
                b10.p = 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.u0(b10, null, org.telegram.messenger.ac.d(J0, document), null, org.telegram.messenger.ac.c(w11, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.r0(b10, null, org.telegram.messenger.ac.c(w11, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.u0(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(botInlineResult.content)), null, org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(botInlineResult.thumb)), null, org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.r0(org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(botInlineResult.content)), null, org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            org.telegram.messenger.g0.r(esVar);
            org.telegram.messenger.g0.i3(esVar, 2000L);
        }
        imageReceiver2 = imageReceiver;
        imageReceiver3 = imageReceiver6;
        if (imageReceiver3.B() == null) {
        }
        if (this.S) {
            imageReceiver2.B().M(i11);
        }
        this.V = i3;
        this.W = document;
        this.X = ryVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = e6Var;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void t() {
        org.telegram.ui.Components.zo0 zo0Var = this.j;
        if (zo0Var != null) {
            org.telegram.messenger.g0.r(zo0Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.y7) {
                ((org.telegram.ui.Cells.y7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.w7) {
                ((org.telegram.ui.Cells.w7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(gs gsVar) {
        this.l = gsVar;
        if (gsVar != null) {
            this.m = gsVar.j();
            this.n = this.l.p();
        }
    }

    public final void v(Activity activity) {
        int i3 = org.telegram.messenger.h10.t0;
        this.r = i3;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i3;
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
        this.y = new l0(6, activity, this);
        kh.k kVar = new kh.k(this.y);
        l0 l0Var = this.y;
        eh.c cVar = this.t;
        cVar.h = kVar;
        cVar.i = l0Var;
        cVar.g = new ue.b();
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.y;
        wr wrVar = new wr(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l0Var2, wrVar);
        ai.c0 c0Var = new ai.c0(this, activity);
        this.z = c0Var;
        c0Var.setFocusable(false);
        this.y.addView(this.z, b8.mf.e(-1, -1, 51));
        this.z.setOnTouchListener(new e0(this, 1));
        org.telegram.messenger.hp.s1(this.r);
        this.I = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
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
        if (!(view instanceof org.telegram.ui.Cells.y7)) {
            return false;
        }
        Activity W = org.telegram.messenger.g0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.y7) {
            ((org.telegram.ui.Cells.y7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.w7) {
            ((org.telegram.ui.Cells.w7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = y7Var;
        TLRPC.Document sticker = y7Var.getSticker();
        org.telegram.messenger.ry stickerPath = y7Var.getStickerPath();
        String V = org.telegram.messenger.zi.V(y7Var.getSticker(), null, Integer.valueOf(this.r));
        gs gsVar = this.l;
        s(sticker, stickerPath, V, gsVar != null ? gsVar.F(false) : null, null, 0, y7Var.E, y7Var.getParentObject(), this.c0, 0);
        es esVar = this.U;
        org.telegram.messenger.g0.r(esVar);
        org.telegram.messenger.g0.i3(esVar, 16L);
        y7Var.setScaled(true);
        return true;
    }
}
