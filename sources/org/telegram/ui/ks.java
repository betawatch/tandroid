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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ks {
    public static TextPaint f0;
    public static volatile ks g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.sb0 C;
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
    public org.telegram.ui.Components.lb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final gs U;
    public int V;
    public TLRPC.Document W;
    public org.telegram.messenger.zy X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public org.telegram.ui.ActionBar.f6 c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public org.telegram.ui.Components.pp0 j;
    public org.telegram.ui.ActionBar.g1 k;
    public is l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final ri.b s;
    public final dh.c t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public k0 y;
    public bi.x5 z;
    public float e = 0.0f;
    public i0.b q = i0.b.e;

    public ks() {
        ri.b bVar = new ri.b();
        this.s = bVar;
        this.t = new dh.c(bVar, bVar, bVar);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = org.telegram.messenger.g0.L(200.0f);
        this.N = new Paint(1);
        this.U = new gs(this);
    }

    public static /* synthetic */ void a(ks ksVar, Bitmap bitmap, Bitmap bitmap2) {
        ri.b bVar = ksVar.s;
        Paint paint = ksVar.N;
        ksVar.A.O0(true, false);
        ksVar.v = bitmap;
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
        ih.d.c(bVar, ksVar.y);
        ksVar.t.d();
        ksVar.e0 = false;
        bi.x5 x5Var = ksVar.z;
        if (x5Var != null) {
            x5Var.invalidate();
        }
    }

    public static boolean g(ks ksVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f10;
        int i7;
        float f11;
        int i10;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        sh.n nVar;
        String str2;
        sh.n nVar2;
        is isVar = ksVar.l;
        if (isVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = isVar.d();
        TLRPC.PollAnswer g10 = ksVar.l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters F1 = org.telegram.messenger.ij.F1(d, g10.option);
        boolean z9 = F1 != null && F1.voters > 0 && org.telegram.messenger.ij.A(d);
        boolean z10 = (org.telegram.messenger.ij.X4(d) || d.poll.closed || ksVar.l.c()) ? false : true;
        boolean z11 = !z10 && org.telegram.messenger.ij.D(d);
        if (z9) {
            sh.n nVar3 = new sh.n(ksVar.r, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ksVar.c0);
            org.telegram.ui.Components.k60 k60Var = new org.telegram.ui.Components.k60(actionBarPopupWindow$ActionBarPopupWindowLayout, ksVar.c0);
            View view = k60Var.B;
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i11 = org.telegram.ui.ActionBar.k6.E8;
            k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, ksVar.c0)));
            dh.c cVar = ksVar.t;
            gh.e k10 = c8.g0.k(ksVar.c0);
            if (view != null) {
                nVar = nVar3;
                str2 = null;
                fh.g c10 = cVar.c(view, null, true);
                c10.p(k10);
                view.setBackground(c10);
            } else {
                nVar = nVar3;
                str2 = null;
            }
            k60Var.c(R.drawable.ic_ab_back, org.telegram.messenger.id.M0(2131753756, str2), new bh(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            k60Var.k();
            org.telegram.messenger.ij A = ksVar.l.A();
            Activity activity = ksVar.w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                org.telegram.ui.ActionBar.f2 lastFragment = (launchActivity.M() == null || launchActivity.M().getLastFragment() == null) ? null : launchActivity.M().getLastFragment();
                if (lastFragment != null) {
                    org.telegram.ui.Components.q41 a10 = nVar.a(lastFragment, org.telegram.messenger.ij.B0(A.k), A.f1(), g10.option, F1.voters, new org.telegram.ui.Components.fx(8, ksVar, lastFragment));
                    nVar2 = nVar;
                    k60Var.q(a10);
                    nVar2.setText(org.telegram.messenger.id.G(F1.voters, "PollVotesCount", new Object[0]));
                    nVar2.a.d(F1.recent_voters, false);
                    nVar2.setLayoutParams(c8.ha.o(-1, 48));
                    int i12 = org.telegram.ui.ActionBar.k6.I5;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, ksVar.c0), 12, 0);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    org.telegram.ui.ActionBar.f6 f6Var = ksVar.c0;
                    nVar2.setBackground(a02);
                    org.telegram.ui.ActionBar.r6.k(nVar2, a02, null, N, f6Var);
                    nVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
                    View d1Var = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ksVar.c0);
                    d1Var.setTag(R.id.fit_width_tag, 1);
                    f10 = 0.06f;
                    org.telegram.ui.ActionBar.r6.j(d1Var, org.telegram.ui.ActionBar.r6.L(0.06f, i11), ksVar.c0);
                    i7 = -1;
                    d1Var.setLayoutParams(c8.ha.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var);
                }
            }
            nVar2 = nVar;
            nVar2.setText(org.telegram.messenger.id.G(F1.voters, "PollVotesCount", new Object[0]));
            nVar2.a.d(F1.recent_voters, false);
            nVar2.setLayoutParams(c8.ha.o(-1, 48));
            int i122 = org.telegram.ui.ActionBar.k6.I5;
            org.telegram.ui.Cells.y a022 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i122, ksVar.c0), 12, 0);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i122);
            org.telegram.ui.ActionBar.f6 f6Var2 = ksVar.c0;
            nVar2.setBackground(a022);
            org.telegram.ui.ActionBar.r6.k(nVar2, a022, null, N2, f6Var2);
            nVar2.setOnClickListener(new ai.v(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 22));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(nVar2);
            View d1Var2 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ksVar.c0);
            d1Var2.setTag(R.id.fit_width_tag, 1);
            f10 = 0.06f;
            org.telegram.ui.ActionBar.r6.j(d1Var2, org.telegram.ui.ActionBar.r6.L(0.06f, i11), ksVar.c0);
            i7 = -1;
            d1Var2.setLayoutParams(c8.ha.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(d1Var2);
        } else {
            f10 = 0.06f;
            i7 = -1;
        }
        if (z10) {
            i10 = i7;
            str = null;
            f11 = f10;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.id.M0(2131747157, null), false, ksVar.c0).setOnClickListener(new zr(ksVar, 2));
        } else {
            f11 = f10;
            i10 = i7;
            str = null;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, org.telegram.messenger.id.M0(2131743827, str), false, ksVar.c0).setOnClickListener(new zr(ksVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z9 && (z10 || z11)) {
            View d1Var3 = new org.telegram.ui.ActionBar.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ksVar.c0);
            d1Var3.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.r6.j(d1Var3, org.telegram.ui.ActionBar.r6.L(f11, org.telegram.ui.ActionBar.k6.E8), ksVar.c0);
            d1Var3.setLayoutParams(c8.ha.o(i10, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d1Var3);
        }
        return z9 || z10 || z11;
    }

    public static ks p() {
        ks ksVar;
        ks ksVar2 = g0;
        if (ksVar2 != null) {
            return ksVar2;
        }
        synchronized (PhotoViewer.class) {
            try {
                ksVar = g0;
                if (ksVar == null) {
                    ksVar = new ks();
                    g0 = ksVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ksVar;
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
        org.telegram.messenger.g0.i3(new xr(this, 0), 200L);
        k0 k0Var = this.O;
        if (k0Var != null) {
            k0Var.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 8);
    }

    public final void n() {
        ch.b0 reactionsWindow;
        org.telegram.ui.Components.lb lbVar = this.P;
        if (lbVar != null && (reactionsWindow = lbVar.getReactionsWindow()) != null && !reactionsWindow.q) {
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
            org.telegram.messenger.camera.q.l(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(org.telegram.messenger.g0.L(-12.0f)), org.telegram.ui.Components.xq.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                m();
            }
        }
    }

    public final boolean q(MotionEvent motionEvent, org.telegram.ui.Components.pj0 pj0Var, is isVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        this.l = isVar;
        if (isVar != null) {
            this.m = isVar.j();
            this.n = this.l.p();
        }
        is isVar2 = this.l;
        if ((isVar2 == null || isVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = pj0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = pj0Var.getChildAt(i10);
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
                    boolean z9 = childAt instanceof org.telegram.ui.Cells.z7;
                    ImageReceiver imageReceiver = this.A;
                    if (z9) {
                        if (((org.telegram.ui.Cells.z7) childAt).a.L()) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                        if (((org.telegram.ui.Cells.x7) childAt).a.getImageReceiver().n() != null) {
                            imageReceiver.J0(0);
                            i7 = 0;
                        }
                        i7 = -1;
                    } else {
                        i7 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                            if (h2Var.a.n() != null) {
                                int i11 = h2Var.P;
                                if (i11 == 6) {
                                    imageReceiver.J0(0);
                                    i7 = 0;
                                } else if (i11 == 2 && h2Var.w) {
                                    imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                    i7 = 1;
                                }
                            }
                            i7 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.ku) {
                            imageReceiver.J0(0);
                        } else if (!(childAt instanceof org.telegram.ui.Components.qx) || ((org.telegram.ui.Components.qx) childAt).getSpan() == null) {
                            if ((childAt instanceof org.telegram.ui.Components.nw0) && (((org.telegram.ui.Components.nw0) childAt).b instanceof org.telegram.ui.Components.i5)) {
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
                        org.telegram.ui.Components.pp0 pp0Var = new org.telegram.ui.Components.pp0(this, pj0Var, i7, f6Var, 6);
                        this.j = pp0Var;
                        org.telegram.messenger.g0.i3(pp0Var, 200L);
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
    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.pj0 pj0Var, Object obj, is isVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        int i10;
        is isVar2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = isVar;
        if (isVar != null) {
            this.m = isVar.j();
            this.n = this.l.p();
        }
        is isVar3 = this.l;
        if ((isVar3 == null || isVar3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l51(7, pj0Var, obj), 150L);
                org.telegram.ui.Components.pp0 pp0Var = this.j;
                if (pp0Var != null) {
                    org.telegram.messenger.g0.r(pp0Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    m();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof org.telegram.ui.Cells.z7) {
                            ((org.telegram.ui.Cells.z7) view3).setScaled(false);
                        } else if (view3 instanceof org.telegram.ui.Cells.x7) {
                            ((org.telegram.ui.Cells.x7) view3).setScaled(false);
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
                            int y10 = (int) motionEvent.getY();
                            int childCount = pj0Var.getChildCount();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= childCount) {
                                    break;
                                }
                                View childAt = pj0Var.getChildAt(i11);
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
                                    boolean z9 = childAt instanceof org.telegram.ui.Cells.z7;
                                    ImageReceiver imageReceiver = this.A;
                                    if (z9) {
                                        imageReceiver.J0(0);
                                    } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                                        imageReceiver.J0(0);
                                    } else {
                                        if (childAt instanceof org.telegram.ui.Cells.h2) {
                                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                                            int i12 = h2Var.P;
                                            if (i12 == 6) {
                                                imageReceiver.J0(0);
                                                i10 = 0;
                                            } else if (i12 == 2 && h2Var.w) {
                                                imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                                                i10 = 1;
                                            } else {
                                                i10 = -1;
                                            }
                                            i7 = i10;
                                        } else {
                                            if (childAt instanceof org.telegram.ui.Components.ku) {
                                                imageReceiver.J0(0);
                                            } else if (!(childAt instanceof org.telegram.ui.Components.qx) || ((org.telegram.ui.Components.qx) childAt).getSpan() == null) {
                                                i7 = -1;
                                            } else {
                                                imageReceiver.J0(0);
                                            }
                                            i7 = 2;
                                        }
                                        if (i7 != -1 && childAt != this.h) {
                                            isVar2 = this.l;
                                            if (isVar2 != null) {
                                                isVar2.t();
                                            }
                                            view = this.h;
                                            if (!(view instanceof org.telegram.ui.Cells.z7)) {
                                                ((org.telegram.ui.Cells.z7) view).setScaled(false);
                                            } else if (view instanceof org.telegram.ui.Cells.x7) {
                                                ((org.telegram.ui.Cells.x7) view).setScaled(false);
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
                                            if (!(view2 instanceof org.telegram.ui.Cells.z7)) {
                                                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                                TLRPC.Document sticker = z7Var.getSticker();
                                                org.telegram.messenger.zy stickerPath = z7Var.getStickerPath();
                                                String V = org.telegram.messenger.ij.V(z7Var.getSticker(), null, Integer.valueOf(this.r));
                                                is isVar4 = this.l;
                                                s(sticker, stickerPath, V, isVar4 != null ? isVar4.G(false) : null, null, i7, z7Var.D, z7Var.getParentObject(), f6Var, 0);
                                                z7Var.setScaled(true);
                                            } else if (view2 instanceof org.telegram.ui.Cells.x7) {
                                                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view2;
                                                TLRPC.Document sticker2 = x7Var.getSticker();
                                                String V2 = org.telegram.messenger.ij.V(x7Var.getSticker(), null, Integer.valueOf(this.r));
                                                is isVar5 = this.l;
                                                s(sticker2, null, V2, isVar5 != null ? isVar5.G(false) : null, null, i7, false, x7Var.getParentObject(), f6Var, 0);
                                                x7Var.setScaled(true);
                                                this.i = x7Var.h;
                                            } else if (view2 instanceof org.telegram.ui.Cells.h2) {
                                                org.telegram.ui.Cells.h2 h2Var2 = (org.telegram.ui.Cells.h2) view2;
                                                TLRPC.Document document2 = h2Var2.getDocument();
                                                is isVar6 = this.l;
                                                s(document2, null, null, isVar6 != null ? isVar6.G(true) : null, h2Var2.getBotInlineResult(), i7, false, h2Var2.getBotInlineResult() != null ? h2Var2.getInlineBot() : h2Var2.getParentObject(), f6Var, 0);
                                                if (i7 != 1 || this.m) {
                                                    h2Var2.setScaled(true);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.ku) {
                                                TLRPC.Document document3 = ((org.telegram.ui.Components.ku) view2).getDocument();
                                                if (document3 != null) {
                                                    s(document3, null, org.telegram.messenger.ij.V(document3, null, Integer.valueOf(this.r)), null, null, i7, false, null, f6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.qx) {
                                                org.telegram.ui.Components.r5 span = ((org.telegram.ui.Components.qx) view2).getSpan();
                                                if (span != null) {
                                                    TLRPC.Document document4 = span.document;
                                                    if (document4 == null) {
                                                        document4 = org.telegram.ui.Components.i5.e(this.r, span.getDocumentId());
                                                    }
                                                    document = document4;
                                                } else {
                                                    document = null;
                                                }
                                                if (document != null) {
                                                    s(document, null, org.telegram.messenger.ij.V(document, null, Integer.valueOf(this.r)), null, null, i7, false, null, f6Var, 0);
                                                }
                                            } else if (view2 instanceof org.telegram.ui.Components.nw0) {
                                                Drawable drawable = ((org.telegram.ui.Components.nw0) view2).b;
                                                TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.i5 ? ((org.telegram.ui.Components.i5) drawable).e : null;
                                                if (document5 != null) {
                                                    s(document5, null, org.telegram.messenger.ij.V(document5, null, Integer.valueOf(this.r)), null, null, i7, false, null, f6Var, 0);
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
                                        isVar2 = this.l;
                                        if (isVar2 != null) {
                                        }
                                        view = this.h;
                                        if (!(view instanceof org.telegram.ui.Cells.z7)) {
                                        }
                                        this.h = childAt;
                                        this.i = false;
                                        this.K = false;
                                        this.R = false;
                                        o();
                                        org.telegram.messenger.g0.X3(this.O, false);
                                        view2 = this.h;
                                        if (!(view2 instanceof org.telegram.ui.Cells.z7)) {
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
                                    gs gsVar = this.U;
                                    org.telegram.messenger.g0.r(gsVar);
                                    gsVar.run();
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
    public final void s(TLRPC.Document document, org.telegram.messenger.zy zyVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i7, boolean z9, Object obj, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ?? r14;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver4;
        ImageReceiver imageReceiver5;
        String str3;
        int i11;
        boolean z10;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = f6Var;
        this.p = z9;
        this.G = null;
        this.u.setColor((org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var)) > 0.721f ? 1 : (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.o1 = null;
        ImageReceiver imageReceiver7 = this.B;
        gs gsVar = this.U;
        if (i7 == 0 || i7 == 2 || i7 == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && zyVar == null) {
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
                if (inputStickerSet != null || i7 == 2) {
                    org.telegram.messenger.g0.r(gsVar);
                    str3 = "…";
                    org.telegram.messenger.g0.i3(gsVar, i10 > 0 ? i10 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.r).m0(inputStickerSet, true);
                if (m0 != null && m0.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (org.telegram.messenger.ij.P4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.r0(org.telegram.messenger.hc.b(document), null, org.telegram.messenger.hc.c(w10, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.t0(org.telegram.messenger.hc.b(document), null, org.telegram.messenger.hc.c(w10, document), null, "webp", this.a0, 1);
                    if (org.telegram.messenger.ij.Y3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.t0(org.telegram.messenger.hc.d(org.telegram.messenger.ij.G1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (org.telegram.messenger.ij.D4(document)) {
                            imageReceiver6.o1 = org.telegram.ui.ActionBar.k6.o0(f6Var);
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
                if (org.telegram.messenger.ij.D4(document)) {
                }
                if (this.G == null) {
                }
            } else if (zyVar != null) {
                imageReceiver6.o0(zyVar.a, null, null, zyVar.e ? "tgs" : null, 0L);
                if (zyVar.g != null) {
                    if (this.C == null) {
                        org.telegram.ui.Components.sb0 sb0Var = new org.telegram.ui.Components.sb0(this.z.getContext());
                        this.C = sb0Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(sb0Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(zyVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(org.telegram.messenger.g0.K2(TextUtils.ellipsize(org.telegram.messenger.i6.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, org.telegram.messenger.g0.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                org.telegram.messenger.g0.r(gsVar);
                org.telegram.messenger.g0.i3(gsVar, i10 > 0 ? i10 : 1300L);
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
                this.X = zyVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = f6Var;
                this.z.invalidate();
                if (this.E) {
                    org.telegram.messenger.g0.f2(this.w);
                    try {
                        if (this.y.getParent() != null) {
                            ((WindowManager) this.w.getSystemService("window")).removeView(this.y);
                        }
                        z10 = true;
                    } catch (Exception e10) {
                        z10 = true;
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    ((WindowManager) this.w.getSystemService("window")).addView(this.y, this.x);
                    this.E = z10;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = org.telegram.messenger.ij.J0(document);
                org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
                b10.p = 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.u0(b10, null, org.telegram.messenger.hc.d(J0, document), null, org.telegram.messenger.hc.c(w11, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.r0(b10, null, org.telegram.messenger.hc.c(w11, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.u0(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(botInlineResult.content)), null, org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(botInlineResult.thumb)), null, org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.r0(org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(botInlineResult.content)), null, org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            org.telegram.messenger.g0.r(gsVar);
            org.telegram.messenger.g0.i3(gsVar, 2000L);
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
        this.X = zyVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = f6Var;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void t() {
        org.telegram.ui.Components.pp0 pp0Var = this.j;
        if (pp0Var != null) {
            org.telegram.messenger.g0.r(pp0Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.z7) {
                ((org.telegram.ui.Cells.z7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.x7) {
                ((org.telegram.ui.Cells.x7) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void u(is isVar) {
        this.l = isVar;
        if (isVar != null) {
            this.m = isVar.j();
            this.n = this.l.p();
        }
    }

    public final void v(Activity activity) {
        int i7 = org.telegram.messenger.p10.s0;
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
        yr yrVar = new yr(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var2, yrVar);
        bi.x5 x5Var = new bi.x5(this, activity);
        this.z = x5Var;
        x5Var.setFocusable(false);
        this.y.addView(this.z, c8.ha.e(-1, -1, 51));
        this.z.setOnTouchListener(new d0(this, 1));
        org.telegram.messenger.qp.s1(this.r);
        this.I = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        org.telegram.messenger.g0.m(layoutParams);
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
        if (!(view instanceof org.telegram.ui.Cells.z7)) {
            return false;
        }
        Activity W = org.telegram.messenger.g0.W(view.getContext());
        if (W == null) {
            return true;
        }
        v(W);
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.z7) {
            ((org.telegram.ui.Cells.z7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.x7) {
            ((org.telegram.ui.Cells.x7) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view2).setScaled(false);
        }
        this.h = z7Var;
        TLRPC.Document sticker = z7Var.getSticker();
        org.telegram.messenger.zy stickerPath = z7Var.getStickerPath();
        String V = org.telegram.messenger.ij.V(z7Var.getSticker(), null, Integer.valueOf(this.r));
        is isVar = this.l;
        s(sticker, stickerPath, V, isVar != null ? isVar.G(false) : null, null, 0, z7Var.D, z7Var.getParentObject(), this.c0, 0);
        gs gsVar = this.U;
        org.telegram.messenger.g0.r(gsVar);
        org.telegram.messenger.g0.i3(gsVar, 16L);
        z7Var.setScaled(true);
        return true;
    }
}
