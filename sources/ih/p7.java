package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.z10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class p7 {
    public static z10 b;
    public static z10 c;
    public static z10 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static nz0 i;
    public static int j;
    public static BitmapDrawable m;
    public static final z10[] a = new z10[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final androidx.emoji2.text.m o = new androidx.emoji2.text.m(1);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.h5 h5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            h5Var.l(string, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        s9 s9Var = new s9();
        valueOf.setSpan(s9Var, valueOf.length() - 1, valueOf.length(), 0);
        s9Var.a = h5Var;
        s9Var.n = true;
        h5Var.l(valueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || v(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void c(org.telegram.ui.ActionBar.b6 b6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var);
        if (j != v02) {
            j = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness >= 0.721f) {
                e.setColor(i0.a.d(0.2f, v02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                e.setColor(i0.a.d(0.2f, v02, -1));
            } else {
                e.setColor(i0.a.d(0.44f, v02, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        Paint[] paintArr = k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(!z10 ? org.telegram.ui.ActionBar.f6.s8 : org.telegram.ui.ActionBar.f6.M8, b6Var);
        int[] iArr = l;
        if (iArr[z10 ? 1 : 0] != v02) {
            iArr[z10 ? 1 : 0] = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness >= 0.721f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -1));
            } else {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.44f, v02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(int i9, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i9, objArr));
        eq eqVar = new eq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            eqVar.setScale(0.8f, 0.8f);
        } else {
            eqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new eq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z10;
        float f15 = f11 - f10;
        if (f10 >= f12 || f11 >= f12 + f15) {
            f14 = f10;
            z10 = false;
        } else {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z10 = true;
        }
        float max = Math.max(f14, f13);
        float min = Math.min(f11, f12 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z10) {
                return;
            }
            if (f14 <= f12 || f11 >= f13) {
                canvas.drawArc(rectF, f14, f15, false, paint);
            }
        }
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, l7 l7Var) {
        i(j10, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10), l7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0467, code lost:
    
        if (r1 == 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
    
        if (r35.B == 1.0f) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cf A[LOOP:0: B:185:0x04cb->B:187:0x04cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j10, Canvas canvas, ImageReceiver imageReceiver, boolean z10, l7 l7Var) {
        int r10;
        int i9;
        float lerp;
        float f10;
        int i10;
        Canvas canvas2;
        int i11;
        v6 v6Var;
        float f11;
        int i12;
        float f12;
        float f13;
        RectF rectF;
        float f14;
        ImageReceiver imageReceiver2;
        l7 l7Var2;
        boolean z11;
        v6 v6Var2;
        float f15;
        ImageReceiver imageReceiver3;
        l7 l7Var3;
        RectF rectF2;
        float f16;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float dpf2;
        float f17;
        float f18;
        float z12;
        int i13;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float dpf22;
        float f19;
        float z13;
        z10 z10Var;
        float z14;
        v6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z15 = l7Var.b;
        RectF rectF3 = l7Var.F;
        boolean z16 = l7Var.E;
        if (l7Var.x != j10) {
            l7Var.x = j10;
            l7Var.g();
            z15 = false;
        }
        boolean z17 = storiesController.j.get(j10, 0) == 1;
        boolean z18 = ChatObject.isForum(UserConfig.selectedAccount, j10) && !l7Var.D;
        boolean z19 = l7Var.r ? !storiesController.h.isEmpty() : z10;
        if (l7Var.d != null) {
            storiesController.D(l7Var.c, j10);
            z17 = false;
        }
        if (z17) {
            if (storiesController.I(j10)) {
                r10 = 3;
                i9 = 2;
            } else {
                i9 = r(storiesController, j10);
                r10 = 3;
            }
            z15 = false;
        } else if (!z19) {
            r10 = r(storiesController, j10);
            i9 = r10;
        } else if (l7Var.a) {
            r10 = 2;
            i9 = 2;
        } else {
            int D = storiesController.D(l7Var.c, j10);
            i9 = D;
            r10 = D == 0 ? 2 : 1;
        }
        int i14 = l7Var.z;
        if (i14 != 0) {
            r10 = i14;
            i9 = r10;
        }
        int i15 = l7Var.y;
        if (i15 != r10) {
            if (i15 == 3) {
                z15 = true;
            }
            if (r10 == 3) {
                l7Var.q = i9;
                l7Var.t = 0.0f;
            }
            if (z15) {
                l7Var.A = i15;
                l7Var.y = r10;
                l7Var.B = 0.0f;
            } else {
                l7Var.y = r10;
                l7Var.B = 1.0f;
            }
        }
        pc pcVar = l7Var.H;
        float a2 = pcVar != null ? pcVar.a(0.08f) : 1.0f;
        if (l7Var.C != z17 && z17) {
            l7Var.K = 1.0f;
            l7Var.L = false;
        }
        l7Var.C = z17;
        if (l7Var.y == 0 && l7Var.B == 1.0f) {
            imageReceiver.setImageCoords(rectF3);
            canvas.save();
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
            imageReceiver.draw(canvas);
            canvas.restore();
            return;
        }
        int save = canvas.save();
        if (a2 != 1.0f) {
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
        }
        float f20 = storiesController.F(l7Var.x) ? l7Var.e : 0.0f;
        float f21 = l7Var.B;
        if (f21 != 1.0f) {
            f21 = gr.f.getInterpolation(f21);
        }
        float f22 = f21;
        if (!z16 || l7Var.v) {
            int i16 = l7Var.A;
            int i17 = l7Var.q;
            if (i16 == 3) {
                i16 = i17;
            }
            int dp = i16 == 2 ? AndroidUtilities.dp(3.0f) : i16 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            int i18 = l7Var.y;
            int i19 = l7Var.q;
            if (i18 == 3) {
                i18 = i19;
            }
            lerp = AndroidUtilities.lerp(dp, i18 == 2 ? AndroidUtilities.dp(3.0f) : i18 == 1 ? AndroidUtilities.dp(4.0f) : 0, l7Var.B);
        } else {
            lerp = 0.0f;
        }
        RectF rectF4 = n;
        if (lerp == 0.0f) {
            imageReceiver.setImageCoords(rectF3);
        } else {
            rectF4.set(rectF3);
            rectF4.inset(lerp, lerp);
            imageReceiver.setImageCoords(rectF4);
        }
        if (f20 > 0.0f) {
            f13 = 1.0f;
            f10 = lerp;
            rectF = rectF4;
            i10 = i9;
            v6Var = storiesController;
            i11 = save;
            f11 = f20;
            i12 = 3;
            f12 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - AndroidUtilities.dp(15.0f), rectF4.top - AndroidUtilities.dp(15.0f), rectF4.right + AndroidUtilities.dp(15.0f), rectF4.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f10 = lerp;
            i10 = i9;
            canvas2 = canvas;
            i11 = save;
            v6Var = storiesController;
            f11 = f20;
            i12 = 3;
            f12 = 0.08f;
            f13 = 1.0f;
            rectF = rectF4;
        }
        int i20 = l7Var.A;
        z10[] z10VarArr = a;
        if ((i20 == 1 && l7Var.B != f13) || l7Var.y == 1) {
            if (i10 == 2) {
                o(imageReceiver);
                z10Var = b;
            } else if (i10 == i12) {
                q(imageReceiver);
                z10Var = c;
            } else {
                t(imageReceiver, z16);
                z10Var = z10VarArr[z16 ? 1 : 0];
            }
            boolean z20 = l7Var.A == 1 && l7Var.B != f13;
            float f23 = (!z16 || l7Var.v) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z20) {
                z14 = (AndroidUtilities.dp(5.0f) * f22) + f23;
                z10Var.c.setAlpha((int) ((f13 - f22) * l7Var.u * 255.0f));
            } else {
                z10Var.c.setAlpha((int) (l7Var.u * 255.0f * f22));
                z14 = e2.c.z(1.0f, f22, AndroidUtilities.dp(5.0f), f23);
            }
            float f24 = z14 + l7Var.G;
            rectF.set(rectF3);
            rectF.inset(f24, f24);
            imageReceiver.getParentView();
            j(canvas2, l7Var, z10Var.c, z18);
        }
        int i21 = l7Var.A;
        Paint[] paintArr = k;
        if (i21 == 2) {
            f14 = 1.0f;
        } else {
            f14 = 1.0f;
        }
        if (l7Var.y != 2) {
            imageReceiver2 = imageReceiver;
            l7Var2 = l7Var;
            z11 = z18;
            v6Var2 = v6Var;
            f15 = 2.7f;
            if ((l7Var2.A == i12 || l7Var2.B == 1.0f) && l7Var2.y != i12) {
                imageReceiver3 = imageReceiver2;
                l7Var3 = l7Var2;
            } else {
                if (l7Var2.q == 1) {
                    t(imageReceiver2, z16);
                    paint = z10VarArr[z16 ? 1 : 0].c;
                } else if (z16) {
                    d(l7Var2.J, l7Var2.o);
                    paint = paintArr[l7Var2.o ? 1 : 0];
                } else {
                    c(l7Var2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f22 * 255.0f));
                if (l7Var2.a) {
                    paint2 = t(imageReceiver2, z16);
                    paint2.setAlpha((int) (l7Var2.u * 255.0f));
                    Paint o6 = o(imageReceiver2);
                    o6.setAlpha((int) (l7Var2.u * 255.0f));
                    Paint q10 = q(imageReceiver2);
                    q10.setAlpha((int) (l7Var2.u * 255.0f));
                    c(l7Var2.J);
                    paint4 = o6;
                    paint3 = q10;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (l7Var2.a) {
                    if (z16 && !l7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(3.5f);
                        f17 = -dpf2;
                    }
                    f17 = 0.0f;
                } else {
                    if (z16 && !l7Var2.v) {
                        dpf2 = AndroidUtilities.dpf2(f15);
                        f17 = -dpf2;
                    }
                    f17 = 0.0f;
                }
                if (l7Var2.A != i12 || l7Var2.B == 1.0f) {
                    paint.setAlpha((int) (l7Var2.u * 255.0f * f22));
                    f18 = 1.0f;
                    z12 = e2.c.z(1.0f, f22, AndroidUtilities.dp(5.0f), f17);
                } else {
                    z12 = (AndroidUtilities.dp(7.0f) * f22) + f17;
                    paint.setAlpha((int) ((1.0f - f22) * l7Var2.u * 255.0f));
                    f18 = 1.0f;
                }
                float f25 = z12 + l7Var2.G;
                rectF.set(rectF3);
                rectF.inset(f25, f25);
                boolean z21 = l7Var2.a;
                if (z21 && l7Var2.y == i12) {
                    float f26 = l7Var2.t;
                    if (f26 != f18) {
                        float f27 = f26 + f12;
                        l7Var2.t = f27;
                        if (f27 > f18) {
                            l7Var2.t = f18;
                        }
                        float f28 = l7Var2.e;
                        l7Var2.e = f18 - l7Var2.t;
                        m(canvas2, v6Var2, imageReceiver2, l7Var2, paint, paint2, paint3, paint4, z11);
                        imageReceiver3 = imageReceiver2;
                        l7Var3 = l7Var2;
                        l7Var3.e = f28;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                }
                l7Var3 = l7Var2;
                Paint paint9 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z21) {
                    int D2 = v6Var2.D(0, l7Var3.x);
                    if (D2 == 2) {
                        paint2 = paint9;
                    } else if (D2 == i12) {
                        paint2 = paint3;
                    }
                    View parentView = imageReceiver3.getParentView();
                    if (l7Var3.L) {
                        float f29 = l7Var3.K - 0.016f;
                        l7Var3.K = f29;
                        if (f29 < 0.0f) {
                            l7Var3.K = 0.0f;
                            l7Var3.L = true;
                            l7Var3.M += 1.152f;
                            parentView.invalidate();
                            if (l7Var3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, l7Var3.M, l7Var3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, l7Var3.M + 360.0f, l7Var3.K * (-360.0f), false, paint2);
                            }
                            for (i13 = 0; i13 < 16; i13++) {
                                float f30 = (i13 * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, l7Var3.M + f30, ((22.5f + f30) - 10.0f) - f30, false, paint2);
                            }
                            canvas2 = canvas;
                            imageReceiver3.draw(canvas2);
                            l7Var3.w = f11 > 0.5f;
                            if (f20 > 0.0f) {
                                float f31 = f10 + l7Var3.G;
                                rectF2.set(rectF3);
                                rectF2.inset(f31, f31);
                                k(canvas2, rectF2, f11, imageReceiver3.getVisible(), 0.0f);
                            }
                            f16 = l7Var3.B;
                            if (f16 != 1.0f) {
                                float f32 = (AndroidUtilities.screenRefreshTime / 250.0f) + f16;
                                l7Var3.B = f32;
                                if (f32 > 1.0f) {
                                    l7Var3.B = 1.0f;
                                }
                                if (imageReceiver3.getParentView() != null) {
                                    imageReceiver3.invalidate();
                                    imageReceiver3.getParentView().invalidate();
                                }
                            }
                            if (i11 != 0) {
                                canvas2.restoreToCount(i11);
                                return;
                            }
                            return;
                        }
                    } else {
                        float f33 = l7Var3.K + 0.016f;
                        l7Var3.K = f33;
                        if (f33 >= 1.0f) {
                            l7Var3.K = 1.0f;
                            l7Var3.L = false;
                        }
                    }
                    l7Var3.M += 1.152f;
                    parentView.invalidate();
                    if (l7Var3.L) {
                    }
                    while (i13 < 16) {
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    l7Var3.w = f11 > 0.5f;
                    if (f20 > 0.0f) {
                    }
                    f16 = l7Var3.B;
                    if (f16 != 1.0f) {
                    }
                    if (i11 != 0) {
                    }
                }
                paint2 = paint;
                View parentView2 = imageReceiver3.getParentView();
                if (l7Var3.L) {
                }
                l7Var3.M += 1.152f;
                parentView2.invalidate();
                if (l7Var3.L) {
                }
                while (i13 < 16) {
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                l7Var3.w = f11 > 0.5f;
                if (f20 > 0.0f) {
                }
                f16 = l7Var3.B;
                if (f16 != 1.0f) {
                }
                if (i11 != 0) {
                }
            }
            rectF2 = rectF;
            imageReceiver3.draw(canvas2);
            l7Var3.w = f11 > 0.5f;
            if (f20 > 0.0f) {
            }
            f16 = l7Var3.B;
            if (f16 != 1.0f) {
            }
            if (i11 != 0) {
            }
        }
        boolean z22 = i21 == 2 && l7Var.B != f14;
        if (z16) {
            d(l7Var.J, l7Var.o);
            paint5 = paintArr[l7Var.o ? 1 : 0];
        } else {
            c(l7Var.J);
            paint5 = e;
        }
        Paint paint10 = paint5;
        if (l7Var.a) {
            Paint t10 = t(imageReceiver, z16);
            t10.setAlpha((int) (l7Var.u * 255.0f));
            paint6 = o(imageReceiver);
            paint6.setAlpha((int) (l7Var.u * 255.0f));
            Paint q11 = q(imageReceiver);
            q11.setAlpha((int) (l7Var.u * 255.0f));
            c(l7Var.J);
            paint8 = q11;
            paint7 = t10;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (l7Var.a) {
            if (z16 && !l7Var.v) {
                dpf22 = AndroidUtilities.dpf2(3.5f);
                f19 = -dpf22;
            }
            f19 = 0.0f;
        } else {
            if (z16 && !l7Var.v) {
                dpf22 = AndroidUtilities.dpf2(2.7f);
                f19 = -dpf22;
            }
            f19 = 0.0f;
        }
        if (z22) {
            z13 = (AndroidUtilities.dp(5.0f) * f22) + f19;
            paint10.setAlpha((int) (l7Var.u * 255.0f * (1.0f - f22)));
            f15 = 2.7f;
        } else {
            paint10.setAlpha((int) (l7Var.u * 255.0f * f22));
            f15 = 2.7f;
            z13 = e2.c.z(1.0f, f22, AndroidUtilities.dp(5.0f), f19);
        }
        float f34 = z13 + l7Var.G;
        rectF.set(rectF3);
        rectF.inset(f34, f34);
        if (l7Var.a) {
            imageReceiver2 = imageReceiver;
            v6Var2 = v6Var;
            Paint paint11 = paint6;
            l7Var2 = l7Var;
            z11 = z18;
            m(canvas2, v6Var2, imageReceiver2, l7Var2, paint10, paint7, paint8, paint11, z11);
        } else {
            imageReceiver2 = imageReceiver;
            l7Var2 = l7Var;
            z11 = z18;
            v6Var2 = v6Var;
            imageReceiver2.getParentView();
            j(canvas2, l7Var2, paint10, z11);
        }
        if (l7Var2.A == i12) {
        }
        imageReceiver3 = imageReceiver2;
        l7Var3 = l7Var2;
        rectF2 = rectF;
        imageReceiver3.draw(canvas2);
        l7Var3.w = f11 > 0.5f;
        if (f20 > 0.0f) {
        }
        f16 = l7Var3.B;
        if (f16 != 1.0f) {
        }
        if (i11 != 0) {
        }
    }

    public static void j(Canvas canvas, l7 l7Var, Paint paint, boolean z10) {
        RectF rectF = n;
        if (z10) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f10 = l7Var.f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f10, boolean z10, float f11) {
        Canvas canvas2;
        if (i == null) {
            i = new nz0(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (g == null) {
            Paint paint = new Paint(1);
            g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f == null) {
            f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.f6.l1(f10, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f11);
        float l10 = i.l() + lerp + lerp;
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f11);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f12 = l10 / 2.0f;
        float f13 = 0.8f * lerp2;
        float f14 = lerp2 * 0.2f;
        f.set((rectF.centerX() - f12) - dp, (rectF.bottom - f13) - dp, rectF.centerX() + f12 + dp, rectF.bottom + f14 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        canvas.scale(lerp3, lerp3, f.centerX(), f.centerY());
        AndroidUtilities.scaleRect(f, f10);
        RectF rectF2 = f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f.height() / 2.0f, g);
        if (z10) {
            f.set(rectF.centerX() - f12, rectF.bottom - f13, rectF.centerX() + f12, rectF.bottom + f14);
            RectF rectF3 = f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, h);
            nz0 nz0Var = i;
            RectF rectF4 = f;
            canvas2 = canvas;
            nz0Var.c(rectF4.left + lerp, rectF4.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, l7 l7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!l7Var.k) {
            if (l7Var.l) {
                float f14 = l7Var.f;
                g(canvas, rectF, paint, f10, f11, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
                return;
            } else if (f10 < 90.0f) {
                g(canvas, rectF, paint, f10, f11, l7Var.g, l7Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f10, f11, -l7Var.i, l7Var.j);
                return;
            }
        }
        boolean z11 = l7Var.m;
        if (!z11 && !l7Var.l) {
            if (f10 < 90.0f) {
                float f15 = l7Var.f;
                g(canvas, rectF, paint, f10, f11, (-f15) / 2.0f, f15 / 2.0f);
                return;
            } else {
                float f16 = l7Var.f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
                return;
            }
        }
        if (l7Var.l) {
            float f17 = l7Var.f;
            g(canvas, rectF, paint, f10, f11, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (!z11) {
            canvas.drawArc(rectF, f10, f11 - f10, false, paint);
        } else {
            float f18 = l7Var.f;
            g(canvas, rectF, paint, f10, f11, (-f18) / 2.0f, f18 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
    
        if (r4 == 1) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, v6 v6Var, ImageReceiver imageReceiver, l7 l7Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z10) {
        Paint paint5;
        RectF rectF;
        int max;
        Paint paint6;
        l7 l7Var2 = l7Var;
        org.telegram.ui.ActionBar.b6 b6Var = l7Var2.J;
        boolean z11 = l7Var2.E;
        c(b6Var);
        d(l7Var2.J, l7Var2.o);
        long j10 = l7Var2.s;
        int i9 = 0;
        int D = j10 != 0 ? v6Var.D(0, j10) : v6Var.D(0, l7Var2.x);
        int i10 = 2;
        l7Var2.n = D == 0 ? 2 : 1;
        TL_stories.PeerStories y10 = v6Var.y(l7Var2.x);
        ArrayList arrayList = v6Var.h;
        if (y10 == null) {
            y10 = v6Var.z(l7Var2.x);
        }
        TL_stories.PeerStories peerStories = y10;
        int size = l7Var2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (D == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (D == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (D == 1) {
            t(imageReceiver, z11);
            paint5 = a[z11 ? 1 : 0].c;
        } else {
            paint5 = z11 ? paintArr[l7Var2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j11 = l7Var2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) v6Var.i.f(j11);
            if (peerStories2 == null) {
                peerStories2 = v6Var.z(j11);
            }
            if (peerStories2 != null) {
                if (j11 != UserConfig.getInstance(v6Var.a).getClientUserId() || Utilities.isNullOrEmpty((Collection) v6Var.b.f(j11))) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        TL_stories.StoryItem storyItem = peerStories2.stories.get(i11);
                        if (storyItem != null) {
                            if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                i9 = 2;
                                break;
                            } else if (storyItem.id > peerStories2.max_read_id) {
                                break;
                            }
                        }
                        i11++;
                    }
                }
                i9 = 1;
            }
            Paint paint8 = i9 == 2 ? paint3 : paint7 == b.c ? paint4 : i9 == 1 ? paint2 : paint;
            l(canvas, rectF2, paint8, -90.0f, 90.0f, l7Var2, z10);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, l7Var, z10);
            float f10 = l7Var.e;
            if (f10 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f10) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, l7Var, z10);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, l7Var, z10);
            paint7.setAlpha(255);
            return;
        }
        Paint paint9 = paint7;
        float f11 = 360.0f / size;
        float f12 = (size > 20 ? 3 : 5) * l7Var2.e;
        float f13 = f12 > f11 ? 0.0f : f12;
        if (l7Var2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, v6Var.f.get(l7Var2.x, 0));
        }
        int i12 = 0;
        while (i12 < size) {
            Paint paint10 = z11 ? paintArr[l7Var2.o ? 1 : 0] : e;
            if (l7Var2.r) {
                int D2 = v6Var.D(i9, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((size - 1) - i12)).peer));
                if (D2 == i10) {
                    paint10 = paint4;
                } else {
                    if (D2 != 3) {
                    }
                    paint10 = paint3;
                }
            } else {
                if (i12 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i12).justUploaded || peerStories.stories.get(i12).id > max) {
                        if (!(peerStories.stories.get(i12).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                            if (peerStories.stories.get(i12).close_friends) {
                                paint10 = paint4;
                            }
                        }
                        paint10 = paint3;
                    }
                }
                paint10 = paint2;
            }
            float f14 = (i12 * f11) - 90.0f;
            float f15 = f14 + f11;
            float f16 = f14 + f13;
            float f17 = f15 - f13;
            Paint paint11 = paint9;
            int i13 = max;
            int i14 = i12;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f16, f17, l7Var, z10);
            RectF rectF4 = rectF3;
            if (l7Var.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - l7Var.e) * 255.0f));
                l(canvas, rectF4, paint11, f16, f17, l7Var, z10);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(255);
            }
            i12 = i14 + 1;
            l7Var2 = l7Var;
            rectF = rectF4;
            paint9 = paint6;
            max = i13;
            i9 = 0;
            i10 = 2;
        }
    }

    public static m7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        v6 v6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i9 = v6Var.f.get(DialogObject.getPeerDialogId(peerStories.peer));
        int i10 = 0;
        while (true) {
            if (i10 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i10).id > i9) {
                storyItem = peerStories.stories.get(i10);
                break;
            }
            i10++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
        } else {
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
            if (pathToAttach2 != null && pathToAttach2.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
            if (pathToAttach3 != null) {
                try {
                    int lastIndexOf = pathToAttach3.getName().lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        File file = new File(pathToAttach3.getParentFile(), pathToAttach3.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        m7 m7Var = new m7();
        m7Var.d = false;
        m7Var.a = peerDialogId;
        m7Var.b = v6Var;
        m7Var.c = new j7(0, m7Var, runnable);
        Runnable[] runnableArr = {r2};
        j7 j7Var = new j7(runnableArr, m7Var);
        AndroidUtilities.runOnUIThread(j7Var, 3000L);
        k7 k7Var = new k7(runnableArr, m7Var);
        m7Var.e = k7Var;
        k7Var.setAllowLoadingOnAttachedOnly(true);
        m7Var.e.onAttachedToWindow();
        String s10 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                m7Var.c.run();
                return null;
            }
            m7Var.e.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
        } else {
            m7Var.e.setImage(ImageLocation.getForDocument(document), ta.b.j(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return m7Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            z10 z10Var = new z10();
            b = z10Var;
            z10Var.a = true;
            z10Var.b = true;
            z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.mk, false), 0, 0);
            b.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return b.c;
    }

    public static Drawable p() {
        if (m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            m = new BitmapDrawable(createBitmap);
        }
        return m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            z10 z10Var = new z10();
            c = z10Var;
            z10Var.a = true;
            z10Var.b = true;
            z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ok, false), 0, 0);
            c.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return c.c;
    }

    public static int r(v6 v6Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j10 == 0) {
            return 0;
        }
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
            if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
                return 0;
            }
            int i9 = v6Var.f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = chat.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i9 ? 1 : 2;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
        if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
            return 0;
        }
        int i10 = v6Var.f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i10 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return e2.c.l(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        z10[] z10VarArr = a;
        if (z10VarArr[z10 ? 1 : 0] == null) {
            z10 z10Var = new z10();
            z10VarArr[z10 ? 1 : 0] = z10Var;
            z10Var.a = true;
            z10Var.b = true;
            if (z10) {
                z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kk, false), 0, 0);
            } else {
                z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ik, false), 0, 0);
            }
            z10VarArr[z10 ? 1 : 0].c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            z10VarArr[z10 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            z10VarArr[z10 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        z10VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return z10VarArr[z10 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        s9 s9Var = new s9();
        valueOf.setSpan(s9Var, valueOf.length() - 1, valueOf.length(), 0);
        s9Var.a = textView;
        s9Var.n = false;
        return valueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i9, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i9).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new r9(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.d(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new r9(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new r9(storyItem));
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
