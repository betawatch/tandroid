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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.cz;
import org.telegram.ui.dz;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public abstract class mb extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public kb a;
    public kb b;
    public ci.e4 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.d6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.e6 x;
    public final org.telegram.ui.Components.e6 y;

    public mb(Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.n = d6Var;
        this.x = new org.telegram.ui.Components.e6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.e6(view, 0L, 360L, rr.h);
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

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, dz dzVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        ci.e4 e4Var = this.c;
        if (e4Var != null) {
            e4Var.e(true);
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
                    pb pbVar = new pb(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, dzVar);
                    if (storyItem != null) {
                        pbVar.c(storyItem.views, false);
                    }
                    w7.z5.a(pbVar);
                    view = pbVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    kd kdVar = new kd();
                    kdVar.c = tL_mediaAreaWeather.emoji;
                    kdVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    qg.v0 v0Var = new qg.v0(getContext(), AndroidUtilities.density);
                    v0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    v0Var.setIsVideo(true);
                    v0Var.d(UserConfig.selectedAccount, kdVar.c);
                    v0Var.setText(kdVar.a());
                    v0Var.e(3, tL_mediaAreaWeather.color);
                    view = new lb(getContext(), v0Var, mediaArea);
                } else {
                    view = new kb(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, dz dzVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, dzVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Canvas canvas2;
        RectF rectF;
        float f7;
        float f10;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            kb kbVar = this.b;
            float e = this.x.e((kbVar == null || !kbVar.s || kbVar.w) ? false : true);
            kb kbVar2 = this.b;
            boolean z10 = kbVar2 != null && kbVar2.w;
            float e7 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.e6 e6Var = ((kb) childAt).a;
                        kb kbVar3 = this.b;
                        float e10 = e6Var.e(childAt == kbVar3 && kbVar3.s);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e10 * 255.0f);
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
                f7 = 0.0f;
                f10 = 0.2f;
            }
            if ((z10 || e7 > f7) && this.a != null) {
                if (this.F == null) {
                    this.F = ((v4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    kb kbVar4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (kbVar4.x ? kbVar4.r.a(0.05f) : 1.0f) * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f10;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f7, f7, getWidth(), getHeight());
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
        } else if (view instanceof kb) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((kb) view).a(canvas);
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
            if (childAt instanceof kb) {
                kb kbVar = (kb) childAt;
                a3.d dVar = kbVar.H;
                if (kbVar.v) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x040a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        kb kbVar;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof kb) {
            int i10 = 3;
            if (view instanceof pb) {
                pb pbVar = (pb) view;
                TL_stories.MediaArea mediaArea = pbVar.b;
                e6 e6Var = ((v4) this).I;
                boolean z13 = e6Var.C1;
                c6 c6Var = e6Var.O1;
                if (!z13 && c6Var.a != null) {
                    zg.p0 d = zg.p0.d(mediaArea.reaction);
                    if (!d.equals(zg.p0.d(c6Var.a.sent_reaction))) {
                        e6Var.L0(d);
                    }
                }
                pbVar.performHapticFeedback(3);
                pbVar.K.a.startAnimation();
                dz dzVar = e6Var.k1;
                Random random = dzVar.h;
                FrameLayout frameLayout = dzVar.G;
                ArrayList arrayList2 = dzVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                zg.p0 d10 = zg.p0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.q5.f(dzVar.b, d10.g));
                }
                float measuredHeight = pbVar.getMeasuredHeight();
                float measuredWidth = pbVar.getMeasuredWidth();
                View view2 = (View) pbVar.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String q6 = dz.q(str);
                int hashCode = pbVar.hashCode();
                boolean z14 = pbVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (dzVar.d(q6, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        cz czVar = (cz) hg.c.h(1, arrayList);
                        czVar.getClass();
                        czVar.e = f12;
                        czVar.d = f11;
                        czVar.a = pbVar.getTranslationX() - (czVar.d / 2.0f);
                        float translationY = pbVar.getTranslationY();
                        float f13 = czVar.d;
                        czVar.b = translationY - (1.5f * f13);
                        if (czVar.m) {
                            czVar.a = ((-f13) * 1.8f) + czVar.a;
                            return;
                        } else {
                            czVar.a = ((-f13) * 0.2f) + czVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || pbVar.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i11 = 0;
                int i12 = 0;
                while (i11 < arrayList.size()) {
                    int i13 = i11;
                    if (((cz) arrayList.get(i11)).k == d10.g) {
                        i12++;
                    }
                    i11 = i13 + 1;
                }
                if (i12 >= 4) {
                    return;
                }
                cz czVar2 = new cz();
                czVar2.j = zg.d.a(pbVar.getAnimatedEmojiDrawable(), true, true);
                if (!czVar2.i) {
                    czVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    czVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                czVar2.p = hashCode;
                czVar2.q = null;
                czVar2.k = d10.g;
                czVar2.m = z12;
                czVar2.e = f12;
                czVar2.d = f11;
                czVar2.a = pbVar.getTranslationX() - (czVar2.d / 2.0f);
                float translationY2 = pbVar.getTranslationY();
                float f14 = czVar2.d;
                czVar2.b = translationY2 - (1.5f * f14);
                czVar2.a = ((-f14) * 1.8f) + czVar2.a;
                if (dzVar.n) {
                    czVar2.j.f(frameLayout);
                }
                arrayList.add(czVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new a3.d(this, 20), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((v4) this).H.H(new xn(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    nf.f.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    nf.f.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                ib ibVar = new ib(3, 0);
                ibVar.E = true;
                ibVar.M0 = this.b.b;
                ibVar.setResourceProvider(this.n);
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
                    ibVar.N0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                ibVar.O0 = false;
                ibVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((v4) this).H.H(ibVar);
                this.b = null;
                invalidate();
                return;
            }
            kb kbVar2 = (kb) view;
            this.a = kbVar2;
            this.b = kbVar2;
            invalidate();
            ci.e4 e4Var = this.c;
            if (e4Var != null) {
                e4Var.e(true);
                this.c = null;
            }
            ci.e4 e4Var2 = new ci.e4(getContext(), 0);
            Paint paint = new Paint(1);
            e4Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(e4Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new ci.d4(e4Var2, 0));
            e4Var2.a0 = zVar;
            zVar.setCallback(e4Var2);
            e4Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            e4Var2.d = 5000L;
            this.c = e4Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    e4Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new jb(0), length, spannableStringBuilder.length(), 33);
                    e4Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    pq pqVar = new pq(R.drawable.photos_arrow, 0);
                    pqVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    pq pqVar2 = new pq(R.drawable.attach_arrow_right, 0);
                    pqVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    pqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(pqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    e4Var2.s(spannableStringBuilder);
                    e4Var2.l0 = new ba(2, this, e4Var2);
                    float f15 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f15)) < ((float) AndroidUtilities.dp(100.0f));
                    e4Var2.a = !z11 ? 1 : 3;
                    kbVar = this.b;
                    if (!(kbVar.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (kbVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + kbVar.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        e4Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        e4Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15));
                    } else {
                        e4Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    e4Var2.setOnClickListener(new v0(this, i10));
                    e4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(e4Var2, w7.x5.c(f15, -1));
                    e4Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            pq pqVar3 = new pq(R.drawable.photos_arrow, 0);
            pqVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(pqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            pq pqVar22 = new pq(R.drawable.attach_arrow_right, 0);
            pqVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            pqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(pqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            e4Var2.s(spannableStringBuilder);
            e4Var2.l0 = new ba(2, this, e4Var2);
            float f152 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f152)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            e4Var2.a = !z11 ? 1 : 3;
            kbVar = this.b;
            if (!(kbVar.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            e4Var2.setOnClickListener(new v0(this, i10));
            e4Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(e4Var2, w7.x5.c(f152, -1));
            e4Var2.u();
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
            } else if (childAt instanceof kb) {
                kb kbVar = (kb) childAt;
                TL_stories.MediaArea mediaArea = kbVar.b;
                int measuredWidth = kbVar.getMeasuredWidth();
                int measuredHeight = kbVar.getMeasuredHeight();
                kbVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                kbVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                kbVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                kbVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) childAt;
                TL_stories.MediaArea mediaArea2 = lbVar.a;
                int measuredWidth2 = lbVar.getMeasuredWidth();
                int measuredHeight2 = lbVar.getMeasuredHeight();
                lbVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                lbVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                lbVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                lbVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof kb) {
                kb kbVar = (kb) getChildAt(i12);
                kbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((kbVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((kbVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) getChildAt(i12);
                lbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ci.e4 e4Var;
        if (getChildCount() == 0 || (e4Var = this.c) == null || !e4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ci.e4 e4Var2 = this.c;
            if (e4Var2 != null) {
                e4Var2.e(true);
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
