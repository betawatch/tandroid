// default package

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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class gl {
    public static final byte C;
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
    public static final ik c0;
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
            Pattern.compile("[一-鿿]");
            V = Pattern.compile("[̀-ͯ\u2066-\u2067]");
            U = Pattern.compile("[\u2066-\u2067]+");
            W = Pattern.compile("([\\u0300-\\u036f]{1,2})[\\u0300-\\u036f]+");
            S = Pattern.compile("((?:(http|https|Http|Https|ton|tg|tonsite):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|" + Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))") + ")") + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        C = O1() ? (byte) 80 : (byte) 72;
        v(a.b, null);
        a0 = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        b0 = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        c0 = new ik();
        g0 = new String[]{"", "K", "M", "B", "T", "P"};
        h0 = new float[9];
        i0 = new float[9];
        j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        o0 = new Paint(1);
    }

    public static int A(int i2, int i3) {
        if (i2 == i3) {
            return 0;
        }
        return i2 > i3 ? 1 : -1;
    }

    public static Bitmap A0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            boolean[] zArr = {false};
            CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new ok(zArr, countDownLatch, (byte) 0), Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static boolean A1() {
        AccessibilityManager accessibilityManager = I;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) a.b.getSystemService("accessibility");
            I = accessibilityManager;
        }
        return accessibilityManager.isEnabled() && I.isTouchExplorationEnabled();
    }

    public static String A2(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        Pattern pattern = W;
        return (pattern == null || (matcher = pattern.matcher(str)) == null) ? str : matcher.replaceAll("$1");
    }

    public static void A3(float f2, View view, Runnable runnable) {
        if (view == null) {
            return;
        }
        int L2 = L(f2);
        if (view.getTag(R.id.spring_tag) != null) {
            ((yla) view.getTag(R.id.spring_tag)).d();
        }
        Float f3 = (Float) view.getTag(R.id.spring_was_translation_x_tag);
        if (f3 != null) {
            view.setTranslationX(f3.floatValue());
        }
        view.setTag(R.id.spring_was_translation_x_tag, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        yla ylaVar = new yla(view, yla.o, translationX);
        zla zlaVar = new zla(translationX);
        zlaVar.b(600.0f);
        ylaVar.m = zlaVar;
        ylaVar.a = (-L2) * 100;
        ylaVar.a(new lk(translationX, view, runnable));
        view.setTag(R.id.spring_tag, ylaVar);
        ylaVar.h();
    }

    public static float B(int i2) {
        return b00.y(Color.blue(i2), 0.0722f, (Color.green(i2) * 0.7152f) + (Color.red(i2) * 0.2126f), 255.0f);
    }

    public static Uri B0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File D0 = D0();
        if (!D0.isDirectory()) {
            try {
                D0.mkdirs();
            } catch (Exception e2) {
                fa4.g(e2, true);
                return null;
            }
        }
        File file = new File(D0, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 87, fileOutputStream);
                fileOutputStream.close();
                Context context = a.b;
                a.d();
                Uri c2 = FileProvider.c(context, "org.telegram.messenger.beta.provider", file);
                fileOutputStream.close();
                return c2;
            } finally {
            }
        } catch (Exception e3) {
            fa4.g(e3, true);
            return null;
        }
    }

    public static boolean B1(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        return tL_chatBannedRights == null || Math.abs(((long) tL_chatBannedRights.until_date) - (System.currentTimeMillis() / 1000)) > 157680000;
    }

    public static void B2(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void B3(View view) {
        A3(10.0f, view, null);
    }

    public static CharSequence C(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i2 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i2 < length) {
                    CharSequence charSequence2 = charSequenceArr[i2];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i2++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i2 < length2) {
            sb.append(charSequenceArr[i2]);
            i2++;
        }
        return sb.toString();
    }

    public static String C0() {
        String str;
        try {
            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
            int i2 = packageInfo.versionCode;
            int i3 = i2 / 10;
            int i4 = i2 % 10;
            if (i4 == 1 || i4 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                a.t();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return k96.a0("TelegramVersion", null, 2131743969, "v" + packageInfo.versionName + " (" + i3 + ") " + str);
        } catch (Exception e2) {
            fa4.g(e2, true);
            return null;
        }
    }

    public static boolean C1(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return C1(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static String C2(String str) {
        if (str == null) {
            return null;
        }
        Pattern pattern = X;
        if (pattern == null) {
            pattern = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
            X = pattern;
        }
        Matcher matcher = pattern.matcher(str);
        return matcher == null ? str : matcher.replaceAll("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if ((!fqe.a() ? 0 : fqe.b) != 40000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean C3() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && fqe.a()) {
        }
        return i2 < 32;
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

    public static File D0() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e2) {
            fa4.g(e2, true);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            fa4.b("external dir mounted");
            try {
                File[] externalCacheDirs = a.b.getExternalCacheDirs();
                int i2 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(gba.e0)) {
                    while (true) {
                        if (i2 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i2];
                            if (file2 != null && file2.getAbsolutePath().startsWith(gba.e0)) {
                                file = externalCacheDirs[i2];
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("check dir ");
                sb.append(file != null ? file.getPath() : null);
                sb.append(" ");
                fa4.b(sb.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    fa4.b("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        try {
            File cacheDir = a.b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e4) {
            fa4.g(e4, true);
        }
        try {
            File filesDir = a.b.getFilesDir();
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

    public static boolean D1(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.ENOSPC) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device");
    }

    public static SpannableStringBuilder D2(CharSequence charSequence, boolean z2) {
        return F2(charSequence, z2, L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    public static boolean D3(String str) {
        try {
            return w(Uri.parse(str).getHost());
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
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
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static int E0(int i2, int i3) {
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        int red2 = Color.red(i3);
        int i4 = (red + red2) / 2;
        int i5 = red - red2;
        int green2 = green - Color.green(i3);
        int blue2 = blue - Color.blue(i3);
        return ((green2 << 2) * green2) + ((((i4 + 512) * i5) * i5) >> 8) + ((((767 - i4) * blue2) * blue2) >> 8);
    }

    public static boolean E1(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.EROFS) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system");
    }

    public static SpannableStringBuilder E2(CharSequence charSequence, boolean z2, float f2, float f3) {
        return F2(charSequence, z2, f2, f3, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    public static boolean E3(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static void F(File file, File file2) {
        try {
            E(file, file2);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static String[] F0() {
        String str;
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
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
            String Q0 = k96.Q0();
            i96 i96Var = k96.D0().B;
            String str3 = i96Var.e;
            String replace = str3 == null ? "" : str3.replace("_", "-");
            boolean isEmpty = TextUtils.isEmpty(replace);
            String str4 = replace;
            if (isEmpty) {
                str4 = i96Var.c();
            }
            if (!Q0.contains(str4) && !str4.contains(Q0)) {
                str2 = str4;
            } else if (!Q0.contains("en")) {
                str2 = "en";
            }
            return !TextUtils.isEmpty(str2) ? new String[]{Q0.replace('_', '-'), str2} : new String[]{Q0.replace('_', '-')};
        } catch (Exception unused) {
            return new String[]{"en"};
        }
    }

    public static boolean F1(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode();
    }

    public static SpannableStringBuilder F2(CharSequence charSequence, boolean z2, float f2, float f3, float f4, int i2) {
        cm2 cm2Var = new cm2(i2, 0);
        float f5 = f4 * 0.88f;
        cm2Var.I = f5;
        cm2Var.J = f5;
        cm2Var.r = -f2;
        cm2Var.s = f3;
        cm2Var.H = 0.8f;
        if (z2) {
            cm2Var.f = z2;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(cm2Var, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder I2 = I2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(cm2Var, 0, 1, 33);
        SpannableStringBuilder I22 = I2(I2, spannableString2, ">");
        cm2 cm2Var2 = new cm2(i2, 0);
        cm2Var2.I = f5;
        cm2Var2.J = f5;
        cm2Var2.r = f2;
        cm2Var2.s = f3;
        cm2Var2.w = 180.0f;
        cm2Var2.H = 0.8f;
        if (z2) {
            cm2Var2.f = z2;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(cm2Var2, 0, 1, 33);
        return I2(I22, spannableString3, "<");
    }

    public static void F3(LaunchActivity launchActivity, au8 au8Var) {
        if (au8Var.g()) {
            String str = au8Var.b;
            int i2 = au8Var.c;
            String str2 = au8Var.d;
            String str3 = au8Var.e;
            String str4 = au8Var.f;
            fx0 fx0Var = new fx0(1, (wjb) null, (Context) launchActivity, false);
            fx0Var.K();
            fx0Var.v0 = false;
            fx0Var.w0 = false;
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            linearLayout.setOrientation(1);
            fx0Var.O = linearLayout;
            TextView b2 = hve.b(launchActivity, 20.0f, bkb.i5, true, null);
            b2.setText(k96.M0(2131743536, null));
            linearLayout.addView(b2, nme.t(-1, -2, 55, 22, 18, 22, 0));
            mfb mfbVar = new mfb(launchActivity, null);
            linearLayout.addView(mfbVar, nme.t(-1, -2, 55, 14, 18, 14, 0));
            if (!TextUtils.isEmpty(str)) {
                mfbVar.f(k96.M0(2131743552, null), str, null, null);
            }
            if (i2 != 0) {
                mfbVar.f(k96.M0(2131743547, null), Integer.toString(i2), null, null);
            }
            if (!TextUtils.isEmpty(str4)) {
                mfbVar.f(k96.M0(2131743545, null), str4, null, null);
            }
            if (!TextUtils.isEmpty(str2)) {
                mfbVar.f(k96.M0(2131743535, null), str2, null, null);
            }
            if (!TextUtils.isEmpty(str3)) {
                mfbVar.f(k96.M0(2131743548, null), str3, null, null);
            }
            q41[] q41VarArr = new q41[1];
            mfbVar.f(k96.M0(2131746407, null), "", null, q41VarArr);
            ((View) q41VarArr[0].getParent()).setPadding(0, 0, 0, 0);
            q41VarArr[0].setDisablePaddingsOffsetY(true);
            q41VarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
            q41VarArr[0].setText(K2(k96.M0(2131746416, null), bkb.w0(null, bkb.Wc, false), new s67(new boolean[1], q41VarArr, au8Var, launchActivity, (byte) 8)));
            if (!TextUtils.isEmpty(str4)) {
                kfb a2 = mfbVar.a(k96.M0(2131743537, null));
                a2.setFilled(true);
                wla wlaVar = (wla) a2.getChildAt(0);
                wlaVar.setTextSize(1, 11.0f);
                wlaVar.setGravity(17);
            }
            u41 u41Var = new u41(null, launchActivity, true);
            u41Var.setRoundRadius(24);
            u41Var.setText(k96.M0(2131751796, null));
            u41Var.setOnClickListener(new b0(au8Var, launchActivity, fx0Var.y0, (byte) 5));
            linearLayout.addView(u41Var, nme.t(-1, 48, 55, 14, 18, 14, 14));
            fx0Var.show();
        }
    }

    public static void G(File file) {
        try {
            if (file.exists()) {
                return;
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th) {
            fa4.g(th, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r9.startsWith("file://") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String G0(Context context, Uri uri, String str, String[] strArr) {
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
                    }
                    query.close();
                    return null;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean G1(Uri uri, int i2) {
        String str;
        if (uri == null) {
            str = "";
            int i3 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlinkFd = Utilities.readlinkFd(i2);
                    if (readlinkFd != null && !readlinkFd.equals(str)) {
                        i3++;
                        if (i3 >= 10) {
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
        if (str.matches(Pattern.quote(new File(a.b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
            return false;
        }
        int i4 = 0;
        while (str.length() <= 4096) {
            try {
                String readlink = Utilities.readlink(str);
                if (readlink != null && !readlink.equals(str)) {
                    i4++;
                    if (i4 >= 10) {
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
        return str.toLowerCase().contains("/data/data/" + a.b.getPackageName());
    }

    public static SpannableStringBuilder G2(CharSequence charSequence, CharSequence charSequence2, String str) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
        }
        return spannableStringBuilder;
    }

    public static void G3(int i2, int i3, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i2, iArr[1] - i3, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                G3(i2, i3, iArr, canvas, viewGroup.getChildAt(i4));
            }
        }
    }

    public static byte[] H(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b2 = bArr[i2];
            if (b2 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i2 + 1], 16);
                    i2 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i2], 16)));
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b2);
            }
            i2++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e3) {
            fa4.g(e3, true);
            return byteArray;
        }
    }

    public static io5 H0(vxc vxcVar, boolean z2) {
        io5 g2 = vxcVar.a.g(647);
        sxc sxcVar = vxcVar.a;
        io5 a2 = io5.a(g2, sxcVar.f(647));
        return z2 ? io5.a(a2, sxcVar.f(8)) : a2;
    }

    public static boolean H1(d dVar) {
        a.j();
        String str = "com.google.android.apps.maps";
        byte b2 = 1;
        try {
            a.b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (dVar.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
            a.j();
            alertDialog$Builder.a.U = k96.M0(2131749004, null);
            alertDialog$Builder.j(k96.M0(2131747638, null), new dg(b2, str, dVar));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            dVar.showDialog(alertDialog$Builder.a);
            return false;
        }
    }

    public static SpannableStringBuilder H2(String str, wjb wjbVar, wh0 wh0Var) {
        if (e0 == null) {
            e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = e0.matcher(str);
        byte b2 = 0;
        int i2 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i2, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new tk(wh0Var, group2, wjbVar, b2), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i2 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i2, str.length());
        return spannableStringBuilder;
    }

    public static Bitmap H3(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        G3(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static float I(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public static int I0(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 10; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                int pixel = bitmap.getPixel((int) (i6 * width), (int) (i7 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i3;
                    int green = Color.green(pixel) + i4;
                    i2++;
                    i5 = Color.blue(pixel) + i5;
                    i4 = green;
                    i3 = red;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return Color.argb(kk7.d4, i3 / i2, i4 / i2, i5 / i2);
    }

    public static boolean I1(char c2) {
        if (k0 == null) {
            k0 = new HashSet();
            int i2 = 0;
            while (true) {
                char[] cArr = j0;
                if (i2 >= cArr.length) {
                    break;
                }
                k0.add(Character.valueOf(cArr[i2]));
                i2++;
            }
        }
        return k0.contains(Character.valueOf(c2));
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, CharSequence charSequence2, String str) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str, 0);
        while (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
            indexOf = TextUtils.indexOf(spannableStringBuilder, str, indexOf + 1);
        }
        return spannableStringBuilder;
    }

    public static String I3(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String S0 = k96.D0().S0(str, true, false);
        return S0 == null ? "" : S0;
    }

    public static void J(o39 o39Var, Runnable runnable) {
        if (o39Var == null) {
            runnable.run();
        } else {
            o39Var.addOnLayoutChangeListener(new sk(o39Var, runnable));
        }
    }

    public static String J0(String str, boolean z2) {
        if (str == null) {
            return null;
        }
        Pattern pattern = n0;
        if (pattern == null) {
            pattern = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
            n0 = pattern;
        }
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        if (group != null) {
            group = group.toLowerCase();
        }
        return (z2 && group != null && group.startsWith("www.")) ? group.substring(4) : group;
    }

    public static boolean J1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence J2(CharSequence charSequence) {
        int i2 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = sb.length();
            while (i2 < length) {
                if (sb.charAt(i2) == '\n') {
                    sb.setCharAt(i2, ' ');
                }
                i2++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i2 < length2) {
                if (charSequence.charAt(i2) == '\n') {
                    spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) " ");
                }
                i2++;
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
        while (i2 < length3) {
            if (charSequence.charAt(i2) == '\n') {
                spannableStringBuilder2.replace(i2, i2 + 1, (CharSequence) " ");
            }
            i2++;
        }
        return spannableStringBuilder2;
    }

    public static CharSequence J3(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) <= ' ') {
            i2++;
        }
        while (i2 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i2;
        }
        return (i2 > 0 || length < charSequence.length()) ? charSequence.subSequence(i2, length) : charSequence;
    }

    public static void K(View view, final Runnable runnable) {
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final boolean[] zArr = new boolean[1];
        final ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = {r2};
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: kk
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair K0(d54 d54Var) {
        int i2;
        int i3 = 0;
        try {
            int i4 = 2;
            switch (d54Var.c()) {
                case 2:
                    i4 = 1;
                    break;
                case 3:
                    i2 = kk7.J2;
                    i4 = 0;
                    i3 = i2;
                    break;
                case 4:
                    break;
                case 5:
                    i3 = 270;
                    break;
                case 6:
                    i2 = 90;
                    i4 = 0;
                    i3 = i2;
                    break;
                case 7:
                    i4 = 1;
                    i3 = 270;
                    break;
                case 8:
                    i4 = 0;
                    i3 = 270;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        } catch (Exception e2) {
            fa4.g(e2, true);
            return new Pair(0, 0);
        }
    }

    public static boolean K1(Context context) {
        Activity W2 = W(context);
        if (W2 == null) {
            return true;
        }
        return (W2.isDestroyed() || W2.isFinishing()) ? false : true;
    }

    public static SpannableStringBuilder K2(String str, int i2, Runnable runnable) {
        int i3;
        int i4;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i4 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i3 = 0;
        } else {
            i3 = i4 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new zk(i2, runnable), indexOf, i3 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new rk(i2, (byte) 1), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void K3(Activity activity) {
        if (activity != null) {
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
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public static int L(float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(p * f2);
    }

    public static Pair L0(File file) {
        try {
            return K0(new d54(file));
        } catch (Exception e2) {
            fa4.g(e2, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1() {
        TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        return (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(a.b.getContentResolver(), "airplane_mode_on", 0) != 0) ? false : true;
    }

    public static SpannableStringBuilder L2(int i2, String str) {
        int i3;
        int i4;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        byte b2 = 0;
        if (indexOf < 0 || indexOf2 < 0 || (i4 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i3 = 0;
        } else {
            i3 = i4 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new rk(i2, b2), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void L3(ImageView imageView, int i2) {
        M3(imageView, imageView.getContext().getDrawable(i2));
    }

    public static int M(float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(p * f2);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return K0(new d54(inputStream));
        } catch (Exception e2) {
            fa4.g(e2, true);
            return new Pair(0, 0);
        }
    }

    public static boolean M1() {
        Boolean bool = M;
        if (bool == null) {
            Point point = q;
            bool = Boolean.valueOf(((float) ((Math.max(point.x, point.y) - m) - n)) / p <= 650.0f);
            M = bool;
        }
        return bool.booleanValue();
    }

    public static SpannableStringBuilder M2(String str, int i2, wjb wjbVar, Runnable runnable, boolean z2) {
        int i3;
        int i4;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i4 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i3 = 0;
        } else {
            i3 = i4 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new al(z2, i2, wjbVar, runnable), indexOf, i3 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new bl(z2, i2, wjbVar), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void M3(ImageView imageView, Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new nk(imageView, new AtomicBoolean(), drawable, (byte) 0));
        duration.start();
    }

    public static float N(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return p * f2;
    }

    public static Pair N0(String str) {
        try {
            return K0(new d54(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        Point point = q;
        return ((float) Math.min(point.x, point.y)) / p <= 690.0f;
    }

    public static SpannableStringBuilder N2(String str, int i2, int i3, Runnable runnable, wjb wjbVar) {
        int i4;
        int i5;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        byte b2 = 0;
        if (indexOf < 0 || indexOf2 < 0 || (i5 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i4 = 0;
        } else {
            i4 = i5 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i3 == 3) {
                int i6 = indexOf + i4;
                spannableStringBuilder.replace(indexOf, i6, (CharSequence) I2(spannableStringBuilder.subSequence(indexOf, i6), " ", " "));
            }
            if (i3 != 0 && i3 != 3 && i3 != 2 && i3 != 4) {
                spannableStringBuilder.setSpan(new yk(wjbVar, b2), indexOf, i4 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new xk(i3, i2, wjbVar, runnable), indexOf, i4 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void N3(WindowManager windowManager, gw9 gw9Var, WindowManager.LayoutParams layoutParams) {
        if (windowManager == null || gw9Var == null || gw9Var.getParent() == null) {
            return;
        }
        windowManager.updateViewLayout(gw9Var, layoutParams);
    }

    public static void O(Canvas canvas, FrameLayout frameLayout, int i2, int i3, float f2) {
        int p1 = bkb.p1(R1(0.0f, 0.75f, Q0(i3)) * f2, i2);
        Paint paint = o0;
        paint.setColor(p1);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i3, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    public static File O0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(a.b.getExternalFilesDir(null).getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(a.b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(a.b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            a.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean O1() {
        return P1() && !gba.V;
    }

    public static SpannableStringBuilder O2(String str, int i2, wl1 wl1Var) {
        return N2(str, i2, 0, wl1Var, null);
    }

    public static void O3(float f2, View view, boolean z2, boolean z3) {
        if (view != null) {
            boolean z4 = view.getParent() != null;
            view.animate().setListener(null).cancel();
            if (!z4) {
                view.setVisibility(z2 ? 0 : 8);
                view.setTag(z2 ? 1 : null);
                view.setAlpha(1.0f);
                view.setScaleX((!z3 || z2) ? 1.0f : 0.5f);
                view.setScaleY((!z3 || z2) ? 1.0f : 0.5f);
                if (f2 != 0.0f) {
                    view.setTranslationY(z2 ? 0.0f : L(-16.0f) * f2);
                    return;
                }
                return;
            }
            if (!z2) {
                ViewPropertyAnimator withEndAction = view.animate().alpha(0.0f).scaleY(z3 ? 0.5f : 1.0f).scaleX(z3 ? 0.5f : 1.0f).setListener(new id4(view)).setInterpolator(s33.h).setDuration(340L).withEndAction(null);
                if (f2 != 0.0f) {
                    withEndAction.translationY(L(-16.0f) * f2);
                }
                withEndAction.start();
                return;
            }
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(z3 ? 0.5f : 1.0f);
                view.setScaleY(z3 ? 0.5f : 1.0f);
                if (f2 != 0.0f) {
                    view.setTranslationY(L(-16.0f) * f2);
                }
            }
            ViewPropertyAnimator withEndAction2 = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(s33.h).setDuration(340L).withEndAction(null);
            if (f2 != 0.0f) {
                withEndAction2.translationY(0.0f);
            }
            withEndAction2.start();
        }
    }

    public static void P(Canvas canvas, RectF rectF, float f2) {
        float min = Math.min(f2, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float N2 = N(1.0f);
        float f3 = N2 / 2.0f;
        float max = Math.max(0.0f, min - N2);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = Y;
        paint.setStyle(style);
        paint.setStrokeWidth(N2);
        paint.setColor(bkb.p1(1.0f, 570425343));
        canvas.save();
        float f4 = rectF.left - f3;
        float f5 = rectF.top;
        if (canvas.clipRect(f4, f5, rectF.right + f3, moe.a(f5 + max, f5, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f3, rectF.right, f3 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float N3 = N(0.6666667f);
        float f6 = N3 / 2.0f;
        float max2 = Math.max(0.0f, min - N3);
        Paint paint2 = Z;
        paint2.setStyle(style);
        paint2.setStrokeWidth(N3);
        paint2.setColor(bkb.p1(1.0f, 385875967));
        canvas.save();
        float f7 = rectF.left - f6;
        float f8 = rectF.bottom;
        if (canvas.clipRect(f7, moe.a(f8 - max2, rectF.top, f8), rectF.right + f6, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f6, rectF.right, rectF.bottom - f6, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static int P0() {
        boolean N1 = N1();
        Point point = q;
        if (!N1) {
            int min = Math.min(point.x, point.y);
            return min - k1(min, 0, 0);
        }
        int min2 = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        return Math.min(min2, max - k1(max, 0, 0));
    }

    public static boolean P1() {
        Boolean bool = K;
        if (bool == null) {
            bool = Boolean.valueOf(a.b != null && a.b.getResources().getBoolean(R.bool.isTablet));
            K = bool;
        }
        return bool.booleanValue();
    }

    public static SpannableStringBuilder P2(String str, Runnable runnable) {
        return N2(str, -1, 0, runnable, null);
    }

    public static void P3(View view, boolean z2, boolean z3) {
        O3(0.0f, view, z2, z3);
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i2, TextPaint textPaint) {
        CharSequence charSequence2;
        int i3;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            int indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > 130) {
                CharSequence subSequence2 = charSequence.subSequence(Math.max(0, indexOf - 65), Math.min(length, indexOf + 65));
                try {
                    int max = indexOf - Math.max(0, indexOf - 65);
                    subSequence2.length();
                    i3 = max;
                    charSequence2 = subSequence2;
                } catch (Exception e2) {
                    e = e2;
                    charSequence2 = subSequence2;
                    fa4.g(e, true);
                    return charSequence2;
                }
            } else {
                i3 = indexOf;
                charSequence2 = charSequence;
            }
        } catch (Exception e3) {
            e = e3;
            charSequence2 = charSequence;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f2 = i2;
            if (textPaint.measureText("...") + lineWidth >= f2) {
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i5))) {
                    i5++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i5);
                if (staticLayout.isRtlCharAt(i5)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f2) {
                    float f3 = 0.1f * f2;
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f2) + f3;
                    if (charSequence2.length() - i5 > 20) {
                        measureText += f3;
                    }
                    if (measureText > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                        if (offsetForHorizontal > charSequence2.length() - 1) {
                            offsetForHorizontal = charSequence2.length() - 1;
                        }
                        int i6 = 0;
                        while (true) {
                            if (Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) || i6 >= 10) {
                                break;
                            }
                            i6++;
                            offsetForHorizontal++;
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                                break;
                            }
                        }
                        if (i6 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i4) - (f2 * 0.3f)), charSequence2.length());
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
        } catch (Exception e4) {
            e = e4;
            fa4.g(e, true);
            return charSequence2;
        }
    }

    public static float Q0(int i2) {
        return Utilities.l((i2 - L(32.0f)) / L(16.0f));
    }

    public static boolean Q1(char c2) {
        return c2 == '-' || c2 == '~';
    }

    public static SpannableStringBuilder Q2(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int t2 = t(spannableStringBuilder, "**");
                if (t2 == -1) {
                    break;
                }
                spannableStringBuilder.replace(t2, t2 + 2, "");
                int t3 = t(spannableStringBuilder, "**");
                if (t3 >= 0) {
                    spannableStringBuilder.replace(t3, t3 + 2, "");
                    arrayList.add(Integer.valueOf(t2));
                    arrayList.add(Integer.valueOf(t3));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i2 = 0; i2 < arrayList.size() / 2; i2++) {
                int i3 = i2 << 1;
                spannableStringBuilder2.setSpan(new z3c(o()), ((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList.get(i3 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return spannableStringBuilder;
        }
    }

    public static void Q3(float f2, View view, boolean z2, boolean z3) {
        T3(view, z2, f2, true, z3);
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static int R0(float f2, float f3, int i2, int i3) {
        int red = Color.red(i3);
        int green = Color.green(i3);
        int blue = Color.blue(i3);
        int alpha = Color.alpha(i3);
        int red2 = Color.red(i2);
        int green2 = Color.green(i2);
        int blue2 = Color.blue(i2);
        return Color.argb((int) yjb.z(alpha - r9, f2, Color.alpha(i2), f3), (int) (((red - red2) * f2) + red2), (int) (((green - green2) * f2) + green2), (int) (((blue - blue2) * f2) + blue2));
    }

    public static float R1(float f2, float f3, float f4) {
        return tb4.A(f3, f2, f4, f2);
    }

    public static SpannableStringBuilder R2(CharSequence charSequence) {
        return charSequence instanceof SpannableStringBuilder ? Q2((SpannableStringBuilder) charSequence) : Q2(new SpannableStringBuilder(charSequence));
    }

    public static void R3(View view, boolean z2) {
        T3(view, z2, 1.0f, true, true);
    }

    public static void S(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        gye.a(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = i2 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i3) {
                attributes.layoutInDisplayCutoutMode = i3;
                window.setAttributes(attributes);
            }
        }
        if (i2 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static String S0(Uri uri) {
        Uri uri2;
        try {
            if (DocumentsContract.isDocumentUri(a.b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else {
                    if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                        return G0(a.b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                        String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = split2[0];
                        int hashCode = str.hashCode();
                        if (hashCode == 93166550) {
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                            }
                            uri2 = null;
                        } else if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            }
                            uri2 = null;
                        } else {
                            if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            }
                            uri2 = null;
                        }
                        return G0(a.b, uri2, "_id=?", new String[]{split2[1]});
                    }
                }
            } else {
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return G0(a.b, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return null;
        }
    }

    public static float S1(float f2, float[] fArr) {
        return R1(fArr[0], fArr[1], f2);
    }

    public static SpannableStringBuilder S2(String str) {
        try {
            StringBuilder sb = new StringBuilder(str);
            while (true) {
                int indexOf = sb.indexOf("<br>");
                if (indexOf == -1) {
                    break;
                }
                sb.replace(indexOf, indexOf + 4, "\n");
            }
            while (true) {
                int indexOf2 = sb.indexOf("<br/>");
                if (indexOf2 == -1) {
                    break;
                }
                sb.replace(indexOf2, indexOf2 + 5, "\n");
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int indexOf3 = sb.indexOf("<b>");
                if (indexOf3 == -1) {
                    break;
                }
                sb.replace(indexOf3, indexOf3 + 3, "");
                int indexOf4 = sb.indexOf("</b>");
                if (indexOf4 == -1) {
                    indexOf4 = sb.indexOf("<b>");
                }
                sb.replace(indexOf4, indexOf4 + 4, "");
                arrayList.add(Integer.valueOf(indexOf3));
                arrayList.add(Integer.valueOf(indexOf4));
            }
            while (true) {
                int indexOf5 = sb.indexOf("**");
                if (indexOf5 == -1) {
                    break;
                }
                sb.replace(indexOf5, indexOf5 + 2, "");
                int indexOf6 = sb.indexOf("**");
                if (indexOf6 >= 0) {
                    sb.replace(indexOf6, indexOf6 + 2, "");
                    arrayList.add(Integer.valueOf(indexOf5));
                    arrayList.add(Integer.valueOf(indexOf6));
                }
            }
            while (true) {
                int indexOf7 = sb.indexOf("**");
                if (indexOf7 == -1) {
                    break;
                }
                sb.replace(indexOf7, indexOf7 + 2, "");
                int indexOf8 = sb.indexOf("**");
                if (indexOf8 >= 0) {
                    sb.replace(indexOf8, indexOf8 + 2, "");
                    arrayList.add(Integer.valueOf(indexOf7));
                    arrayList.add(Integer.valueOf(indexOf8));
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            for (int i2 = 0; i2 < arrayList.size() / 2; i2++) {
                int i3 = i2 << 1;
                spannableStringBuilder.setSpan(new z3c(o()), ((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList.get(i3 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void S3(View view, boolean z2, float f2, boolean z3, float f3, boolean z4, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (view != null) {
            if (view.getParent() == null) {
                z4 = false;
            }
            if (!z4) {
                view.animate().setListener(null).cancel();
                view.setVisibility(z2 ? 0 : z3 ? 8 : 4);
                view.setTag(z2 ? 1 : null);
                view.setAlpha(f3);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            if (!z2) {
                if (view.getTag() != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().alpha(0.0f).scaleY(f2).scaleX(f2).setListener(new id4(view, z3)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                    view.setTag(null);
                    return;
                }
                return;
            }
            if (view.getTag() == null) {
                view.animate().setListener(null).cancel();
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setScaleX(f2);
                    view.setScaleY(f2);
                }
                view.animate().alpha(f3).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(r0);
            }
        }
    }

    public static void T() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            if (declaredMethod.invoke(telephonyManager, null) != null) {
                throw new ClassCastException();
            }
            if (declaredMethod.invoke(telephonyManager, null) != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    public static int T0(int i2) {
        return U0(i2, false);
    }

    public static float T1(boolean z2, boolean z3, float f2) {
        return tb4.A(z3 ? 1.0f : 0.0f, z2 ? 1.0f : 0.0f, f2, z2 ? 1.0f : 0.0f);
    }

    public static CharSequence T2(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = sb.length();
            int i2 = 0;
            while (i2 < length - 2) {
                int i3 = i2 + 2;
                sb.getChars(i2, i3, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb = sb.replace(i2, i3, "\n");
                    i2--;
                    length--;
                }
                i2++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i4 = 0;
            while (i4 < length2 - 2) {
                int i5 = i4 + 2;
                spannableStringBuilder.getChars(i4, i5, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i4, i5, (CharSequence) "\n");
                    i4--;
                    length2--;
                }
                i4++;
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
        int i6 = 0;
        while (i6 < length3 - 2) {
            int i7 = i6 + 2;
            spannableStringBuilder2.getChars(i6, i7, cArr, 0);
            if (cArr[0] == '\n' && cArr[1] == '\n') {
                spannableStringBuilder2 = spannableStringBuilder2.replace(i6, i7, (CharSequence) "\n");
                i6--;
                length3--;
            }
            i6++;
        }
        return spannableStringBuilder2;
    }

    public static void T3(View view, boolean z2, float f2, boolean z3, boolean z4) {
        S3(view, z2, f2, z3, 1.0f, z4, null);
    }

    public static String U(String str) {
        return C2(A2(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r3 > 0.0f) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int U0(int i2, boolean z2) {
        float[] b2 = b(Color.red(i2), Color.green(i2), Color.blue(i2));
        float f2 = b2[1];
        if (f2 <= 0.0f) {
            float f3 = b2[2];
            if (f3 < 1.0f) {
            }
            if (!z2) {
                float f4 = b2[2];
                if (f4 <= 0.5f) {
                    b2[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (f4 * 0.65f)));
                    return a(b2[0], b2[1], b2[2]) & (z2 ? -1711276033 : 1728053247);
                }
            }
            b2[2] = Math.max(0.0f, b2[2] * 0.65f);
            return a(b2[0], b2[1], b2[2]) & (z2 ? -1711276033 : 1728053247);
        }
        b2[1] = Math.min(1.0f, ((1.0f - f2) * 0.1f) + (z2 ? 0.15f : 0.05f) + f2);
        if (!z2) {
        }
        b2[2] = Math.max(0.0f, b2[2] * 0.65f);
        return a(b2[0], b2[1], b2[2]) & (z2 ? -1711276033 : 1728053247);
    }

    public static int U1(float f2, int i2, int i3) {
        return (int) ((f2 * (i3 - i2)) + i2);
    }

    public static void U2(Activity activity, int i2) {
        if (activity == null || O1()) {
            return;
        }
        activity.getWindow().setSoftInputMode(48);
        N = i2;
    }

    public static void U3(int i2, o39 o39Var) {
        w39 adapter;
        s49 T2;
        if (o39Var == null || (adapter = o39Var.getAdapter()) == null) {
            return;
        }
        for (int i3 = 0; i3 < o39Var.getChildCount(); i3++) {
            View childAt = o39Var.getChildAt(i3);
            int R2 = RecyclerView.R(childAt);
            if (R2 >= 0 && (T2 = o39Var.T(childAt)) != null && !T2.r() && T2.b() == i2) {
                adapter.t(T2, R2);
            }
        }
    }

    public static Object V(Class cls, List list) {
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public static int V0(int i2) {
        float[] b2 = b(Color.red(i2), Color.green(i2), Color.blue(i2));
        b2[1] = Math.min(1.0f, b2[1] + 0.05f);
        float f2 = b2[2];
        float f3 = f2 * 0.9f;
        if (f2 > 0.5f) {
            b2[2] = Math.max(0.0f, f3);
        } else {
            b2[2] = Math.max(0.0f, f3);
        }
        return a(b2[0], b2[1], b2[2]) | (-16777216);
    }

    public static void V1(Rect rect, Rect rect2, float f2, Rect rect3) {
        if (rect3 != null) {
            rect3.set(U1(f2, rect.left, rect2.left), U1(f2, rect.top, rect2.top), U1(f2, rect.right, rect2.right), U1(f2, rect.bottom, rect2.bottom));
        }
    }

    public static void V2(Activity activity, int i2) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null || O1()) {
            return;
        }
        window.setSoftInputMode(16);
        N = i2;
    }

    public static void V3(o39 o39Var) {
        w39 adapter;
        s49 T2;
        if (o39Var == null || (adapter = o39Var.getAdapter()) == null) {
            return;
        }
        for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
            View childAt = o39Var.getChildAt(i2);
            int R2 = RecyclerView.R(childAt);
            if (R2 >= 0 && (T2 = o39Var.T(childAt)) != null && !T2.r()) {
                adapter.t(T2, R2);
            }
        }
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

    public static int W0(int i2) {
        return Math.max(73, (i2 >> 16) & 65535);
    }

    public static void W1(Rect rect, RectF rectF, float f2, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(R1(rect.left, rectF.left, f2), R1(rect.top, rectF.top, f2), R1(rect.right, rectF.right, f2), R1(rect.bottom, rectF.bottom, f2));
        }
    }

    public static void W2(Activity activity, int i2) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i2;
    }

    public static void W3(View view) {
        if (view != null) {
            try {
                if (view.getContext() == null || Build.VERSION.SDK_INT < 26 || !((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    return;
                }
                view.performHapticFeedback(9, 1);
            } catch (Exception unused) {
            }
        }
    }

    public static View X(ViewGroup viewGroup, float f2, float f3) {
        if (viewGroup.getVisibility() != 0) {
            return null;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    View X2 = X((ViewGroup) childAt, f2 - childAt.getLeft(), f3 - childAt.getTop());
                    if (X2 != null) {
                        return X2;
                    }
                } else if (f2 >= childAt.getX() && f2 <= childAt.getX() + childAt.getWidth() && f3 >= childAt.getY() && f2 <= childAt.getY() + childAt.getHeight()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static int X0() {
        return Y0(false);
    }

    public static void X1(RectF rectF, RectF rectF2, float f2, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(R1(rectF.left, rectF2.left, f2), R1(rectF.top, rectF2.top, f2), R1(rectF.right, rectF2.right, f2), R1(rectF.bottom, rectF2.bottom, f2));
        }
    }

    public static void X2(LaunchActivity launchActivity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            PictureInPictureParams.Builder c2 = fk.c();
            c2.setSourceRectHint(null);
            c2.setAspectRatio(null);
            if (i2 >= 31) {
                c2.setAutoEnterEnabled(false);
            }
            q3(launchActivity, c2.build());
        }
    }

    public static SpannableStringBuilder X3(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(k96.M0(2131748817, null));
        spannableString.setSpan(new vk(runnable, (byte) 0), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return D2(spannableStringBuilder, true);
    }

    public static boolean Y(ViewGroup viewGroup, float f2, float f3, y28 y28Var) {
        int i2;
        Rect rect;
        int i3 = 0;
        while (i3 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof y28) || childAt == y28Var)) {
                if (childAt instanceof u4b) {
                    w4b w4bVar = (w4b) viewGroup;
                    if (w4bVar.b == null || (f2 >= L(60.0f) && f2 <= viewGroup.getWidth() - L(60.0f))) {
                        int i4 = 0;
                        while (i4 < w4bVar.getChildCount()) {
                            View childAt2 = w4bVar.getChildAt(i4);
                            if (childAt2 instanceof c6b) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d2 = f2 - translationX;
                                i2 = i3;
                                double d3 = f3 - translationY;
                                float cos = (float) ((Math.cos(radians) * d2) - (Math.sin(radians) * d3));
                                float d4 = (float) ug8.d(radians, d3, Math.sin(radians) * d2);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && d4 >= (-measuredHeight) / 2.0f && d4 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (!rect.contains((int) f2, (int) f3) && childAt.isClickable()) {
                                        return true;
                                    }
                                    if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f2 - childAt.getX(), f3 - childAt.getY(), y28Var)) {
                                        return true;
                                    }
                                    i3 = i2 + 1;
                                }
                            } else {
                                i2 = i3;
                            }
                            i4++;
                            i3 = i2;
                        }
                    }
                }
                i2 = i3;
                rect = Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f2, (int) f3)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i3 = i2 + 1;
            }
            i2 = i3;
            i3 = i2 + 1;
        }
        return false;
    }

    public static int Y0(boolean z2) {
        if (z2) {
            Integer num = A;
            if (num == null) {
                num = 2560;
                A = num;
            }
            return num.intValue();
        }
        Integer num2 = z;
        if (num2 == null) {
            num2 = 1280;
            z = num2;
        }
        return num2.intValue();
    }

    public static void Y1(float[] fArr, float[] fArr2, float f2, float[] fArr3) {
        if (fArr3 != null) {
            int i2 = 0;
            while (i2 < fArr3.length) {
                float f3 = 0.0f;
                float f4 = (fArr == null || i2 >= fArr.length) ? 0.0f : fArr[i2];
                if (fArr2 != null && i2 < fArr2.length) {
                    f3 = fArr2[i2];
                }
                fArr3[i2] = R1(f4, f3, f2);
                i2++;
            }
        }
    }

    public static void Y2() {
        if (L == null) {
            L = Boolean.valueOf(P1());
        }
        K = null;
        if (gba.T0) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
            int i2 = sharedPreferences.getInt("fons_size", (!O1() || (a.b != null && a.b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) ? 16 : 18);
            gba.S0 = i2;
            gba.V0 = sharedPreferences.getInt("iv_font_size", i2);
        }
    }

    public static TLRPC.Document Z(long j2, List list) {
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i2);
            if (document != null && document.id == j2) {
                return document;
            }
        }
        return null;
    }

    public static float Z0(boolean z2, float f2) {
        float f3 = f2 / 2.54f;
        DisplayMetrics displayMetrics = B;
        return f3 * (z2 ? displayMetrics.xdpi : displayMetrics.ydpi);
    }

    public static float Z1(float f2, float f3, float f4) {
        return ((((((((f3 - f2) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f4) + f2) + 360.0f) % 360.0f;
    }

    public static double[] Z2(int i2, int i3, int i4) {
        double d2;
        double d3;
        double d4;
        double d5 = i2 / 255.0d;
        double d6 = i3 / 255.0d;
        double d7 = i4 / 255.0d;
        double max = (d5 <= d6 || d5 <= d7) ? Math.max(d6, d7) : d5;
        double min = (d5 >= d6 || d5 >= d7) ? Math.min(d6, d7) : d5;
        double d8 = max - min;
        double d9 = 0.0d;
        double d10 = max == 0.0d ? 0.0d : d8 / max;
        if (max != min) {
            if (d5 > d6 && d5 > d7) {
                d2 = (d6 - d7) / d8;
                d3 = d6 < d7 ? 6 : 0;
            } else if (d6 > d7) {
                d4 = 2.0d + ((d7 - d5) / d8);
                d9 = d4 / 6.0d;
            } else {
                d2 = (d5 - d6) / d8;
                d3 = 4.0d;
            }
            d4 = d2 + d3;
            d9 = d4 / 6.0d;
        }
        return new double[]{d9, d10, max};
    }

    public static int a(float f2, float f3, float f4) {
        int i2;
        int i3;
        int i4;
        if (f3 != 0.0f) {
            float floor = (f2 - ((float) Math.floor(f2))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f5 = (1.0f - f3) * f4;
            float B2 = yjb.B(f3, floor2, 1.0f, f4);
            float f6 = (1.0f - ((1.0f - floor2) * f3)) * f4;
            int i5 = (int) floor;
            if (i5 == 0) {
                i2 = (int) ((f4 * 255.0f) + 0.5f);
                i3 = (int) ((f6 * 255.0f) + 0.5f);
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            i2 = (int) ((f5 * 255.0f) + 0.5f);
                            i3 = (int) ((B2 * 255.0f) + 0.5f);
                        } else if (i5 == 4) {
                            i2 = (int) ((f6 * 255.0f) + 0.5f);
                            i3 = (int) ((f5 * 255.0f) + 0.5f);
                        } else if (i5 != 5) {
                            i2 = 0;
                        } else {
                            i2 = (int) ((f4 * 255.0f) + 0.5f);
                            i3 = (int) ((f5 * 255.0f) + 0.5f);
                            i4 = (int) ((B2 * 255.0f) + 0.5f);
                        }
                        i4 = (int) ((f4 * 255.0f) + 0.5f);
                    } else {
                        i2 = (int) ((f5 * 255.0f) + 0.5f);
                        i3 = (int) ((f4 * 255.0f) + 0.5f);
                        i4 = (int) ((f6 * 255.0f) + 0.5f);
                    }
                    return ((i2 & kk7.d4) << 16) | (-16777216) | ((i3 & kk7.d4) << 8) | (i4 & kk7.d4);
                }
                i2 = (int) ((B2 * 255.0f) + 0.5f);
                i3 = (int) ((f4 * 255.0f) + 0.5f);
            }
            i4 = (int) ((f5 * 255.0f) + 0.5f);
            return ((i2 & kk7.d4) << 16) | (-16777216) | ((i3 & kk7.d4) << 8) | (i4 & kk7.d4);
        }
        i2 = (int) ((f4 * 255.0f) + 0.5f);
        i3 = i2;
        i4 = i3;
        return ((i2 & kk7.d4) << 16) | (-16777216) | ((i3 & kk7.d4) << 8) | (i4 & kk7.d4);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("google_bug_154855417", 0);
        if (sharedPreferences.contains("fixed")) {
            return;
        }
        new File(a.h(), "ZoomTables.data").delete();
        sharedPreferences.edit().putBoolean("fixed", true).apply();
    }

    public static long a1(SharedPreferences sharedPreferences, String str, long j2) {
        try {
            return sharedPreferences.getLong(str, j2);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j2);
        }
    }

    public static void a2(RectF rectF, RectF rectF2, float f2, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float R1 = R1(rectF.centerX(), rectF2.centerX(), f2);
        float R12 = R1(rectF.centerY(), rectF2.centerY(), f2);
        float R13 = R1(rectF.width(), rectF2.width(), Math.min(1.0f, f2)) / 2.0f;
        float R14 = R1(rectF.height(), rectF2.height(), Math.min(1.0f, f2)) / 2.0f;
        rectF3.set(R1 - R13, R12 - R14, R1 + R13, R12 + R14);
    }

    public static void a3(float[] fArr, int[] iArr) {
        if (fArr == null) {
            fvc.f("percents or output is null");
            return;
        }
        if (iArr == null) {
            iArr = new int[fArr.length];
        }
        if (fArr.length != iArr.length) {
            k93.i("percents.length != output.length");
            return;
        }
        float f2 = 0.0f;
        for (float f3 : fArr) {
            f2 += f3;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            int floor = (int) Math.floor((fArr[i3] / f2) * 100.0f);
            iArr[i3] = floor;
            i2 += floor;
        }
        while (i2 < 100) {
            int i4 = -1;
            float f4 = 0.0f;
            for (int i5 = 0; i5 < fArr.length; i5++) {
                float f5 = fArr[i5];
                float f6 = (f5 / f2) - (iArr[i5] / 100.0f);
                if (f5 > 0.0f && f6 >= f4) {
                    i4 = i5;
                    f4 = f6;
                }
            }
            if (i4 < 0) {
                return;
            }
            iArr[i4] = iArr[i4] + 1;
            i2++;
        }
    }

    public static float[] b(int i2, int i3, int i4) {
        int max = Math.max(i2, i3);
        if (i4 > max) {
            max = i4;
        }
        int min = Math.min(i2, i3);
        if (i4 < min) {
            min = i4;
        }
        float f2 = max;
        float f3 = f2 / 255.0f;
        float f4 = 0.0f;
        float f5 = max != 0 ? (max - min) / f2 : 0.0f;
        if (f5 != 0.0f) {
            float f6 = max - min;
            float f7 = (max - i2) / f6;
            float f8 = (max - i3) / f6;
            float f9 = (max - i4) / f6;
            float f10 = (i2 == max ? f9 - f8 : i3 == max ? (f7 + 2.0f) - f9 : (f8 + 4.0f) - f7) / 6.0f;
            f4 = f10 < 0.0f ? f10 + 1.0f : f10;
        }
        return new float[]{f4, f5, f3};
    }

    public static double b0(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static Point b1() {
        Point point = new Point();
        try {
            ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return point;
        }
    }

    public static int b2(float f2, int i2, int i3) {
        return Color.argb(U1(f2, Color.alpha(i2), Color.alpha(i3)), U1(f2, Color.red(i2), Color.red(i3)), U1(f2, Color.green(i2), Color.green(i3)), U1(f2, Color.blue(i2), Color.blue(i3)));
    }

    public static int b3(boolean z2, boolean z3) {
        if (z2) {
            return w;
        }
        int i2 = v;
        return z3 ? i2 - L(42.0f) : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Spannable spannable, int i2, boolean z2, boolean z3) {
        Future future;
        boolean z4;
        if (spannable != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
            qk qkVar = new qk(spannableStringBuilder, i2, z2, z3);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            try {
                try {
                    try {
                        future = newSingleThreadExecutor.submit(new mk(qkVar, 0 == true ? 1 : 0));
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        newSingleThreadExecutor.shutdownNow();
                        z4 = false;
                        if (z4) {
                        }
                    }
                    try {
                        z4 = ((Boolean) future.get(200L, TimeUnit.MILLISECONDS)).booleanValue();
                    } catch (TimeoutException unused) {
                        if (future != null) {
                            future.cancel(true);
                        }
                        newSingleThreadExecutor.shutdownNow();
                        z4 = false;
                        if (z4) {
                        }
                    }
                } catch (TimeoutException unused2) {
                    future = null;
                }
                if (z4) {
                    for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                        spannable.removeSpan(uRLSpan);
                    }
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    for (int i3 = 0; i3 < uRLSpanArr.length; i3++) {
                        URLSpan uRLSpan2 = uRLSpanArr[i3];
                        spannable.setSpan(uRLSpan2, spannableStringBuilder.getSpanStart(uRLSpan2), spannableStringBuilder.getSpanEnd(uRLSpanArr[i3]), 33);
                    }
                }
            } finally {
                newSingleThreadExecutor.shutdownNow();
            }
        }
    }

    public static void c0(View view, p8c p8cVar) {
        if (!(view instanceof ViewGroup)) {
            p8cVar.a(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            p8cVar.a(view);
            c0(viewGroup.getChildAt(i2), p8cVar);
        }
    }

    public static ArrayList c1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = a.b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((File) arrayList.get(i2)).getPath().equals(file2.getPath());
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

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:197|198)(2:3|4)|5|(7:6|(4:8|9|(3:152|153|154)(9:11|12|13|(3:15|(1:17)(2:19|(4:22|(1:24)(2:30|(1:32)(2:33|(1:64)(2:39|(1:41)(2:42|(1:44)(2:45|(1:47)(2:48|(1:63)(2:54|(1:56)(2:57|(1:62)(1:61)))))))))|(1:28)|29))|18)|(1:151)(2:74|(4:144|145|(1:147)|148)(1:76))|(1:78)|79|80|(8:(1:88)|89|(1:91)(1:139)|92|(3:95|96|(8:107|(3:109|(1:121)(2:111|(2:113|114)(2:116|(2:118|119)(1:120)))|115)|122|123|(1:125)(1:137)|(1:133)|134|135)(2:104|(1:106)))|138|134|135)(3:140|141|142))|136)(1:158)|149|150|68|69|70)|159|160|161|162|(5:166|(2:185|186)(5:(1:171)|172|(2:173|(2:175|(2:178|179)(1:177))(2:183|184))|180|181)|182|163|164)|187|70) */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02b5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02b8, code lost:
    
        fa4.g(r0, r16);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c2(Uri uri, int i2, boolean z2, ArrayList arrayList, String str) {
        InputStream createInputStream;
        int i3;
        ArrayList arrayList2;
        ?? r1;
        ?? r16;
        int i4;
        int i5;
        int i6;
        byte[] H2;
        fl flVar;
        ArrayList arrayList3 = arrayList;
        int i7 = 1;
        if (z2) {
            try {
                createInputStream = a.b.getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            } catch (Throwable th) {
                th = th;
                i3 = i7;
            }
        } else {
            try {
                createInputStream = a.b.getContentResolver().openInputStream(uri);
            } catch (Throwable th2) {
                th = th2;
                i3 = 1;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(createInputStream, "UTF-8"));
        int i8 = 0;
        int i9 = 0;
        el elVar = null;
        String str2 = null;
        fl flVar2 = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            try {
                if (readLine.startsWith("PHOTO")) {
                    i9 = i7;
                } else {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            elVar = new el();
                            elVar.b = new ArrayList();
                            elVar.c = new StringBuilder();
                            arrayList4.add(elVar);
                            elVar.a = str;
                        } else if (!readLine.startsWith("END:VCARD") && arrayList3 != null) {
                            if (readLine.startsWith("TEL")) {
                                flVar = new fl();
                                flVar.c = i8;
                            } else if (readLine.startsWith("EMAIL")) {
                                flVar = new fl();
                                flVar.c = i7;
                            } else if (readLine.startsWith("ADR") || readLine.startsWith("LABEL") || readLine.startsWith("GEO")) {
                                flVar = new fl();
                                flVar.c = 2;
                            } else if (readLine.startsWith("URL")) {
                                flVar = new fl();
                                flVar.c = 3;
                            } else if (readLine.startsWith("NOTE")) {
                                flVar = new fl();
                                flVar.c = 4;
                            } else if (readLine.startsWith("BDAY")) {
                                flVar = new fl();
                                flVar.c = 5;
                            } else if (readLine.startsWith("ORG") || readLine.startsWith("TITLE") || readLine.startsWith("ROLE")) {
                                flVar = new fl();
                                flVar.c = 6;
                            } else if (readLine.startsWith("X-ANDROID")) {
                                flVar = new fl();
                                flVar.c = -1;
                            } else if (readLine.startsWith("X-PHONETIC") || !readLine.startsWith("X-")) {
                                flVar = null;
                            } else {
                                flVar = new fl();
                                flVar.c = 20;
                            }
                            if (flVar != null && flVar.c >= 0) {
                                arrayList3.add(flVar);
                            }
                            flVar2 = flVar;
                            i9 = i8;
                        }
                        i9 = i8;
                        flVar2 = null;
                    }
                    if (i9 != 0 || elVar == null) {
                        i5 = i7;
                    } else {
                        r16 = i7;
                        if (flVar2 == null) {
                            try {
                                if (elVar.c.length() > 0) {
                                    elVar.c.append('\n');
                                }
                                elVar.c.append(readLine);
                                i5 = r16;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            flVar2.a.add(readLine);
                            i5 = r16;
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i8, readLine.length() - 1);
                        i7 = i5;
                    } else {
                        if (i9 == 0 && elVar != null && flVar2 != null) {
                            flVar2.b = readLine;
                        }
                        int indexOf = readLine.indexOf(":");
                        InputStream inputStream = createInputStream;
                        String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(i8, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                        if (strArr.length >= 2 && elVar != null) {
                            if (strArr[i8].startsWith("FN") || strArr[i8].startsWith("N") || (strArr[i8].startsWith("ORG") && TextUtils.isEmpty(elVar.a))) {
                                String[] split = strArr[i8].split(";");
                                int length = split.length;
                                String[] strArr2 = strArr;
                                int i10 = i8;
                                i6 = i10;
                                String str3 = null;
                                String str4 = null;
                                while (i10 < length) {
                                    String[] split2 = split[i10].split("=");
                                    String[] strArr3 = split;
                                    if (split2.length == 2) {
                                        if (split2[i6].equals("CHARSET")) {
                                            str3 = split2[i5];
                                        } else if (split2[i6].equals("ENCODING")) {
                                            str4 = split2[i5];
                                        }
                                    }
                                    i10++;
                                    split = strArr3;
                                }
                                if (strArr2[i6].startsWith("N")) {
                                    elVar.a = strArr2[i5].replace(';', ' ').trim();
                                } else {
                                    elVar.a = strArr2[i5];
                                }
                                if (str4 != null && str4.equalsIgnoreCase("QUOTED-PRINTABLE") && (H2 = H(g1(elVar.a))) != null && H2.length != 0) {
                                    elVar.a = new String(H2, str3);
                                }
                                createInputStream = inputStream;
                                arrayList3 = arrayList;
                                i7 = i5;
                                i8 = i6;
                            } else if (strArr[i8].startsWith("TEL")) {
                                elVar.b.add(strArr[i5]);
                            }
                        }
                        i6 = i8;
                        createInputStream = inputStream;
                        arrayList3 = arrayList;
                        i7 = i5;
                        i8 = i6;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r16 = i7;
            }
            th = th3;
            i3 = r16;
            arrayList2 = null;
            r1 = i3;
            fa4.g(th, r1);
            return arrayList2;
        }
        InputStream inputStream2 = createInputStream;
        r16 = i7;
        int i11 = i8;
        bufferedReader.close();
        inputStream2.close();
        int i12 = i11;
        arrayList2 = null;
        while (i12 < arrayList4.size()) {
            try {
                el elVar2 = (el) arrayList4.get(i12);
                if (elVar2.a == null || elVar2.b.isEmpty()) {
                    i4 = i11;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    String str5 = (String) elVar2.b.get(i11);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= elVar2.b.size()) {
                            i4 = 0;
                            break;
                        }
                        String str6 = (String) elVar2.b.get(i13);
                        i4 = 0;
                        if (qu2.r(i2).m0.get(str6.substring(Math.max(0, str6.length() - 7))) != null) {
                            str5 = str6;
                            break;
                        }
                        i13++;
                    }
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                    tL_userContact_old2.phone = str5;
                    tL_userContact_old2.first_name = elVar2.a;
                    tL_userContact_old2.last_name = "";
                    tL_userContact_old2.id = 0L;
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = elVar2.c.toString();
                    restrictionReason.platform = "";
                    restrictionReason.reason = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                    arrayList2.add(tL_userContact_old2);
                }
                i12++;
                i11 = i4;
            } catch (Throwable th5) {
                th = th5;
                r1 = 1;
            }
        }
        return arrayList2;
    }

    public static void c3(Runnable runnable) {
        d3(runnable, 0L);
    }

    public static void d(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            a.b.sendBroadcast(intent);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static void d0(RecyclerView recyclerView, p8c p8cVar) {
        if (recyclerView != null) {
            for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                p8cVar.a(recyclerView.getChildAt(i2));
            }
            for (int i3 = 0; i3 < recyclerView.getCachedChildCount(); i3++) {
                p8cVar.a(recyclerView.P(i3));
            }
            for (int i4 = 0; i4 < recyclerView.getHiddenChildCount(); i4++) {
                p8cVar.a(recyclerView.W(i4));
            }
            for (int i5 = 0; i5 < recyclerView.getAttachedScrapChildCount(); i5++) {
                p8cVar.a(recyclerView.O(i5));
            }
        }
    }

    public static Bitmap d1(float f2, float f3, String str, String str2, int i2) {
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        int i3;
        int i4;
        Bitmap decodeStream;
        int i5;
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
                        fileInputStream.getChannel().position(i2);
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            fa4.g(th, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    fa4.g(e2, true);
                                }
                            }
                        }
                    }
                }
                i3 = options.outWidth;
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        if (i3 <= 0 || (i4 = options.outHeight) <= 0) {
            if (fileInputStream != null) {
                fileInputStream.close();
                return null;
            }
            return null;
        }
        if (f2 > f3 && i3 < i4) {
            f3 = f2;
            f2 = f3;
        }
        float min = Math.min(i3 / f2, i4 / f3);
        options.inSampleSize = 1;
        if (min > 1.0f) {
            do {
                i5 = options.inSampleSize << 1;
                options.inSampleSize = i5;
            } while (i5 < min);
        }
        options.inJustDecodeBounds = false;
        if (str != null) {
            decodeStream = BitmapFactory.decodeFile(str, options);
        } else {
            fileInputStream.getChannel().position(i2);
            decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
        }
        if (fileInputStream != null) {
            try {
                return decodeStream;
            } catch (Exception e22) {
            }
        }
        return decodeStream;
    }

    public static void d2(Activity activity) {
        WeakReference weakReference;
        if (activity == null || f != -10 || P1()) {
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
            int i2 = activity.getResources().getConfiguration().orientation;
            if (rotation == 3) {
                if (i2 == 1) {
                    activity.setRequestedOrientation(1);
                    return;
                } else {
                    activity.setRequestedOrientation(8);
                    return;
                }
            }
            if (rotation == 1) {
                if (i2 == 1) {
                    activity.setRequestedOrientation(9);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0) {
                if (i2 == 2) {
                    activity.setRequestedOrientation(0);
                    return;
                } else {
                    activity.setRequestedOrientation(1);
                    return;
                }
            }
            if (i2 == 2) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(9);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static void d3(Runnable runnable, long j2) {
        if (a.d == null) {
            return;
        }
        if (j2 == 0) {
            a.d.post(runnable);
        } else {
            a.d.postDelayed(runnable, j2);
        }
    }

    public static void e(String str) {
        if (str == null) {
            return;
        }
        d(new File(str));
    }

    public static String e0(int i2, double d2, double d3, int i3, int i4, boolean z2, int i5, int i6) {
        int i7 = 2;
        int min = Math.min(2, (int) Math.ceil(p));
        int i8 = i6 == -1 ? na7.q1(i2).f3 : i6;
        if (i8 != 1 && i8 != 3) {
            String str = na7.q1(i2).i3;
            return !TextUtils.isEmpty(str) ? z2 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d3), str) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min), str) : z2 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d3)) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min));
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        i96 i96Var = k96.D0().B;
        String str2 = null;
        int i9 = 0;
        while (i9 < i7) {
            int i10 = i7;
            if (strArr[i9].toLowerCase().contains(i96Var.c)) {
                str2 = strArr[i9];
            }
            i9++;
            i7 = i10;
        }
        int i11 = i7;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (!z2) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d3);
            Double valueOf2 = Double.valueOf(d2);
            Integer valueOf3 = Integer.valueOf(i5);
            Integer valueOf4 = Integer.valueOf(i3 * min);
            Integer valueOf5 = Integer.valueOf(i4 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Object[] objArr = new Object[7];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i11] = valueOf3;
            objArr[3] = valueOf4;
            objArr[4] = valueOf5;
            objArr[5] = valueOf6;
            objArr[6] = str2;
            return String.format(locale, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", objArr);
        }
        Locale locale2 = Locale.US;
        Double valueOf7 = Double.valueOf(d3);
        Double valueOf8 = Double.valueOf(d2);
        Integer valueOf9 = Integer.valueOf(i5);
        Integer valueOf10 = Integer.valueOf(i3 * min);
        Integer valueOf11 = Integer.valueOf(i4 * min);
        Integer valueOf12 = Integer.valueOf(min);
        Double valueOf13 = Double.valueOf(d3);
        Double valueOf14 = Double.valueOf(d2);
        Object[] objArr2 = new Object[9];
        objArr2[0] = valueOf7;
        objArr2[1] = valueOf8;
        objArr2[i11] = valueOf9;
        objArr2[3] = valueOf10;
        objArr2[4] = valueOf11;
        objArr2[5] = valueOf12;
        objArr2[6] = valueOf13;
        objArr2[7] = valueOf14;
        objArr2[8] = str2;
        return String.format(locale2, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", objArr2);
    }

    public static int e1() {
        float f2 = p;
        if (f2 >= 4.0f) {
            return 3;
        }
        return f2 >= 2.0f ? 2 : 1;
    }

    public static void e2(Activity activity) {
        WeakReference weakReference;
        if (activity == null || P1()) {
            return;
        }
        try {
            f = (g == -10 || (weakReference = i) == null || weakReference.get() != activity) ? activity.getRequestedOrientation() : g;
            g = -10;
            h = -10;
            i = null;
            activity.setRequestedOrientation(1);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static void e3(RectF rectF, float f2, float f3, float f4) {
        float f5 = f3 - rectF.left;
        float f6 = rectF.right - f3;
        rectF.set(f3 - (f5 * f2), f4 - ((f4 - rectF.top) * f2), (f6 * f2) + f3, ((rectF.bottom - f4) * f2) + f4);
    }

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static String f0(int i2) {
        if (i2 < 1000) {
            return Integer.toString(i2);
        }
        ArrayList arrayList = new ArrayList();
        while (i2 != 0) {
            int i3 = i2 % 1000;
            i2 /= 1000;
            if (i2 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i3)));
            } else {
                arrayList.add(Integer.toString(i3));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sb.append((String) arrayList.get(size));
            if (size != 0) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static File f1() {
        return new File(ba4.z(4), "sharing/");
    }

    public static void f2() {
        fa4.b("[FLAG_SECURE]");
    }

    public static void f3(ui5 ui5Var, String str) {
        if (ui5Var == null || str == null) {
            return;
        }
        d dVar = (d) ui5Var.getFragmentStack().get(ui5Var.getFragmentStack().size() - 1);
        try {
            Field declaredField = dVar.getClass().getDeclaredField("listView");
            declaredField.setAccessible(true);
            o39 o39Var = (o39) declaredField.get(dVar);
            o39Var.f1(new ie((Object) dVar, (Object) str, (Object) o39Var, (byte) 3), 700, true);
            declaredField.setAccessible(false);
        } catch (Throwable unused) {
        }
    }

    public static boolean g(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) a.b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, n43.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static String g0(int i2, boolean z2, boolean z3) {
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        return i3 == 0 ? z2 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i4), Integer.valueOf(i5)) : z3 ? String.format(Locale.US, "%d:%02d", Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static byte[] g1(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static void g2(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) a.b.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(TLObject.FLAG_14);
            obtain.getText().add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static void g3(Activity activity, int i2) {
        if (activity == null || O1()) {
            return;
        }
        int i3 = N;
        if (i3 == 0 || i3 == i2) {
            activity.getWindow().setSoftInputMode(48);
        }
    }

    public static void h(ColorMatrix colorMatrix, float f2) {
        float f3 = f2 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 1.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 1.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i2, boolean z2) {
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        return z2 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static Long h1(String str) {
        String i1 = i1(str);
        if (i1 == null) {
            return null;
        }
        try {
            return Utilities.A(i1);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap h2(float f2, int i2, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f2);
        int height = (int) (view.getHeight() / f2);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f3 = 1.0f / f2;
        canvas.scale(f3, f3);
        canvas.drawColor(bkb.w0(null, bkb.c6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i2, Math.max(width, height) / kk7.J2));
        return createBitmap;
    }

    public static void h3(Activity activity, boolean z2) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        j3(window.getDecorView(), z2);
    }

    public static void i(ColorMatrix colorMatrix, float f2) {
        float f3 = f2 + 1.0f;
        float f4 = 1.0f - f3;
        float f5 = 0.3086f * f4;
        float f6 = 0.6094f * f4;
        float f7 = f4 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f5 + f3, f6, f7, 0.0f, 0.0f, f5, f6 + f3, f7, 0.0f, 0.0f, f5, f6, f3 + f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String i0(long j2, boolean z2, boolean z3) {
        if (j2 == 0) {
            return String.format("%d KB", 0);
        }
        if (j2 < 1024) {
            return String.format("%d B", Long.valueOf(j2));
        }
        if (j2 < 1048576) {
            float f2 = j2 / 1024.0f;
            if (z2) {
                int i2 = (int) f2;
                if ((f2 - i2) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i2));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f2));
        }
        if (j2 < 1048576000) {
            float f3 = (j2 / 1024.0f) / 1024.0f;
            if (z2) {
                int i3 = (int) f3;
                if ((f3 - i3) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i3));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f3));
        }
        float f4 = ((int) ((j2 / 1024) / 1024)) / 1000.0f;
        if (z2) {
            int i4 = (int) f4;
            if ((f4 - i4) * 10.0f == 0.0f) {
                return String.format("%d GB", Integer.valueOf(i4));
            }
        }
        return z3 ? String.format("%.1f GB", Float.valueOf(f4)) : String.format("%.2f GB", Float.valueOf(f4));
    }

    public static String i1(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = randomAccessFile.readLine();
            if (readLine != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused3) {
                }
                return readLine;
            }
            randomAccessFile.close();
            return null;
        } catch (Exception unused4) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    public static SpannableStringBuilder i2(CharSequence charSequence, Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new vk(runnable, (byte) 1), 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void i3(Dialog dialog, boolean z2) {
        Window window;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        j3(window.getDecorView(), z2);
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
        } catch (Exception e2) {
            fa4.e("allGlobalViews()", e2);
            return null;
        }
    }

    public static String j0(int i2) {
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        return i2 < 0 ? String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i3)), Integer.valueOf(Math.abs(i4)), Integer.valueOf(Math.abs(i5))) : String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String j1(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void j2(p8c p8cVar, float f2) {
        k2(p8cVar, f2, (int) f2, null);
    }

    public static void j3(View view, boolean z2) {
        int systemUiVisibility;
        int b2;
        if (view == null || Build.VERSION.SDK_INT < 26 || systemUiVisibility == (b2 = fod.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z2))) {
            return;
        }
        view.setSystemUiVisibility(b2);
    }

    public static int k(int i2, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i2);
        int red = Color.red(i2);
        int green = Color.green(i2);
        float f2 = red;
        float f3 = green;
        float blue = Color.blue(i2);
        float f4 = alpha;
        float f5 = (array[3] * f4) + (array[2] * blue) + (array[1] * f3) + (array[0] * f2) + array[4];
        float f6 = (array[8] * f4) + (array[7] * blue) + (array[6] * f3) + (array[5] * f2) + array[9];
        float f7 = (array[13] * f4) + (array[12] * blue) + (array[11] * f3) + (array[10] * f2) + array[14];
        return Color.argb(moe.b(Math.round((array[18] * f4) + (array[17] * blue) + (array[16] * f3) + (array[15] * f2) + array[19]), 0, kk7.d4), moe.b(Math.round(f5), 0, kk7.d4), moe.b(Math.round(f6), 0, kk7.d4), moe.b(Math.round(f7), 0, kk7.d4));
    }

    public static String k0(int i2, int i3) {
        int i4 = i3 / 3600;
        int i5 = (i3 / 60) % 60;
        int i6 = i3 % 60;
        int i7 = i2 / 3600;
        int i8 = (i2 / 60) % 60;
        int i9 = i2 % 60;
        return i3 == 0 ? i7 == 0 ? String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i8), Integer.valueOf(i9)) : String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)) : (i7 == 0 && i4 == 0) ? String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i5), Integer.valueOf(i6)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int k1(int i2, int i3, int i4) {
        return Math.max(L(320.0f), (((i2 - i3) - i4) * 35) / 100) + i3;
    }

    public static void k2(p8c p8cVar, float f2, int i2, ArrayList arrayList) {
        List j2 = j();
        if (j2 == null) {
            p8cVar.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = q;
                int i3 = (int) (point.x / f2);
                int i4 = (int) (((point.y + m) + n) / f2);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f3 = 1.0f / f2;
                canvas.scale(f3, f3);
                canvas.drawColor(bkb.w0(null, bkb.c6, false));
                for (int i5 = 0; i5 < j2.size(); i5++) {
                    View view = (View) j2.get(i5);
                    if (!(view instanceof va8) && (arrayList == null || !arrayList.contains(view))) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(bm2.o(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f2, iArr[1] / f2);
                        try {
                            view.draw(canvas);
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i2, Math.max(i3, i4) / kk7.J2));
                p8cVar.a(createBitmap);
            } catch (Exception e3) {
                fa4.g(e3, true);
                p8cVar.a(null);
            }
        } finally {
            m0 = false;
        }
    }

    public static void k3(Activity activity, boolean z2) {
        if (activity != null) {
            n3(activity.getWindow(), z2);
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

    public static SpannableStringBuilder l0(CharSequence charSequence, js4 js4Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
            String str = (String) js4Var.m(Integer.valueOf(i2));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i2]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i2].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(String str, boolean z2) {
        int[] iArr = b0;
        int[] iArr2 = a0;
        if (str == null || str.length() == 0) {
            return z2 ? iArr[0] : iArr2[0];
        }
        int i2 = (str.contains(".doc") || str.contains(".txt") || str.contains(".psd")) ? 0 : (str.contains(".xls") || str.contains(".csv")) ? 1 : (str.contains(".pdf") || str.contains(".ppt") || str.contains(".key")) ? 2 : (str.contains(".zip") || str.contains(".rar") || str.contains(".ai") || str.contains(".mp3") || str.contains(".mov") || str.contains(".avi")) ? 3 : -1;
        if (i2 == -1) {
            int lastIndexOf = str.lastIndexOf(46);
            String substring = lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
            i2 = substring.length() != 0 ? substring.charAt(0) % iArr2.length : str.charAt(0) % iArr2.length;
        }
        return z2 ? iArr[i2] : iArr2[i2];
    }

    public static void l2(ColorMatrix colorMatrix, float f2) {
        colorMatrix.postConcat(new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void l3(Dialog dialog, boolean z2) {
        if (dialog != null) {
            n3(dialog.getWindow(), z2);
        }
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i2 >= 30 ? 3 : 1;
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        return charSequence.toString().contains("%s") ? l0(charSequence, new zf((byte) 22), charSequenceArr) : l0(charSequence, new zf((byte) 24), charSequenceArr);
    }

    public static CharSequence m1(CharSequence charSequence) {
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

    public static boolean m2() {
        return n2(false);
    }

    public static void m3(View view, boolean z2) {
        int systemUiVisibility;
        int b2;
        if (view == null || Build.VERSION.SDK_INT < 26 || systemUiVisibility == (b2 = fod.b((systemUiVisibility = view.getSystemUiVisibility()), TLObject.FLAG_13, z2))) {
            return;
        }
        view.setSystemUiVisibility(b2);
    }

    public static void n(Animator animator, double d2, double d3) {
        double d4;
        double d5;
        double sqrt = Math.sqrt(d2 / 1.0d);
        double sqrt2 = d3 / (Math.sqrt(d2 * 1.0d) * 2.0d);
        if (sqrt2 < 1.0d) {
            d5 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d4 = ((sqrt2 * sqrt) + (-0.0d)) / d5;
        } else {
            d4 = (-0.0d) + sqrt;
            d5 = 0.0d;
        }
        double d6 = d5;
        double d7 = d4;
        animator.setDuration((long) (((-5.991464547107982d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new wk(sqrt2, sqrt, d6, d7));
    }

    public static String n0(int i2) {
        String str;
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        if (i3 > 0) {
            Locale locale = Locale.US;
            str = oo1.n(i3, "h");
        } else {
            str = "";
        }
        if (i4 > 0) {
            str = str.concat(String.format(Locale.US, i3 > 0 ? "%02dm" : "%dm", Integer.valueOf(i4)));
        }
        return str.concat(String.format(Locale.US, (i3 > 0 || i4 > 0) ? "%02ds" : "%ds", Integer.valueOf(i5)));
    }

    public static Typeface n1(String str) {
        Typeface createFromAsset;
        Typeface typeface;
        Hashtable hashtable = d;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        fk.e();
                        Typeface.Builder builder = new Typeface.Builder(a.b.getAssets(), str);
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
                        createFromAsset = Typeface.createFromAsset(a.b.getAssets(), str);
                    }
                    hashtable.put(str, createFromAsset);
                } catch (Exception e2) {
                    if (w01.a) {
                        fa4.d("Could not get typeface '" + str + "' because " + e2.getMessage());
                    }
                    return null;
                }
            }
            typeface = (Typeface) hashtable.get(str);
        }
        return typeface;
    }

    public static boolean n2(boolean z2) {
        ur urVar = ur.f;
        if (z2) {
            urVar.getClass();
            if (SystemClock.elapsedRealtime() - urVar.c < 200) {
                urVar.b = false;
            }
        }
        boolean z3 = urVar.b;
        if (z2) {
            ur.f.b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (w01.a && z2 && gba.r.length() > 0) {
            fa4.b("wasInBackground = " + z3 + " appLocked = " + gba.w + " autoLockIn = " + gba.x + " lastPauseTime = " + gba.A + " uptime = " + elapsedRealtime);
        }
        if (gba.r.length() > 0 && z3) {
            if (gba.w) {
                return true;
            }
            if ((gba.x != 0 && gba.A != 0 && !gba.w && gba.A + gba.x <= elapsedRealtime) || elapsedRealtime + 5 < gba.A) {
                return true;
            }
        }
        return false;
    }

    public static void n3(Window window, boolean z2) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b2 = fod.b(systemUiVisibility, TLObject.FLAG_13, z2);
        if (systemUiVisibility != b2) {
            decorView.setSystemUiVisibility(b2);
        }
        if (Build.VERSION.SDK_INT >= 35 || window.getStatusBarColor() == 0) {
            return;
        }
        window.setStatusBarColor(0);
    }

    public static Typeface o() {
        Typeface typeface = a;
        if (typeface != null) {
            return typeface;
        }
        if (!gba.R0 || Build.VERSION.SDK_INT < 28) {
            Typeface n1 = n1("fonts/rmedium.ttf");
            a = n1;
            return n1;
        }
        Typeface create = Typeface.create(null, 500, false);
        a = create;
        return create;
    }

    public static String o0(int i2, int i3) {
        String[] strArr;
        if (i2 == 0) {
            return "0";
        }
        float f2 = i2;
        if (i3 == 0) {
            i3 = i2;
        }
        if (i3 < 1000) {
            return f0(i2);
        }
        int i4 = 0;
        while (true) {
            strArr = g0;
            if (i3 < 1000 || i4 >= strArr.length - 1) {
                break;
            }
            i3 /= 1000;
            f2 /= 1000.0f;
            i4++;
        }
        if (f2 < 0.1d) {
            return "0";
        }
        float f3 = f2 * 10.0f;
        float f4 = (int) f3;
        if (f3 != f4) {
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f4 / 10.0f), strArr[i4]);
        }
        Locale locale = Locale.ENGLISH;
        return tb4.o(f0((int) f2), strArr[i4]);
    }

    public static int o1(View view) {
        if (view != null) {
            int height = view.getHeight();
            Point point = q;
            if (height != point.y && view.getHeight() != point.y - m) {
                try {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
        }
        return 0;
    }

    public static void o2(long j2, StringBuilder sb) {
        if (j2 >= 10) {
            sb.append(j2);
        } else {
            sb.append("0");
            sb.append(j2);
        }
    }

    public static void o3(Dialog dialog, int i2, boolean z2, fz1 fz1Var) {
        if (dialog != null) {
            p3(dialog.getWindow(), i2, z2, fz1Var);
        }
    }

    public static int p(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
                if (createScaledBitmap != null) {
                    int pixel = createScaledBitmap.getPixel(0, 0);
                    if (bitmap != createScaledBitmap) {
                        createScaledBitmap.recycle();
                    }
                    return pixel;
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
                return 0;
            }
        }
        return 0;
    }

    public static String p0(int i2, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i2 != 0) {
            return tb4.y("VID_", format, ".mp4");
        }
        StringBuilder p2 = ug8.p("IMG_", format, ".");
        if (TextUtils.isEmpty(str)) {
            str = "jpg";
        }
        p2.append(str);
        return p2.toString();
    }

    public static void p1(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view == null || viewGroup == null) {
            return;
        }
        while (view != viewGroup) {
            if (!(view.getParent() instanceof gec)) {
                fArr[0] = view.getX() + fArr[0];
                fArr[1] = view.getY() + fArr[1];
            }
            view = (View) view.getParent();
        }
    }

    public static void p2(sca scaVar) {
        if (scaVar == null || scaVar.getAdapter() == null) {
            return;
        }
        if (scaVar.d0()) {
            scaVar.post(new b1(scaVar, (byte) 12));
        } else {
            scaVar.getAdapter().f();
        }
    }

    public static void p3(Window window, int i2, boolean z2, fz1 fz1Var) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            l0.remove(window);
        }
        if (!z2) {
            if (fz1Var != null) {
                x02 x02Var = fz1Var.b;
                x02Var.G0 = -1;
                x02Var.H0 = i2;
                x02Var.b.invalidate();
            }
            try {
                window.setNavigationBarColor(i2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i2);
        ofArgb.addUpdateListener(new pk(fz1Var, window, (byte) 0));
        ofArgb.addListener(new g0(window, (byte) 6));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(s33.f);
        ofArgb.start();
        HashMap hashMap2 = l0;
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            l0 = hashMap2;
        }
        hashMap2.put(window, ofArgb);
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof p72) {
            return q(((p72) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i2 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i2 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i2 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof wd0) {
                int[] iArr2 = ((wd0) drawable).a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i2 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i2 = iArr2[0];
                    }
                }
            } else if (drawable instanceof ye7) {
                iArr[2] = 754974720;
                iArr[0] = 754974720;
                iArr[3] = 1023410176;
                iArr[1] = 1023410176;
                return iArr;
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        double[] Z2 = Z2((i2 >> 16) & kk7.d4, (i2 >> 8) & kk7.d4, i2 & kk7.d4);
        double d2 = Z2[1];
        Z2[1] = Math.min(1.0d, ((1.0d - d2) * 0.1d) + 0.05d + d2);
        int[] w1 = w1(Z2[0], Z2[1], Math.max(0.0d, Z2[2] * 0.65d));
        iArr[0] = Color.argb(kk7.m1, w1[0], w1[1], w1[2]);
        iArr[1] = Color.argb(kk7.R1, w1[0], w1[1], w1[2]);
        int[] w12 = w1(Z2[0], Z2[1], Math.max(0.0d, Z2[2] * 0.72d));
        iArr[2] = Color.argb(kk7.m1, w12[0], w12[1], w12[2]);
        iArr[3] = Color.argb(kk7.R1, w12[0], w12[1], w12[2]);
        return iArr;
    }

    public static File q0(String str, boolean z2) {
        try {
            File z3 = ba4.z(100);
            return (z2 || z3 == null) ? new File(a.b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str)) : new File(z3, p0(0, str));
        } catch (Exception e2) {
            fa4.g(e2, true);
            return null;
        }
    }

    public static int q1(int i2, boolean z2) {
        int i3 = z2 ? i2 + kk7.J2 : i2 - 180;
        while (i3 >= 360) {
            i3 -= 360;
        }
        while (i3 < 0) {
            i3 += 360;
        }
        return i3;
    }

    public static void q2(k27 k27Var, Activity activity, d dVar) {
        TLRPC.Document F0;
        char c2;
        String str;
        if (k27Var == null || (F0 = k27Var.F0()) == null) {
            return;
        }
        String r2 = k27Var.k.media != null ? ba4.r(null, F0) : "";
        String str2 = k27Var.k.attachPath;
        File file = (str2 == null || str2.length() == 0) ? null : new File(k27Var.k.attachPath);
        if (file == null || !file.exists()) {
            ba4.G(y6c.t0);
            file = ba4.M(k27Var.k, false, true);
        }
        if (file == null || !file.exists()) {
            return;
        }
        if (dVar != null && file.getName().toLowerCase().endsWith("attheme")) {
            akb u2 = bkb.u(file, k27Var.I0(), null, true);
            if (u2 != null) {
                dVar.presentFragment(new qmb(u2));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            HashMap hashMap = new HashMap();
            int i2 = bkb.K5;
            hashMap.put("info1", Integer.valueOf(dVar.getThemedColor(i2)));
            hashMap.put("info2", Integer.valueOf(dVar.getThemedColor(i2)));
            alertDialog$Builder.l(R.raw.not_available, 52, dVar.getThemedColor(i2), hashMap);
            hd hdVar = alertDialog$Builder.a;
            hdVar.X = true;
            hdVar.U = k96.M0(2131749008, null);
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            dVar.showDialog(hdVar);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            c2 = 0;
            try {
                int lastIndexOf = r2.lastIndexOf(46);
                if (lastIndexOf == -1 || ((str = singleton.getMimeTypeFromExtension(r2.substring(lastIndexOf + 1).toLowerCase())) == null && ((str = F0.mime_type) == null || str.length() == 0))) {
                    str = null;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    a.d();
                    intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", file), str != null ? str : "text/plain");
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
                        a.d();
                        intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file), "text/plain");
                    }
                    activity.startActivityForResult(intent, 500);
                }
            } catch (Exception unused2) {
                if (activity != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    HashMap hashMap2 = new HashMap();
                    int i3 = bkb.K5;
                    hashMap2.put("info1", Integer.valueOf(dVar.getThemedColor(i3)));
                    hashMap2.put("info2", Integer.valueOf(dVar.getThemedColor(i3)));
                    alertDialog$Builder2.l(R.raw.not_available, 52, dVar.getThemedColor(i3), hashMap2);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.X = true;
                    alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                    Object[] objArr = new Object[1];
                    objArr[c2] = k27Var.F0().mime_type;
                    hdVar2.U = k96.a0("NoHandleAppInstalled", null, 2131748013, objArr);
                    dVar.showDialog(hdVar2);
                }
            }
        } catch (Exception unused3) {
            c2 = 0;
        }
    }

    public static void q3(LaunchActivity launchActivity, PictureInPictureParams pictureInPictureParams) {
        if (launchActivity == null || launchActivity.isDestroyed()) {
            return;
        }
        if (pictureInPictureParams == null) {
            X2(launchActivity);
            return;
        }
        try {
            launchActivity.setPictureInPictureParams(pictureInPictureParams);
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    public static void r(Runnable runnable) {
        if (a.d == null) {
            return;
        }
        a.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null || str.length() == 0) {
            str = str2;
        } else if (str2 != null && str2.length() != 0) {
            str = tb4.y(str, " ", str2);
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i2 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i2);
            if (indexOf == -1) {
                break;
            }
            int i3 = indexOf - (indexOf == 0 ? 0 : 1);
            int length = str3.length() + (indexOf == 0 ? 0 : 1) + i3;
            if (i2 != 0) {
                if (i2 != i3 + 1) {
                    spannableStringBuilder.append((CharSequence) trim.substring(i2, i3));
                }
            } else if (i3 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i3));
            }
            String substring = trim.substring(i3, Math.min(trim.length(), length));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new cm4(bkb.p6, null), length2, trim2.length() + length2, 33);
            i2 = length;
        }
        if (i2 != -1 && i2 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i2));
        }
        return spannableStringBuilder;
    }

    public static boolean r1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        au8 d2;
        if (intent == null) {
            return false;
        }
        try {
            if ((intent.getFlags() & TLObject.FLAG_20) != 0 || (data = intent.getData()) == null || (d2 = au8.d(data)) == null || !d2.g()) {
                return false;
            }
            F3(launchActivity, d2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean r2(k27 k27Var, Activity activity, wjb wjbVar, boolean z2) {
        String str = k27Var.k.attachPath;
        File file = (str == null || str.length() == 0) ? null : new File(k27Var.k.attachPath);
        if (file == null || !file.exists()) {
            ba4.G(k27Var.K1);
            file = ba4.M(k27Var.k, false, true);
        }
        File file2 = file;
        int i2 = k27Var.D;
        return s2(file2, k27Var.S0(), (i2 == 9 || i2 == 0) ? k27Var.t1() : null, activity, wjbVar, z2);
    }

    public static void r3(Window window) {
        WindowManager windowManager;
        float f2 = s;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f2;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static float s(float f2, float f3, float f4, float f5) {
        if (f4 <= 0.0f) {
            return f2;
        }
        float min = Math.min(f5, f4) * (1.0f / f4);
        return moe.a((f2 - ((1.0f - min) * (f3 / f4))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z2) {
        try {
            File v0 = v0(z2);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
            SimpleDateFormat simpleDateFormat = f0;
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
                f0 = simpleDateFormat;
            }
            return new File(v0, "VID_" + simpleDateFormat.format(date) + ".mp4");
        } catch (Exception e2) {
            fa4.g(e2, true);
            return null;
        }
    }

    public static boolean s1(d dVar) {
        List j2;
        if (dVar == null) {
            return false;
        }
        Dialog dialog = dVar.visibleDialog;
        if (dialog == null || (dialog instanceof hd) || ((dialog instanceof fx0) && ((fx0) dialog).i1 != null)) {
            if (dVar.getParentLayout() == null || (j2 = j()) == null || j2.isEmpty()) {
                return false;
            }
            View view = null;
            for (int size = j2.size() - 1; size >= 0; size--) {
                view = (View) j2.get(size);
                Dialog dialog2 = dVar.visibleDialog;
                if (dialog2 instanceof hd) {
                    View view2 = ((hd) dialog2).b1;
                    while (view2 != null && (view2.getParent() instanceof View)) {
                        view2 = (View) view2.getParent();
                    }
                    if (view == view2) {
                        continue;
                    }
                }
                if (!(view instanceof cd) && !(view instanceof va8)) {
                    break;
                }
            }
            View view3 = dVar.getParentLayout().getView();
            while (view3 != null && (view3.getParent() instanceof View)) {
                view3 = (View) view3.getParent();
            }
            if (view == view3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r8.length() != 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s2(File file, String str, String str2, Activity activity, wjb wjbVar, boolean z2) {
        if (file == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int lastIndexOf = str == null ? -1 : str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            if (z2) {
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
                return true;
            }
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(substring.toLowerCase());
            if (mimeTypeFromExtension != null) {
                str2 = mimeTypeFromExtension;
            } else if (str2 != null) {
            }
            if (str2 != null && str2.equals("application/vnd.android.package-archive")) {
                if (!z2) {
                    if (Build.VERSION.SDK_INT >= 26 && !a.b.getPackageManager().canRequestPackageInstalls()) {
                        ij.j(activity, wjbVar).show();
                        return true;
                    }
                }
                return true;
            }
            if (Build.VERSION.SDK_INT < 24) {
                a.d();
                intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", file), str2 != null ? str2 : "text/plain");
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
                    a.d();
                    intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(file), "text/plain");
                }
                activity.startActivityForResult(intent, 500);
                return true;
            }
        }
        str2 = null;
        if (str2 != null) {
            if (!z2) {
            }
            return true;
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        if (str2 != null) {
        }
    }

    public static void s3(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager == null || Math.abs(layoutParams.preferredRefreshRate - s) <= 0.2d) {
            return;
        }
        layoutParams.preferredRefreshRate = s;
        if (view.isAttachedToWindow()) {
            try {
                windowManager.updateViewLayout(view, layoutParams);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int t(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null || charSequence2.length() <= 0) {
            return -1;
        }
        int i2 = 0;
        while (i2 <= charSequence.length() - charSequence2.length()) {
            for (int i3 = 0; i3 < charSequence2.length(); i3++) {
                if (charSequence2.charAt(i3) != charSequence.charAt(i2 + i3)) {
                    break;
                }
            }
            return i2;
        }
        return -1;
    }

    public static int t0() {
        if (y6c.h(y6c.t0).o() && !ConnectionsManager.getInstance(y6c.t0).isTestBackend()) {
            return y6c.t0;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (y6c.h(i2).o() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                return i2;
            }
        }
        return y6c.t0;
    }

    public static void t1(View view) {
        if (view != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r1.length() != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t2(TLObject tLObject, Activity activity) {
        if (tLObject == null || activity == null) {
            return false;
        }
        String str = null;
        String r2 = ba4.r(null, tLObject);
        ba4.G(y6c.t0);
        File J2 = ba4.J(tLObject, null, true, true);
        if (J2 == null || !J2.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int lastIndexOf = r2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(r2.substring(lastIndexOf + 1).toLowerCase());
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
            a.d();
            intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", J2), str != null ? str : "text/plain");
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
                a.d();
                intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", J2), "text/plain");
            } else {
                intent.setDataAndType(Uri.fromFile(J2), "text/plain");
            }
            activity.startActivityForResult(intent, 500);
            return true;
        }
    }

    public static void t3(tv tvVar, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            tvVar.setEdgeEffectColor(i2);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(tvVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i2);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(tvVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i2);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static void u(Context context, boolean z2) {
        if (context == null) {
            return;
        }
        context.setTheme((bkb.I.o() && z2) ? R.style.Theme_TMessages_Dark : R.style.Theme_TMessages);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.H1;
        }
        return (W2 == null || W2.isFinishing()) ? W(a.b) : W2;
    }

    public static SpannableStringBuilder u1(CharSequence charSequence, String str, wjb wjbVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        int indexOf = lowerCase.indexOf(str);
        while (indexOf >= 0) {
            try {
                valueOf.setSpan(new cm4(bkb.p6, wjbVar), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            indexOf = lowerCase.indexOf(str, indexOf + 1);
        }
        return valueOf;
    }

    public static long u2(int i2, int i3) {
        return (i2 << 32) | (i3 & 4294967295L);
    }

    public static void u3(ScrollView scrollView, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i2);
            scrollView.setBottomEdgeEffectColor(i2);
            return;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i2);
            }
            Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i2);
            }
        } catch (Exception unused) {
        }
    }

    public static void v(Context context, Configuration configuration) {
        Display defaultDisplay;
        try {
            float f2 = p;
            p = context.getResources().getDisplayMetrics().density;
            if (o && Math.abs(f2 - r3) > 0.001d) {
                if (bkb.l3 != null) {
                    bkb.l3 = null;
                    bkb.J(context, false);
                }
                if (bkb.A0 != null) {
                    bkb.A0 = null;
                    bkb.S(context);
                }
                if (bkb.P1 != null) {
                    bkb.P1 = null;
                    bkb.X(context);
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
                    for (float f3 : supportedRefreshRates) {
                        if (f3 > s) {
                            s = f3;
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
                if (O1()) {
                    u = (int) (P0() * 0.6f);
                    v = P0() - L(28.0f);
                    w = P0() - L(92.0f);
                } else {
                    u = (int) (Math.min(point.x, point.y) * 0.6f);
                    v = Math.min(point.x, point.y) - L(28.0f);
                    w = Math.min(point.x - L(64.0f), point.y) - L(28.0f);
                }
                x = L(2.0f);
            }
            if (w01.a) {
                fa4.d("density = " + p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + m + ", navbar height: " + n);
            }
            e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public static File v0(boolean z2) {
        int i2;
        if (z2 || !w01.b || (((i2 = Build.VERSION.SDK_INT) >= 33 && a.b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) || (i2 <= 33 && a.b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))) {
            return ba4.z(0);
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
            if (file.mkdirs() || file.exists()) {
                return file;
            }
            if (w01.a) {
                fa4.b("failed to create directory");
                return null;
            }
        } else if (w01.a) {
            fa4.b("External storage is not mounted READ/WRITE.");
        }
        return null;
    }

    public static CharSequence v1(CharSequence charSequence, ArrayList arrayList, wjb wjbVar) {
        if (arrayList != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                SpannableStringBuilder u1 = u1(charSequence, (String) arrayList.get(i3), wjbVar);
                if (u1 != null) {
                    charSequence = u1;
                } else {
                    i2++;
                }
            }
            if (i2 != arrayList.size()) {
                return charSequence;
            }
        }
        return null;
    }

    public static String v2(File file, int i2) {
        InputStream inputStream;
        ThreadLocal threadLocal = b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            inputStream = file != null ? new FileInputStream(file) : a.b.getResources().openRawResource(i2);
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            ThreadLocal threadLocal2 = c;
            byte[] bArr2 = (byte[]) threadLocal2.get();
            if (bArr2 == null) {
                bArr2 = new byte[TLObject.FLAG_12];
                threadLocal2.set(bArr2);
            }
            int i3 = 0;
            while (true) {
                int read = inputStream.read(bArr2, 0, bArr2.length);
                if (read >= 0) {
                    int i4 = i3 + read;
                    if (bArr.length < i4) {
                        byte[] bArr3 = new byte[bArr.length << 1];
                        System.arraycopy(bArr, 0, bArr3, 0, i3);
                        b.set(bArr3);
                        bArr = bArr3;
                    }
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i3, read);
                        i3 = i4;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            inputStream.close();
            return new String(bArr, 0, i3);
        } catch (Throwable unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        }
    }

    public static void v3(View view, int i2, int i3, int i4, int i5) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin == i2 && marginLayoutParams.topMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.bottomMargin == i5) {
                    return;
                }
                marginLayoutParams.leftMargin = i2;
                marginLayoutParams.topMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.bottomMargin = i5;
                view.requestLayout();
            }
        }
    }

    public static boolean w(String str) {
        boolean z2;
        boolean z3;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z2 = false;
            z3 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    char charAt = str.charAt(i2);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                        if (z2 && z3) {
                            break;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    fa4.g(e, true);
                    return !z2 ? false : false;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z2 = false;
            z3 = false;
        }
        if (!z2 && z3) {
            return true;
        }
    }

    public static int w0(int i2, int i3) {
        int red = Color.red(i2);
        int red2 = Color.red(i3);
        int green = Color.green(i2);
        int green2 = Color.green(i3);
        int blue = Color.blue(i2);
        return Color.argb(kk7.d4, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i3) / 2) + (blue / 2));
    }

    public static int[] w1(double d2, double d3, double d4) {
        double d5;
        double d6 = d2 * 6.0d;
        double floor = (int) Math.floor(d6);
        double d7 = d6 - floor;
        double d8 = (1.0d - d3) * d4;
        double d9 = (1.0d - (d7 * d3)) * d4;
        double d10 = (1.0d - ((1.0d - d7) * d3)) * d4;
        int i2 = ((int) floor) % 6;
        if (i2 == 0) {
            d8 = d10;
            d10 = d8;
        } else if (i2 != 1) {
            if (i2 == 2) {
                d5 = d8;
                d8 = d4;
            } else if (i2 == 3) {
                d10 = d4;
                d4 = d8;
                d8 = d9;
            } else if (i2 == 4) {
                d5 = d10;
                d10 = d4;
            } else if (i2 != 5) {
                d4 = 0.0d;
                d10 = 0.0d;
                d8 = 0.0d;
            } else {
                d10 = d9;
            }
            d4 = d5;
        } else {
            d10 = d8;
            d8 = d4;
            d4 = d9;
        }
        return new int[]{(int) (d4 * 255.0d), (int) (d8 * 255.0d), (int) (d10 * 255.0d)};
    }

    public static void w2(Bitmap bitmap) {
        x2(Collections.singletonList(bitmap));
    }

    public static void w3(gec gecVar, int i2) {
        try {
            Field declaredField = gec.class.getDeclaredField("g0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(gecVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i2);
            }
            Field declaredField2 = gec.class.getDeclaredField("h0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(gecVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i2);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean x(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String h2 = p38.h(str2, false);
            int i2 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = h2.indexOf(str3, i2);
                    if (indexOf == -1) {
                        return false;
                    }
                    i2 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static void x0(Surface surface, Bitmap bitmap) {
        if (surface.isValid()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(surface, bitmap, new gk(countDownLatch, (byte) 1), Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static float x1(float f2, float f3, float f4) {
        return (f2 - f3) / (f4 - f3);
    }

    public static void x2(List list) {
        if (Build.VERSION.SDK_INT <= 23 || list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bitmap bitmap = (Bitmap) list.get(i2);
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList.add(new WeakReference(bitmap));
            }
        }
        d3(new re(arrayList, (byte) 2), 36L);
    }

    public static void x3(boolean z2) {
        synchronized (l) {
            try {
                CallReceiver callReceiver = d0;
                if (z2) {
                    if (callReceiver == null) {
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                        if (Build.VERSION.SDK_INT >= 33) {
                            Context context = a.b;
                            CallReceiver callReceiver2 = new CallReceiver();
                            d0 = callReceiver2;
                            context.registerReceiver(callReceiver2, intentFilter, 4);
                        } else {
                            Context context2 = a.b;
                            CallReceiver callReceiver3 = new CallReceiver();
                            d0 = callReceiver3;
                            context2.registerReceiver(callReceiver3, intentFilter);
                        }
                    }
                } else if (callReceiver != null) {
                    a.b.unregisterReceiver(d0);
                    d0 = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void y(View view) {
        if (view != null) {
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
    }

    public static void y0(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surfaceView, bitmap, new gk(countDownLatch, (byte) 0), Utilities.g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public static int y1(String str, String str2) {
        if (str2.isEmpty() || str.isEmpty()) {
            return str.indexOf(str2);
        }
        for (int i2 = 0; i2 < str.length() && str2.length() + i2 <= str.length(); i2++) {
            int i3 = 0;
            for (int i4 = i2; i4 < str.length() && i3 < str2.length() && Character.toLowerCase(str.charAt(i4)) == Character.toLowerCase(str2.charAt(i3)); i4++) {
                i3++;
            }
            if (i3 == str2.length()) {
                return i2;
            }
        }
        return -1;
    }

    public static void y2(Activity activity, int i2) {
        if (activity == null || O1() || N != i2) {
            return;
        }
        activity.getWindow().setSoftInputMode(32);
    }

    public static void y3(boolean z2) {
        synchronized (k) {
            j = z2;
            if (z2) {
                try {
                    u84 u84Var = new u84(a.b, u84.q, vn.g, ay4.c);
                    agb b2 = bgb.b();
                    b2.a = new gcd();
                    b2.c = new f84[]{eed.a};
                    b2.d = (char) 1567;
                    u84Var.e(1, b2.a()).addOnSuccessListener(new zf((byte) 23));
                } catch (Throwable th) {
                    fa4.g(th, true);
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

    public static void z0(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView == null || a.d == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        PixelCopy.request(surfaceView, bitmap, new gk(runnable, (byte) 2), a.d);
    }

    public static boolean z1(int i2, int i3, int i4, int i5) {
        return Math.max(i2, i3) > Math.min(i4, i5) && Math.max(i4, i5) > Math.min(i2, i3);
    }

    public static void z2(Activity activity, int i2) {
        if (activity == null || O != i2) {
            return;
        }
        activity.getWindow().clearFlags(131072);
    }

    public static void z3(View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.shake_animation);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jk(view, (byte) 0));
        ofFloat.addListener(new uk(view, (byte) 0));
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.shake_animation, ofFloat);
    }
}
