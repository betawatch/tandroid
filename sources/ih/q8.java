package ih;

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
import kh.tc;
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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class q8 extends FrameLayout implements View.OnClickListener {
    public final Path A;
    public Bitmap B;
    public boolean C;
    public o8 a;
    public o8 b;
    public kh.x3 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.b6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF v;
    public final Paint w;
    public final org.telegram.ui.Components.y5 x;
    public final org.telegram.ui.Components.y5 y;

    public q8(Context context, View view, org.telegram.ui.ActionBar.b6 b6Var) {
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
        this.n = b6Var;
        this.x = new org.telegram.ui.Components.y5(view, 0L, 120L, new LinearInterpolator());
        this.y = new org.telegram.ui.Components.y5(view, 0L, 360L, gr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(kh.a8 a8Var) {
        if (a8Var == null || a8Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < a8Var.T0.size(); i9++) {
            if (((VideoEditedInfo.MediaEntity) a8Var.T0.get(i9)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) a8Var.T0.get(i9)).mediaArea);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, py pyVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        kh.x3 x3Var = this.c;
        if (x3Var != null) {
            x3Var.e(true);
            this.c = null;
        }
        int i9 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt != frameLayout) {
                removeView(childAt);
                i9--;
            }
            i9++;
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    t8 t8Var = new t8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, pyVar);
                    if (storyItem != null) {
                        t8Var.c(storyItem.views, false);
                    }
                    g7.g6.a(t8Var);
                    view = t8Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    tc tcVar = new tc();
                    tcVar.c = tL_mediaAreaWeather.emoji;
                    tcVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    yf.r0 r0Var = new yf.r0(getContext(), AndroidUtilities.density);
                    r0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                    r0Var.setIsVideo(true);
                    r0Var.d(UserConfig.selectedAccount, tcVar.c);
                    r0Var.setText(tcVar.a());
                    r0Var.e(3, tL_mediaAreaWeather.color);
                    view = new p8(getContext(), r0Var, mediaArea);
                } else {
                    view = new o8(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, py pyVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, pyVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        float f10;
        float f11;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            o8 o8Var = this.b;
            float e10 = this.x.e((o8Var == null || !o8Var.s || o8Var.w) ? false : true);
            o8 o8Var2 = this.b;
            boolean z10 = o8Var2 != null && o8Var2.w;
            float e11 = this.y.e(z10);
            RectF rectF2 = this.v;
            if (e10 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e10, 402653184));
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.y5 y5Var = ((o8) childAt).a;
                        o8 o8Var3 = this.b;
                        float e12 = y5Var.e(childAt == o8Var3 && o8Var3.s);
                        if (e12 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i10 = (int) (e12 * 255.0f);
                            Paint paint = this.w;
                            paint.setAlpha(i10);
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
            if ((z10 || e11 > f10) && this.a != null) {
                if (this.B == null) {
                    this.B = ((g3) this).E.getPlayingBitmap();
                }
                if (this.B != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e11, 805306368));
                    canvas2.save();
                    Path path = this.A;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    o8 o8Var4 = this.a;
                    float lerp = AndroidUtilities.lerp(1.0f, (o8Var4.x ? o8Var4.r.a(0.05f) : 1.0f) * 1.05f, e11);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f11;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f10, f10, getWidth(), getHeight());
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
        } else if (view instanceof o8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((o8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.C) {
            return;
        }
        this.C = true;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof o8) {
                o8 o8Var = (o8) childAt;
                g gVar = o8Var.D;
                if (o8Var.v) {
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0412  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        o8 o8Var;
        float f10;
        float f11;
        ArrayList arrayList;
        int i9;
        float f12;
        float f13;
        boolean z12;
        float f14;
        if (view instanceof o8) {
            if (view instanceof t8) {
                t8 t8Var = (t8) view;
                TL_stories.MediaArea mediaArea = t8Var.b;
                i4 i4Var = ((g3) this).E;
                boolean z13 = i4Var.y1;
                g4 g4Var = i4Var.K1;
                if (!z13 && g4Var.a != null) {
                    hg.r0 d = hg.r0.d(mediaArea.reaction);
                    if (!d.equals(hg.r0.d(g4Var.a.sent_reaction))) {
                        i4Var.L0(d);
                    }
                }
                t8Var.performHapticFeedback(3);
                t8Var.G.a.startAnimation();
                py pyVar = i4Var.g1;
                Random random = pyVar.h;
                FrameLayout frameLayout = pyVar.C;
                ArrayList arrayList2 = pyVar.B;
                if (arrayList2.size() > 12) {
                    return;
                }
                hg.r0 d9 = hg.r0.d(mediaArea.reaction);
                String str = d9.f;
                if (str == null) {
                    str = MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.k5.f(pyVar.b, d9.g));
                }
                float measuredHeight = t8Var.getMeasuredHeight();
                float measuredWidth = t8Var.getMeasuredWidth();
                View view2 = (View) t8Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f11 = 0.4f * view2.getWidth();
                    f10 = f11;
                } else {
                    f10 = measuredHeight;
                    f11 = measuredWidth;
                }
                String q10 = py.q(str);
                int hashCode = t8Var.hashCode();
                boolean z14 = t8Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d9.f != null) {
                    arrayList = arrayList2;
                    boolean d10 = pyVar.d(q10, hashCode, null, null, -1, false, false, f11, f10, z14);
                    i9 = hashCode;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                    f14 = 2.0f;
                    if (d10) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        oy oyVar = (oy) j3.r0.j(1, arrayList);
                        oyVar.getClass();
                        oyVar.e = f13;
                        oyVar.d = f12;
                        oyVar.a = t8Var.getTranslationX() - (oyVar.d / 2.0f);
                        float translationY = t8Var.getTranslationY();
                        float f15 = oyVar.d;
                        oyVar.b = translationY - (1.5f * f15);
                        if (oyVar.m) {
                            oyVar.a = ((-f15) * 1.8f) + oyVar.a;
                            return;
                        } else {
                            oyVar.a = ((-f15) * 0.2f) + oyVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i9 = hashCode;
                    f12 = f11;
                    f13 = f10;
                    z12 = z14;
                    f14 = 2.0f;
                }
                if (d9.g == 0 || t8Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    ArrayList arrayList3 = arrayList;
                    if (((oy) arrayList.get(i10)).k == d9.g) {
                        i11++;
                    }
                    i10++;
                    arrayList = arrayList3;
                }
                ArrayList arrayList4 = arrayList;
                if (i11 >= 4) {
                    return;
                }
                oy oyVar2 = new oy();
                oyVar2.j = hg.d.a(t8Var.getAnimatedEmojiDrawable(), true, true);
                if (!oyVar2.i) {
                    oyVar2.f = ((random.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                    oyVar2.g = ((random.nextInt() % 101) / 100.0f) * (f13 / 4.0f);
                }
                oyVar2.p = i9;
                oyVar2.q = null;
                oyVar2.k = d9.g;
                oyVar2.m = z12;
                oyVar2.e = f13;
                oyVar2.d = f12;
                oyVar2.a = t8Var.getTranslationX() - (oyVar2.d / f14);
                float translationY2 = t8Var.getTranslationY();
                float f16 = oyVar2.d;
                oyVar2.b = translationY2 - (1.5f * f16);
                oyVar2.a = ((-f16) * 1.8f) + oyVar2.a;
                if (pyVar.n) {
                    oyVar2.j.f(frameLayout);
                }
                arrayList4.add(oyVar2);
                return;
            }
            if (this.b == view) {
                AndroidUtilities.runOnUIThread(new g(this, 18), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((g3) this).D.H(new qn(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    ve.e.s(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    ve.e.s(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                m8 m8Var = new m8(3, 0);
                m8Var.A = true;
                m8Var.I0 = this.b.b;
                m8Var.setResourceProvider(this.n);
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
                    m8Var.J0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                m8Var.K0 = false;
                m8Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                ((g3) this).D.H(m8Var);
                this.b = null;
                invalidate();
                return;
            }
            o8 o8Var2 = (o8) view;
            this.a = o8Var2;
            this.b = o8Var2;
            invalidate();
            kh.x3 x3Var = this.c;
            if (x3Var != null) {
                x3Var.e(true);
                this.c = null;
            }
            kh.x3 x3Var2 = new kh.x3(getContext(), 0);
            Paint paint = new Paint(1);
            x3Var2.U = paint;
            paint.setPathEffect(new CornerPathEffect(x3Var2.v));
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new kh.w3(x3Var2, 0));
            x3Var2.T = zVar;
            zVar.setCallback(x3Var2);
            x3Var2.n(0.0f, this.b.getTranslationX() - AndroidUtilities.dp(8.0f));
            x3Var2.d = 5000L;
            this.c = x3Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    x3Var2.q(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.l1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new n8(0), length, spannableStringBuilder.length(), 33);
                    x3Var2.l(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    eq eqVar = new eq(R.drawable.photos_arrow, 0);
                    eqVar.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    eq eqVar2 = new eq(R.drawable.attach_arrow_right, 0);
                    eqVar2.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
                    eqVar2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    x3Var2.t(spannableStringBuilder);
                    x3Var2.h0 = new j7(4, this, x3Var2);
                    float f17 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) AndroidUtilities.dp(f17)) >= ((float) AndroidUtilities.dp(100.0f));
                    x3Var2.a = !z11 ? 1 : 3;
                    o8Var = this.b;
                    if (!(o8Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (o8Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f17) >= AndroidUtilities.dp(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + o8Var.getTranslationY() <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                        x3Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        x3Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f17));
                    } else {
                        x3Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    x3Var2.setOnClickListener(new androidx.mediarouter.app.c(this, 22));
                    x3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.d.addView(x3Var2, g7.e6.c(f17, -1));
                    x3Var2.v();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            eq eqVar3 = new eq(R.drawable.photos_arrow, 0);
            eqVar3.translate(AndroidUtilities.dp(!z10 ? 1.0f : 2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            spannableString3.setSpan(eqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            eq eqVar22 = new eq(R.drawable.attach_arrow_right, 0);
            eqVar22.translate(AndroidUtilities.dp(!z10 ? -1.0f : -2.0f), AndroidUtilities.dp(!z10 ? 0.0f : 1.0f));
            eqVar22.setScale(-1.0f, 1.0f);
            spannableString22.setSpan(eqVar22, 0, spannableString22.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString3);
            x3Var2.t(spannableStringBuilder);
            x3Var2.h0 = new j7(4, this, x3Var2);
            float f172 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) AndroidUtilities.dp(f172)) >= ((float) AndroidUtilities.dp(100.0f))) {
            }
            x3Var2.a = !z11 ? 1 : 3;
            o8Var = this.b;
            if (!(o8Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            x3Var2.setOnClickListener(new androidx.mediarouter.app.c(this, 22));
            x3Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.d.addView(x3Var2, g7.e6.c(f172, -1));
            x3Var2.v();
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i9, i12 - i10);
            } else if (childAt instanceof o8) {
                o8 o8Var = (o8) childAt;
                TL_stories.MediaArea mediaArea = o8Var.b;
                int measuredWidth = o8Var.getMeasuredWidth();
                int measuredHeight = o8Var.getMeasuredHeight();
                o8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                o8Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                o8Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                o8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof p8) {
                p8 p8Var = (p8) childAt;
                TL_stories.MediaArea mediaArea2 = p8Var.a;
                int measuredWidth2 = p8Var.getMeasuredWidth();
                int measuredHeight2 = p8Var.getMeasuredHeight();
                p8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                p8Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                p8Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                p8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof o8) {
                o8 o8Var = (o8) getChildAt(i11);
                o8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((o8Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((o8Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof p8) {
                p8 p8Var = (p8) getChildAt(i11);
                p8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((p8Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((p8Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        kh.x3 x3Var;
        if (getChildCount() == 0 || (x3Var = this.c) == null || !x3Var.R) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            kh.x3 x3Var2 = this.c;
            if (x3Var2 != null) {
                x3Var2.e(true);
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
