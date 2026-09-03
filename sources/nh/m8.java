package nh;

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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.cz;
import org.telegram.ui.dz;
import org.telegram.ui.zn;
import ph.za;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final Path B;
    public Bitmap C;
    public boolean D;
    public k8 a;
    public k8 b;
    public ph.f3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.z5 x;
    public final org.telegram.ui.Components.z5 y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.B = new Path();
        this.D = false;
        this.h = view;
        this.n = f6Var;
        this.x = new org.telegram.ui.Components.z5(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.z5(view, 0L, 360L, mr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ph.t6 t6Var) {
        if (t6Var == null || t6Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < t6Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) t6Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) t6Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z4);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, dz dzVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        ph.f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.e(true);
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
        this.D = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    p8 p8Var = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, dzVar);
                    if (storyItem != null) {
                        p8Var.c(storyItem.views, false);
                    }
                    k7.d6.a(p8Var);
                    view = p8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    za zaVar = new za();
                    zaVar.c = tL_mediaAreaWeather.emoji;
                    zaVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    dg.l1 l1Var = new dg.l1(getContext(), AndroidUtilities.density);
                    l1Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    l1Var.setIsVideo(true);
                    l1Var.d(UserConfig.selectedAccount, zaVar.c);
                    l1Var.setText(zaVar.a());
                    l1Var.e(3, tL_mediaAreaWeather.color);
                    view = new l8(getContext(), l1Var, mediaArea);
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

    public final void d(TL_stories.StoryItem storyItem, dz dzVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, dzVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        float f10;
        float f11;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var = this.b;
            float e = this.x.e((k8Var == null || !k8Var.s || k8Var.w) ? false : true);
            k8 k8Var2 = this.b;
            boolean z4 = k8Var2 != null && k8Var2.w;
            float e6 = this.y.e(z4);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.z5 z5Var = ((k8) childAt).a;
                        k8 k8Var3 = this.b;
                        float e10 = z5Var.e(childAt == k8Var3 && k8Var3.s);
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
                f10 = 0.0f;
                f11 = 0.2f;
            }
            if ((z4 || e6 > f10) && this.a != null) {
                if (this.C == null) {
                    this.C = ((f3) this).F.getPlayingBitmap();
                }
                if (this.C != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e6, 805306368));
                    canvas2.save();
                    Path path = this.B;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    k8 k8Var4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (k8Var4.x ? k8Var4.r.a(0.05f) : 1.0f) * 1.05f, e6);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f11;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f10, f10, getWidth(), getHeight());
                    int width = this.C.getWidth();
                    int height = this.C.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.C, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * lerp, this.a.getScaleY() * lerp, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.C;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.C = null;
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
        if (this.D) {
            return;
        }
        this.D = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                n5 n5Var = k8Var.E;
                if (k8Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(n5Var);
                    AndroidUtilities.runOnUIThread(n5Var, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        k8 k8Var;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        boolean z11;
        if (view instanceof k8) {
            if (view instanceof p8) {
                p8 p8Var = (p8) view;
                TL_stories.MediaArea mediaArea = p8Var.b;
                d4 d4Var = ((f3) this).F;
                boolean z12 = d4Var.z1;
                b4 b4Var = d4Var.L1;
                if (!z12 && b4Var.a != null) {
                    mg.q0 d = mg.q0.d(mediaArea.reaction);
                    if (!d.equals(mg.q0.d(b4Var.a.sent_reaction))) {
                        d4Var.L0(d);
                    }
                }
                p8Var.performHapticFeedback(3);
                p8Var.H.a.startAnimation();
                dz dzVar = d4Var.h1;
                Random random = dzVar.h;
                FrameLayout frameLayout = dzVar.D;
                ArrayList arrayList2 = dzVar.C;
                if (arrayList2.size() > 12) {
                    return;
                }
                mg.q0 d10 = mg.q0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.l5.f(dzVar.b, d10.g));
                }
                float measuredHeight = p8Var.getMeasuredHeight();
                float measuredWidth = p8Var.getMeasuredWidth();
                View view2 = (View) p8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f11 = 0.4f * view2.getWidth();
                    f10 = f11;
                } else {
                    f10 = measuredHeight;
                    f11 = measuredWidth;
                }
                String q10 = dz.q(str);
                int hashCode = p8Var.hashCode();
                boolean z13 = p8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z11 = z13;
                    if (dzVar.d(q10, hashCode, null, null, -1, false, false, f11, f10, z13)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        cz czVar = (cz) kf.k0.i(1, arrayList);
                        czVar.getClass();
                        czVar.e = f13;
                        czVar.d = f12;
                        czVar.a = p8Var.getTranslationX() - (czVar.d / 2.0f);
                        float translationY = p8Var.getTranslationY();
                        float f14 = czVar.d;
                        czVar.b = translationY - (1.5f * f14);
                        if (czVar.m) {
                            czVar.a = ((-f14) * 1.8f) + czVar.a;
                            return;
                        } else {
                            czVar.a = ((-f14) * 0.2f) + czVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f12 = f11;
                    f13 = f10;
                    z11 = z13;
                }
                if (d10.g == 0 || p8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    int i12 = i10;
                    if (((cz) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10 = i12 + 1;
                }
                if (i11 >= 4) {
                    return;
                }
                cz czVar2 = new cz();
                czVar2.j = mg.d.a(p8Var.getAnimatedEmojiDrawable(), true, true);
                if (!czVar2.i) {
                    czVar2.f = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    czVar2.g = ((random.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                czVar2.p = hashCode;
                czVar2.q = null;
                czVar2.k = d10.g;
                czVar2.m = z11;
                czVar2.e = f13;
                czVar2.d = f12;
                czVar2.a = p8Var.getTranslationX() - (czVar2.d / 2.0f);
                float translationY2 = p8Var.getTranslationY();
                float f15 = czVar2.d;
                czVar2.b = translationY2 - (1.5f * f15);
                czVar2.a = ((-f15) * 1.8f) + czVar2.a;
                if (dzVar.n) {
                    czVar2.j.f(frameLayout);
                }
                arrayList.add(czVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new n5(this, 9), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((f3) this).E.H(new zn(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    ze.d.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    ze.d.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                i8 i8Var = new i8(3, 0);
                i8Var.B = true;
                i8Var.J0 = this.b.b;
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
                    i8Var.K0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                i8Var.L0 = false;
                i8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((f3) this).E.H(i8Var);
                this.b = null;
                invalidate();
                return;
            }
            k8 k8Var2 = (k8) view;
            this.a = k8Var2;
            this.b = k8Var2;
            invalidate();
            ph.f3 f3Var = this.c;
            if (f3Var != null) {
                f3Var.e(true);
                this.c = null;
            }
            ph.f3 f3Var2 = new ph.f3(getContext(), 0);
            Paint paint = new Paint(1);
            f3Var2.V = paint;
            paint.setPathEffect(new CornerPathEffect(f3Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new dg.k1(f3Var2, 7));
            f3Var2.U = zVar;
            zVar.setCallback(f3Var2);
            f3Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            f3Var2.d = 5000L;
            this.c = f3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    f3Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new j8(0), length, spannableStringBuilder.length(), 33);
                    f3Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z4 = true;
                    SpannableString spannableString = new SpannableString(">");
                    lq lqVar = new lq(R.drawable.photos_arrow, 0);
                    lqVar.translate(AndroidUtilities.dp(!z4 ? 1.0f : 2.0f), AndroidUtilities.dp(!z4 ? 0.0f : 1.0f));
                    spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    lq lqVar2 = new lq(R.drawable.attach_arrow_right, 0);
                    lqVar2.translate(AndroidUtilities.dp(!z4 ? -1.0f : -2.0f), AndroidUtilities.dp(z4 ? 0.0f : 1.0f));
                    lqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(lqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    f3Var2.s(spannableStringBuilder);
                    f3Var2.i0 = new n4(19, this, f3Var2);
                    float f16 = !z4 ? 100 : 50;
                    z10 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f16)) < ((float) AndroidUtilities.dp(100.0f));
                    f3Var2.a = !z10 ? 1 : 3;
                    k8Var = this.b;
                    if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z10 ? (k8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f16) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + k8Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        f3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z10) {
                        f3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f16));
                    } else {
                        f3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    f3Var2.setOnClickListener(new androidx.mediarouter.app.c(this, 28));
                    f3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(f3Var2, k7.b6.c(f16, -1));
                    f3Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z4 = false;
            SpannableString spannableString3 = new SpannableString(">");
            lq lqVar3 = new lq(R.drawable.photos_arrow, 0);
            lqVar3.translate(AndroidUtilities.dp(!z4 ? 1.0f : 2.0f), AndroidUtilities.dp(!z4 ? 0.0f : 1.0f));
            spannableString3.setSpan(lqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            lq lqVar22 = new lq(R.drawable.attach_arrow_right, 0);
            lqVar22.translate(AndroidUtilities.dp(!z4 ? -1.0f : -2.0f), AndroidUtilities.dp(z4 ? 0.0f : 1.0f));
            lqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(lqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            f3Var2.s(spannableStringBuilder);
            f3Var2.i0 = new n4(19, this, f3Var2);
            float f162 = !z4 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f162)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            f3Var2.a = !z10 ? 1 : 3;
            k8Var = this.b;
            if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z10) {
            }
            f3Var2.setOnClickListener(new androidx.mediarouter.app.c(this, 28));
            f3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(f3Var2, k7.b6.c(f162, -1));
            f3Var2.u();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            bitmap.recycle();
            this.C = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
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
        ph.f3 f3Var;
        if (getChildCount() == 0 || (f3Var = this.c) == null || !f3Var.S) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ph.f3 f3Var2 = this.c;
            if (f3Var2 != null) {
                f3Var2.e(true);
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
