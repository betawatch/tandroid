package oh;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.bz;
import org.telegram.ui.cz;
import org.telegram.ui.xn;
import qh.wa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final Path B;
    public Bitmap C;
    public boolean D;
    public k8 a;
    public k8 b;
    public qh.e3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.g6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.z5 x;
    public final org.telegram.ui.Components.z5 y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.n = g6Var;
        this.x = new org.telegram.ui.Components.z5(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.z5(view, 0L, 360L, pr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(qh.r6 r6Var) {
        if (r6Var == null || r6Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < r6Var.T0.size(); i10++) {
            if (((VideoEditedInfo.MediaEntity) r6Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) r6Var.T0.get(i10)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z4);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, cz czVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        qh.e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.e(true);
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
                    p8 p8Var = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, czVar);
                    if (storyItem != null) {
                        p8Var.c(storyItem.views, false);
                    }
                    k7.e6.a(p8Var);
                    view = p8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    wa waVar = new wa();
                    waVar.c = tL_mediaAreaWeather.emoji;
                    waVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    eg.j1 j1Var = new eg.j1(getContext(), AndroidUtilities.density);
                    j1Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    j1Var.setIsVideo(true);
                    j1Var.d(UserConfig.selectedAccount, waVar.c);
                    j1Var.setText(waVar.a());
                    j1Var.e(3, tL_mediaAreaWeather.color);
                    view = new l8(getContext(), j1Var, mediaArea);
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

    public final void d(TL_stories.StoryItem storyItem, cz czVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, czVar);
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
            float e6 = this.x.e((k8Var == null || !k8Var.s || k8Var.w) ? false : true);
            k8 k8Var2 = this.b;
            boolean z4 = k8Var2 != null && k8Var2.w;
            float e10 = this.y.e(z4);
            RectF rectF2 = this.v;
            if (e6 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(e6, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.z5 z5Var = ((k8) childAt).a;
                        k8 k8Var3 = this.b;
                        float e11 = z5Var.e(childAt == k8Var3 && k8Var3.s);
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
                f10 = 0.0f;
                f11 = 0.2f;
            }
            if ((z4 || e10 > f10) && this.a != null) {
                if (this.C == null) {
                    this.C = ((g3) this).F.getPlayingBitmap();
                }
                if (this.C != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(e10, 805306368));
                    canvas2.save();
                    Path path = this.B;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    k8 k8Var4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (k8Var4.x ? k8Var4.r.a(0.05f) : 1.0f) * 1.05f, e10);
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
                t3 t3Var = k8Var.E;
                if (k8Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(t3Var);
                    AndroidUtilities.runOnUIThread(t3Var, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040c  */
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
        int i10;
        float f12;
        float f13;
        boolean z11;
        if (view instanceof k8) {
            int i11 = 12;
            if (view instanceof p8) {
                p8 p8Var = (p8) view;
                TL_stories.MediaArea mediaArea = p8Var.b;
                f4 f4Var = ((g3) this).F;
                boolean z12 = f4Var.z1;
                d4 d4Var = f4Var.L1;
                if (!z12 && d4Var.a != null) {
                    ng.q0 d = ng.q0.d(mediaArea.reaction);
                    if (!d.equals(ng.q0.d(d4Var.a.sent_reaction))) {
                        f4Var.L0(d);
                    }
                }
                p8Var.performHapticFeedback(3);
                p8Var.H.a.startAnimation();
                cz czVar = f4Var.h1;
                Random random = czVar.h;
                FrameLayout frameLayout = czVar.D;
                ArrayList arrayList2 = czVar.C;
                if (arrayList2.size() > 12) {
                    return;
                }
                ng.q0 d10 = ng.q0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.l5.f(czVar.b, d10.g));
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
                String q10 = cz.q(str);
                int hashCode = p8Var.hashCode();
                boolean z13 = p8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    boolean d11 = czVar.d(q10, hashCode, null, null, -1, false, false, f11, f10, z13);
                    i10 = hashCode;
                    f12 = f11;
                    f13 = f10;
                    z11 = z13;
                    if (d11) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        bz bzVar = (bz) l.d.i(1, arrayList);
                        bzVar.getClass();
                        bzVar.e = f13;
                        bzVar.d = f12;
                        bzVar.a = p8Var.getTranslationX() - (bzVar.d / 2.0f);
                        float translationY = p8Var.getTranslationY();
                        float f14 = bzVar.d;
                        bzVar.b = translationY - (1.5f * f14);
                        if (bzVar.m) {
                            bzVar.a = ((-f14) * 1.8f) + bzVar.a;
                            return;
                        } else {
                            bzVar.a = ((-f14) * 0.2f) + bzVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i10 = hashCode;
                    f12 = f11;
                    f13 = f10;
                    z11 = z13;
                }
                if (d10.g == 0 || p8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i12 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    int i14 = i13;
                    if (((bz) arrayList.get(i13)).k == d10.g) {
                        i12++;
                    }
                    i13 = i14 + 1;
                }
                if (i12 >= 4) {
                    return;
                }
                bz bzVar2 = new bz();
                bzVar2.j = ng.d.a(p8Var.getAnimatedEmojiDrawable(), true, true);
                if (!bzVar2.i) {
                    bzVar2.f = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    bzVar2.g = ((random.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                bzVar2.p = i10;
                bzVar2.q = null;
                bzVar2.k = d10.g;
                bzVar2.m = z11;
                bzVar2.e = f13;
                bzVar2.d = f12;
                bzVar2.a = p8Var.getTranslationX() - (bzVar2.d / 2.0f);
                float translationY2 = p8Var.getTranslationY();
                float f15 = bzVar2.d;
                bzVar2.b = translationY2 - (1.5f * f15);
                bzVar2.a = ((-f15) * 1.8f) + bzVar2.a;
                if (czVar.n) {
                    bzVar2.j.f(frameLayout);
                }
                arrayList.add(bzVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new t3(this, i11), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((g3) this).E.H(new xn(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    af.g.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    af.g.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
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
                ((g3) this).E.H(i8Var);
                this.b = null;
                invalidate();
                return;
            }
            k8 k8Var2 = (k8) view;
            this.a = k8Var2;
            this.b = k8Var2;
            invalidate();
            qh.e3 e3Var = this.c;
            if (e3Var != null) {
                e3Var.e(true);
                this.c = null;
            }
            qh.e3 e3Var2 = new qh.e3(getContext(), 0);
            Paint paint = new Paint(1);
            e3Var2.V = paint;
            paint.setPathEffect(new CornerPathEffect(e3Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new eg.i1(e3Var2, 7));
            e3Var2.U = zVar;
            zVar.setCallback(e3Var2);
            e3Var2.m(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            e3Var2.d = 5000L;
            this.c = e3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    e3Var2.p(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new j8(0), length, spannableStringBuilder.length(), 33);
                    e3Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z4 = true;
                    SpannableString spannableString = new SpannableString(">");
                    oq oqVar = new oq(R.drawable.photos_arrow, 0);
                    oqVar.translate(AndroidUtilities.dp(!z4 ? 1.0f : 2.0f), AndroidUtilities.dp(!z4 ? 0.0f : 1.0f));
                    spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    oq oqVar2 = new oq(R.drawable.attach_arrow_right, 0);
                    oqVar2.translate(AndroidUtilities.dp(!z4 ? -1.0f : -2.0f), AndroidUtilities.dp(z4 ? 0.0f : 1.0f));
                    oqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(oqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    e3Var2.s(spannableStringBuilder);
                    e3Var2.i0 = new z1(22, this, e3Var2);
                    float f16 = !z4 ? 100 : 50;
                    z10 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f16)) < ((float) AndroidUtilities.dp(100.0f));
                    e3Var2.a = z10 ? 1 : 3;
                    k8Var = this.b;
                    if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z10 ? (k8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f16) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + k8Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        e3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z10) {
                        e3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f16));
                    } else {
                        e3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    e3Var2.setOnClickListener(new androidx.mediarouter.app.c(this, 28));
                    e3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(e3Var2, k7.c6.c(f16, -1));
                    e3Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z4 = false;
            SpannableString spannableString3 = new SpannableString(">");
            oq oqVar3 = new oq(R.drawable.photos_arrow, 0);
            oqVar3.translate(AndroidUtilities.dp(!z4 ? 1.0f : 2.0f), AndroidUtilities.dp(!z4 ? 0.0f : 1.0f));
            spannableString3.setSpan(oqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            oq oqVar22 = new oq(R.drawable.attach_arrow_right, 0);
            oqVar22.translate(AndroidUtilities.dp(!z4 ? -1.0f : -2.0f), AndroidUtilities.dp(z4 ? 0.0f : 1.0f));
            oqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(oqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            e3Var2.s(spannableStringBuilder);
            e3Var2.i0 = new z1(22, this, e3Var2);
            float f162 = !z4 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f162)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            e3Var2.a = z10 ? 1 : 3;
            k8Var = this.b;
            if (!(k8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z10) {
            }
            e3Var2.setOnClickListener(new androidx.mediarouter.app.c(this, 28));
            e3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(e3Var2, k7.c6.c(f162, -1));
            e3Var2.u();
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
        qh.e3 e3Var;
        if (getChildCount() == 0 || (e3Var = this.c) == null || !e3Var.S) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            qh.e3 e3Var2 = this.c;
            if (e3Var2 != null) {
                e3Var2.e(true);
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
