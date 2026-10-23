package ai;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n7 {
    public float A;
    public float B;
    public i11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ee G;
    public final org.telegram.ui.Components.yc H;
    public final org.telegram.ui.Components.yc I;
    public final org.telegram.ui.Components.yc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public MessageObject R;
    public boolean S;
    public final ne.e T;
    public f4 U;
    public f4 V;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.p5 e;
    public int g;
    public RadialGradient h;
    public final yh.j1 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public i11 r;
    public float s;
    public i11 t;
    public float u;
    public float v;
    public float x;
    public final yh.j0 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public n7(int i10, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        yh.j0 j0Var = new yh.j0();
        this.y = j0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ee(1, 25);
        this.K = new RectF();
        this.T = new ne.e(0, new a1.c(this, 6), bs.h, 320L);
        this.a = i10;
        this.b = view;
        this.c = g6Var;
        this.j = new yh.j1(view);
        this.H = new org.telegram.ui.Components.yc(view);
        this.I = new org.telegram.ui.Components.yc(view);
        this.J = new org.telegram.ui.Components.yc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.p5(AndroidUtilities.dp(28.0f), view);
        j0Var.r = view;
        j0Var.d.setParentView(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.onAttachedToWindow();
            this.e.a();
            this.y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        yh.j1 j1Var = this.j;
        if (z10 && j1Var != null) {
            int i10 = this.M;
            int i11 = org.telegram.ui.ActionBar.r6.b;
            if (i10 != i11) {
                this.M = i11;
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.c);
                    Paint paint = (Paint) j1Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        ne.e eVar = this.T;
        float f7 = eVar.e;
        float f10 = f7 / 2.0f;
        float f11 = this.P;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f7, f11);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.k != null && (this.h == null || this.g != height)) {
            this.g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint2);
        canvas.save();
        canvas.translate(f10, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        org.telegram.ui.Components.p5 p5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            p5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        m1.a(canvas, 1, p5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f);
        float dp2 = AndroidUtilities.dp(110.0f);
        float dp3 = AndroidUtilities.dp(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), dp, dp2, dp3);
        imageReceiver.draw(canvas);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            o12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i12 = o12;
        this.r.p = eVar.e - AndroidUtilities.dp(12.0f);
        i11 i11Var = this.r;
        i11Var.c(f10 - (i11Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = eVar.e - AndroidUtilities.dp(12.0f);
        i11 i11Var2 = this.t;
        Canvas canvas2 = canvas;
        int i13 = i12;
        i11Var2.c(f10 - (i11Var2.c / 2.0f), this.s, 1.0f, i13, canvas2);
        if (this.z) {
            yh.j0 j0Var = this.y;
            int i14 = j0Var.t;
            int i15 = j0Var.u;
            int i16 = (int) (f10 - (i14 / 2.0f));
            int i17 = (int) this.x;
            int i18 = i14 + i16;
            j0Var.setBounds(i16, i17, i18, i17 + i15);
            float f12 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i16, f12, i18, i15 + f12);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            j0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f13 = 9.0f;
            float dp4 = this.u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i19 = 0;
            while (i19 < size) {
                int i20 = i19 + 1;
                m7 m7Var = (m7) arrayList.get(i19);
                i11 i11Var3 = m7Var.b;
                float f14 = f10 - (dp4 / 2.0f);
                i11Var3.c((f14 + this.u) - i11Var3.c, m7Var.a, 1.0f, i13, canvas2);
                canvas2 = canvas;
                m7Var.c.c(f14 + this.u + AndroidUtilities.dp(r19), m7Var.a, 1.0f, -1, canvas2);
                i13 = i13;
                i19 = i20;
                f13 = f13;
            }
        }
        int i21 = i13;
        if (!this.p) {
            float dp5 = f10 - ((this.C.c + AndroidUtilities.dp(30.0f)) / 2.0f);
            float f15 = this.A;
            float a11 = org.telegram.messenger.v0.a(this.C.c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(dp5, f15, a11, f16);
            Path path2 = this.E;
            path2.rewind();
            float f17 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
            int o13 = org.telegram.ui.ActionBar.k6.o1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(o13);
            float a12 = this.H.a(0.075f);
            canvas2.scale(a12, a12, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            j1Var.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.67f), ((int) rectF.top) - AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f) + ((int) rectF.right), AndroidUtilities.dp(46.67f) + ((int) rectF.top));
            j1Var.x = i21;
            j1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        ee eeVar = this.G;
        eeVar.g(rectF2);
        eeVar.d();
        eeVar.a(canvas, org.telegram.ui.ActionBar.k6.o1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).M();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f7, float f10, MotionEvent motionEvent) {
        boolean z10;
        int action;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        if (this.U != null && this.z && !contains) {
            if (this.K.contains(motionEvent.getX() - f7, motionEvent.getY() - f10)) {
                z10 = true;
                boolean contains2 = this.n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
                action = motionEvent.getAction();
                org.telegram.ui.Components.yc ycVar = this.J;
                org.telegram.ui.Components.yc ycVar2 = this.H;
                org.telegram.ui.Components.yc ycVar3 = this.I;
                if (action != 0) {
                    ycVar3.c((!contains2 || contains || z10) ? false : true);
                    ycVar2.c(contains);
                    ycVar.c(z10);
                } else if (motionEvent.getAction() == 2) {
                    if (ycVar2.i && !contains) {
                        ycVar2.c(false);
                    } else if (ycVar.i && !z10) {
                        ycVar.c(false);
                    } else if (ycVar3.i && !contains2) {
                        ycVar3.c(false);
                    }
                } else {
                    if (motionEvent.getAction() == 1 && ycVar.i) {
                        ycVar.c(false);
                        this.U.run();
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && ((z11 = ycVar2.i) || ycVar3.i)) {
                        f4 f4Var = this.V;
                        if (f4Var != null) {
                            if (z11) {
                                f4Var.run();
                            }
                        } else if (this.L) {
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                org.telegram.messenger.v0.p(R.string.UniqueGiftNotFoundBurned, org.telegram.ui.Components.xc.a0(U), R.raw.fire_on, 36);
                            }
                        } else {
                            l7 l7Var = new l7(this.b.getContext(), this.a, this.R.getDialogId(), this.c, null);
                            l7Var.K2(this.R, null);
                            l7Var.show();
                        }
                        ycVar2.c(false);
                        ycVar3.c(false);
                        return true;
                    }
                    if (motionEvent.getAction() == 3 && (ycVar2.i || ycVar3.i || ycVar.i)) {
                        ycVar2.c(false);
                        ycVar3.c(false);
                        ycVar.c(false);
                        return true;
                    }
                }
                return !ycVar2.i || ycVar3.i || ycVar.i;
            }
        }
        z10 = false;
        boolean contains22 = this.n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        action = motionEvent.getAction();
        org.telegram.ui.Components.yc ycVar4 = this.J;
        org.telegram.ui.Components.yc ycVar22 = this.H;
        org.telegram.ui.Components.yc ycVar32 = this.I;
        if (action != 0) {
        }
        if (ycVar22.i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z11;
        org.telegram.ui.Components.p5 p5Var;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.N = false;
        this.R = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z11 = this.S;
                p5Var = this.e;
                imageReceiver = this.d;
                if (z11 && tL_messageActionStarGiftUnique != null && this.Q == null) {
                    imageReceiver.onAttachedToWindow();
                    p5Var.a();
                    this.y.d.onAttachedToWindow();
                }
                this.Q = tL_messageActionStarGiftUnique;
                this.p = messageObject == null && messageObject.isRepostPreview;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                this.h = null;
                this.f.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                if (stargiftattributepattern != null) {
                    p5Var.i(stargiftattributepattern.document, z10);
                } else {
                    p5Var.g(null, z10);
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel2 = this.m;
                if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
                    if (this.p) {
                        imageReceiver.setAllowStartLottieAnimation(true);
                        imageReceiver.setAllowStartAnimation(true);
                        imageReceiver.setAutoRepeat(1);
                    } else {
                        imageReceiver.setAutoRepeatCount(0);
                        imageReceiver.clearDecorators();
                        imageReceiver.setAutoRepeat(0);
                    }
                    nd.a1(imageReceiver, this.m.document, 110);
                }
                boolean z12 = tL_starGiftUnique.burned;
                this.L = z12;
                yh.j1 j1Var = this.j;
                if (z12) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.c);
                    Paint paint = (Paint) j1Var.b;
                    paint.setShader(null);
                    paint.setColor(w02);
                    this.M = org.telegram.ui.ActionBar.r6.b;
                    j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
                } else {
                    j1Var.e(this.k, true, false);
                    j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
                }
                if (this.p) {
                    this.O = AndroidUtilities.dp(200.0f);
                } else {
                    this.O = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
                    if (!AndroidUtilities.isTablet()) {
                        this.O = (int) (this.O * 1.2f);
                    }
                    this.O -= AndroidUtilities.dp(8.0f);
                }
                g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                ne.e eVar = this.T;
                if (!z10) {
                    eVar.c(this.O);
                    return;
                }
                int round = Math.round(eVar.g ? eVar.f : eVar.e);
                int i10 = this.O;
                if (round != i10) {
                    eVar.a(i10);
                    return;
                }
                return;
            }
        }
        tL_messageActionStarGiftUnique = null;
        if (tL_messageActionStarGiftUnique != null) {
        }
        tL_messageActionStarGiftUnique = null;
        z11 = this.S;
        p5Var = this.e;
        imageReceiver = this.d;
        if (z11) {
            imageReceiver.onAttachedToWindow();
            p5Var.a();
            this.y.d.onAttachedToWindow();
        }
        this.Q = tL_messageActionStarGiftUnique;
        this.p = messageObject == null && messageObject.isRepostPreview;
        if (tL_messageActionStarGiftUnique != null) {
        }
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f7;
        float f10;
        float f11;
        int dp;
        float f12 = this.O;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i10 = this.a;
        long clientUserId = z10 == isOutOwner ? UserConfig.getInstance(i10).getClientUserId() : messageObject.getDialogId();
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            clientUserId = DialogObject.getPeerDialogId(peer);
        }
        String shortName = DialogObject.getShortName(clientUserId);
        float dp2 = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        if (this.p) {
            this.r = new i11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer != null || UserObject.isService(messageObject.getDialogId())) {
            this.r = new i11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        } else if (messageObject.getDialogId() != UserConfig.getInstance(i10).getClientUserId()) {
            this.r = new i11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new i11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new i11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
        } else {
            this.r = new i11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
        }
        this.q = (this.r.j() / 2.0f) + dp2;
        float j10 = this.r.j() + dp2 + AndroidUtilities.dp(3.0f);
        if (this.p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.t = new i11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.t = new i11(i2.o1.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.j() / f11) + j10;
        float j11 = this.t.j() + j10 + AndroidUtilities.dp(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        yh.j0 j0Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j0Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            TLObject userOrChat = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? MessagesController.getInstance(i10).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id)) : MessagesController.getInstance(i10).getUserOrChat(messageObject.getFromChatId());
            this.z = true;
            j0Var.c(userOrChat);
            j0Var.m = replaceAnimatedEmoji;
            j0Var.s = -1;
            j0Var.b(((int) f12) - AndroidUtilities.dp(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = j0Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.N = true;
                    this.O = (int) ((Math.min(0.4f, ((j0Var.n != null ? r3.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp3 = j11 + AndroidUtilities.dp(4.0f);
            this.x = dp3;
            j11 = dp3 + j0Var.u + AndroidUtilities.dp(f10);
        } else {
            this.z = false;
            j0Var.c(null);
            j0Var.m = null;
            j0Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    j11 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var = new m7(j11, LocaleController.getString(R.string.Gift2AttributeModel), this.m.name);
                arrayList.add(m7Var);
                float f13 = f12 * 0.5f;
                i11 i11Var = m7Var.b;
                i11Var.p = f13;
                this.u = Math.max(this.u, i11Var.c);
                i11 i11Var2 = m7Var.c;
                i11Var2.p = f13;
                this.v = Math.max(this.v, i11Var2.c);
                j11 += m7Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    j11 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var2 = new m7(j11, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.k.name);
                arrayList.add(m7Var2);
                float f14 = f12 * 0.5f;
                i11 i11Var3 = m7Var2.b;
                i11Var3.p = f14;
                this.u = Math.max(this.u, i11Var3.c);
                i11 i11Var4 = m7Var2.c;
                i11Var4.p = f14;
                this.v = Math.max(this.v, i11Var4.c);
                j11 = m7Var2.a() + j11;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    j11 += AndroidUtilities.dp(6.0f);
                }
                m7 m7Var3 = new m7(j11, LocaleController.getString(R.string.Gift2AttributeSymbol), this.l.name);
                arrayList.add(m7Var3);
                float f15 = f12 * 0.5f;
                i11 i11Var5 = m7Var3.b;
                i11Var5.p = f15;
                this.u = Math.max(this.u, i11Var5.c);
                i11 i11Var6 = m7Var3.c;
                i11Var6.p = f15;
                this.v = Math.max(this.v, i11Var6.c);
                j11 += m7Var3.a();
            }
        }
        float dp4 = j11 + AndroidUtilities.dp(11.66f);
        if (this.p) {
            dp = AndroidUtilities.dp(f7);
        } else {
            this.A = dp4;
            this.C = new i11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp5 = AndroidUtilities.dp(30.0f);
            this.B = dp5;
            dp4 += dp5;
            dp = AndroidUtilities.dp(11.0f);
        }
        this.P = (int) (dp4 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f7 = this.O;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        i11 i11Var = new i11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.r = i11Var;
        this.q = (i11Var.j() / 2.0f) + dp;
        float j11 = this.r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        i11 i11Var2 = new i11(i2.o1.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = i11Var2;
        this.s = (i11Var2.j() / 2.0f) + j11;
        float j12 = this.t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        yh.j0 j0Var = this.y;
        TextPaint textPaint = j0Var.c;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spanned = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
            spanned = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        }
        TLObject userOrChat = j10 != 0 ? MessagesController.getInstance(this.a).getUserOrChat(j10) : null;
        this.z = true;
        j0Var.c(userOrChat);
        j0Var.m = spanned;
        j0Var.s = -1;
        j0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = j0Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.N = true;
                this.O = (int) ((Math.min(0.4f, ((j0Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.x = dp2;
        float dp3 = dp2 + j0Var.u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new i11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.P = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
