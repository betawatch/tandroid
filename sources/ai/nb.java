package ai;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import ci.kd;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.ez;
import org.telegram.ui.fz;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class nb extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public lb a;
    public lb b;
    public ci.d4 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.e6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.g6 x;
    public final org.telegram.ui.Components.g6 y;

    public nb(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.n = e6Var;
        this.x = new org.telegram.ui.Components.g6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.g6(view, 0L, 360L, hs.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ci.l8 l8Var) {
        if (l8Var == null || l8Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < l8Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) l8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) l8Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, fz fzVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        ci.d4 d4Var = this.c;
        if (d4Var != null) {
            d4Var.e(true);
            this.c = null;
        }
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt != frameLayout) {
                removeView(childAt);
                i10--;
            }
            i10++;
        }
        this.b = null;
        this.y.d(0.0f, true);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.G = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    qb qbVar = new qb(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, fzVar);
                    if (storyItem != null) {
                        qbVar.c(storyItem.views, false);
                    }
                    w7.z5.a(qbVar);
                    view = qbVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    kd kdVar = new kd();
                    kdVar.c = tL_mediaAreaWeather.emoji;
                    kdVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    qg.s0 s0Var = new qg.s0(getContext(), AndroidUtilities.density);
                    s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    s0Var.setIsVideo(true);
                    s0Var.d(UserConfig.selectedAccount, kdVar.c);
                    s0Var.setText(kdVar.a());
                    s0Var.e(3, tL_mediaAreaWeather.color);
                    view = new mb(getContext(), s0Var, mediaArea);
                } else {
                    view = new lb(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, fz fzVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, fzVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            lb lbVar = this.b;
            float e7 = this.x.e((lbVar == null || !lbVar.s || lbVar.w) ? false : true);
            lb lbVar2 = this.b;
            boolean z10 = lbVar2 != null && lbVar2.w;
            float e10 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e7 > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(e7, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.g6 g6Var = ((lb) childAt).a;
                        lb lbVar3 = this.b;
                        float e11 = g6Var.e(childAt == lbVar3 && lbVar3.s);
                        if (e11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e11 * 255.0f);
                            Paint paint = this.w;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
            }
            if ((z10 || e10 > 0.0f) && this.a != null) {
                if (this.F == null) {
                    this.F = ((w4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(e10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    lb lbVar4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (lbVar4.x ? lbVar4.r.a(0.05f) : 1.0f) * 1.05f, e10);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * 0.2f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * lerp, this.a.getScaleY() * lerp, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof lb) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((lb) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (this.G) {
            return;
        }
        this.G = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof lb) {
                lb lbVar = (lb) childAt;
                a3.d dVar = lbVar.H;
                if (lbVar.v) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0405  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        lb lbVar;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof lb) {
            int i10 = 3;
            float f13 = 2.0f;
            if (view instanceof qb) {
                qb qbVar = (qb) view;
                TL_stories.MediaArea mediaArea = qbVar.b;
                f6 f6Var = ((w4) this).I;
                boolean z13 = f6Var.C1;
                d6 d6Var = f6Var.O1;
                if (!z13 && d6Var.a != null) {
                    zg.n0 d = zg.n0.d(mediaArea.reaction);
                    if (!d.equals(zg.n0.d(d6Var.a.sent_reaction))) {
                        f6Var.L0(d);
                    }
                }
                qbVar.performHapticFeedback(3);
                qbVar.K.a.startAnimation();
                fz fzVar = f6Var.k1;
                Random random = fzVar.h;
                FrameLayout frameLayout = fzVar.G;
                ArrayList arrayList2 = fzVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                zg.n0 d10 = zg.n0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.s5.f(fzVar.b, d10.g));
                }
                float measuredHeight = qbVar.getMeasuredHeight();
                float measuredWidth = qbVar.getMeasuredWidth();
                View view2 = (View) qbVar.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String p5 = fz.p(str);
                int hashCode = qbVar.hashCode();
                boolean z14 = qbVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (fzVar.d(p5, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ez ezVar = (ez) hg.c.g(1, arrayList);
                        ezVar.getClass();
                        ezVar.e = f12;
                        ezVar.d = f11;
                        ezVar.a = qbVar.getTranslationX() - (ezVar.d / 2.0f);
                        float translationY = qbVar.getTranslationY();
                        float f14 = ezVar.d;
                        ezVar.b = translationY - (1.5f * f14);
                        if (ezVar.m) {
                            ezVar.a = ((-f14) * 1.8f) + ezVar.a;
                            return;
                        } else {
                            ezVar.a = ((-f14) * 0.2f) + ezVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || qbVar.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i11 = 0;
                int i12 = 0;
                while (i11 < arrayList.size()) {
                    float f15 = f13;
                    int i13 = i11;
                    if (((ez) arrayList.get(i11)).k == d10.g) {
                        i12++;
                    }
                    i11 = i13 + 1;
                    f13 = f15;
                }
                float f16 = f13;
                if (i12 >= 4) {
                    return;
                }
                ez ezVar2 = new ez();
                ezVar2.j = zg.d.a(qbVar.getAnimatedEmojiDrawable(), true, true);
                if (!ezVar2.i) {
                    ezVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    ezVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                ezVar2.p = hashCode;
                ezVar2.q = null;
                ezVar2.k = d10.g;
                ezVar2.m = z12;
                ezVar2.e = f12;
                ezVar2.d = f11;
                ezVar2.a = qbVar.getTranslationX() - (ezVar2.d / f16);
                float translationY2 = qbVar.getTranslationY();
                float f17 = ezVar2.d;
                ezVar2.b = translationY2 - (1.5f * f17);
                ezVar2.a = ((-f17) * 1.8f) + ezVar2.a;
                if (fzVar.n) {
                    ezVar2.j.f(frameLayout);
                }
                arrayList.add(ezVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new a3.d(this, 20), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((w4) this).H.H(new zn(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    of.f.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    of.f.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                jb jbVar = new jb(3, 0);
                jbVar.E = true;
                jbVar.M0 = this.b.b;
                jbVar.setResourceProvider(this.n);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                TL_stories.MediaArea mediaArea3 = this.b.b;
                if (mediaArea3 instanceof TL_stories.TL_mediaAreaVenue) {
                    TL_stories.TL_mediaAreaVenue tL_mediaAreaVenue = (TL_stories.TL_mediaAreaVenue) mediaArea3;
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_messageMediaVenue.venue_id = tL_mediaAreaVenue.venue_id;
                    tL_messageMediaVenue.venue_type = tL_mediaAreaVenue.venue_type;
                    tL_messageMediaVenue.title = tL_mediaAreaVenue.title;
                    tL_messageMediaVenue.address = tL_mediaAreaVenue.address;
                    tL_messageMediaVenue.provider = tL_mediaAreaVenue.provider;
                    tL_messageMediaVenue.geo = tL_mediaAreaVenue.geo;
                    tL_message.media = tL_messageMediaVenue;
                } else if (!(mediaArea3 instanceof TL_stories.TL_mediaAreaGeoPoint)) {
                    this.b = null;
                    invalidate();
                    return;
                } else {
                    jbVar.N0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                jbVar.O0 = false;
                jbVar.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((w4) this).H.H(jbVar);
                this.b = null;
                invalidate();
                return;
            }
            lb lbVar2 = (lb) view;
            this.a = lbVar2;
            this.b = lbVar2;
            invalidate();
            ci.d4 d4Var = this.c;
            if (d4Var != null) {
                d4Var.e(true);
                this.c = null;
            }
            ci.d4 d4Var2 = new ci.d4(getContext(), 0);
            Paint paint = new Paint(1);
            d4Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(d4Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new ci.c4(d4Var2, 0));
            d4Var2.a0 = zVar;
            zVar.setCallback(d4Var2);
            d4Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            d4Var2.d = 5000L;
            this.c = d4Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    d4Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.m1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new kb(0), length, spannableStringBuilder.length(), 33);
                    d4Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    er erVar = new er(R.drawable.photos_arrow, 0);
                    erVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(erVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    er erVar2 = new er(R.drawable.attach_arrow_right, 0);
                    erVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    erVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(erVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    d4Var2.s(spannableStringBuilder);
                    d4Var2.l0 = new ca(2, this, d4Var2);
                    float f18 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f18)) < ((float) AndroidUtilities.dp(100.0f));
                    d4Var2.a = !z11 ? 1 : 3;
                    lbVar = this.b;
                    if (!(lbVar.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (lbVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f18) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + lbVar.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        d4Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        d4Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f18));
                    } else {
                        d4Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    d4Var2.setOnClickListener(new v0(this, i10));
                    d4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(d4Var2, w7.x5.d(f18, -1));
                    d4Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            er erVar3 = new er(R.drawable.photos_arrow, 0);
            erVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(erVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            er erVar22 = new er(R.drawable.attach_arrow_right, 0);
            erVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            erVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(erVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            d4Var2.s(spannableStringBuilder);
            d4Var2.l0 = new ca(2, this, d4Var2);
            float f182 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f182)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            d4Var2.a = !z11 ? 1 : 3;
            lbVar = this.b;
            if (!(lbVar.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            d4Var2.setOnClickListener(new v0(this, i10));
            d4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(d4Var2, w7.x5.d(f182, -1));
            d4Var2.u();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) childAt;
                TL_stories.MediaArea mediaArea = lbVar.b;
                int measuredWidth = lbVar.getMeasuredWidth();
                int measuredHeight = lbVar.getMeasuredHeight();
                lbVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                lbVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                lbVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                lbVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof mb) {
                mb mbVar = (mb) childAt;
                TL_stories.MediaArea mediaArea2 = mbVar.a;
                int measuredWidth2 = mbVar.getMeasuredWidth();
                int measuredHeight2 = mbVar.getMeasuredHeight();
                mbVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                mbVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                mbVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                mbVar.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) getChildAt(i12);
                lbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof mb) {
                mb mbVar = (mb) getChildAt(i12);
                mbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((mbVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((mbVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ci.d4 d4Var;
        if (getChildCount() == 0 || (d4Var = this.c) == null || !d4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ci.d4 d4Var2 = this.c;
            if (d4Var2 != null) {
                d4Var2.e(true);
                this.c = null;
            }
            this.b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
