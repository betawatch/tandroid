package lh;

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
import java.util.ArrayList;
import java.util.Random;
import nh.dc;
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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.qy;
import org.telegram.ui.ry;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final Path A;
    public Bitmap B;
    public boolean C;
    public k8 a;
    public k8 b;
    public nh.t3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.c6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.d6 x;
    public final org.telegram.ui.Components.d6 y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.A = new Path();
        this.C = false;
        this.h = view;
        this.n = c6Var;
        this.x = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.d6(view, 0L, 360L, jr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(nh.o7 o7Var) {
        if (o7Var == null || o7Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < o7Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) o7Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) o7Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ry ryVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        nh.t3 t3Var = this.c;
        if (t3Var != null) {
            t3Var.e(true);
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
        this.C = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    p8 p8Var = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, ryVar);
                    if (storyItem != null) {
                        p8Var.c(storyItem.views, false);
                    }
                    i7.h6.a(p8Var);
                    view = p8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    dc dcVar = new dc();
                    dcVar.c = tL_mediaAreaWeather.emoji;
                    dcVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    bg.n1 n1Var = new bg.n1(getContext(), AndroidUtilities.density);
                    n1Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    n1Var.setIsVideo(true);
                    n1Var.d(UserConfig.selectedAccount, dcVar.c);
                    n1Var.setText(dcVar.a());
                    n1Var.e(3, tL_mediaAreaWeather.color);
                    view = new l8(getContext(), n1Var, mediaArea);
                } else {
                    view = new k8(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, ry ryVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, ryVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        float f9;
        float f10;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var = this.b;
            float e10 = this.x.e((k8Var == null || !k8Var.s || k8Var.w) ? false : true);
            k8 k8Var2 = this.b;
            boolean z10 = k8Var2 != null && k8Var2.w;
            float e11 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e10 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f9 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e10, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.d6 d6Var = ((k8) childAt).a;
                        k8 k8Var3 = this.b;
                        float e12 = d6Var.e(childAt == k8Var3 && k8Var3.s);
                        if (e12 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e12 * 255.0f);
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
                f9 = 0.0f;
                f10 = 0.2f;
            }
            if ((z10 || e11 > f9) && this.a != null) {
                if (this.B == null) {
                    this.B = ((e3) this).E.getPlayingBitmap();
                }
                if (this.B != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e11, 805306368));
                    canvas2.save();
                    Path path = this.A;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    k8 k8Var4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (k8Var4.x ? k8Var4.r.a(0.05f) : 1.0f) * 1.05f, e11);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f10;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f9, f9, getWidth(), getHeight());
                    int width = this.B.getWidth();
                    int height = this.B.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.B, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * lerp, this.a.getScaleY() * lerp, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.B;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.B = null;
                }
            }
            invalidate();
        } else if (view instanceof k8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((k8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.C) {
            return;
        }
        this.C = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                m5 m5Var = k8Var.D;
                if (k8Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(m5Var);
                    AndroidUtilities.runOnUIThread(m5Var, 400L);
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
    /* JADX WARN: Removed duplicated region for block: B:113:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        k8 k8Var;
        float f9;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof k8) {
            if (view instanceof p8) {
                p8 p8Var = (p8) view;
                TL_stories.MediaArea mediaArea = p8Var.b;
                d4 d4Var = ((e3) this).E;
                boolean z13 = d4Var.y1;
                b4 b4Var = d4Var.K1;
                if (!z13 && b4Var.a != null) {
                    kg.q0 d = kg.q0.d(mediaArea.reaction);
                    if (!d.equals(kg.q0.d(b4Var.a.sent_reaction))) {
                        d4Var.L0(d);
                    }
                }
                p8Var.performHapticFeedback(3);
                p8Var.G.a.startAnimation();
                ry ryVar = d4Var.g1;
                Random random = ryVar.h;
                FrameLayout frameLayout = ryVar.C;
                ArrayList arrayList2 = ryVar.B;
                if (arrayList2.size() > 12) {
                    return;
                }
                kg.q0 d10 = kg.q0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.p5.f(ryVar.b, d10.g));
                }
                float measuredHeight = p8Var.getMeasuredHeight();
                float measuredWidth = p8Var.getMeasuredWidth();
                View view2 = (View) p8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f9 = f10;
                } else {
                    f9 = measuredHeight;
                    f10 = measuredWidth;
                }
                String q6 = ry.q(str);
                int hashCode = p8Var.hashCode();
                boolean z14 = p8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f9;
                    z12 = z14;
                    if (ryVar.d(q6, hashCode, null, null, -1, false, false, f10, f9, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        qy qyVar = (qy) j7.l1.i(1, arrayList);
                        qyVar.getClass();
                        qyVar.e = f12;
                        qyVar.d = f11;
                        qyVar.a = p8Var.getTranslationX() - (qyVar.d / 2.0f);
                        float translationY = p8Var.getTranslationY();
                        float f13 = qyVar.d;
                        qyVar.b = translationY - (1.5f * f13);
                        if (qyVar.m) {
                            qyVar.a = ((-f13) * 1.8f) + qyVar.a;
                            return;
                        } else {
                            qyVar.a = ((-f13) * 0.2f) + qyVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f9;
                    z12 = z14;
                }
                if (d10.g == 0 || p8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    int i12 = i10;
                    if (((qy) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10 = i12 + 1;
                }
                if (i11 >= 4) {
                    return;
                }
                qy qyVar2 = new qy();
                qyVar2.j = kg.d.a(p8Var.getAnimatedEmojiDrawable(), true, true);
                if (!qyVar2.i) {
                    qyVar2.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    qyVar2.g = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                qyVar2.p = hashCode;
                qyVar2.q = null;
                qyVar2.k = d10.g;
                qyVar2.m = z12;
                qyVar2.e = f12;
                qyVar2.d = f11;
                qyVar2.a = p8Var.getTranslationX() - (qyVar2.d / 2.0f);
                float translationY2 = p8Var.getTranslationY();
                float f14 = qyVar2.d;
                qyVar2.b = translationY2 - (1.5f * f14);
                qyVar2.a = ((-f14) * 1.8f) + qyVar2.a;
                if (ryVar.n) {
                    qyVar2.j.f(frameLayout);
                }
                arrayList.add(qyVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new m5(this, 9), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((e3) this).D.H(new tn(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    ye.d.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    ye.d.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                i8 i8Var = new i8(3, 0);
                i8Var.A = true;
                i8Var.I0 = this.b.b;
                i8Var.setResourceProvider(this.n);
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
                    i8Var.J0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                i8Var.K0 = false;
                i8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((e3) this).D.H(i8Var);
                this.b = null;
                invalidate();
                return;
            }
            k8 k8Var2 = (k8) view;
            this.a = k8Var2;
            this.b = k8Var2;
            invalidate();
            nh.t3 t3Var = this.c;
            if (t3Var != null) {
                t3Var.e(true);
                this.c = null;
            }
            nh.t3 t3Var2 = new nh.t3(getContext(), 0);
            Paint paint = new Paint(1);
            t3Var2.U = paint;
            paint.setPathEffect(new CornerPathEffect(t3Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new bg.m1(t3Var2, 3));
            t3Var2.T = zVar;
            zVar.setCallback(t3Var2);
            t3Var2.n(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            t3Var2.d = 5000L;
            this.c = t3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    t3Var2.q(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new j8(0), length, spannableStringBuilder.length(), 33);
                    t3Var2.l(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    iq iqVar = new iq(R.drawable.photos_arrow, 0);
                    iqVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    iq iqVar2 = new iq(R.drawable.attach_arrow_right, 0);
                    iqVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
                    iqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(iqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    t3Var2.t(spannableStringBuilder);
                    t3Var2.h0 = new r3(20, this, t3Var2);
                    float f15 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f15)) < ((float) AndroidUtilities.dp(100.0f));
                    t3Var2.a = !z11 ? 1 : 3;
                    k8Var = this.b;
                    if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (k8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + k8Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        t3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        t3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f15));
                    } else {
                        t3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    t3Var2.setOnClickListener(new ag.o(this, 28));
                    t3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(t3Var2, i7.f6.c(f15, -1));
                    t3Var2.v();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            iq iqVar3 = new iq(R.drawable.photos_arrow, 0);
            iqVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(iqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            iq iqVar22 = new iq(R.drawable.attach_arrow_right, 0);
            iqVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(z10 ? 0.0f : 1.0f));
            iqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(iqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            t3Var2.t(spannableStringBuilder);
            t3Var2.h0 = new r3(20, this, t3Var2);
            float f152 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f152)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            t3Var2.a = !z11 ? 1 : 3;
            k8Var = this.b;
            if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            t3Var2.setOnClickListener(new ag.o(this, 28));
            t3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(t3Var2, i7.f6.c(f152, -1));
            t3Var2.v();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                TL_stories.MediaArea mediaArea = k8Var.b;
                int measuredWidth = k8Var.getMeasuredWidth();
                int measuredHeight = k8Var.getMeasuredHeight();
                k8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                k8Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                k8Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                k8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) childAt;
                TL_stories.MediaArea mediaArea2 = l8Var.a;
                int measuredWidth2 = l8Var.getMeasuredWidth();
                int measuredHeight2 = l8Var.getMeasuredHeight();
                l8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                l8Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                l8Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                l8Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) getChildAt(i12);
                k8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) getChildAt(i12);
                l8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        nh.t3 t3Var;
        if (getChildCount() == 0 || (t3Var = this.c) == null || !t3Var.R) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            nh.t3 t3Var2 = this.c;
            if (t3Var2 != null) {
                t3Var2.e(true);
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
