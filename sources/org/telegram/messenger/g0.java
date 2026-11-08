package org.telegram.messenger;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.PictureInPictureParams;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.StateSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.view.inspector.WindowInspector;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cq0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn0;
import org.telegram.ui.v71;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final int C;
    public static boolean D;
    public static boolean E;
    public static AccessibilityManager I;
    public static Vibrator J;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;
    public static final Pattern V;
    public static final Pattern W;
    public static Typeface a;
    public static final int[] a0;
    public static final int[] b0;
    public static final f c0;
    public static CallReceiver d0;
    public static float e;
    public static Pattern e0;
    public static SimpleDateFormat f0;
    public static final String[] g0;
    public static final float[] h0;
    public static WeakReference i;
    public static final float[] i0;
    public static final char[] j0;
    public static HashSet k0;
    public static HashMap l0;
    public static boolean m0;
    public static Pattern n0;
    public static boolean o;
    public static final Paint o0;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static boolean y;
    public static final ThreadLocal b = new ThreadLocal();
    public static final ThreadLocal c = new ThreadLocal();
    public static final Hashtable d = new Hashtable();
    public static int f = -10;
    public static int g = -10;
    public static int h = -10;
    public static boolean j = false;
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static int m = 0;
    public static int n = 0;
    public static float p = 1.0f;
    public static final Point q = new Point();
    public static float r = 60.0f;
    public static float s = 60.0f;
    public static float t = 16.666666f;
    public static Integer z = null;
    public static Integer A = null;
    public static final DisplayMetrics B = new DisplayMetrics();
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public static final AccelerateInterpolator G = new AccelerateInterpolator();
    public static final OvershootInterpolator H = new OvershootInterpolator();
    public static Boolean K = null;
    public static Boolean L = null;
    public static Boolean M = null;
    public static int N = 0;
    public static int O = 0;
    public static final RectF P = new RectF();
    public static final Rect Q = new Rect();
    public static final int[] R = new int[2];
    public static Pattern X = null;
    public static final Paint Y = new Paint(1);
    public static final Paint Z = new Paint(1);

    static {
        S = null;
        T = null;
        U = null;
        V = null;
        W = null;
        try {
            T = Pattern.compile("[─-◿]");
            Pattern.compile("[一-\u9fff]");
            V = Pattern.compile("[̀-ͯ\u2066-\u2067]");
            U = Pattern.compile("[\u2066-\u2067]+");
            W = Pattern.compile("([\\u0300-\\u036f]{1,2})[\\u0300-\\u036f]+");
            S = Pattern.compile("((?:(http|https|Http|Https|ton|tg|tonsite):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-\ufdcfﷰ-\uffef]{2,63}|" + Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))") + ")") + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        C = Q1() ? 80 : 72;
        v(t0.b, null);
        a0 = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        b0 = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        c0 = new f();
        g0 = new String[]{"", "K", "M", "B", "T", "P"};
        h0 = new float[9];
        i0 = new float[9];
        j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        o0 = new Paint(1);
    }

    public static int A(int i7, int i10) {
        if (i7 == i10) {
            return 0;
        }
        return i7 > i10 ? 1 : -1;
    }

    public static void A0(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView == null || t0.d == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        PixelCopy.request(surfaceView, bitmap, new p(runnable, 2), t0.d);
    }

    public static int A1(String str, String str2) {
        if (str2.isEmpty() || str.isEmpty()) {
            return str.indexOf(str2);
        }
        for (int i7 = 0; i7 < str.length() && str2.length() + i7 <= str.length(); i7++) {
            int i10 = 0;
            for (int i11 = i7; i11 < str.length() && i10 < str2.length() && Character.toLowerCase(str.charAt(i11)) == Character.toLowerCase(str2.charAt(i10)); i11++) {
                i10++;
            }
            if (i10 == str2.length()) {
                return i7;
            }
        }
        return -1;
    }

    public static void A2(List list) {
        if (Build.VERSION.SDK_INT <= 23 || list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Bitmap bitmap = (Bitmap) list.get(i7);
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList.add(new WeakReference(bitmap));
            }
        }
        i3(new k(1, arrayList), 36L);
    }

    public static void A3(org.telegram.ui.r2 r2Var, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            r2Var.setEdgeEffectColor(i7);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(r2Var);
            if (edgeEffect != null) {
                edgeEffect.setColor(i7);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(r2Var);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i7);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static float B(int i7) {
        return com.google.android.recaptcha.internal.a.y(Color.blue(i7), 0.0722f, (Color.green(i7) * 0.7152f) + (Color.red(i7) * 0.2126f), 255.0f);
    }

    public static Bitmap B0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.messenger.n
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i7) {
                    boolean[] zArr2 = zArr;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    zArr2[0] = i7 == 0;
                    countDownLatch2.countDown();
                }
            }, Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static boolean B1(int i7, int i10, int i11, int i12) {
        return Math.max(i7, i10) > Math.min(i11, i12) && Math.max(i11, i12) > Math.min(i7, i10);
    }

    public static void B2(Activity activity, int i7) {
        if (activity == null || Q1() || N != i7) {
            return;
        }
        activity.getWindow().setSoftInputMode(32);
    }

    public static void B3(View view, int i7, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin == i7 && marginLayoutParams.topMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.bottomMargin == i12) {
                return;
            }
            marginLayoutParams.leftMargin = i7;
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.rightMargin = i11;
            marginLayoutParams.bottomMargin = i12;
            view.requestLayout();
        }
    }

    public static CharSequence C(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i7 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i7 < length) {
                    CharSequence charSequence2 = charSequenceArr[i7];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i7++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i7 < length2) {
            sb2.append(charSequenceArr[i7]);
            i7++;
        }
        return sb2.toString();
    }

    public static Uri C0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File E0 = E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        File file = new File(E0, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 87, fileOutputStream);
                fileOutputStream.close();
                Context context = t0.b;
                t0.d();
                Uri d2 = FileProvider.d(context, "org.telegram.messenger.beta.provider", file);
                fileOutputStream.close();
                return d2;
            } finally {
            }
        } catch (Exception e11) {
            a8.g(e11, true);
            return null;
        }
    }

    public static boolean C1() {
        if (I == null) {
            I = (AccessibilityManager) t0.b.getSystemService("accessibility");
        }
        return I.isEnabled() && I.isTouchExplorationEnabled();
    }

    public static void C2(Activity activity, int i7) {
        if (activity != null && O == i7) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void C3(c5.k kVar, int i7) {
        try {
            Field declaredField = c5.k.class.getDeclaredField("f0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(kVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i7);
            }
            Field declaredField2 = c5.k.class.getDeclaredField("g0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(kVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i7);
            }
        } catch (Exception unused) {
        }
    }

    public static void D(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[TLObject.FLAG_12];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                outputStream.close();
                return;
            } else {
                Thread.yield();
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static String D0() {
        String str;
        try {
            PackageInfo packageInfo = t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0);
            int i7 = packageInfo.versionCode;
            int i10 = i7 / 10;
            int i11 = i7 % 10;
            if (i11 == 1 || i11 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                t0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return id.a0("TelegramVersion", null, 2131744213, "v" + packageInfo.versionName + " (" + i10 + ") " + str);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static boolean D1(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        return tL_chatBannedRights == null || Math.abs(((long) tL_chatBannedRights.until_date) - (System.currentTimeMillis() / 1000)) > 157680000;
    }

    public static String D2(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        Pattern pattern = W;
        return (pattern == null || (matcher = pattern.matcher(str)) == null) ? str : matcher.replaceAll("$1");
    }

    public static void D3(boolean z9) {
        synchronized (l) {
            try {
                try {
                    if (z9) {
                        if (d0 == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = t0.b;
                                CallReceiver callReceiver = new CallReceiver();
                                d0 = callReceiver;
                                context.registerReceiver(callReceiver, intentFilter, 4);
                            } else {
                                Context context2 = t0.b;
                                CallReceiver callReceiver2 = new CallReceiver();
                                d0 = callReceiver2;
                                context2.registerReceiver(callReceiver2, intentFilter);
                            }
                        }
                    } else if (d0 != null) {
                        t0.b.unregisterReceiver(d0);
                        d0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean E(File file, File file2) {
        if (file.equals(file2)) {
            return true;
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static File E0() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e10) {
            a8.g(e10, true);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            a8.b("external dir mounted");
            try {
                File[] externalCacheDirs = t0.b.getExternalCacheDirs();
                int i7 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(iz.h0)) {
                    while (true) {
                        if (i7 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i7];
                            if (file2 != null && file2.getAbsolutePath().startsWith(iz.h0)) {
                                file = externalCacheDirs[i7];
                                break;
                            }
                            i7++;
                        } else {
                            break;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("check dir ");
                if (file != null) {
                    str2 = file.getPath();
                }
                sb2.append(str2);
                sb2.append(" ");
                a8.b(sb2.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    a8.b("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        try {
            File cacheDir = t0.b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            File filesDir = t0.b.getFilesDir();
            if (filesDir != null) {
                File file3 = new File(filesDir, "cache/");
                file3.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file3;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static boolean E1(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return E1(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static void E2(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void E3(boolean z9) {
        synchronized (k) {
            try {
                j = z9;
                if (z9) {
                    try {
                        m7.a aVar = new m7.a(t0.b, b6.a.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
                        com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                        b10.c = new sa.d(aVar, 14);
                        b10.d = new n6.c[]{m7.b.a};
                        b10.a = 1567;
                        aVar.e(1, b10.a()).addOnSuccessListener(new ni.a(11));
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void F(File file, File file2) {
        try {
            E(file, file2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static int F0(int i7, int i10) {
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        int red2 = Color.red(i10);
        int i11 = (red + red2) / 2;
        int i12 = red - red2;
        int green2 = green - Color.green(i10);
        int blue2 = blue - Color.blue(i10);
        return (green2 * 4 * green2) + ((((i11 + 512) * i12) * i12) >> 8) + ((((767 - i11) * blue2) * blue2) >> 8);
    }

    public static boolean F1(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.ENOSPC) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device");
    }

    public static String F2(String str) {
        if (str == null) {
            return null;
        }
        if (X == null) {
            X = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
        }
        Matcher matcher = X.matcher(str);
        return matcher == null ? str : matcher.replaceAll("");
    }

    public static void F3(View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.shake_animation);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(view, 0));
        ofFloat.addListener(new di.l2(2, view));
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.shake_animation, ofFloat);
    }

    public static void G(File file) {
        try {
            if (file.exists()) {
                return;
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th2) {
            a8.g(th2, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:3:0x0002, B:5:0x0015, B:7:0x0019, B:8:0x001f, B:10:0x0025, B:11:0x0048, B:13:0x0052, B:16:0x006b, B:18:0x0071, B:19:0x0075, B:21:0x007b, B:25:0x008b, B:27:0x0091, B:30:0x009a, B:32:0x0084, B:35:0x0063, B:36:0x00a3, B:39:0x002a, B:41:0x0030, B:43:0x0034, B:44:0x003a, B:46:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:3:0x0002, B:5:0x0015, B:7:0x0019, B:8:0x001f, B:10:0x0025, B:11:0x0048, B:13:0x0052, B:16:0x006b, B:18:0x0071, B:19:0x0075, B:21:0x007b, B:25:0x008b, B:27:0x0091, B:30:0x009a, B:32:0x0084, B:35:0x0063, B:36:0x00a3, B:39:0x002a, B:41:0x0030, B:43:0x0034, B:44:0x003a, B:46:0x0040), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] G0() {
        String str;
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) t0.b.getSystemService("input_method");
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            String str2 = null;
            if (currentInputMethodSubtype != null) {
                str = Build.VERSION.SDK_INT >= 24 ? currentInputMethodSubtype.getLanguageTag() : null;
                if (TextUtils.isEmpty(str)) {
                    str = currentInputMethodSubtype.getLocale();
                }
            } else {
                InputMethodSubtype lastInputMethodSubtype = inputMethodManager.getLastInputMethodSubtype();
                if (lastInputMethodSubtype != null) {
                    String languageTag = Build.VERSION.SDK_INT >= 24 ? lastInputMethodSubtype.getLanguageTag() : null;
                    str = TextUtils.isEmpty(languageTag) ? lastInputMethodSubtype.getLocale() : languageTag;
                } else {
                    str = null;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return new String[]{str.replace('_', '-')};
            }
            String Q0 = id.Q0();
            fd fdVar = id.E0().B;
            String str3 = fdVar.e;
            String replace = str3 == null ? "" : str3.replace("_", "-");
            boolean isEmpty = TextUtils.isEmpty(replace);
            String str4 = replace;
            if (isEmpty) {
                str4 = fdVar.c();
            }
            if (!Q0.contains(str4) && !str4.contains(Q0)) {
                str2 = str4;
                return TextUtils.isEmpty(str2) ? new String[]{Q0.replace('_', '-'), str2} : new String[]{Q0.replace('_', '-')};
            }
            if (!Q0.contains("en")) {
                str2 = "en";
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (Exception unused) {
            return new String[]{"en"};
        }
    }

    public static boolean G1(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.EROFS) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system");
    }

    public static SpannableStringBuilder G2(SpannableStringBuilder spannableStringBuilder, float f10, float f11) {
        return J2(spannableStringBuilder, true, f10, f11, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    public static void G3(float f10, View view, Runnable runnable) {
        if (view == null) {
            return;
        }
        int L2 = L(f10);
        if (view.getTag(R.id.spring_tag) != null) {
            ((r1.g) view.getTag(R.id.spring_tag)).d();
        }
        Float f11 = (Float) view.getTag(R.id.spring_was_translation_x_tag);
        if (f11 != null) {
            view.setTranslationX(f11.floatValue());
        }
        view.setTag(R.id.spring_was_translation_x_tag, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        r1.g gVar = new r1.g(view, r1.g.o, translationX);
        r1.h hVar = new r1.h(translationX);
        hVar.b(600.0f);
        gVar.m = hVar;
        gVar.a = (-L2) * 100;
        gVar.a(new fi.h3(translationX, view, runnable));
        view.setTag(R.id.spring_tag, gVar);
        gVar.h();
    }

    public static byte[] H(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        while (i7 < bArr.length) {
            byte b10 = bArr[i7];
            if (b10 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i7 + 1], 16);
                    i7 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i7], 16)));
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i7++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e11) {
            a8.g(e11, true);
            return byteArray;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r9.startsWith("file://") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        if (r8 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String H0(Context context, Uri uri, String str, String[] strArr) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (!string.startsWith("content://")) {
                            if (!string.startsWith("/")) {
                            }
                            query.close();
                            return string;
                        }
                        query.close();
                        return null;
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean H1(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode();
    }

    public static SpannableStringBuilder H2(CharSequence charSequence, boolean z9) {
        return J2(charSequence, z9, L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    public static void H3(View view) {
        G3(10.0f, view, null);
    }

    public static float I(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public static i0.b I0(r0.k1 k1Var, boolean z9) {
        i0.b g10 = k1Var.a.g(647);
        r0.h1 h1Var = k1Var.a;
        i0.b a10 = i0.b.a(g10, h1Var.f(647));
        return z9 ? i0.b.a(a10, h1Var.f(8)) : a10;
    }

    public static boolean I1(Uri uri, int i7) {
        String str;
        if (uri == null) {
            str = "";
            int i10 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlinkFd = Utilities.readlinkFd(i7);
                    if (readlinkFd != null && !readlinkFd.equals(str)) {
                        i10++;
                        if (i10 >= 10) {
                            return true;
                        }
                        str = readlinkFd;
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
            return true;
        }
        str = uri.getPath();
        if (str == null) {
            return false;
        }
        if (str.matches(Pattern.quote(new File(t0.b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
            return false;
        }
        int i11 = 0;
        while (str.length() <= 4096) {
            try {
                String readlink = Utilities.readlink(str);
                if (readlink != null && !readlink.equals(str)) {
                    i11++;
                    if (i11 >= 10) {
                        return true;
                    }
                    str = readlink;
                }
            } catch (Throwable unused2) {
                return true;
            }
        }
        return true;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath != null) {
                str = canonicalPath;
            }
        } catch (Exception unused3) {
            str.replace("/./", "/");
        }
        if (str.endsWith(".attheme")) {
            return false;
        }
        return str.toLowerCase().contains("/data/data/" + t0.b.getPackageName());
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, boolean z9, float f10, float f11) {
        return J2(charSequence, z9, f10, f11, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r1 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean I3() {
        boolean z9;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            if (as.j()) {
                if ((!as.j() ? 0 : as.i) == 40000) {
                    z9 = true;
                }
            }
            z9 = false;
        }
        return i7 < 32;
    }

    public static void J(View view, Runnable runnable) {
        if (view == null) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new u(view, runnable));
        }
    }

    public static int J0(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            for (int i14 = 0; i14 < 10; i14++) {
                int pixel = bitmap.getPixel((int) (i13 * width), (int) (i14 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i10;
                    int green = Color.green(pixel) + i11;
                    i7++;
                    i12 = Color.blue(pixel) + i12;
                    i11 = green;
                    i10 = red;
                }
            }
        }
        if (i7 == 0) {
            return 0;
        }
        return Color.argb(qs.e4, i10 / i7, i11 / i7, i12 / i7);
    }

    public static boolean J1(org.telegram.ui.ActionBar.f2 f2Var) {
        ((nb.a) t0.k()).getClass();
        String str = "com.google.android.apps.maps";
        int i7 = 0;
        try {
            t0.b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
            ((nb.a) t0.k()).getClass();
            alertDialog$Builder.a.T = id.M0(2131749197, null);
            alertDialog$Builder.k(id.M0(2131747832, null), new o(i7, str, f2Var));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            f2Var.showDialog(alertDialog$Builder.a);
            return false;
        }
    }

    public static SpannableStringBuilder J2(CharSequence charSequence, boolean z9, float f10, float f11, float f12, int i7) {
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i7, 0);
        float f13 = f12 * 0.88f;
        wpVar.H = f13;
        wpVar.I = f13;
        wpVar.r = -f10;
        wpVar.s = f11;
        wpVar.G = 0.8f;
        if (z9) {
            wpVar.f = z9;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder M2 = M2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(wpVar, 0, 1, 33);
        SpannableStringBuilder M22 = M2(M2, spannableString2, ">");
        org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(i7, 0);
        wpVar2.H = f13;
        wpVar2.I = f13;
        wpVar2.r = f10;
        wpVar2.s = f11;
        wpVar2.w = 180.0f;
        wpVar2.G = 0.8f;
        if (z9) {
            wpVar2.f = z9;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(wpVar2, 0, 1, 33);
        return M2(M22, spannableString3, "<");
    }

    public static boolean J3(String str) {
        try {
            return w(Uri.parse(str).getHost());
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static void K(View view, final Runnable runnable) {
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final boolean[] zArr = new boolean[1];
        final ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = {r2};
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.messenger.h
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(onPreDrawListenerArr[0]);
                }
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    public static String K0(String str, boolean z9) {
        if (str == null) {
            return null;
        }
        if (n0 == null) {
            n0 = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
        }
        Matcher matcher = n0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        if (group != null) {
            group = group.toLowerCase();
        }
        return (z9 && group != null && group.startsWith("www.")) ? group.substring(4) : group;
    }

    public static boolean K1(char c10) {
        if (k0 == null) {
            k0 = new HashSet();
            int i7 = 0;
            while (true) {
                char[] cArr = j0;
                if (i7 >= cArr.length) {
                    break;
                }
                k0.add(Character.valueOf(cArr[i7]));
                i7++;
            }
        }
        return k0.contains(Character.valueOf(c10));
    }

    public static SpannableStringBuilder K2(CharSequence charSequence, CharSequence charSequence2, String str) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
        }
        return spannableStringBuilder;
    }

    public static boolean K3(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static int L(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(p * f10);
    }

    public static Pair L0(File file) {
        try {
            return O0(new u1.g(file));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i7 = 0; i7 < charSequence.length(); i7++) {
                char charAt = charSequence.charAt(i7);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder L2(String str, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.qr qrVar) {
        if (e0 == null) {
            e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = e0.matcher(str);
        int i7 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i7, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new v(qrVar, group2, f6Var, 0), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i7 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i7, str.length());
        return spannableStringBuilder;
    }

    public static void L3(final LaunchActivity launchActivity, final ui.a aVar) {
        if (aVar.g()) {
            String str = aVar.b;
            int i7 = aVar.c;
            String str2 = aVar.d;
            String str3 = aVar.e;
            String str4 = aVar.f;
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, false);
            v2Var.N();
            v2Var.u0 = false;
            v2Var.v0 = false;
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            linearLayout.setOrientation(1);
            v2Var.N = linearLayout;
            TextView b10 = c8.qa.b(launchActivity, 20.0f, org.telegram.ui.ActionBar.k6.j5, true, null);
            b10.setText(id.M0(2131743778, null));
            linearLayout.addView(b10, c8.ha.t(-1, -2, 55, 22, 18, 22, 0));
            tx0 tx0Var = new tx0(launchActivity, null);
            linearLayout.addView(tx0Var, c8.ha.t(-1, -2, 55, 14, 18, 14, 0));
            if (!TextUtils.isEmpty(str)) {
                tx0Var.c(id.M0(2131743794, null), str, null, null);
            }
            if (i7 != 0) {
                tx0Var.c(id.M0(2131743789, null), Integer.toString(i7), null, null);
            }
            if (!TextUtils.isEmpty(str4)) {
                tx0Var.c(id.M0(2131743787, null), str4, null, null);
            }
            if (!TextUtils.isEmpty(str2)) {
                tx0Var.c(id.M0(2131743777, null), str2, null, null);
            }
            if (!TextUtils.isEmpty(str3)) {
                tx0Var.c(id.M0(2131743790, null), str3, null, null);
            }
            org.telegram.ui.Components.jc[] jcVarArr = new org.telegram.ui.Components.jc[1];
            tx0Var.c(id.M0(2131746601, null), "", null, jcVarArr);
            ((View) jcVarArr[0].getParent()).setPadding(0, 0, 0, 0);
            jcVarArr[0].setDisablePaddingsOffsetY(true);
            jcVarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
            jcVarArr[0].setText(O2(id.M0(2131746610, null), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false), new em(new boolean[1], jcVarArr, aVar, launchActivity, 5)));
            if (!TextUtils.isEmpty(str4)) {
                rx0 a10 = tx0Var.a(id.M0(2131743779, null));
                a10.setFilled(true);
                xh.l lVar = (xh.l) a10.getChildAt(0);
                lVar.setTextSize(1, 11.0f);
                lVar.setGravity(17);
            }
            fi.d dVar = new fi.d(launchActivity, null, true);
            dVar.setRoundRadius(24);
            dVar.setText(id.M0(2131751808, null));
            final org.telegram.ui.ActionBar.g2 g2Var = v2Var.x0;
            dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferences.Editor edit = qp.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    ui.a aVar2 = ui.a.this;
                    aVar2.i(edit);
                    edit.commit();
                    iz.B1 = iz.a(new hz(aVar2));
                    ConnectionsManager.setProxySettings(true, aVar2);
                    qs.e().k(qs.A4, new Object[0]);
                    org.telegram.ui.ActionBar.f2 lastFragment = launchActivity.M().getLastFragment();
                    if (lastFragment instanceof org.telegram.ui.an) {
                        org.telegram.ui.an anVar = (org.telegram.ui.an) lastFragment;
                        anVar.f8();
                        UndoView undoView = anVar.M3;
                        if (undoView != null) {
                            undoView.j(87, 0L, null);
                            g2Var.run();
                        }
                    }
                    qs.e().k(qs.P4, 6, id.M0(2131746611, null));
                    g2Var.run();
                }
            });
            linearLayout.addView(dVar, c8.ha.t(-1, 48, 55, 14, 18, 14, 14));
            v2Var.show();
        }
    }

    public static int M(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(p * f10);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return O0(new u1.g(inputStream));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean M1(Context context) {
        Activity W2 = W(context);
        if (W2 == null) {
            return true;
        }
        return (W2.isDestroyed() || W2.isFinishing()) ? false : true;
    }

    public static SpannableStringBuilder M2(CharSequence charSequence, CharSequence charSequence2, String str) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str, 0);
        while (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
            indexOf = TextUtils.indexOf(spannableStringBuilder, str, indexOf + 1);
        }
        return spannableStringBuilder;
    }

    public static void M3(int i7, int i10, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i7, iArr[1] - i10, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                M3(i7, i10, iArr, canvas, viewGroup.getChildAt(i11));
            }
        }
    }

    public static float N(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return p * f10;
    }

    public static Pair N0(String str) {
        try {
            return O0(new u1.g(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        TelephonyManager telephonyManager = (TelephonyManager) t0.b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        return (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(t0.b.getContentResolver(), "airplane_mode_on", 0) != 0) ? false : true;
    }

    public static CharSequence N2(CharSequence charSequence) {
        int i7 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            while (i7 < length) {
                if (sb2.charAt(i7) == '\n') {
                    sb2.setCharAt(i7, ' ');
                }
                i7++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i7 < length2) {
                if (charSequence.charAt(i7) == '\n') {
                    spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) " ");
                }
                i7++;
            }
            return spannableStringBuilder;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence == null) {
                return null;
            }
            return charSequence.toString().replace('\n', ' ');
        }
        if (TextUtils.indexOf(charSequence, '\n') < 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
        int length3 = charSequence.length();
        while (i7 < length3) {
            if (charSequence.charAt(i7) == '\n') {
                spannableStringBuilder2.replace(i7, i7 + 1, (CharSequence) " ");
            }
            i7++;
        }
        return spannableStringBuilder2;
    }

    public static Bitmap N3(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        M3(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static void O(Canvas canvas, FrameLayout frameLayout, int i7, int i10, float f10) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(T1(0.0f, 0.75f, R0(i10)) * f10, i7);
        Paint paint = o0;
        paint.setColor(r12);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i10, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair O0(u1.g gVar) {
        int i7;
        int i10 = 0;
        try {
            int i11 = 2;
            switch (gVar.c()) {
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i7 = qs.K2;
                    i11 = 0;
                    i10 = i7;
                    break;
                case 4:
                    break;
                case 5:
                    i10 = 270;
                    break;
                case 6:
                    i7 = 90;
                    i11 = 0;
                    i10 = i7;
                    break;
                case 7:
                    i11 = 1;
                    i10 = 270;
                    break;
                case 8:
                    i11 = 0;
                    i10 = 270;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean O1() {
        if (M == null) {
            Point point = q;
            M = Boolean.valueOf(((float) ((Math.max(point.x, point.y) - m) - n)) / p <= 650.0f);
        }
        return M.booleanValue();
    }

    public static SpannableStringBuilder O2(String str, int i7, Runnable runnable) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new z(i7, runnable), indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new t(i7, 1), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static String O3(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String S0 = id.E0().S0(str, true, false);
        return S0 == null ? "" : S0;
    }

    public static void P(Canvas canvas, RectF rectF, float f10) {
        float min = Math.min(f10, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float N2 = N(1.0f);
        float f11 = N2 / 2.0f;
        float max = Math.max(0.0f, min - N2);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = Y;
        paint.setStyle(style);
        paint.setStrokeWidth(N2);
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(1.0f, 570425343));
        canvas.save();
        float f12 = rectF.left - f11;
        float f13 = rectF.top;
        if (canvas.clipRect(f12, f13, rectF.right + f11, c8.j9.a(f13 + max, f13, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f11, rectF.right, f11 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float N3 = N(0.6666667f);
        float f14 = N3 / 2.0f;
        float max2 = Math.max(0.0f, min - N3);
        Paint paint2 = Z;
        paint2.setStyle(style);
        paint2.setStrokeWidth(N3);
        paint2.setColor(org.telegram.ui.ActionBar.k6.r1(1.0f, 385875967));
        canvas.save();
        float f15 = rectF.left - f14;
        float f16 = rectF.bottom;
        if (canvas.clipRect(f15, c8.j9.a(f16 - max2, rectF.top, f16), rectF.right + f14, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f14, rectF.right, rectF.bottom - f14, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static File P0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(t0.b.getExternalFilesDir(null).getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(t0.b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(t0.b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            t0.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean P1() {
        Point point = q;
        return ((float) Math.min(point.x, point.y)) / p <= 690.0f;
    }

    public static SpannableStringBuilder P2(int i7, String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new t(i7, 0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static CharSequence P3(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) <= ' ') {
            i7++;
        }
        while (i7 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i7;
        }
        return (i7 > 0 || length < charSequence.length()) ? charSequence.subSequence(i7, length) : charSequence;
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i7, TextPaint textPaint) {
        CharSequence charSequence2;
        int i10;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            int indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > 130) {
                CharSequence subSequence2 = charSequence.subSequence(Math.max(0, indexOf - 65), Math.min(length, indexOf + 65));
                try {
                    int max = indexOf - Math.max(0, indexOf - 65);
                    subSequence2.length();
                    i10 = max;
                    charSequence2 = subSequence2;
                } catch (Exception e10) {
                    e = e10;
                    charSequence2 = subSequence2;
                    a8.g(e, true);
                    return charSequence2;
                }
            } else {
                i10 = indexOf;
                charSequence2 = charSequence;
            }
        } catch (Exception e11) {
            e = e11;
            charSequence2 = charSequence;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f10 = i7;
            if (textPaint.measureText("...") + lineWidth >= f10) {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i12))) {
                    i12++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i12);
                if (staticLayout.isRtlCharAt(i12)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f10) {
                    float f11 = 0.1f * f10;
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f10) + f11;
                    if (charSequence2.length() - i12 > 20) {
                        measureText += f11;
                    }
                    if (measureText > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                        if (offsetForHorizontal > charSequence2.length() - 1) {
                            offsetForHorizontal = charSequence2.length() - 1;
                        }
                        int i13 = 0;
                        while (true) {
                            if (Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) || i13 >= 10) {
                                break;
                            }
                            i13++;
                            offsetForHorizontal++;
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                                break;
                            }
                        }
                        if (i13 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i11) - (f10 * 0.3f)), charSequence2.length());
                        } else {
                            if (offsetForHorizontal > 0 && offsetForHorizontal < charSequence2.length() - 2 && Character.isWhitespace(charSequence2.charAt(offsetForHorizontal))) {
                                offsetForHorizontal++;
                            }
                            subSequence = charSequence2.subSequence(offsetForHorizontal, charSequence2.length());
                        }
                        return SpannableStringBuilder.valueOf("...").append(subSequence);
                    }
                }
            }
            return charSequence2;
        } catch (Exception e12) {
            e = e12;
            a8.g(e, true);
            return charSequence2;
        }
    }

    public static int Q0() {
        boolean P1 = P1();
        Point point = q;
        if (!P1) {
            int min = Math.min(point.x, point.y);
            return min - l1(min, 0, 0);
        }
        int min2 = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        return Math.min(min2, max - l1(max, 0, 0));
    }

    public static boolean Q1() {
        return R1() && !iz.W;
    }

    public static SpannableStringBuilder Q2(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, boolean z9) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new a0(z9, i7, f6Var, runnable), indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new b0(z9, i7, f6Var), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Q3(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            if (f != -10) {
                int requestedOrientation = activity.getRequestedOrientation();
                activity.setRequestedOrientation(f);
                if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                    g = f;
                    h = requestedOrientation;
                    i = new WeakReference(activity);
                }
                f = -10;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static float R0(int i7) {
        return Utilities.l((i7 - L(32.0f)) / L(16.0f));
    }

    public static boolean R1() {
        if (K == null) {
            K = Boolean.valueOf(t0.b != null && t0.b.getResources().getBoolean(R.bool.isTablet));
        }
        return K.booleanValue();
    }

    public static SpannableStringBuilder R2(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var, qn0 qn0Var) {
        return Q2(str, i7, f6Var, qn0Var, false);
    }

    public static void R3(ImageView imageView, int i7) {
        S3(imageView, imageView.getContext().getDrawable(i7));
    }

    public static void S(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            g0.f.t(window);
        } else if (i7 >= 30) {
            g0.f.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i7 >= 28) {
            int i10 = i7 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i10) {
                attributes.layoutInDisplayCutoutMode = i10;
                window.setAttributes(attributes);
            }
        }
        if (i7 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static int S0(float f10, float f11, int i7, int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        int red2 = Color.red(i7);
        int green2 = Color.green(i7);
        int blue2 = Color.blue(i7);
        return Color.argb((int) com.google.android.recaptcha.internal.a.B(alpha - r9, f10, Color.alpha(i7), f11), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2));
    }

    public static boolean S1(char c10) {
        return c10 == '-' || c10 == '~';
    }

    public static SpannableStringBuilder S2(String str, int i7, int i10, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i12 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i11 = 0;
        } else {
            i11 = i12 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i10 == 3) {
                int i13 = indexOf + i11;
                spannableStringBuilder.replace(indexOf, i13, (CharSequence) M2(spannableStringBuilder.subSequence(indexOf, i13), " ", " "));
            }
            if (i10 != 0 && i10 != 3 && i10 != 2 && i10 != 4) {
                spannableStringBuilder.setSpan(new li.w5(f6Var, 1), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new y(i10, i7, f6Var, runnable), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void S3(final ImageView imageView, final Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs = Math.abs(floatValue - 0.5f) + 0.5f;
                ImageView imageView2 = imageView;
                imageView2.setScaleX(abs);
                imageView2.setScaleY(abs);
                if (floatValue >= 0.5f) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if (atomicBoolean2.get()) {
                        return;
                    }
                    atomicBoolean2.set(true);
                    imageView2.setImageDrawable(drawable);
                }
            }
        });
        duration.start();
    }

    public static void T() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) t0.b.getSystemService("phone");
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            if (declaredMethod.invoke(telephonyManager, null) != null) {
                throw new ClassCastException();
            }
            if (declaredMethod.invoke(telephonyManager, null) != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static String T0(Uri uri) {
        Uri uri2;
        try {
            if (DocumentsContract.isDocumentUri(t0.b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else {
                    if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                        return H0(t0.b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                        String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = split2[0];
                        int hashCode = str.hashCode();
                        if (hashCode == 93166550) {
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                return H0(t0.b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(t0.b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (hashCode == 100313435) {
                            if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                return H0(t0.b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(t0.b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (hashCode == 112202875 && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            return H0(t0.b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return H0(t0.b, uri2, "_id=?", new String[]{split2[1]});
                    }
                }
            } else {
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return H0(t0.b, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static float T1(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static SpannableStringBuilder T2(String str, int i7, org.telegram.ui.af afVar) {
        return S2(str, i7, 0, afVar, null);
    }

    public static void T3(WindowManager windowManager, bi.x5 x5Var, WindowManager.LayoutParams layoutParams) {
        if (windowManager == null || x5Var == null || x5Var.getParent() == null) {
            return;
        }
        windowManager.updateViewLayout(x5Var, layoutParams);
    }

    public static String U(String str) {
        return F2(D2(str));
    }

    public static int U0(int i7) {
        return V0(i7, false);
    }

    public static float U1(float f10, float[] fArr) {
        return T1(fArr[0], fArr[1], f10);
    }

    public static SpannableStringBuilder U2(String str, Runnable runnable) {
        return S2(str, -1, 0, runnable, null);
    }

    public static void U3(float f10, View view, boolean z9, boolean z10) {
        if (view == null) {
            return;
        }
        boolean z11 = view.getParent() != null;
        view.animate().setListener(null).cancel();
        if (!z11) {
            view.setVisibility(z9 ? 0 : 8);
            view.setTag(z9 ? 1 : null);
            view.setAlpha(1.0f);
            view.setScaleX((!z10 || z9) ? 1.0f : 0.5f);
            view.setScaleY((!z10 || z9) ? 1.0f : 0.5f);
            if (f10 != 0.0f) {
                view.setTranslationY(z9 ? 0.0f : L(-16.0f) * f10);
                return;
            }
            return;
        }
        if (!z9) {
            ViewPropertyAnimator withEndAction = view.animate().alpha(0.0f).scaleY(z10 ? 0.5f : 1.0f).scaleX(z10 ? 0.5f : 1.0f).setListener(new org.telegram.ui.Components.t9(view)).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).withEndAction(null);
            if (f10 != 0.0f) {
                withEndAction.translationY(L(-16.0f) * f10);
            }
            withEndAction.start();
            return;
        }
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.setScaleX(z10 ? 0.5f : 1.0f);
            view.setScaleY(z10 ? 0.5f : 1.0f);
            if (f10 != 0.0f) {
                view.setTranslationY(L(-16.0f) * f10);
            }
        }
        ViewPropertyAnimator withEndAction2 = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).withEndAction(null);
        if (f10 != 0.0f) {
            withEndAction2.translationY(0.0f);
        }
        withEndAction2.start();
    }

    public static Object V(Class cls, List list) {
        if (list == null) {
            return null;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r3 > 0.0f) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int V0(int i7, boolean z9) {
        float[] b10 = b(Color.red(i7), Color.green(i7), Color.blue(i7));
        float f10 = b10[1];
        if (f10 <= 0.0f) {
            float f11 = b10[2];
            if (f11 < 1.0f) {
            }
            if (!z9) {
                float f12 = b10[2];
                if (f12 <= 0.5f) {
                    b10[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (f12 * 0.65f)));
                    return a(b10[0], b10[1], b10[2]) & (z9 ? -1711276033 : 1728053247);
                }
            }
            b10[2] = Math.max(0.0f, b10[2] * 0.65f);
            return a(b10[0], b10[1], b10[2]) & (z9 ? -1711276033 : 1728053247);
        }
        b10[1] = Math.min(1.0f, ((1.0f - f10) * 0.1f) + (z9 ? 0.15f : 0.05f) + f10);
        if (!z9) {
        }
        b10[2] = Math.max(0.0f, b10[2] * 0.65f);
        return a(b10[0], b10[1], b10[2]) & (z9 ? -1711276033 : 1728053247);
    }

    public static float V1(boolean z9, boolean z10, float f10) {
        return com.google.android.recaptcha.internal.a.z(z10 ? 1.0f : 0.0f, z9 ? 1.0f : 0.0f, f10, z9 ? 1.0f : 0.0f);
    }

    public static SpannableStringBuilder V2(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int t6 = t(spannableStringBuilder, "**");
                if (t6 == -1) {
                    break;
                }
                spannableStringBuilder.replace(t6, t6 + 2, "");
                int t10 = t(spannableStringBuilder, "**");
                if (t10 >= 0) {
                    spannableStringBuilder.replace(t10, t10 + 2, "");
                    arrayList.add(Integer.valueOf(t6));
                    arrayList.add(Integer.valueOf(t10));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i7 = 0; i7 < arrayList.size() / 2; i7++) {
                int i10 = i7 * 2;
                spannableStringBuilder2.setSpan(new u31(o()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return spannableStringBuilder;
        }
    }

    public static void V3(View view, boolean z9, boolean z10) {
        U3(0.0f, view, z9, z10);
    }

    public static Activity W(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return W(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int W0(int i7) {
        float[] b10 = b(Color.red(i7), Color.green(i7), Color.blue(i7));
        b10[1] = Math.min(1.0f, b10[1] + 0.05f);
        float f10 = b10[2];
        if (f10 > 0.5f) {
            b10[2] = Math.max(0.0f, f10 * 0.9f);
        } else {
            b10[2] = Math.max(0.0f, f10 * 0.9f);
        }
        return a(b10[0], b10[1], b10[2]) | (-16777216);
    }

    public static int W1(float f10, int i7, int i10) {
        return (int) ((f10 * (i10 - i7)) + i7);
    }

    public static SpannableStringBuilder W2(CharSequence charSequence) {
        return charSequence instanceof SpannableStringBuilder ? V2((SpannableStringBuilder) charSequence) : V2(new SpannableStringBuilder(charSequence));
    }

    public static void W3(float f10, View view, boolean z9, boolean z10) {
        Z3(view, z9, f10, true, z10);
    }

    public static View X(ViewGroup viewGroup, float f10, float f11) {
        if (viewGroup.getVisibility() != 0) {
            return null;
        }
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    View X2 = X((ViewGroup) childAt, f10 - childAt.getLeft(), f11 - childAt.getTop());
                    if (X2 != null) {
                        return X2;
                    }
                } else if (f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getY() && f10 <= childAt.getY() + childAt.getHeight()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static int X0(int i7) {
        return Math.max(73, (i7 >> 16) & 65535);
    }

    public static void X1(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 != null) {
            rect3.set(W1(f10, rect.left, rect2.left), W1(f10, rect.top, rect2.top), W1(f10, rect.right, rect2.right), W1(f10, rect.bottom, rect2.bottom));
        }
    }

    public static SpannableStringBuilder X2(String str) {
        try {
            StringBuilder sb2 = new StringBuilder(str);
            while (true) {
                int indexOf = sb2.indexOf("<br>");
                if (indexOf == -1) {
                    break;
                }
                sb2.replace(indexOf, indexOf + 4, "\n");
            }
            while (true) {
                int indexOf2 = sb2.indexOf("<br/>");
                if (indexOf2 == -1) {
                    break;
                }
                sb2.replace(indexOf2, indexOf2 + 5, "\n");
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int indexOf3 = sb2.indexOf("<b>");
                if (indexOf3 == -1) {
                    break;
                }
                sb2.replace(indexOf3, indexOf3 + 3, "");
                int indexOf4 = sb2.indexOf("</b>");
                if (indexOf4 == -1) {
                    indexOf4 = sb2.indexOf("<b>");
                }
                sb2.replace(indexOf4, indexOf4 + 4, "");
                arrayList.add(Integer.valueOf(indexOf3));
                arrayList.add(Integer.valueOf(indexOf4));
            }
            while (true) {
                int indexOf5 = sb2.indexOf("**");
                if (indexOf5 == -1) {
                    break;
                }
                sb2.replace(indexOf5, indexOf5 + 2, "");
                int indexOf6 = sb2.indexOf("**");
                if (indexOf6 >= 0) {
                    sb2.replace(indexOf6, indexOf6 + 2, "");
                    arrayList.add(Integer.valueOf(indexOf5));
                    arrayList.add(Integer.valueOf(indexOf6));
                }
            }
            while (true) {
                int indexOf7 = sb2.indexOf("**");
                if (indexOf7 == -1) {
                    break;
                }
                sb2.replace(indexOf7, indexOf7 + 2, "");
                int indexOf8 = sb2.indexOf("**");
                if (indexOf8 >= 0) {
                    sb2.replace(indexOf8, indexOf8 + 2, "");
                    arrayList.add(Integer.valueOf(indexOf7));
                    arrayList.add(Integer.valueOf(indexOf8));
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            for (int i7 = 0; i7 < arrayList.size() / 2; i7++) {
                int i10 = i7 * 2;
                spannableStringBuilder.setSpan(new u31(o()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e10) {
            a8.g(e10, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void X3(View view, boolean z9) {
        Z3(view, z9, 1.0f, true, true);
    }

    public static boolean Y(ViewGroup viewGroup, float f10, float f11, View view) {
        int i7;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i10 = 0;
        while (i10 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof di.i4) || childAt == view)) {
                if (childAt instanceof di.r8) {
                    di.t8 t8Var = (di.t8) viewGroup;
                    if (t8Var.b == null || (f10 >= L(60.0f) && f10 <= viewGroup.getWidth() - L(60.0f))) {
                        int i11 = 0;
                        while (i11 < t8Var.getChildCount()) {
                            View childAt2 = t8Var.getChildAt(i11);
                            if (childAt2 instanceof di.w8) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d2 = f10 - translationX;
                                i7 = i10;
                                double d10 = f11 - translationY;
                                float cos = (float) ((Math.cos(radians) * d2) - (Math.sin(radians) * d10));
                                float d11 = (float) jg.g.d(radians, d10, Math.sin(radians) * d2);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && d11 >= (-measuredHeight) / 2.0f && d11 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (!rect.contains((int) f10, (int) f11) && childAt.isClickable()) {
                                        return true;
                                    }
                                    if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), view)) {
                                        return true;
                                    }
                                    i10 = i7 + 1;
                                }
                            } else {
                                i7 = i10;
                            }
                            i11++;
                            i10 = i7;
                        }
                    }
                }
                i7 = i10;
                rect = Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i10 = i7 + 1;
            }
            i7 = i10;
            i10 = i7 + 1;
        }
        return false;
    }

    public static int Y0() {
        return Z0(false);
    }

    public static void Y1(Rect rect, RectF rectF, float f10, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(T1(rect.left, rectF.left, f10), T1(rect.top, rectF.top, f10), T1(rect.right, rectF.right, f10), T1(rect.bottom, rectF.bottom, f10));
        }
    }

    public static CharSequence Y2(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            int i7 = 0;
            while (i7 < length - 2) {
                int i10 = i7 + 2;
                sb2.getChars(i7, i10, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb2 = sb2.replace(i7, i10, "\n");
                    i7--;
                    length--;
                }
                i7++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i11 = 0;
            while (i11 < length2 - 2) {
                int i12 = i11 + 2;
                spannableStringBuilder.getChars(i11, i12, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i11, i12, (CharSequence) "\n");
                    i11--;
                    length2--;
                }
                i11++;
            }
            return charSequence;
        }
        if (!(charSequence instanceof SpannableString)) {
            return charSequence.toString().replace("\n\n", "\n");
        }
        if (TextUtils.indexOf(charSequence, "\n\n") < 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
        int length3 = charSequence.length();
        int i13 = 0;
        while (i13 < length3 - 2) {
            int i14 = i13 + 2;
            spannableStringBuilder2.getChars(i13, i14, cArr, 0);
            if (cArr[0] == '\n' && cArr[1] == '\n') {
                spannableStringBuilder2 = spannableStringBuilder2.replace(i13, i14, (CharSequence) "\n");
                i13--;
                length3--;
            }
            i13++;
        }
        return spannableStringBuilder2;
    }

    public static void Y3(View view, boolean z9, float f10, boolean z10, float f11, boolean z11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            z11 = false;
        }
        if (!z11) {
            view.animate().setListener(null).cancel();
            view.setVisibility(z9 ? 0 : z10 ? 8 : 4);
            view.setTag(z9 ? 1 : null);
            view.setAlpha(f11);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (!z9 || view.getTag() != null) {
            if (z9 || view.getTag() == null) {
                return;
            }
            view.animate().setListener(null).cancel();
            view.animate().alpha(0.0f).scaleY(f10).scaleX(f10).setListener(new org.telegram.ui.Components.t9(view, z10)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
            view.setTag(null);
            return;
        }
        view.animate().setListener(null).cancel();
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
        view.animate().alpha(f11).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
        view.setTag(r0);
    }

    public static TLRPC.Document Z(long j3, List list) {
        if (list == null) {
            return null;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i7);
            if (document != null && document.id == j3) {
                return document;
            }
        }
        return null;
    }

    public static int Z0(boolean z9) {
        if (z9) {
            if (A == null) {
                A = 2560;
            }
            return A.intValue();
        }
        if (z == null) {
            z = 1280;
        }
        return z.intValue();
    }

    public static void Z1(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(T1(rectF.left, rectF2.left, f10), T1(rectF.top, rectF2.top, f10), T1(rectF.right, rectF2.right, f10), T1(rectF.bottom, rectF2.bottom, f10));
        }
    }

    public static void Z2(Activity activity, int i7) {
        if (activity == null || Q1()) {
            return;
        }
        activity.getWindow().setSoftInputMode(48);
        N = i7;
    }

    public static void Z3(View view, boolean z9, float f10, boolean z10, boolean z11) {
        Y3(view, z9, f10, z10, 1.0f, z11, null);
    }

    public static int a(float f10, float f11, float f12) {
        int i7;
        int i10;
        int i11;
        if (f11 != 0.0f) {
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float C2 = com.google.android.recaptcha.internal.a.C(f11, floor2, 1.0f, f12);
            float f14 = (1.0f - ((1.0f - floor2) * f11)) * f12;
            int i12 = (int) floor;
            if (i12 == 0) {
                i7 = (int) ((f12 * 255.0f) + 0.5f);
                i10 = (int) ((f14 * 255.0f) + 0.5f);
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            i7 = (int) ((f13 * 255.0f) + 0.5f);
                            i10 = (int) ((C2 * 255.0f) + 0.5f);
                        } else if (i12 == 4) {
                            i7 = (int) ((f14 * 255.0f) + 0.5f);
                            i10 = (int) ((f13 * 255.0f) + 0.5f);
                        } else if (i12 != 5) {
                            i7 = 0;
                        } else {
                            i7 = (int) ((f12 * 255.0f) + 0.5f);
                            i10 = (int) ((f13 * 255.0f) + 0.5f);
                            i11 = (int) ((C2 * 255.0f) + 0.5f);
                        }
                        i11 = (int) ((f12 * 255.0f) + 0.5f);
                    } else {
                        i7 = (int) ((f13 * 255.0f) + 0.5f);
                        i10 = (int) ((f12 * 255.0f) + 0.5f);
                        i11 = (int) ((f14 * 255.0f) + 0.5f);
                    }
                    return ((i7 & qs.e4) << 16) | (-16777216) | ((i10 & qs.e4) << 8) | (i11 & qs.e4);
                }
                i7 = (int) ((C2 * 255.0f) + 0.5f);
                i10 = (int) ((f12 * 255.0f) + 0.5f);
            }
            i11 = (int) ((f13 * 255.0f) + 0.5f);
            return ((i7 & qs.e4) << 16) | (-16777216) | ((i10 & qs.e4) << 8) | (i11 & qs.e4);
        }
        i7 = (int) ((f12 * 255.0f) + 0.5f);
        i10 = i7;
        i11 = i10;
        return ((i7 & qs.e4) << 16) | (-16777216) | ((i10 & qs.e4) << 8) | (i11 & qs.e4);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("google_bug_154855417", 0);
        if (sharedPreferences.contains("fixed")) {
            return;
        }
        new File(t0.h(), "ZoomTables.data").delete();
        sharedPreferences.edit().putBoolean("fixed", true).apply();
    }

    public static float a1(boolean z9, float f10) {
        float f11 = f10 / 2.54f;
        DisplayMetrics displayMetrics = B;
        return f11 * (z9 ? displayMetrics.xdpi : displayMetrics.ydpi);
    }

    public static void a2(float[] fArr, float[] fArr2, float f10, float[] fArr3) {
        if (fArr3 == null) {
            return;
        }
        int i7 = 0;
        while (i7 < fArr3.length) {
            float f11 = 0.0f;
            float f12 = (fArr == null || i7 >= fArr.length) ? 0.0f : fArr[i7];
            if (fArr2 != null && i7 < fArr2.length) {
                f11 = fArr2[i7];
            }
            fArr3[i7] = T1(f12, f11, f10);
            i7++;
        }
    }

    public static void a3(Activity activity, int i7) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null || Q1()) {
            return;
        }
        window.setSoftInputMode(16);
        N = i7;
    }

    public static void a4(int i7, pj0 pj0Var) {
        v4.g0 adapter;
        v4.d1 T2;
        if (pj0Var == null || (adapter = pj0Var.getAdapter()) == null) {
            return;
        }
        for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
            View childAt = pj0Var.getChildAt(i10);
            int R2 = RecyclerView.R(childAt);
            if (R2 >= 0 && (T2 = pj0Var.T(childAt)) != null && !T2.r() && T2.b() == i7) {
                adapter.t(T2, R2);
            }
        }
    }

    public static float[] b(int i7, int i10, int i11) {
        int max = Math.max(i7, i10);
        if (i11 > max) {
            max = i11;
        }
        int min = Math.min(i7, i10);
        if (i11 < min) {
            min = i11;
        }
        float f10 = max;
        float f11 = f10 / 255.0f;
        float f12 = 0.0f;
        float f13 = max != 0 ? (max - min) / f10 : 0.0f;
        if (f13 != 0.0f) {
            float f14 = max - min;
            float f15 = (max - i7) / f14;
            float f16 = (max - i10) / f14;
            float f17 = (max - i11) / f14;
            float f18 = (i7 == max ? f17 - f16 : i10 == max ? (f15 + 2.0f) - f17 : (f16 + 4.0f) - f15) / 6.0f;
            f12 = f18 < 0.0f ? f18 + 1.0f : f18;
        }
        return new float[]{f12, f13, f11};
    }

    public static double b0(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static long b1(SharedPreferences sharedPreferences, String str, long j3) {
        try {
            return sharedPreferences.getLong(str, j3);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j3);
        }
    }

    public static float b2(float f10, float f11, float f12) {
        return ((((((((f11 - f10) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f12) + f10) + 360.0f) % 360.0f;
    }

    public static void b3(Activity activity, int i7) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i7;
    }

    public static void b4(pj0 pj0Var) {
        v4.g0 adapter;
        v4.d1 T2;
        if (pj0Var == null || (adapter = pj0Var.getAdapter()) == null) {
            return;
        }
        for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
            View childAt = pj0Var.getChildAt(i7);
            int R2 = RecyclerView.R(childAt);
            if (R2 >= 0 && (T2 = pj0Var.T(childAt)) != null && !T2.r()) {
                adapter.t(T2, R2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Spannable spannable, int i7, boolean z9, boolean z10) {
        Future future;
        boolean z11;
        if (spannable == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        final r rVar = new r(spannableStringBuilder, i7, z9, z10);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Callable callable = new Callable() { // from class: org.telegram.messenger.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return (Boolean) r.this.run();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return Boolean.FALSE;
                }
            }
        };
        try {
            try {
                try {
                    future = newSingleThreadExecutor.submit(callable);
                } catch (TimeoutException unused) {
                    future = null;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                z11 = false;
                if (z11) {
                }
            }
            try {
                z11 = ((Boolean) future.get(qs.e3, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (TimeoutException unused2) {
                if (future != null) {
                    future.cancel(true);
                }
                z11 = false;
                if (z11) {
                }
            }
            if (z11) {
                for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                    spannable.removeSpan(uRLSpan);
                }
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                    URLSpan uRLSpan2 = uRLSpanArr[i10];
                    spannable.setSpan(uRLSpan2, spannableStringBuilder.getSpanStart(uRLSpan2), spannableStringBuilder.getSpanEnd(uRLSpanArr[i10]), 33);
                }
            }
        } finally {
            newSingleThreadExecutor.shutdownNow();
        }
    }

    public static void c0(View view, c20 c20Var) {
        if (!(view instanceof ViewGroup)) {
            c20Var.a(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            c20Var.a(view);
            c0(viewGroup.getChildAt(i7), c20Var);
        }
    }

    public static Point c1() {
        Point point = new Point();
        try {
            ((WindowManager) t0.b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e10) {
            a8.g(e10, true);
            return point;
        }
    }

    public static void c2(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float T1 = T1(rectF.centerX(), rectF2.centerX(), f10);
        float T12 = T1(rectF.centerY(), rectF2.centerY(), f10);
        float T13 = T1(rectF.width(), rectF2.width(), Math.min(1.0f, f10)) / 2.0f;
        float T14 = T1(rectF.height(), rectF2.height(), Math.min(1.0f, f10)) / 2.0f;
        rectF3.set(T1 - T13, T12 - T14, T1 + T13, T12 + T14);
    }

    public static void c3(Activity activity) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i7 >= 31) {
                builder.setAutoEnterEnabled(false);
            }
            w3(activity, builder.build());
        }
    }

    public static void c4(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void d(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            t0.b.sendBroadcast(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void d0(RecyclerView recyclerView, c20 c20Var) {
        if (recyclerView == null) {
            return;
        }
        for (int i7 = 0; i7 < recyclerView.getChildCount(); i7++) {
            c20Var.a(recyclerView.getChildAt(i7));
        }
        for (int i10 = 0; i10 < recyclerView.getCachedChildCount(); i10++) {
            c20Var.a(recyclerView.P(i10));
        }
        for (int i11 = 0; i11 < recyclerView.getHiddenChildCount(); i11++) {
            c20Var.a(recyclerView.V(i11));
        }
        for (int i12 = 0; i12 < recyclerView.getAttachedScrapChildCount(); i12++) {
            c20Var.a(recyclerView.O(i12));
        }
    }

    public static ArrayList d1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = t0.b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((File) arrayList.get(i7)).getPath().equals(file2.getPath());
                    }
                    if (!hashSet.contains(file2.getAbsolutePath())) {
                        hashSet.add(file2.getAbsolutePath());
                        arrayList.add(file2);
                    }
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !hashSet.contains(externalStorageDirectory.getAbsolutePath())) {
            arrayList.add(externalStorageDirectory);
        }
        return arrayList;
    }

    public static int d2(float f10, int i7, int i10) {
        return Color.argb(W1(f10, Color.alpha(i7), Color.alpha(i10)), W1(f10, Color.red(i7), Color.red(i10)), W1(f10, Color.green(i7), Color.green(i10)), W1(f10, Color.blue(i7), Color.blue(i10)));
    }

    public static void d3() {
        if (L == null) {
            L = Boolean.valueOf(R1());
        }
        K = null;
        if (iz.X0) {
            SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
            int i7 = sharedPreferences.getInt("fons_size", (!Q1() || (t0.b != null && t0.b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) ? 16 : 18);
            iz.W0 = i7;
            iz.Z0 = sharedPreferences.getInt("iv_font_size", i7);
        }
    }

    public static SpannableStringBuilder d4(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(id.M0(2131749010, null));
        spannableString.setSpan(new w(0, runnable), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return H2(spannableStringBuilder, true);
    }

    public static void e(String str) {
        if (str == null) {
            return;
        }
        d(new File(str));
    }

    public static String e0(int i7, double d2, double d10, int i10, int i11, boolean z9, int i12, int i13) {
        int i14 = 2;
        int min = Math.min(2, (int) Math.ceil(p));
        int i15 = i13 == -1 ? qp.s1(i7).m3 : i13;
        if (i15 != 1 && i15 != 3) {
            String str = qp.s1(i7).s3;
            return !TextUtils.isEmpty(str) ? z9 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d10), str) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), str) : z9 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d10)) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min));
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        fd fdVar = id.E0().B;
        String str2 = null;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = i14;
            if (strArr[i16].toLowerCase().contains(fdVar.c)) {
                str2 = strArr[i16];
            }
            i16++;
            i14 = i17;
        }
        int i18 = i14;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (!z9) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d10);
            Double valueOf2 = Double.valueOf(d2);
            Integer valueOf3 = Integer.valueOf(i12);
            Integer valueOf4 = Integer.valueOf(i10 * min);
            Integer valueOf5 = Integer.valueOf(i11 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Object[] objArr = new Object[7];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i18] = valueOf3;
            objArr[3] = valueOf4;
            objArr[4] = valueOf5;
            objArr[5] = valueOf6;
            objArr[6] = str2;
            return String.format(locale, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", objArr);
        }
        Locale locale2 = Locale.US;
        Double valueOf7 = Double.valueOf(d10);
        Double valueOf8 = Double.valueOf(d2);
        Integer valueOf9 = Integer.valueOf(i12);
        Integer valueOf10 = Integer.valueOf(i10 * min);
        Integer valueOf11 = Integer.valueOf(i11 * min);
        Integer valueOf12 = Integer.valueOf(min);
        Double valueOf13 = Double.valueOf(d10);
        Double valueOf14 = Double.valueOf(d2);
        Object[] objArr2 = new Object[9];
        objArr2[0] = valueOf7;
        objArr2[1] = valueOf8;
        objArr2[i18] = valueOf9;
        objArr2[3] = valueOf10;
        objArr2[4] = valueOf11;
        objArr2[5] = valueOf12;
        objArr2[6] = valueOf13;
        objArr2[7] = valueOf14;
        objArr2[8] = str2;
        return String.format(locale2, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", objArr2);
    }

    public static Bitmap e1(float f10, float f11, String str, String str2, int i7) {
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        int i10;
        int i11;
        Bitmap decodeStream;
        int i12;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (str != null) {
                    BitmapFactory.decodeFile(str, options);
                    fileInputStream = null;
                } else {
                    fileInputStream = new FileInputStream(str2);
                    try {
                        fileInputStream.getChannel().position(i7);
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            a8.g(th, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                            }
                        }
                    }
                }
                i10 = options.outWidth;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        if (i10 <= 0 || (i11 = options.outHeight) <= 0) {
            if (fileInputStream != null) {
                fileInputStream.close();
                return null;
            }
            return null;
        }
        if (f10 > f11 && i10 < i11) {
            f11 = f10;
            f10 = f11;
        }
        float min = Math.min(i10 / f10, i11 / f11);
        options.inSampleSize = 1;
        if (min > 1.0f) {
            do {
                i12 = options.inSampleSize * 2;
                options.inSampleSize = i12;
            } while (i12 < min);
        }
        options.inJustDecodeBounds = false;
        if (str != null) {
            decodeStream = BitmapFactory.decodeFile(str, options);
        } else {
            fileInputStream.getChannel().position(i7);
            decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
        }
        if (fileInputStream != null) {
            try {
                return decodeStream;
            } catch (Exception e102) {
            }
        }
        return decodeStream;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:203|204)(2:3|4)|5|(7:6|(4:8|9|(3:158|159|160)(9:11|12|13|(3:15|(1:17)(2:105|(4:109|(1:111)(2:117|(1:119)(3:120|(2:127|(1:129)(2:130|(1:132)(2:133|(1:135)(3:136|(2:143|(1:145)(2:146|(1:151)(1:148)))|152))))|153))|(1:115)|116))|18)(1:157)|(1:104)(1:(5:22|23|24|(1:26)|27)(1:103))|(1:29)|30|31|(8:(1:39)|40|(1:42)(1:92)|43|(11:46|47|(2:56|(1:58))|59|(3:61|(2:66|(2:68|69)(2:70|(2:72|73)(1:74)))(2:63|64)|65)|75|76|(1:78)(1:90)|(1:86)|87|88)|91|87|88)(3:93|94|95))|89)(1:164)|97|98|99|100|101)|165|166|167|168|(5:172|(2:191|192)(5:(1:177)|178|(2:179|(2:181|(2:184|185)(1:183))(2:189|190))|186|187)|188|169|170)|193|101) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02c7, code lost:
    
        org.telegram.messenger.a8.g(r0, r16);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e2(Uri uri, int i7, boolean z9, ArrayList arrayList, String str) {
        InputStream createInputStream;
        int i10;
        ArrayList arrayList2;
        ?? r12;
        ?? r16;
        int i11;
        int i12;
        InputStream inputStream;
        String[] strArr;
        int i13;
        byte[] H2;
        f0 f0Var;
        ArrayList arrayList3 = arrayList;
        int i14 = 1;
        if (z9) {
            try {
                createInputStream = t0.b.getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            } catch (Throwable th2) {
                th = th2;
                i10 = i14;
            }
        } else {
            try {
                createInputStream = t0.b.getContentResolver().openInputStream(uri);
            } catch (Throwable th3) {
                th = th3;
                i10 = 1;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(createInputStream, "UTF-8"));
        int i15 = 0;
        int i16 = 0;
        e0 e0Var = null;
        String str2 = null;
        f0 f0Var2 = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            try {
                if (readLine.startsWith("PHOTO")) {
                    i16 = i14;
                } else {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            e0Var = new e0();
                            e0Var.b = new ArrayList();
                            e0Var.c = new StringBuilder();
                            arrayList4.add(e0Var);
                            e0Var.a = str;
                        } else if (!readLine.startsWith("END:VCARD") && arrayList3 != null) {
                            if (readLine.startsWith("TEL")) {
                                f0Var = new f0();
                                f0Var.c = i15;
                            } else if (readLine.startsWith("EMAIL")) {
                                f0Var = new f0();
                                f0Var.c = i14;
                            } else {
                                if (!readLine.startsWith("ADR") && !readLine.startsWith("LABEL") && !readLine.startsWith("GEO")) {
                                    if (readLine.startsWith("URL")) {
                                        f0Var = new f0();
                                        f0Var.c = 3;
                                    } else if (readLine.startsWith("NOTE")) {
                                        f0Var = new f0();
                                        f0Var.c = 4;
                                    } else if (readLine.startsWith("BDAY")) {
                                        f0Var = new f0();
                                        f0Var.c = 5;
                                    } else {
                                        if (!readLine.startsWith("ORG") && !readLine.startsWith("TITLE") && !readLine.startsWith("ROLE")) {
                                            if (readLine.startsWith("X-ANDROID")) {
                                                f0Var = new f0();
                                                f0Var.c = -1;
                                            } else if (!readLine.startsWith("X-PHONETIC") && readLine.startsWith("X-")) {
                                                f0Var = new f0();
                                                f0Var.c = 20;
                                            } else {
                                                f0Var = null;
                                            }
                                        }
                                        f0Var = new f0();
                                        f0Var.c = 6;
                                    }
                                }
                                f0Var = new f0();
                                f0Var.c = 2;
                            }
                            if (f0Var != null && f0Var.c >= 0) {
                                arrayList3.add(f0Var);
                            }
                            f0Var2 = f0Var;
                            i16 = i15;
                        }
                        i16 = i15;
                        f0Var2 = null;
                    }
                    if (i16 != 0 || e0Var == null) {
                        i12 = i14;
                    } else if (f0Var2 == null) {
                        r16 = i14;
                        try {
                            if (e0Var.c.length() > 0) {
                                e0Var.c.append('\n');
                            }
                            e0Var.c.append(readLine);
                            i12 = r16;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        i12 = i14;
                        f0Var2.a.add(readLine);
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i15, readLine.length() - 1);
                        i14 = i12;
                    } else {
                        if (i16 == 0 && e0Var != null && f0Var2 != null) {
                            f0Var2.b = readLine;
                        }
                        int indexOf = readLine.indexOf(":");
                        if (indexOf >= 0) {
                            inputStream = createInputStream;
                            strArr = new String[]{readLine.substring(i15, indexOf), readLine.substring(indexOf + 1).trim()};
                        } else {
                            inputStream = createInputStream;
                            strArr = new String[]{readLine.trim()};
                        }
                        if (strArr.length >= 2 && e0Var != null) {
                            if (!strArr[i15].startsWith("FN") && !strArr[i15].startsWith("N") && (!strArr[i15].startsWith("ORG") || !TextUtils.isEmpty(e0Var.a))) {
                                if (strArr[i15].startsWith("TEL")) {
                                    e0Var.b.add(strArr[i12]);
                                }
                            }
                            String[] split = strArr[i15].split(";");
                            int length = split.length;
                            String[] strArr2 = strArr;
                            int i17 = i15;
                            i13 = i17;
                            String str3 = null;
                            String str4 = null;
                            while (i17 < length) {
                                String[] split2 = split[i17].split("=");
                                String[] strArr3 = split;
                                if (split2.length == 2) {
                                    if (split2[i13].equals("CHARSET")) {
                                        str3 = split2[i12];
                                    } else if (split2[i13].equals("ENCODING")) {
                                        str4 = split2[i12];
                                    }
                                }
                                i17++;
                                split = strArr3;
                            }
                            if (strArr2[i13].startsWith("N")) {
                                e0Var.a = strArr2[i12].replace(';', ' ').trim();
                            } else {
                                e0Var.a = strArr2[i12];
                            }
                            if (str4 != null && str4.equalsIgnoreCase("QUOTED-PRINTABLE") && (H2 = H(h1(e0Var.a))) != null && H2.length != 0) {
                                e0Var.a = new String(H2, str3);
                            }
                            createInputStream = inputStream;
                            arrayList3 = arrayList;
                            i14 = i12;
                            i15 = i13;
                        }
                        i13 = i15;
                        createInputStream = inputStream;
                        arrayList3 = arrayList;
                        i14 = i12;
                        i15 = i13;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                r16 = i14;
            }
            th = th4;
            i10 = r16;
            arrayList2 = null;
            r12 = i10;
            a8.g(th, r12);
            return arrayList2;
        }
        InputStream inputStream2 = createInputStream;
        r16 = i14;
        int i18 = i15;
        bufferedReader.close();
        inputStream2.close();
        int i19 = i18;
        arrayList2 = null;
        while (i19 < arrayList4.size()) {
            try {
                e0 e0Var2 = (e0) arrayList4.get(i19);
                if (e0Var2.a == null || e0Var2.b.isEmpty()) {
                    i11 = i18;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    String str5 = (String) e0Var2.b.get(i18);
                    int i20 = 0;
                    while (true) {
                        if (i20 >= e0Var2.b.size()) {
                            i11 = 0;
                            break;
                        }
                        String str6 = (String) e0Var2.b.get(i20);
                        i11 = 0;
                        if (g5.r(i7).l0.get(str6.substring(Math.max(0, str6.length() - 7))) != null) {
                            str5 = str6;
                            break;
                        }
                        i20++;
                    }
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                    tL_userContact_old2.phone = str5;
                    tL_userContact_old2.first_name = e0Var2.a;
                    tL_userContact_old2.last_name = "";
                    tL_userContact_old2.id = 0L;
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = e0Var2.c.toString();
                    restrictionReason.platform = "";
                    restrictionReason.reason = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                    arrayList2.add(tL_userContact_old2);
                }
                i19++;
                i18 = i11;
            } catch (Throwable th6) {
                th = th6;
                r12 = 1;
            }
        }
        return arrayList2;
    }

    public static double[] e3(int i7, int i10, int i11) {
        double d2;
        double d10;
        double d11;
        double d12 = i7 / 255.0d;
        double d13 = i10 / 255.0d;
        double d14 = i11 / 255.0d;
        double max = (d12 <= d13 || d12 <= d14) ? Math.max(d13, d14) : d12;
        double min = (d12 >= d13 || d12 >= d14) ? Math.min(d13, d14) : d12;
        double d15 = max - min;
        double d16 = 0.0d;
        double d17 = max == 0.0d ? 0.0d : d15 / max;
        if (max != min) {
            if (d12 > d13 && d12 > d14) {
                d2 = (d13 - d14) / d15;
                d10 = d13 < d14 ? 6 : 0;
            } else if (d13 > d14) {
                d11 = 2.0d + ((d14 - d12) / d15);
                d16 = d11 / 6.0d;
            } else {
                d2 = (d12 - d13) / d15;
                d10 = 4.0d;
            }
            d11 = d2 + d10;
            d16 = d11 / 6.0d;
        }
        return new double[]{d16, d17, max};
    }

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static String f0(int i7) {
        if (i7 < 1000) {
            return Integer.toString(i7);
        }
        ArrayList arrayList = new ArrayList();
        while (i7 != 0) {
            int i10 = i7 % 1000;
            i7 /= 1000;
            if (i7 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i10)));
            } else {
                arrayList.add(Integer.toString(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sb2.append((String) arrayList.get(size));
            if (size != 0) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public static int f1() {
        float f10 = p;
        if (f10 >= 4.0f) {
            return 3;
        }
        return f10 >= 2.0f ? 2 : 1;
    }

    public static void f2(Activity activity) {
        WeakReference weakReference;
        if (activity == null || f != -10 || R1()) {
            return;
        }
        try {
            f = (g == -10 || (weakReference = i) == null || weakReference.get() != activity) ? activity.getRequestedOrientation() : g;
            g = -10;
            h = -10;
            i = null;
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            if (windowManager == null || windowManager.getDefaultDisplay() == null) {
                return;
            }
            int rotation = windowManager.getDefaultDisplay().getRotation();
            int i7 = activity.getResources().getConfiguration().orientation;
            if (rotation == 3) {
                if (i7 == 1) {
                    activity.setRequestedOrientation(1);
                    return;
                } else {
                    activity.setRequestedOrientation(8);
                    return;
                }
            }
            if (rotation == 1) {
                if (i7 == 1) {
                    activity.setRequestedOrientation(9);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0) {
                if (i7 == 2) {
                    activity.setRequestedOrientation(0);
                    return;
                } else {
                    activity.setRequestedOrientation(1);
                    return;
                }
            }
            if (i7 == 2) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(9);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void f3(float[] fArr, int[] iArr) {
        if (fArr == null) {
            throw new NullPointerException("percents or output is null");
        }
        if (iArr == null) {
            iArr = new int[fArr.length];
        }
        if (fArr.length != iArr.length) {
            throw new IndexOutOfBoundsException("percents.length != output.length");
        }
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < fArr.length; i10++) {
            int floor = (int) Math.floor((fArr[i10] / f10) * 100.0f);
            iArr[i10] = floor;
            i7 += floor;
        }
        while (i7 < 100) {
            int i11 = -1;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < fArr.length; i12++) {
                float f13 = fArr[i12];
                float f14 = (f13 / f10) - (iArr[i12] / 100.0f);
                if (f13 > 0.0f && f14 >= f12) {
                    i11 = i12;
                    f12 = f14;
                }
            }
            if (i11 < 0) {
                return;
            }
            iArr[i11] = iArr[i11] + 1;
            i7++;
        }
    }

    public static boolean g(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) t0.b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, bg.r.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static String g0(int i7, boolean z9, boolean z10) {
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        return i10 == 0 ? z9 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : z10 ? String.format(Locale.US, "%d:%02d", Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static File g1() {
        return new File(w7.z(4), "sharing/");
    }

    public static void g2(Activity activity) {
        WeakReference weakReference;
        if (activity == null || R1()) {
            return;
        }
        try {
            f = (g == -10 || (weakReference = i) == null || weakReference.get() != activity) ? activity.getRequestedOrientation() : g;
            g = -10;
            h = -10;
            i = null;
            activity.setRequestedOrientation(1);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static int g3(boolean z9, boolean z10) {
        if (z9) {
            return w;
        }
        int i7 = v;
        return z10 ? i7 - L(42.0f) : i7;
    }

    public static void h(ColorMatrix colorMatrix, float f10) {
        float f11 = f10 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f11, 0.0f, 1.0f, 0.0f, 0.0f, f11, 0.0f, 0.0f, 1.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i7, boolean z9) {
        int i10 = i7 / 60;
        int i11 = i7 % 60;
        return z9 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static void h2() {
        a8.b("[FLAG_SECURE]");
    }

    public static void h3(Runnable runnable) {
        i3(runnable, 0L);
    }

    public static void i(ColorMatrix colorMatrix, float f10) {
        float f11 = f10 + 1.0f;
        float f12 = 1.0f - f11;
        float f13 = 0.3086f * f12;
        float f14 = 0.6094f * f12;
        float f15 = f12 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f13 + f11, f14, f15, 0.0f, 0.0f, f13, f14 + f11, f15, 0.0f, 0.0f, f13, f14, f11 + f15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String i0(long j3, boolean z9, boolean z10) {
        if (j3 == 0) {
            return String.format("%d KB", 0);
        }
        if (j3 < 1024) {
            return String.format("%d B", Long.valueOf(j3));
        }
        if (j3 < 1048576) {
            float f10 = j3 / 1024.0f;
            if (z9) {
                int i7 = (int) f10;
                if ((f10 - i7) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i7));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f10));
        }
        if (j3 < 1048576000) {
            float f11 = (j3 / 1024.0f) / 1024.0f;
            if (z9) {
                int i10 = (int) f11;
                if ((f11 - i10) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f11));
        }
        float f12 = ((int) ((j3 / 1024) / 1024)) / 1000.0f;
        if (z9) {
            int i11 = (int) f12;
            if ((f12 - i11) * 10.0f == 0.0f) {
                return String.format("%d GB", Integer.valueOf(i11));
            }
        }
        return z10 ? String.format("%.1f GB", Float.valueOf(f12)) : String.format("%.2f GB", Float.valueOf(f12));
    }

    public static Long i1(String str) {
        String j12 = j1(str);
        if (j12 == null) {
            return null;
        }
        try {
            return Utilities.A(j12);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void i2(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) t0.b.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(TLObject.FLAG_14);
            obtain.getText().add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static void i3(Runnable runnable, long j3) {
        if (t0.d == null) {
            return;
        }
        if (j3 == 0) {
            t0.d.post(runnable);
        } else {
            t0.d.postDelayed(runnable, j3);
        }
    }

    public static List j() {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return WindowInspector.getGlobalWindowViews();
            }
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", null).invoke(null, null);
            Method method = cls.getMethod("getViewRootNames", null);
            Method method2 = cls.getMethod("getRootView", String.class);
            String[] strArr = (String[]) method.invoke(invoke, null);
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add((View) method2.invoke(invoke, str));
            }
            return arrayList;
        } catch (Exception e10) {
            a8.e("allGlobalViews()", e10);
            return null;
        }
    }

    public static String j0(int i7) {
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        return i7 < 0 ? String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i10)), Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12))) : String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String j1(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (Exception unused) {
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String readLine = randomAccessFile.readLine();
            if (readLine != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused2) {
                }
                return readLine;
            }
        } catch (Exception unused3) {
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
        try {
            randomAccessFile.close();
        } catch (Exception unused5) {
        }
        return null;
    }

    public static Bitmap j2(float f10, int i7, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f10);
        int height = (int) (view.getHeight() / f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i7, Math.max(width, height) / qs.K2));
        return createBitmap;
    }

    public static void j3(RectF rectF, float f10, float f11, float f12) {
        float f13 = f11 - rectF.left;
        float f14 = rectF.right - f11;
        rectF.set(f11 - (f13 * f10), f12 - ((f12 - rectF.top) * f10), (f14 * f10) + f11, ((rectF.bottom - f12) * f10) + f12);
    }

    public static int k(int i7, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i7);
        int red = Color.red(i7);
        int green = Color.green(i7);
        float f10 = red;
        float f11 = green;
        float blue = Color.blue(i7);
        float f12 = alpha;
        float f13 = (array[3] * f12) + (array[2] * blue) + (array[1] * f11) + (array[0] * f10) + array[4];
        float f14 = (array[8] * f12) + (array[7] * blue) + (array[6] * f11) + (array[5] * f10) + array[9];
        float f15 = (array[13] * f12) + (array[12] * blue) + (array[11] * f11) + (array[10] * f10) + array[14];
        return Color.argb(c8.j9.b(Math.round((array[18] * f12) + (array[17] * blue) + (array[16] * f11) + (array[15] * f10) + array[19]), 0, qs.e4), c8.j9.b(Math.round(f13), 0, qs.e4), c8.j9.b(Math.round(f14), 0, qs.e4), c8.j9.b(Math.round(f15), 0, qs.e4));
    }

    public static String k0(int i7, int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        int i14 = i7 / 3600;
        int i15 = (i7 / 60) % 60;
        int i16 = i7 % 60;
        return i10 == 0 ? i14 == 0 ? String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)) : (i14 == 0 && i11 == 0) ? String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String k1(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SpannableStringBuilder k2(CharSequence charSequence, Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new w(1, runnable), 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void k3(org.telegram.ui.ActionBar.q4 q4Var, String str) {
        if (q4Var == null || str == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) q4Var.getFragmentStack().get(q4Var.getFragmentStack().size() - 1);
        try {
            Field declaredField = f2Var.getClass().getDeclaredField("listView");
            declaredField.setAccessible(true);
            pj0 pj0Var = (pj0) declaredField.get(f2Var);
            pj0Var.e1(new i(f2Var, str, pj0Var), 700, true);
            declaredField.setAccessible(false);
        } catch (Throwable unused) {
        }
    }

    public static Bitmap l(Bitmap bitmap, ColorMatrix colorMatrix) {
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static SpannableStringBuilder l0(CharSequence charSequence, k9 k9Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
            String str = (String) k9Var.j(Integer.valueOf(i7));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i7]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i7].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(int i7, int i10, int i11) {
        return Math.max(L(320.0f), (((i7 - i10) - i11) * 35) / 100) + i10;
    }

    public static void l2(c20 c20Var, float f10) {
        m2(c20Var, f10, (int) f10, null);
    }

    public static void l3(Activity activity, int i7) {
        if (activity == null || Q1()) {
            return;
        }
        int i10 = N;
        if (i10 == 0 || i10 == i7) {
            activity.getWindow().setSoftInputMode(48);
        }
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i7 >= 30 ? 3 : 1;
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        return charSequence.toString().contains("%s") ? l0(charSequence, new ni.a(10), charSequenceArr) : l0(charSequence, new ni.a(12), charSequenceArr);
    }

    public static int m1(String str, boolean z9) {
        int[] iArr = b0;
        int[] iArr2 = a0;
        if (str == null || str.length() == 0) {
            return z9 ? iArr[0] : iArr2[0];
        }
        int i7 = (str.contains(".doc") || str.contains(".txt") || str.contains(".psd")) ? 0 : (str.contains(".xls") || str.contains(".csv")) ? 1 : (str.contains(".pdf") || str.contains(".ppt") || str.contains(".key")) ? 2 : (str.contains(".zip") || str.contains(".rar") || str.contains(".ai") || str.contains(".mp3") || str.contains(".mov") || str.contains(".avi")) ? 3 : -1;
        if (i7 == -1) {
            int lastIndexOf = str.lastIndexOf(46);
            String substring = lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
            i7 = substring.length() != 0 ? substring.charAt(0) % iArr2.length : str.charAt(0) % iArr2.length;
        }
        return z9 ? iArr[i7] : iArr2[i7];
    }

    public static void m2(c20 c20Var, float f10, int i7, ArrayList arrayList) {
        List j3 = j();
        if (j3 == null) {
            c20Var.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = q;
                int i10 = (int) (point.x / f10);
                int i11 = (int) (((point.y + m) + n) / f10);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f11 = 1.0f / f10;
                canvas.scale(f11, f11);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                for (int i12 = 0; i12 < j3.size(); i12++) {
                    View view = (View) j3.get(i12);
                    if (!(view instanceof ee0) && (arrayList == null || !arrayList.contains(view))) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(i0.a.o(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f10, iArr[1] / f10);
                        try {
                            view.draw(canvas);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i7, Math.max(i10, i11) / qs.K2));
                c20Var.a(createBitmap);
            } catch (Exception e11) {
                a8.g(e11, true);
                c20Var.a(null);
            }
            m0 = false;
        } catch (Throwable th2) {
            m0 = false;
            throw th2;
        }
    }

    public static void m3(Activity activity, boolean z9) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        o3(window.getDecorView(), z9);
    }

    public static void n(Animator animator, double d2, double d10) {
        double d11;
        double d12;
        double sqrt = Math.sqrt(d2 / 1.0d);
        double sqrt2 = d10 / (Math.sqrt(d2 * 1.0d) * 2.0d);
        if (sqrt2 < 1.0d) {
            d12 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d11 = ((sqrt2 * sqrt) + (-0.0d)) / d12;
        } else {
            d11 = (-0.0d) + sqrt;
            d12 = 0.0d;
        }
        double d13 = d12;
        double d14 = d11;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new x(sqrt2, sqrt, d13, d14));
    }

    public static String n0(int i7) {
        String str;
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        if (i10 > 0) {
            Locale locale = Locale.US;
            str = com.google.android.recaptcha.internal.a.i(i10, "h");
        } else {
            str = "";
        }
        if (i11 > 0) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
            m10.append(String.format(Locale.US, i10 > 0 ? "%02dm" : "%dm", Integer.valueOf(i11)));
            str = m10.toString();
        }
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str);
        m11.append(String.format(Locale.US, (i10 > 0 || i11 > 0) ? "%02ds" : "%ds", Integer.valueOf(i12)));
        return m11.toString();
    }

    public static CharSequence n1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            while (charSequence.length() > 0 && (charSequence.charAt(0) == '\n' || charSequence.charAt(0) == ' ')) {
                charSequence = charSequence.subSequence(1, charSequence.length());
            }
            while (charSequence.length() > 0 && (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == ' ')) {
                charSequence = charSequence.subSequence(0, charSequence.length() - 1);
            }
        }
        return charSequence;
    }

    public static void n2(ColorMatrix colorMatrix, float f10) {
        colorMatrix.postConcat(new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void n3(Dialog dialog, boolean z9) {
        Window window;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        o3(window.getDecorView(), z9);
    }

    public static Typeface o() {
        if (a == null) {
            if (!iz.V0 || Build.VERSION.SDK_INT < 28) {
                a = o1("fonts/rmedium.ttf");
            } else {
                a = Typeface.create(null, 500, false);
            }
        }
        return a;
    }

    public static String o0(int i7, int i10) {
        String[] strArr;
        if (i7 == 0) {
            return "0";
        }
        float f10 = i7;
        if (i10 == 0) {
            i10 = i7;
        }
        if (i10 < 1000) {
            return f0(i7);
        }
        int i11 = 0;
        while (true) {
            strArr = g0;
            if (i10 < 1000 || i11 >= strArr.length - 1) {
                break;
            }
            i10 /= 1000;
            f10 /= 1000.0f;
            i11++;
        }
        if (f10 < 0.1d) {
            return "0";
        }
        float f11 = f10 * 10.0f;
        float f12 = (int) f11;
        if (f11 != f12) {
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 / 10.0f), strArr[i11]);
        }
        Locale locale = Locale.ENGLISH;
        return rf.b.r(f0((int) f10), strArr[i11]);
    }

    public static Typeface o1(String str) {
        Typeface createFromAsset;
        Typeface typeface;
        Hashtable hashtable = d;
        synchronized (hashtable) {
            try {
                if (!hashtable.containsKey(str)) {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Typeface.Builder builder = new Typeface.Builder(t0.b.getAssets(), str);
                            if (str.contains("rextrabold")) {
                                builder.setWeight(800);
                            }
                            if (str.contains("medium") || str.contains("rbold")) {
                                builder.setWeight(700);
                            }
                            if (str.contains("italic")) {
                                builder.setItalic(true);
                            }
                            createFromAsset = builder.build();
                        } else {
                            createFromAsset = Typeface.createFromAsset(t0.b.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e10) {
                        if (r2.a) {
                            a8.d("Could not get typeface '" + str + "' because " + e10.getMessage());
                        }
                        return null;
                    }
                }
                typeface = (Typeface) hashtable.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typeface;
    }

    public static boolean o2() {
        return p2(false);
    }

    public static void o3(View view, boolean z9) {
        int systemUiVisibility;
        int b10;
        if (view == null || Build.VERSION.SDK_INT < 26 || systemUiVisibility == (b10 = c8.zc.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z9))) {
            return;
        }
        view.setSystemUiVisibility(b10);
    }

    public static int p(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
                if (createScaledBitmap != null) {
                    int pixel = createScaledBitmap.getPixel(0, 0);
                    if (bitmap == createScaledBitmap) {
                        return pixel;
                    }
                    createScaledBitmap.recycle();
                    return pixel;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return 0;
            }
        }
        return 0;
    }

    public static String p0(int i7, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i7 != 0) {
            return a8.p0.p("VID_", format, ".mp4");
        }
        StringBuilder u10 = a8.p0.u("IMG_", format, ".");
        if (TextUtils.isEmpty(str)) {
            str = "jpg";
        }
        u10.append(str);
        return u10.toString();
    }

    public static Vibrator p1() {
        if (J == null) {
            J = (Vibrator) t0.b.getSystemService("vibrator");
        }
        return J;
    }

    public static boolean p2(boolean z9) {
        r0 r0Var = r0.f;
        if (z9) {
            r0Var.getClass();
            if (SystemClock.elapsedRealtime() - r0Var.c < 200) {
                r0Var.b = false;
            }
        }
        boolean z10 = r0Var.b;
        if (z9) {
            r0.f.b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (r2.a && z9 && iz.s.length() > 0) {
            a8.b("wasInBackground = " + z10 + " appLocked = " + iz.x + " autoLockIn = " + iz.y + " lastPauseTime = " + iz.B + " uptime = " + elapsedRealtime);
        }
        if (iz.s.length() > 0 && z10) {
            if (iz.x) {
                return true;
            }
            if ((iz.y != 0 && iz.B != 0 && !iz.x && iz.B + iz.y <= elapsedRealtime) || elapsedRealtime + 5 < iz.B) {
                return true;
            }
        }
        return false;
    }

    public static void p3(Activity activity, boolean z9) {
        if (activity != null) {
            s3(activity.getWindow(), z9);
        }
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.dn) {
            return q(((org.telegram.ui.dn) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i7 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i7 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i7 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.k9) {
                int[] iArr2 = ((org.telegram.ui.Components.k9) drawable).a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i7 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i7 = iArr2[0];
                    }
                }
            } else if (drawable instanceof qa0) {
                int argb = Color.argb(45, 0, 0, 0);
                iArr[2] = argb;
                iArr[0] = argb;
                int argb2 = Color.argb(61, 0, 0, 0);
                iArr[3] = argb2;
                iArr[1] = argb2;
                return iArr;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        double[] e32 = e3((i7 >> 16) & qs.e4, (i7 >> 8) & qs.e4, i7 & qs.e4);
        double d2 = e32[1];
        e32[1] = Math.min(1.0d, ((1.0d - d2) * 0.1d) + 0.05d + d2);
        int[] y12 = y1(e32[0], e32[1], Math.max(0.0d, e32[2] * 0.65d));
        iArr[0] = Color.argb(qs.n1, y12[0], y12[1], y12[2]);
        iArr[1] = Color.argb(qs.S1, y12[0], y12[1], y12[2]);
        int[] y13 = y1(e32[0], e32[1], Math.max(0.0d, e32[2] * 0.72d));
        iArr[2] = Color.argb(qs.n1, y13[0], y13[1], y13[2]);
        iArr[3] = Color.argb(qs.S1, y13[0], y13[1], y13[2]);
        return iArr;
    }

    public static File q0(String str, boolean z9) {
        try {
            File z10 = w7.z(100);
            if (!z9 && z10 != null) {
                return new File(z10, p0(0, str));
            }
            return new File(t0.b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str));
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int q1(View view) {
        if (view != null) {
            int height = view.getHeight();
            Point point = q;
            if (height != point.y && view.getHeight() != point.y - m) {
                try {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
        return 0;
    }

    public static void q2(long j3, StringBuilder sb2) {
        if (j3 >= 10) {
            sb2.append(j3);
        } else {
            sb2.append("0");
            sb2.append(j3);
        }
    }

    public static void q3(Dialog dialog, boolean z9) {
        if (dialog != null) {
            s3(dialog.getWindow(), z9);
        }
    }

    public static void r(Runnable runnable) {
        if (t0.d == null) {
            return;
        }
        t0.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null || str.length() == 0) {
            str = str2;
        } else if (str2 != null && str2.length() != 0) {
            str = a8.p0.D(str, " ", str2);
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i7 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i7);
            if (indexOf == -1) {
                break;
            }
            int i10 = indexOf - (indexOf == 0 ? 0 : 1);
            int length = str3.length() + (indexOf == 0 ? 0 : 1) + i10;
            if (i7 != 0 && i7 != i10 + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i7, i10));
            } else if (i7 == 0 && i10 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i10));
            }
            String substring = trim.substring(i10, Math.min(trim.length(), length));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.q6, null), length2, trim2.length() + length2, 33);
            i7 = length;
        }
        if (i7 != -1 && i7 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i7));
        }
        return spannableStringBuilder;
    }

    public static void r1(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view == null || viewGroup == null) {
            return;
        }
        while (view != viewGroup) {
            if (!(view.getParent() instanceof c5.k)) {
                fArr[0] = view.getX() + fArr[0];
                fArr[1] = view.getY() + fArr[1];
            }
            view = (View) view.getParent();
        }
    }

    public static void r2(cq0 cq0Var) {
        if (cq0Var == null || cq0Var.getAdapter() == null) {
            return;
        }
        if (cq0Var.c0()) {
            cq0Var.post(new a(cq0Var, 1));
        } else {
            cq0Var.getAdapter().f();
        }
    }

    public static void r3(View view, boolean z9) {
        int systemUiVisibility;
        int b10;
        if (view == null || Build.VERSION.SDK_INT < 26 || systemUiVisibility == (b10 = c8.zc.b((systemUiVisibility = view.getSystemUiVisibility()), TLObject.FLAG_13, z9))) {
            return;
        }
        view.setSystemUiVisibility(b10);
    }

    public static float s(float f10, float f11, float f12, float f13) {
        if (f12 <= 0.0f) {
            return f10;
        }
        float min = Math.min(f13, f12) * (1.0f / f12);
        return c8.j9.a((f10 - ((1.0f - min) * (f11 / f12))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z9) {
        try {
            File v02 = v0(z9);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
            if (f0 == null) {
                f0 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            return new File(v02, "VID_" + f0.format(date) + ".mp4");
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int s1(int i7, boolean z9) {
        int i10 = z9 ? i7 + qs.K2 : i7 - 180;
        while (i10 >= 360) {
            i10 -= 360;
        }
        while (i10 < 0) {
            i10 += 360;
        }
        return i10;
    }

    public static void s2(ij ijVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.Document F0;
        char c10;
        String str;
        if (ijVar == null || (F0 = ijVar.F0()) == null) {
            return;
        }
        String r10 = ijVar.k.media != null ? w7.r(null, F0) : "";
        String str2 = ijVar.k.attachPath;
        File file = (str2 == null || str2.length() == 0) ? null : new File(ijVar.k.attachPath);
        if (file == null || !file.exists()) {
            w7.G(p10.s0);
            file = w7.M(ijVar.k, false, true);
        }
        if (file == null || !file.exists()) {
            return;
        }
        if (f2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
            org.telegram.ui.ActionBar.j6 v10 = org.telegram.ui.ActionBar.k6.v(file, ijVar.I0(), null, true);
            if (v10 != null) {
                f2Var.presentFragment(new v71(v10));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            HashMap hashMap = new HashMap();
            int i7 = org.telegram.ui.ActionBar.k6.L5;
            hashMap.put("info1", Integer.valueOf(f2Var.getThemedColor(i7)));
            hashMap.put("info2", Integer.valueOf(f2Var.getThemedColor(i7)));
            alertDialog$Builder.m(R.raw.not_available, 52, f2Var.getThemedColor(i7), hashMap);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.W = true;
            u1Var.T = id.M0(2131749201, null);
            alertDialog$Builder.k(id.M0(2131747832, null), null);
            f2Var.showDialog(u1Var);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            c10 = 0;
            try {
                int lastIndexOf = r10.lastIndexOf(46);
                if (lastIndexOf == -1 || ((str = singleton.getMimeTypeFromExtension(r10.substring(lastIndexOf + 1).toLowerCase())) == null && ((str = F0.mime_type) == null || str.length() == 0))) {
                    str = null;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    t0.d();
                    intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", file), str != null ? str : "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(file), str != null ? str : "text/plain");
                }
                if (str == null) {
                    activity.startActivityForResult(intent, 500);
                    return;
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception unused) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        t0.d();
                        intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file), "text/plain");
                    }
                    activity.startActivityForResult(intent, 500);
                }
            } catch (Exception unused2) {
                if (activity == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                HashMap hashMap2 = new HashMap();
                int i10 = org.telegram.ui.ActionBar.k6.L5;
                hashMap2.put("info1", Integer.valueOf(f2Var.getThemedColor(i10)));
                hashMap2.put("info2", Integer.valueOf(f2Var.getThemedColor(i10)));
                alertDialog$Builder2.m(R.raw.not_available, 52, f2Var.getThemedColor(i10), hashMap2);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.W = true;
                alertDialog$Builder2.k(id.M0(2131747832, null), null);
                Object[] objArr = new Object[1];
                objArr[c10] = ijVar.F0().mime_type;
                u1Var2.T = id.a0("NoHandleAppInstalled", null, 2131748206, objArr);
                f2Var.showDialog(u1Var2);
            }
        } catch (Exception unused3) {
            c10 = 0;
        }
    }

    public static void s3(Window window, boolean z9) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b10 = c8.zc.b(systemUiVisibility, TLObject.FLAG_13, z9);
        if (systemUiVisibility != b10) {
            decorView.setSystemUiVisibility(b10);
        }
        if (Build.VERSION.SDK_INT >= 35 || window.getStatusBarColor() == 0) {
            return;
        }
        window.setStatusBarColor(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int t(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null || charSequence2.length() <= 0) {
            return -1;
        }
        int i7 = 0;
        while (i7 <= charSequence.length() - charSequence2.length()) {
            for (int i10 = 0; i10 < charSequence2.length(); i10++) {
                if (charSequence2.charAt(i10) != charSequence.charAt(i7 + i10)) {
                    break;
                }
            }
            return i7;
        }
        return -1;
    }

    public static int t0() {
        if (p10.i(p10.s0).p() && !ConnectionsManager.getInstance(p10.s0).isTestBackend()) {
            return p10.s0;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (p10.i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                return i7;
            }
        }
        return p10.s0;
    }

    public static boolean t1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        ui.a d2;
        if (intent == null) {
            return false;
        }
        try {
            if ((intent.getFlags() & TLObject.FLAG_20) != 0 || (data = intent.getData()) == null || (d2 = ui.a.d(data)) == null || !d2.g()) {
                return false;
            }
            L3(launchActivity, d2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r8.length() != 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t2(File file, String str, String str2, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        if (file == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int lastIndexOf = str == null ? -1 : str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            if (z9) {
                if (substring != null) {
                    switch (substring.toLowerCase().hashCode()) {
                        case -1535907675:
                        case -1422950858:
                        case -1253501876:
                        case -907685685:
                        case -788047292:
                        case -338481545:
                        case 3106:
                        case 3184:
                        case 3215:
                        case 3401:
                        case 3479:
                        case 3494:
                        case 3580:
                        case 3581:
                        case 3593:
                        case 3632:
                        case 3669:
                        case 3756:
                        case 3804:
                        case 96400:
                        case 96586:
                        case 96796:
                        case 96801:
                        case 96894:
                        case 97013:
                        case 97300:
                        case 97301:
                        case 97543:
                        case 98437:
                        case 98472:
                        case 98618:
                        case 98689:
                        case 98719:
                        case 98789:
                        case 98808:
                        case 98819:
                        case 99338:
                        case 99351:
                        case 99548:
                        case 99556:
                        case 99582:
                        case 99640:
                        case 99752:
                        case 100208:
                        case 100511:
                        case 100542:
                        case 100730:
                        case 100882:
                        case 100958:
                        case 101460:
                        case 101671:
                        case 101854:
                        case 102556:
                        case 102572:
                        case 103404:
                        case 103438:
                        case 103637:
                        case 103649:
                        case 104074:
                        case 104269:
                        case 104417:
                        case 104430:
                        case 104435:
                        case 104474:
                        case 104479:
                        case 104582:
                        case 104587:
                        case 104987:
                        case 105532:
                        case 105543:
                        case 105551:
                        case 106202:
                        case 106496:
                        case 107141:
                        case 107305:
                        case 107932:
                        case 107988:
                        case 107989:
                        case 108341:
                        case 108382:
                        case 108413:
                        case 108419:
                        case 108426:
                        case 108430:
                        case 108570:
                        case 109824:
                        case 109860:
                        case 110754:
                        case 110801:
                        case 110834:
                        case 110883:
                        case 110968:
                        case 110989:
                        case 111052:
                        case 111220:
                        case 111265:
                        case 111269:
                        case 111390:
                        case 111420:
                        case 111482:
                        case 111494:
                        case 112185:
                        case 112712:
                        case 112788:
                        case 112862:
                        case 113115:
                        case 113132:
                        case 113291:
                        case 113698:
                        case 113700:
                        case 113837:
                        case 113854:
                        case 114101:
                        case 114130:
                        case 114276:
                        case 114381:
                        case 114809:
                        case 114922:
                        case 114970:
                        case 115161:
                        case 115312:
                        case 115639:
                        case 116079:
                        case 116537:
                        case 116551:
                        case 116609:
                        case 117218:
                        case 117537:
                        case 117840:
                        case 117938:
                        case 118023:
                        case 118026:
                        case 118028:
                        case 118439:
                        case 118783:
                        case 118807:
                        case 118939:
                        case 120703:
                        case 3003834:
                        case 3016404:
                        case 3088960:
                        case 3213227:
                        case 3271912:
                        case 3358271:
                        case 3444044:
                        case 3446979:
                        case 3447940:
                        case 3524225:
                        case 3524692:
                        case 3526257:
                        case 3682393:
                        case 35379135:
                        case 114035747:
                            break;
                    }
                }
                return true;
            }
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(substring.toLowerCase());
            if (mimeTypeFromExtension != null) {
                str2 = mimeTypeFromExtension;
            } else if (str2 != null) {
            }
            if (str2 != null && str2.equals("application/vnd.android.package-archive")) {
                if (!z9) {
                    if (Build.VERSION.SDK_INT >= 26 && !t0.b.getPackageManager().canRequestPackageInstalls()) {
                        org.telegram.ui.Components.v4.j(activity, f6Var).show();
                        return true;
                    }
                }
                return true;
            }
            if (Build.VERSION.SDK_INT < 24) {
                t0.d();
                intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", file), str2 != null ? str2 : "text/plain");
            } else {
                intent.setDataAndType(Uri.fromFile(file), str2 != null ? str2 : "text/plain");
            }
            if (str2 != null) {
                activity.startActivityForResult(intent, 500);
                return true;
            }
            try {
                activity.startActivityForResult(intent, 500);
                return true;
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 24) {
                    t0.d();
                    intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(file), "text/plain");
                }
                activity.startActivityForResult(intent, 500);
                return true;
            }
        }
        str2 = null;
        if (str2 != null) {
            if (!z9) {
            }
            return true;
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        if (str2 != null) {
        }
    }

    public static void t3(Activity activity, int i7, boolean z9) {
        if (activity != null) {
            v3(activity.getWindow(), i7, z9, null);
        }
    }

    public static void u(Context context, boolean z9) {
        if (context == null) {
            return;
        }
        context.setTheme((org.telegram.ui.ActionBar.k6.I.q() && z9) ? R.style.Theme_TMessages_Dark : R.style.Theme_TMessages);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.G1;
        }
        return (W2 == null || W2.isFinishing()) ? W(t0.b) : W2;
    }

    public static boolean u1(org.telegram.ui.ActionBar.f2 f2Var) {
        List j3;
        if (f2Var == null) {
            return false;
        }
        Dialog dialog = f2Var.visibleDialog;
        if (dialog == null || (dialog instanceof org.telegram.ui.ActionBar.u1) || ((dialog instanceof org.telegram.ui.ActionBar.v2) && ((org.telegram.ui.ActionBar.v2) dialog).f1 != null)) {
            if (f2Var.getParentLayout() == null || (j3 = j()) == null || j3.isEmpty()) {
                return false;
            }
            View view = null;
            for (int size = j3.size() - 1; size >= 0; size--) {
                view = (View) j3.get(size);
                Dialog dialog2 = f2Var.visibleDialog;
                if (dialog2 instanceof org.telegram.ui.ActionBar.u1) {
                    View view2 = ((org.telegram.ui.ActionBar.u1) dialog2).a1;
                    while (view2 != null && (view2.getParent() instanceof View)) {
                        view2 = (View) view2.getParent();
                    }
                    if (view == view2) {
                        continue;
                    }
                }
                if (!(view instanceof org.telegram.ui.ActionBar.q1) && !(view instanceof ee0)) {
                    break;
                }
            }
            View view3 = f2Var.getParentLayout().getView();
            while (view3 != null && (view3.getParent() instanceof View)) {
                view3 = (View) view3.getParent();
            }
            if (view == view3) {
                return false;
            }
        }
        return true;
    }

    public static boolean u2(ij ijVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        String str = ijVar.k.attachPath;
        File file = (str == null || str.length() == 0) ? null : new File(ijVar.k.attachPath);
        if (file == null || !file.exists()) {
            w7.G(ijVar.I1);
            file = w7.M(ijVar.k, false, true);
        }
        File file2 = file;
        int i7 = ijVar.D;
        return t2(file2, ijVar.S0(), (i7 == 9 || i7 == 0) ? ijVar.u1() : null, activity, f6Var, z9);
    }

    public static void u3(Dialog dialog, int i7, boolean z9, org.telegram.ui.Components.mg mgVar) {
        if (dialog != null) {
            v3(dialog.getWindow(), i7, z9, mgVar);
        }
    }

    public static void v(Context context, Configuration configuration) {
        Display defaultDisplay;
        try {
            float f10 = p;
            p = context.getResources().getDisplayMetrics().density;
            if (o && Math.abs(f10 - r3) > 0.001d) {
                if (org.telegram.ui.ActionBar.k6.m3 != null) {
                    org.telegram.ui.ActionBar.k6.m3 = null;
                    org.telegram.ui.ActionBar.k6.K(context, false);
                }
                if (org.telegram.ui.ActionBar.k6.B0 != null) {
                    org.telegram.ui.ActionBar.k6.B0 = null;
                    org.telegram.ui.ActionBar.k6.T(context);
                }
                if (org.telegram.ui.ActionBar.k6.Q1 != null) {
                    org.telegram.ui.ActionBar.k6.Q1 = null;
                    org.telegram.ui.ActionBar.k6.Z(context);
                }
            }
            o = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            D = configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = B;
            Point point = q;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(point);
                float refreshRate = defaultDisplay.getRefreshRate();
                r = refreshRate;
                s = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f11 : supportedRefreshRates) {
                        if (f11 > s) {
                            s = f11;
                        }
                    }
                }
                t = 1000.0f / r;
            }
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(r2 * p);
                if (Math.abs(point.x - ceil) > 3) {
                    point.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(r2 * p);
                if (Math.abs(point.y - ceil2) > 3) {
                    point.y = ceil2;
                }
            }
            if (u == 0) {
                if (Q1()) {
                    u = (int) (Q0() * 0.6f);
                    v = Q0() - L(28.0f);
                    w = Q0() - L(92.0f);
                } else {
                    u = (int) (Math.min(point.x, point.y) * 0.6f);
                    v = Math.min(point.x, point.y) - L(28.0f);
                    w = Math.min(point.x - L(64.0f), point.y) - L(28.0f);
                }
                x = L(2.0f);
            }
            if (r2.a) {
                a8.d("density = " + p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + m + ", navbar height: " + n);
            }
            e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static File v0(boolean z9) {
        int i7;
        if (z9 || !r2.b || (((i7 = Build.VERSION.SDK_INT) >= 33 && t0.b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) || (i7 <= 33 && t0.b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))) {
            return w7.z(0);
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
            if (file.mkdirs() || file.exists()) {
                return file;
            }
            if (r2.a) {
                a8.b("failed to create directory");
                return null;
            }
        } else if (r2.a) {
            a8.b("External storage is not mounted READ/WRITE.");
        }
        return null;
    }

    public static void v1(View view) {
        if (view == null) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r1.length() != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v2(TLObject tLObject, Activity activity) {
        if (tLObject == null || activity == null) {
            return false;
        }
        String str = null;
        String r10 = w7.r(null, tLObject);
        w7.G(p10.s0);
        File J2 = w7.J(tLObject, null, true, true);
        if (J2 == null || !J2.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int lastIndexOf = r10.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(r10.substring(lastIndexOf + 1).toLowerCase());
            if (mimeTypeFromExtension == null) {
                if (tLObject instanceof TLRPC.TL_document) {
                    mimeTypeFromExtension = ((TLRPC.TL_document) tLObject).mime_type;
                }
                if (mimeTypeFromExtension != null) {
                }
            }
            str = mimeTypeFromExtension;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            t0.d();
            intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", J2), str != null ? str : "text/plain");
        } else {
            intent.setDataAndType(Uri.fromFile(J2), str != null ? str : "text/plain");
        }
        if (str == null) {
            activity.startActivityForResult(intent, 500);
            return true;
        }
        try {
            activity.startActivityForResult(intent, 500);
            return true;
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 24) {
                t0.d();
                intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", J2), "text/plain");
            } else {
                intent.setDataAndType(Uri.fromFile(J2), "text/plain");
            }
            activity.startActivityForResult(intent, 500);
            return true;
        }
    }

    public static void v3(Window window, int i7, boolean z9, org.telegram.ui.Components.mg mgVar) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            l0.remove(window);
        }
        if (!z9) {
            if (mgVar != null) {
                org.telegram.ui.Components.di diVar = mgVar.b;
                diVar.F0 = -1;
                diVar.G0 = i7;
                diVar.b.invalidate();
            }
            try {
                window.setNavigationBarColor(i7);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i7);
        ofArgb.addUpdateListener(new q(0, mgVar, window));
        ofArgb.addListener(new m.a(window, 4));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(org.telegram.ui.Components.xq.f);
        ofArgb.start();
        if (l0 == null) {
            l0 = new HashMap();
        }
        l0.put(window, ofArgb);
    }

    public static boolean w(String str) {
        boolean z9;
        boolean z10;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z9 = false;
            z10 = false;
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    char charAt = str.charAt(i7);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                            z10 = true;
                        } else {
                            z9 = true;
                        }
                        if (z9 && z10) {
                            break;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    a8.g(e, true);
                    return !z9 ? false : false;
                }
            }
        } catch (Exception e11) {
            e = e11;
            z9 = false;
            z10 = false;
        }
        if (!z9 && z10) {
            return true;
        }
    }

    public static int w0(int i7, int i10) {
        int red = Color.red(i7);
        int red2 = Color.red(i10);
        int green = Color.green(i7);
        int green2 = Color.green(i10);
        int blue = Color.blue(i7);
        return Color.argb(qs.e4, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i10) / 2) + (blue / 2));
    }

    public static SpannableStringBuilder w1(CharSequence charSequence, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        int indexOf = lowerCase.indexOf(str);
        while (indexOf >= 0) {
            try {
                valueOf.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.q6, f6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            indexOf = lowerCase.indexOf(str, indexOf + 1);
        }
        return valueOf;
    }

    public static long w2(int i7, int i10) {
        return (i10 & 4294967295L) | (i7 << 32);
    }

    public static void w3(Activity activity, PictureInPictureParams pictureInPictureParams) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        if (pictureInPictureParams == null) {
            c3(activity);
            return;
        }
        try {
            activity.setPictureInPictureParams(pictureInPictureParams);
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static boolean x(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String d2 = pf.b.d(str2, false);
            int i7 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d2.indexOf(str3, i7);
                    if (indexOf == -1) {
                        return false;
                    }
                    i7 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static Bitmap x0() {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = t0.b.getResources().openRawResource(R.raw.round_blur_overlay_text);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    a8.g(th, true);
                    return bitmap;
                } finally {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        return bitmap;
    }

    public static CharSequence x1(CharSequence charSequence, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        if (arrayList != null) {
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                SpannableStringBuilder w12 = w1(charSequence, (String) arrayList.get(i10), f6Var);
                if (w12 != null) {
                    charSequence = w12;
                } else {
                    i7++;
                }
            }
            if (i7 != arrayList.size()) {
                return charSequence;
            }
        }
        return null;
    }

    public static SpannableStringBuilder x2(String str, Runnable runnable) {
        return S2(str, -1, 2, runnable, null);
    }

    public static void x3(Window window) {
        WindowManager windowManager;
        float f10 = s;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f10;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void y(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ListView) {
            Drawable selector = ((ListView) view).getSelector();
            if (selector != null) {
                selector.setState(StateSet.NOTHING);
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            background.setState(StateSet.NOTHING);
            background.jumpToCurrentState();
        }
    }

    public static void y0(Surface surface, Bitmap bitmap) {
        if (surface.isValid()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(surface, bitmap, new p(countDownLatch, 0), Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static int[] y1(double d2, double d10, double d11) {
        double d12;
        double d13 = d2 * 6.0d;
        double floor = (int) Math.floor(d13);
        double d14 = d13 - floor;
        double d15 = (1.0d - d10) * d11;
        double d16 = (1.0d - (d14 * d10)) * d11;
        double d17 = (1.0d - ((1.0d - d14) * d10)) * d11;
        int i7 = ((int) floor) % 6;
        if (i7 == 0) {
            d15 = d17;
            d17 = d15;
        } else if (i7 != 1) {
            if (i7 == 2) {
                d12 = d15;
                d15 = d11;
            } else if (i7 == 3) {
                d17 = d11;
                d11 = d15;
                d15 = d16;
            } else if (i7 == 4) {
                d12 = d17;
                d17 = d11;
            } else if (i7 != 5) {
                d11 = 0.0d;
                d17 = 0.0d;
                d15 = 0.0d;
            } else {
                d17 = d16;
            }
            d11 = d12;
        } else {
            d17 = d15;
            d15 = d11;
            d11 = d16;
        }
        return new int[]{(int) (d11 * 255.0d), (int) (d15 * 255.0d), (int) (d17 * 255.0d)};
    }

    public static String y2(File file, int i7) {
        InputStream inputStream;
        ThreadLocal threadLocal = b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            inputStream = file != null ? new FileInputStream(file) : t0.b.getResources().openRawResource(i7);
            try {
                ThreadLocal threadLocal2 = c;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[TLObject.FLAG_12];
                    threadLocal2.set(bArr2);
                }
                int i10 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, bArr2.length);
                    if (read >= 0) {
                        int i11 = i10 + read;
                        if (bArr.length < i11) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i10);
                            b.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i10, read);
                            i10 = i11;
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                inputStream.close();
                return new String(bArr, 0, i10);
            } catch (Throwable unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            inputStream = null;
        }
    }

    public static void y3(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - s) > 0.2d) {
            layoutParams.preferredRefreshRate = s;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static ByteBuffer z(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        try {
            allocate = ByteBuffer.allocate(byteBuffer.capacity());
        } catch (OutOfMemoryError unused) {
            System.gc();
            allocate = ByteBuffer.allocate(byteBuffer.capacity());
        }
        int position = byteBuffer.position();
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        allocate.position(position);
        return allocate;
    }

    public static void z0(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surfaceView, bitmap, new p(countDownLatch, 1), Utilities.g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    public static float z1(float f10, float f11, float f12) {
        return (f10 - f11) / (f12 - f11);
    }

    public static void z2(Bitmap bitmap) {
        A2(Collections.singletonList(bitmap));
    }

    public static void z3(ScrollView scrollView, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i7);
            scrollView.setBottomEdgeEffectColor(i7);
            return;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i7);
            }
            Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i7);
            }
        } catch (Exception unused) {
        }
    }
}
