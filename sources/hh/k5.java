package hh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k5 {
    public float A;
    public float B;
    public pz0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final bb G;
    public final nc H;
    public final nc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final ud.c Q;
    public gh.q0 R;
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.i5 e;
    public int g;
    public RadialGradient h;
    public final gh.e2 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public pz0 r;
    public float s;
    public pz0 t;
    public float u;
    public float v;
    public float x;
    public final gh.y0 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public k5(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        gh.y0 y0Var = new gh.y0();
        this.y = y0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new bb(1, 25);
        this.Q = new ud.c(0, new h3.x(this, 8), er.h, 320L);
        this.a = i10;
        this.b = view;
        this.c = c6Var;
        this.j = new gh.e2(view);
        this.H = new nc(view);
        this.I = new nc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.i5(AndroidUtilities.dp(28.0f), view);
        y0Var.r = view;
        y0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        ud.c cVar = this.Q;
        float f10 = cVar.e;
        float f11 = f10 / 2.0f;
        float f12 = this.M;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f10, f12);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.k != null && (this.h == null || this.g != height)) {
            this.g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f11, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        org.telegram.ui.Components.i5 i5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            i5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        y0.a(canvas, 1, i5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        float dp = AndroidUtilities.dp(10.0f);
        float dp2 = AndroidUtilities.dp(110.0f);
        float dp3 = AndroidUtilities.dp(110.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f11 - (AndroidUtilities.dp(110.0f) / 2.0f), dp, dp2, dp3);
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = l1;
        this.r.p = cVar.e - AndroidUtilities.dp(12.0f);
        pz0 pz0Var = this.r;
        pz0Var.c(f11 - (pz0Var.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = cVar.e - AndroidUtilities.dp(12.0f);
        pz0 pz0Var2 = this.t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        pz0Var2.c(f11 - (pz0Var2.c / 2.0f), this.s, 1.0f, i11, canvas2);
        if (this.z) {
            gh.y0 y0Var = this.y;
            int i12 = y0Var.t;
            int i13 = y0Var.u;
            int i14 = (int) (f11 - (i12 / 2.0f));
            int i15 = (int) this.x;
            y0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            y0Var.draw(canvas2);
        } else {
            float dp4 = this.u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                j5 j5Var = (j5) arrayList.get(i16);
                pz0 pz0Var3 = j5Var.b;
                float f13 = f11 - (dp4 / 2.0f);
                pz0Var3.c((f13 + this.u) - pz0Var3.c, j5Var.a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                j5Var.c.c(f13 + this.u + AndroidUtilities.dp(9.0f), j5Var.a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.p) {
            float dp5 = f11 - ((this.C.c + AndroidUtilities.dp(30.0f)) / 2.0f);
            float f14 = this.A;
            float c10 = i0.a.c(this.C.c, AndroidUtilities.dp(30.0f), 2.0f, f11);
            float f15 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(dp5, f14, c10, f15);
            Path path2 = this.E;
            path2.rewind();
            float f16 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.g6.l1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(l12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp6 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp7 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp8 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp9 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            gh.e2 e2Var = this.j;
            e2Var.setBounds(dp6, dp7, dp8, dp9);
            e2Var.h = i18;
            e2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a3 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a3, a3, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        bb bbVar = this.G;
        bbVar.g(rectF2);
        bbVar.d();
        bbVar.a(canvas, org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).K();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.e;
    }

    public final boolean d() {
        return this.N != null;
    }

    public final boolean e(float f10, float f11, MotionEvent motionEvent) {
        boolean z10;
        boolean contains = this.D.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        boolean contains2 = this.n.contains(motionEvent.getX() - f10, motionEvent.getY() - f11);
        int action = motionEvent.getAction();
        nc ncVar = this.H;
        nc ncVar2 = this.I;
        if (action == 0) {
            ncVar2.c(contains2 && !contains);
            ncVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (ncVar.h && !contains) {
                ncVar.c(false);
            } else if (ncVar2.h && !contains2) {
                ncVar2.c(false);
            }
        } else {
            if (motionEvent.getAction() == 1 && ((z10 = ncVar.h) || ncVar2.h)) {
                gh.q0 q0Var = this.R;
                if (q0Var != null) {
                    if (z10) {
                        q0Var.run();
                    }
                } else if (this.J) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.messenger.y1.q(R.string.UniqueGiftNotFoundBurned, mc.a0(U), R.raw.fire_on, 36);
                    }
                } else {
                    i5 i5Var = new i5(this.b.getContext(), this.a, this.O.getDialogId(), this.c, null);
                    i5Var.i2(this.O, null);
                    i5Var.show();
                }
                ncVar.c(false);
                ncVar2.c(false);
                return true;
            }
            if (motionEvent.getAction() == 3 && (ncVar.h || ncVar2.h)) {
                ncVar.c(false);
                ncVar2.c(false);
                return true;
            }
        }
        return ncVar.h || ncVar2.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        boolean z11;
        org.telegram.ui.Components.i5 i5Var;
        ImageReceiver imageReceiver;
        TLRPC.Message message;
        this.K = false;
        this.O = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (tL_messageActionStarGiftUnique != null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                    tL_messageActionStarGiftUnique = null;
                }
                z11 = this.P;
                i5Var = this.e;
                imageReceiver = this.d;
                if (z11 && tL_messageActionStarGiftUnique != null && this.N == null) {
                    imageReceiver.onAttachedToWindow();
                    i5Var.a();
                    this.y.d.onAttachedToWindow();
                }
                this.N = tL_messageActionStarGiftUnique;
                this.p = messageObject == null && messageObject.isRepostPreview;
                if (tL_messageActionStarGiftUnique != null) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                this.k = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.l = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = this.m;
                this.m = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                this.h = null;
                this.f.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = this.l;
                if (stargiftattributepattern != null) {
                    i5Var.i(stargiftattributepattern.document, z10);
                } else {
                    i5Var.g(null, z10);
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
                    oa.Z0(imageReceiver, this.m.document, 110);
                }
                boolean z12 = tL_starGiftUnique.burned;
                this.J = z12;
                gh.e2 e2Var = this.j;
                if (z12) {
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, this.c);
                    Paint paint = e2Var.a;
                    paint.setShader(null);
                    paint.setColor(v02);
                    e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
                } else {
                    e2Var.d(this.k, true, false);
                    e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
                }
                if (this.p) {
                    this.L = AndroidUtilities.dp(200.0f);
                } else {
                    this.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
                    if (!AndroidUtilities.isTablet()) {
                        this.L = (int) (this.L * 1.2f);
                    }
                    this.L -= AndroidUtilities.dp(8.0f);
                }
                g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                ud.c cVar = this.Q;
                if (!z10) {
                    cVar.c(this.L);
                    return;
                }
                int round = Math.round(cVar.g ? cVar.f : cVar.e);
                int i10 = this.L;
                if (round != i10) {
                    cVar.a(i10);
                    return;
                }
                return;
            }
        }
        tL_messageActionStarGiftUnique = null;
        if (tL_messageActionStarGiftUnique != null) {
        }
        tL_messageActionStarGiftUnique = null;
        z11 = this.P;
        i5Var = this.e;
        imageReceiver = this.d;
        if (z11) {
            imageReceiver.onAttachedToWindow();
            i5Var.a();
            this.y.d.onAttachedToWindow();
        }
        this.N = tL_messageActionStarGiftUnique;
        this.p = messageObject == null && messageObject.isRepostPreview;
        if (tL_messageActionStarGiftUnique != null) {
        }
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f10;
        float f11;
        float f12;
        int dp;
        float f13 = this.L;
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
            this.r = new pz0(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer != null || UserObject.isService(messageObject.getDialogId())) {
            this.r = new pz0(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        } else if (messageObject.getDialogId() != UserConfig.getInstance(i10).getClientUserId()) {
            this.r = new pz0(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
        } else if (tL_starGiftUnique.crafted) {
            this.r = new pz0(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.r = new pz0(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
        } else {
            this.r = new pz0(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
        }
        this.q = (this.r.j() / 2.0f) + dp2;
        float j10 = this.r.j() + dp2 + AndroidUtilities.dp(3.0f);
        if (this.p) {
            f10 = 10.0f;
            f11 = 3.0f;
            this.t = new pz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f12 = 2.0f;
        } else {
            f10 = 10.0f;
            f11 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f12 = 2.0f;
            this.t = new pz0(i0.a.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.s = (this.t.j() / f12) + j10;
        float j11 = this.t.j() + j10 + AndroidUtilities.dp(this.p ? 14.0f : 11.0f);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        gh.y0 y0Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = y0Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            TLObject userOrChat = tL_messageActionStarGiftUnique.name_hidden ? null : tL_messageActionStarGiftUnique.from_id != null ? MessagesController.getInstance(i10).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id)) : MessagesController.getInstance(i10).getUserOrChat(messageObject.getFromChatId());
            this.z = true;
            y0Var.c(userOrChat);
            y0Var.m = replaceAnimatedEmoji;
            y0Var.s = -1;
            y0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = y0Var.n;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.K = true;
                    this.L = (int) ((Math.min(0.4f, ((y0Var.n != null ? r3.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp3 = j11 + AndroidUtilities.dp(4.0f);
            this.x = dp3;
            j11 = dp3 + y0Var.u + AndroidUtilities.dp(f11);
        } else {
            this.z = false;
            y0Var.c(null);
            y0Var.m = null;
            y0Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    j11 += AndroidUtilities.dp(6.0f);
                }
                j5 j5Var = new j5(j11, LocaleController.getString(R.string.Gift2AttributeModel), this.m.name);
                arrayList.add(j5Var);
                float f14 = f13 * 0.5f;
                pz0 pz0Var = j5Var.b;
                pz0Var.p = f14;
                this.u = Math.max(this.u, pz0Var.c);
                pz0 pz0Var2 = j5Var.c;
                pz0Var2.p = f14;
                this.v = Math.max(this.v, pz0Var2.c);
                j11 += j5Var.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    j11 += AndroidUtilities.dp(6.0f);
                }
                j5 j5Var2 = new j5(j11, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.k.name);
                arrayList.add(j5Var2);
                float f15 = f13 * 0.5f;
                pz0 pz0Var3 = j5Var2.b;
                pz0Var3.p = f15;
                this.u = Math.max(this.u, pz0Var3.c);
                pz0 pz0Var4 = j5Var2.c;
                pz0Var4.p = f15;
                this.v = Math.max(this.v, pz0Var4.c);
                j11 = j5Var2.a() + j11;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    j11 += AndroidUtilities.dp(6.0f);
                }
                j5 j5Var3 = new j5(j11, LocaleController.getString(R.string.Gift2AttributeSymbol), this.l.name);
                arrayList.add(j5Var3);
                float f16 = f13 * 0.5f;
                pz0 pz0Var5 = j5Var3.b;
                pz0Var5.p = f16;
                this.u = Math.max(this.u, pz0Var5.c);
                pz0 pz0Var6 = j5Var3.c;
                pz0Var6.p = f16;
                this.v = Math.max(this.v, pz0Var6.c);
                j11 += j5Var3.a();
            }
        }
        float dp4 = j11 + AndroidUtilities.dp(11.66f);
        if (this.p) {
            dp = AndroidUtilities.dp(f10);
        } else {
            this.A = dp4;
            this.C = new pz0(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp5 = AndroidUtilities.dp(30.0f);
            this.B = dp5;
            dp4 += dp5;
            dp = AndroidUtilities.dp(11.0f);
        }
        this.M = (int) (dp4 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        float f10 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        pz0 pz0Var = new pz0(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.r = pz0Var;
        this.q = (pz0Var.j() / 2.0f) + dp;
        float j11 = this.r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        pz0 pz0Var2 = new pz0(i0.a.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.t = pz0Var2;
        this.s = (pz0Var2.j() / 2.0f) + j11;
        float j12 = this.t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        gh.y0 y0Var = this.y;
        TextPaint textPaint = y0Var.c;
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
        y0Var.c(userOrChat);
        y0Var.m = spanned;
        y0Var.s = -1;
        y0Var.b(((int) f10) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = y0Var.n;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.K = true;
                this.L = (int) ((Math.min(0.4f, ((y0Var.n != null ? r5.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.x = dp2;
        float dp3 = dp2 + y0Var.u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new pz0(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
