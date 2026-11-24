// default package

import android.app.Activity;
import android.content.Context;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hx2 {
    public static TextPaint f0;
    public static volatile hx2 g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public kw7 C;
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
    public bj8 O;
    public c31 P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final dx2 U;
    public int V;
    public TLRPC.Document W;
    public t5a X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public ylb c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public up6 j;
    public m8 k;
    public fx2 l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final jz4 s;
    public final km0 t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public yd y;
    public su z;
    public float e = 0.0f;
    public iq5 q = iq5.e;

    public hx2() {
        jz4 jz4Var = new jz4();
        this.s = jz4Var;
        this.t = new km0(jz4Var, jz4Var, jz4Var);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = gm.L(200.0f);
        this.N = new Paint(1);
        this.U = new dx2(this);
    }

    public static hx2 e() {
        hx2 hx2Var;
        hx2 hx2Var2 = g0;
        if (hx2Var2 != null) {
            return hx2Var2;
        }
        synchronized (PhotoViewer.class) {
            hx2Var = g0;
            if (hx2Var == null) {
                hx2Var = new hx2();
                g0 = hx2Var;
            }
        }
        return hx2Var;
    }

    public final boolean a(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        float f;
        int i;
        float f2;
        int i2;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        g49 g49Var;
        String str2;
        g49 g49Var2;
        fx2 fx2Var = this.l;
        if (fx2Var == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = fx2Var.d();
        TLRPC.PollAnswer g = this.l.g();
        if (d == null || d.poll == null || g == null) {
            return false;
        }
        TLRPC.PollAnswerVoters E1 = k47.E1(d, g.option);
        boolean z = E1 != null && E1.voters > 0 && k47.A(d);
        boolean z2 = (k47.V4(d) || d.poll.closed || this.l.c()) ? false : true;
        boolean z3 = !z2 && k47.D(d);
        if (z) {
            g49 g49Var3 = new g49(this.r, this.c0, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
            bu5 bu5Var = new bu5(actionBarPopupWindow$ActionBarPopupWindowLayout, this.c0);
            View view = bu5Var.B;
            int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
            int i3 = cmb.D8;
            bu5Var.U(cmb.p1(0.06f, cmb.v0(i3, this.c0)));
            nm0 k = qqd.k(this.c0);
            if (view != null) {
                g49Var = g49Var3;
                str2 = null;
                im0 c = this.t.c(view, null, true);
                c.p(k);
                view.setBackground(c);
            } else {
                g49Var = g49Var3;
                str2 = null;
            }
            bu5Var.b(R.drawable.ic_ab_back, jb6.M0(2131753721, str2), new vw2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0), false);
            bu5Var.j();
            k47 x = this.l.x();
            Activity activity = this.w;
            if ((activity instanceof LaunchActivity) && x != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                d lastFragment = (launchActivity.N() == null || launchActivity.N().getLastFragment() == null) ? null : launchActivity.N().getLastFragment();
                if (lastFragment != null) {
                    q7c a = g49Var.a(lastFragment, k47.B0(x.k), x.e1(), g.option, E1.voters, new qy1((Object) this, (Object) lastFragment, (byte) 11));
                    g49Var2 = g49Var;
                    bu5Var.p(a);
                    g49Var2.setText(jb6.G(E1.voters, "PollVotesCount", new Object[0]));
                    g49Var2.a.d(E1.recent_voters, false);
                    g49Var2.setLayoutParams(qoe.o(-1, 48));
                    int i4 = cmb.H5;
                    fg0 Y = cmb.Y(cmb.v0(i4, this.c0), 12, 0);
                    wmb M = anb.M(i4);
                    ylb ylbVar = this.c0;
                    g49Var2.setBackground(Y);
                    anb.j(g49Var2, Y, null, M, ylbVar);
                    g49Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g49Var2);
                    View j8Var = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                    j8Var.setTag(R.id.fit_width_tag, 1);
                    f = 0.06f;
                    anb.i(j8Var, anb.K(0.06f, i3), this.c0);
                    i = -1;
                    j8Var.setLayoutParams(qoe.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var);
                }
            }
            g49Var2 = g49Var;
            g49Var2.setText(jb6.G(E1.voters, "PollVotesCount", new Object[0]));
            g49Var2.a.d(E1.recent_voters, false);
            g49Var2.setLayoutParams(qoe.o(-1, 48));
            int i42 = cmb.H5;
            fg0 Y2 = cmb.Y(cmb.v0(i42, this.c0), 12, 0);
            wmb M2 = anb.M(i42);
            ylb ylbVar2 = this.c0;
            g49Var2.setBackground(Y2);
            anb.j(g49Var2, Y2, null, M2, ylbVar2);
            g49Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g49Var2);
            View j8Var2 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
            j8Var2.setTag(R.id.fit_width_tag, 1);
            f = 0.06f;
            anb.i(j8Var2, anb.K(0.06f, i3), this.c0);
            i = -1;
            j8Var2.setLayoutParams(qoe.o(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var2);
        } else {
            f = 0.06f;
            i = -1;
        }
        if (z2) {
            i2 = i;
            str = null;
            f2 = f;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, jb6.M0(2131746889, null), false, this.c0).setOnClickListener(new uw2(this, (byte) 2));
        } else {
            f2 = f;
            i2 = i;
            str = null;
        }
        if (z3) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, jb6.M0(2131743511, str), false, this.c0).setOnClickListener(new uw2(this, (byte) 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z && (z2 || z3)) {
            View j8Var3 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), this.c0);
            j8Var3.setTag(R.id.fit_width_tag, 1);
            anb.i(j8Var3, anb.K(f2, cmb.D8), this.c0);
            j8Var3.setLayoutParams(qoe.o(i2, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j8Var3);
        }
        return z || z2 || z3;
    }

    public final void b() {
        if (this.w == null || this.K) {
            return;
        }
        gm.r(this.U);
        this.F = 1.0f;
        this.H = System.currentTimeMillis();
        this.z.invalidate();
        this.W = null;
        this.a0 = null;
        this.Y = null;
        this.l = null;
        this.E = false;
        gm.d3(new sw2(this, (byte) 0), 200L);
        bj8 bj8Var = this.O;
        if (bj8Var != null) {
            bj8Var.animate().alpha(0.0f).translationY(gm.L(56.0f)).setDuration(150L).setInterpolator(d53.f).start();
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(d53.f).start();
        }
        nm7.e().k(nm7.k1, 8);
    }

    public final void c() {
        x53 reactionsWindow;
        c31 c31Var = this.P;
        if (c31Var != null && (reactionsWindow = c31Var.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        d();
        b();
    }

    public final void d() {
        m8 m8Var = this.k;
        if (m8Var != null) {
            m8Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            wi8.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(gm.L(-12.0f)), d53.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                b();
            }
        }
    }

    public final /* synthetic */ void f(Bitmap bitmap, Bitmap bitmap2) {
        this.A.v0(true, false);
        this.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = this.N;
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        jz4 jz4Var = this.s;
        jz4Var.a(bitmap2);
        tl0.c(jz4Var, this.y);
        this.t.d();
        this.e0 = false;
        su suVar = this.z;
        if (suVar != null) {
            suVar.invalidate();
        }
    }

    public final boolean g(MotionEvent motionEvent, r59 r59Var, fx2 fx2Var, ylb ylbVar) {
        int i;
        this.l = fx2Var;
        if (fx2Var != null) {
            this.m = fx2Var.i();
            this.n = this.l.n();
        }
        fx2 fx2Var2 = this.l;
        if ((fx2Var2 == null || fx2Var2.h()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = r59Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = r59Var.getChildAt(i2);
                    if (childAt == null) {
                        break;
                    }
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (top > y || bottom < y || left > x || right < x) {
                        i2++;
                    } else {
                        boolean z = childAt instanceof y0b;
                        ImageReceiver imageReceiver = this.A;
                        if (z) {
                            if (((y0b) childAt).a.E()) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else if (childAt instanceof v0b) {
                            if (((v0b) childAt).a.getImageReceiver().n() != null) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else {
                            i = 2;
                            if (childAt instanceof lx2) {
                                lx2 lx2Var = (lx2) childAt;
                                if (lx2Var.a.n() != null) {
                                    byte b = lx2Var.Q;
                                    if (b == 6) {
                                        imageReceiver.q0(0);
                                        i = 0;
                                    } else if (b == 2 && lx2Var.w) {
                                        imageReceiver.q0(gm.L(6.0f));
                                        i = 1;
                                    }
                                }
                                i = -1;
                            } else if (childAt instanceof ty3) {
                                imageReceiver.q0(0);
                            } else if (!(childAt instanceof n24) || ((n24) childAt).getSpan() == null) {
                                if ((childAt instanceof edb) && (((edb) childAt).b instanceof vm)) {
                                    imageReceiver.q0(0);
                                }
                                i = -1;
                            } else {
                                imageReceiver.q0(0);
                            }
                        }
                        if (i != -1) {
                            this.a = x;
                            this.b = y;
                            this.h = childAt;
                            up6 up6Var = new up6((Object) this, (Object) r59Var, i, (Object) ylbVar, (byte) 18);
                            this.j = up6Var;
                            gm.d3(up6Var, 200L);
                            return true;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(MotionEvent motionEvent, r59 r59Var, Object obj, fx2 fx2Var, ylb ylbVar) {
        int i;
        int i2;
        fx2 fx2Var2;
        View view;
        View view2;
        TLRPC.Document document;
        this.l = fx2Var;
        if (fx2Var != null) {
            this.m = fx2Var.i();
            this.n = this.l.n();
        }
        fx2 fx2Var3 = this.l;
        if ((fx2Var3 == null || fx2Var3.h()) && (this.j != null || this.E)) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
                gm.d3(new mv2((Object) r59Var, obj, (byte) 4), 150L);
                up6 up6Var = this.j;
                if (up6Var != null) {
                    gm.r(up6Var);
                    this.j = null;
                    return false;
                }
                if (this.E) {
                    b();
                    View view3 = this.h;
                    if (view3 != null) {
                        if (view3 instanceof y0b) {
                            ((y0b) view3).setScaled(false);
                        } else if (view3 instanceof v0b) {
                            ((v0b) view3).setScaled(false);
                        } else if (view3 instanceof lx2) {
                            ((lx2) view3).setScaled(false);
                        }
                        this.h = null;
                    }
                }
            } else if (motionEvent.getAction() != 0) {
                if (this.E) {
                    if (motionEvent.getAction() == 2) {
                        if (this.V != 1 || this.m) {
                            int x = (int) motionEvent.getX();
                            int y = (int) motionEvent.getY();
                            int childCount = r59Var.getChildCount();
                            int i3 = 0;
                            while (true) {
                                if (i3 < childCount) {
                                    View childAt = r59Var.getChildAt(i3);
                                    if (childAt == null) {
                                        break;
                                    }
                                    int top = childAt.getTop();
                                    int bottom = childAt.getBottom();
                                    int left = childAt.getLeft();
                                    int right = childAt.getRight();
                                    if (top > y || bottom < y || left > x || right < x) {
                                        i3++;
                                    } else {
                                        boolean z = childAt instanceof y0b;
                                        ImageReceiver imageReceiver = this.A;
                                        if (z) {
                                            imageReceiver.q0(0);
                                        } else if (childAt instanceof v0b) {
                                            imageReceiver.q0(0);
                                        } else {
                                            if (childAt instanceof lx2) {
                                                lx2 lx2Var = (lx2) childAt;
                                                byte b = lx2Var.Q;
                                                if (b == 6) {
                                                    imageReceiver.q0(0);
                                                    i2 = 0;
                                                } else if (b == 2 && lx2Var.w) {
                                                    imageReceiver.q0(gm.L(6.0f));
                                                    i2 = 1;
                                                } else {
                                                    i2 = -1;
                                                }
                                                i = i2;
                                            } else {
                                                if (childAt instanceof ty3) {
                                                    imageReceiver.q0(0);
                                                } else if (!(childAt instanceof n24) || ((n24) childAt).getSpan() == null) {
                                                    i = -1;
                                                } else {
                                                    imageReceiver.q0(0);
                                                }
                                                i = 2;
                                            }
                                            if (i != -1 && childAt != this.h) {
                                                fx2Var2 = this.l;
                                                if (fx2Var2 != null) {
                                                    fx2Var2.q();
                                                }
                                                view = this.h;
                                                if (!(view instanceof y0b)) {
                                                    ((y0b) view).setScaled(false);
                                                } else if (view instanceof v0b) {
                                                    ((v0b) view).setScaled(false);
                                                } else if (view instanceof lx2) {
                                                    ((lx2) view).setScaled(false);
                                                }
                                                this.h = childAt;
                                                this.i = false;
                                                this.K = false;
                                                this.R = false;
                                                d();
                                                gm.R3(this.O, false);
                                                view2 = this.h;
                                                if (!(view2 instanceof y0b)) {
                                                    y0b y0bVar = (y0b) view2;
                                                    TLRPC.Document sticker = y0bVar.getSticker();
                                                    t5a stickerPath = y0bVar.getStickerPath();
                                                    String V = k47.V(y0bVar.getSticker(), null, Integer.valueOf(this.r));
                                                    fx2 fx2Var4 = this.l;
                                                    i(sticker, stickerPath, V, fx2Var4 != null ? fx2Var4.E(false) : null, null, i, y0bVar.E, y0bVar.getParentObject(), ylbVar, 0);
                                                    y0bVar.setScaled(true);
                                                } else if (view2 instanceof v0b) {
                                                    v0b v0bVar = (v0b) view2;
                                                    TLRPC.Document sticker2 = v0bVar.getSticker();
                                                    String V2 = k47.V(v0bVar.getSticker(), null, Integer.valueOf(this.r));
                                                    fx2 fx2Var5 = this.l;
                                                    i(sticker2, null, V2, fx2Var5 != null ? fx2Var5.E(false) : null, null, i, false, v0bVar.getParentObject(), ylbVar, 0);
                                                    v0bVar.setScaled(true);
                                                    this.i = v0bVar.h;
                                                } else if (view2 instanceof lx2) {
                                                    lx2 lx2Var2 = (lx2) view2;
                                                    TLRPC.Document document2 = lx2Var2.getDocument();
                                                    fx2 fx2Var6 = this.l;
                                                    i(document2, null, null, fx2Var6 != null ? fx2Var6.E(true) : null, lx2Var2.getBotInlineResult(), i, false, lx2Var2.getBotInlineResult() != null ? lx2Var2.getInlineBot() : lx2Var2.getParentObject(), ylbVar, 0);
                                                    if (i != 1 || this.m) {
                                                        lx2Var2.setScaled(true);
                                                    }
                                                } else if (view2 instanceof ty3) {
                                                    TLRPC.Document document3 = ((ty3) view2).getDocument();
                                                    if (document3 != null) {
                                                        i(document3, null, k47.V(document3, null, Integer.valueOf(this.r)), null, null, i, false, null, ylbVar, 0);
                                                    }
                                                } else if (view2 instanceof n24) {
                                                    gn span = ((n24) view2).getSpan();
                                                    if (span != null) {
                                                        TLRPC.Document document4 = span.document;
                                                        if (document4 == null) {
                                                            document4 = vm.e(this.r, span.getDocumentId());
                                                        }
                                                        document = document4;
                                                    } else {
                                                        document = null;
                                                    }
                                                    if (document != null) {
                                                        i(document, null, k47.V(document, null, Integer.valueOf(this.r)), null, null, i, false, null, ylbVar, 0);
                                                    }
                                                } else if (view2 instanceof edb) {
                                                    Drawable drawable = ((edb) view2).b;
                                                    TLRPC.Document document5 = drawable instanceof vm ? ((vm) drawable).e : null;
                                                    if (document5 != null) {
                                                        i(document5, null, k47.V(document5, null, Integer.valueOf(this.r)), null, null, i, false, null, ylbVar, 0);
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
                                        i = 0;
                                        if (i != -1) {
                                            fx2Var2 = this.l;
                                            if (fx2Var2 != null) {
                                            }
                                            view = this.h;
                                            if (!(view instanceof y0b)) {
                                            }
                                            this.h = childAt;
                                            this.i = false;
                                            this.K = false;
                                            this.R = false;
                                            d();
                                            gm.R3(this.O, false);
                                            view2 = this.h;
                                            if (!(view2 instanceof y0b)) {
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                        }
                                    }
                                } else {
                                    break;
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
                                float y2 = motionEvent.getY();
                                float f = (y2 - this.c) + this.d;
                                this.d = f;
                                this.c = y2;
                                if (f > 0.0f) {
                                    this.d = 0.0f;
                                } else if (f < (-gm.L(60.0f))) {
                                    this.d = -gm.L(60.0f);
                                }
                                float f2 = this.d;
                                float L = gm.L(200.0f);
                                this.e = (-((1.0f - (1.0f / (((Math.abs(f2) * 0.55f) / L) + 1.0f))) * L)) * (f2 >= 0.0f ? -1.0f : 1.0f);
                                this.z.invalidate();
                                if (this.d <= (-gm.L(55.0f))) {
                                    dx2 dx2Var = this.U;
                                    gm.r(dx2Var);
                                    dx2Var.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
                if (this.j != null) {
                    if (motionEvent.getAction() != 2) {
                        gm.r(this.j);
                        this.j = null;
                        return false;
                    }
                    if (Math.hypot(this.a - motionEvent.getX(), this.b - motionEvent.getY()) > gm.L(10.0f)) {
                        gm.r(this.j);
                        this.j = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028c  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(TLRPC.Document document, t5a t5aVar, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i, boolean z, Object obj, ylb ylbVar, int i2) {
        ImageReceiver imageReceiver;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ?? r14;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver4;
        ImageReceiver imageReceiver5;
        String str3;
        int i3;
        boolean z2;
        if (this.w == null || this.y == null) {
            return;
        }
        this.c0 = ylbVar;
        this.p = z;
        this.G = null;
        this.u.setColor((gm.B(cmb.v0(cmb.c6, ylbVar)) > 0.721f ? 1 : (gm.B(cmb.v0(cmb.c6, ylbVar)) == 0.721f ? 0 : -1)) < 0 ? 1895825408 : 1692853990);
        this.S = false;
        ImageReceiver imageReceiver6 = this.A;
        imageReceiver6.p1 = null;
        ImageReceiver imageReceiver7 = this.B;
        dx2 dx2Var = this.U;
        if (i == 0 || i == 2 || i == 3) {
            imageReceiver = imageReceiver7;
            if (document == null && t5aVar == null) {
                return;
            }
            if (f0 == null) {
                TextPaint textPaint = new TextPaint(1);
                f0 = textPaint;
                textPaint.setTextSize(gm.L(24.0f));
            }
            imageReceiver.f();
            this.S = false;
            if (document != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= document.attributes.size()) {
                        inputStickerSet = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                    int i5 = i4;
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                        break;
                    } else {
                        i4 = i5 + 1;
                    }
                }
                if (str != null) {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                    this.G = new StaticLayout(gm.G2(TextUtils.ellipsize(gw3.m(str, f0.getFontMetricsInt(), false, null, 0), f0, gm.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, gm.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    imageReceiver4 = imageReceiver;
                    imageReceiver5 = imageReceiver6;
                }
                if (inputStickerSet != null || i == 2) {
                    gm.r(dx2Var);
                    str3 = "…";
                    gm.d3(dx2Var, i2 > 0 ? i2 : 1300L);
                } else {
                    str3 = "…";
                }
                TLRPC.TL_messages_stickerSet n0 = hs6.d0(this.r).n0(inputStickerSet, true);
                if (n0 != null && n0.documents.isEmpty()) {
                    inputStickerSet = null;
                }
                this.a0 = inputStickerSet;
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                if (k47.N4(document)) {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.Z(gn5.b(document), null, gn5.c(w, document), null, null, 0L, "webp", this.a0, 1);
                } else {
                    imageReceiver6 = imageReceiver5;
                    imageReceiver6.b0(gn5.b(document), null, gn5.c(w, document), null, "webp", this.a0, 1);
                    if (k47.W3(document)) {
                        this.S = true;
                        ImageReceiver imageReceiver8 = imageReceiver4;
                        imageReceiver8.b0(gn5.d(k47.F1(document), document), null, null, null, "tgs", this.a0, 1);
                        imageReceiver = imageReceiver8;
                        if (k47.B4(document)) {
                            imageReceiver6.p1 = cmb.n0(ylbVar);
                        }
                        if (this.G == null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i6);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(gm.G2(TextUtils.ellipsize(gw3.m(documentAttribute2.alt, f0.getFontMetricsInt(), false, null, 0), f0, gm.L(200.0f), TextUtils.TruncateAt.END), "", str3), f0, gm.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                }
                imageReceiver = imageReceiver4;
                if (k47.B4(document)) {
                }
                if (this.G == null) {
                }
            } else if (t5aVar != null) {
                imageReceiver6.e0(t5aVar.a, null, null, t5aVar.e ? "tgs" : null, 0L);
                if (t5aVar.g != null) {
                    if (this.C == null) {
                        kw7 kw7Var = new kw7(this.z.getContext());
                        this.C = kw7Var;
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                        this.z.addView(kw7Var, new FrameLayout.LayoutParams(512, 512));
                    } else {
                        imageReceiver2 = imageReceiver;
                        imageReceiver3 = imageReceiver6;
                    }
                    r14 = 0;
                    this.C.b(t5aVar.g.G, true, true, false);
                } else {
                    imageReceiver2 = imageReceiver;
                    imageReceiver3 = imageReceiver6;
                    r14 = 0;
                }
                if (str != null) {
                    this.G = new StaticLayout(gm.G2(TextUtils.ellipsize(gw3.m(str, f0.getFontMetricsInt(), r14, null, r14), f0, gm.L(200.0f), TextUtils.TruncateAt.END), "", "…"), f0, gm.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.l.getClass();
                gm.r(dx2Var);
                gm.d3(dx2Var, i2 > 0 ? i2 : 1300L);
                if (imageReceiver3.y() == null) {
                    i3 = 0;
                    imageReceiver3.y().H(0);
                } else {
                    i3 = 0;
                }
                if (this.S && imageReceiver2.y() != null) {
                    imageReceiver2.y().H(i3);
                }
                this.V = i;
                this.W = document;
                this.X = t5aVar;
                this.Y = str2;
                this.Z = botInlineResult;
                this.b0 = obj;
                this.c0 = ylbVar;
                this.z.invalidate();
                if (this.E) {
                    gm.d2(this.w);
                    try {
                        if (this.y.getParent() != null) {
                            ((WindowManager) this.w.getSystemService("window")).removeView(this.y);
                        }
                        z2 = true;
                    } catch (Exception e) {
                        z2 = true;
                        fc4.g(e, true);
                    }
                    ((WindowManager) this.w.getSystemService("window")).addView(this.y, this.x);
                    this.E = z2;
                    this.F = 0.0f;
                    this.c = -10000.0f;
                    this.g = 0.0f;
                    this.d = 0.0f;
                    this.e = 0.0f;
                    this.H = System.currentTimeMillis();
                    nm7.e().k(nm7.j1, 8);
                    return;
                }
                return;
            }
        } else {
            if (document != null) {
                TLRPC.PhotoSize w2 = bc4.w(document.thumbs, 90, false, null, false);
                TLRPC.VideoSize J0 = k47.J0(document);
                gn5 b = gn5.b(document);
                b.p = (byte) 2;
                if (J0 != null) {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.Y(b, null, gn5.d(J0, document), null, gn5.c(w2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                } else {
                    imageReceiver = imageReceiver7;
                    imageReceiver6.Z(b, null, gn5.c(w2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                }
            } else {
                imageReceiver = imageReceiver7;
                if (botInlineResult == null || botInlineResult.content == null) {
                    return;
                }
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                    imageReceiver6.Y(gn5.p(vuc.c(botInlineResult.content)), null, gn5.p(vuc.c(botInlineResult.thumb)), null, gn5.p(vuc.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                } else {
                    imageReceiver6.Z(gn5.p(vuc.c(botInlineResult.content)), null, gn5.p(vuc.c(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                }
            }
            gm.r(dx2Var);
            gm.d3(dx2Var, 2000L);
        }
        imageReceiver2 = imageReceiver;
        imageReceiver3 = imageReceiver6;
        if (imageReceiver3.y() == null) {
        }
        if (this.S) {
            imageReceiver2.y().H(i3);
        }
        this.V = i;
        this.W = document;
        this.X = t5aVar;
        this.Y = str2;
        this.Z = botInlineResult;
        this.b0 = obj;
        this.c0 = ylbVar;
        this.z.invalidate();
        if (this.E) {
        }
    }

    public final void j() {
        up6 up6Var = this.j;
        if (up6Var != null) {
            gm.r(up6Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof y0b) {
                ((y0b) view).setScaled(false);
            } else if (view instanceof v0b) {
                ((v0b) view).setScaled(false);
            } else if (view instanceof lx2) {
                ((lx2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void k(fx2 fx2Var) {
        this.l = fx2Var;
        if (fx2Var != null) {
            this.m = fx2Var.i();
            this.n = this.l.n();
        }
    }

    public final void l(Activity activity) {
        int i = z8c.t0;
        this.r = i;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i;
        imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i2 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i2;
        imageReceiver2.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.y = new yd((byte) 16, (Context) activity, (Object) this);
        zgc zgcVar = new zgc(this.y);
        yd ydVar = this.y;
        km0 km0Var = this.t;
        km0Var.h = zgcVar;
        km0Var.i = ydVar;
        km0Var.g = new g79(0, false);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        yd ydVar2 = this.y;
        tw2 tw2Var = new tw2(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ydVar2, tw2Var);
        su suVar = new su(this, activity);
        this.z = suVar;
        suVar.setFocusable(false);
        this.y.addView(this.z, qoe.e(-1, -1, 51));
        this.z.setOnTouchListener(new a7(this, (byte) 3));
        oc7.r1(this.r);
        this.I = oc7.c1().getInt("kbd_height", gm.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        gm.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.p0(this.z);
    }

    public final boolean m(View view) {
        if (!(view instanceof y0b)) {
            return false;
        }
        Activity W = gm.W(view.getContext());
        if (W == null) {
            return true;
        }
        l(W);
        y0b y0bVar = (y0b) view;
        View view2 = this.h;
        if (view2 instanceof y0b) {
            ((y0b) view2).setScaled(false);
        } else if (view2 instanceof v0b) {
            ((v0b) view2).setScaled(false);
        } else if (view2 instanceof lx2) {
            ((lx2) view2).setScaled(false);
        }
        this.h = y0bVar;
        TLRPC.Document sticker = y0bVar.getSticker();
        t5a stickerPath = y0bVar.getStickerPath();
        String V = k47.V(y0bVar.getSticker(), null, Integer.valueOf(this.r));
        fx2 fx2Var = this.l;
        i(sticker, stickerPath, V, fx2Var != null ? fx2Var.E(false) : null, null, 0, y0bVar.E, y0bVar.getParentObject(), this.c0, 0);
        dx2 dx2Var = this.U;
        gm.r(dx2Var);
        gm.d3(dx2Var, 16L);
        y0bVar.setScaled(true);
        return true;
    }
}
