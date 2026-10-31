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
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.et0;
import org.telegram.ui.m91;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class i0 {
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
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        C = Q1() ? 80 : 72;
        v(w0.b, null);
        a0 = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        b0 = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        c0 = new f();
        g0 = new String[]{"", "K", "M", "B", "T", "P"};
        h0 = new float[9];
        i0 = new float[9];
        j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        o0 = new Paint(1);
    }

    public static int A(int i10, int i11) {
        if (i10 == i11) {
            return 0;
        }
        return i10 > i11 ? 1 : -1;
    }

    public static void A0(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView == null || w0.d == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        PixelCopy.request(surfaceView, bitmap, new q(runnable, 2), w0.d);
    }

    public static int A1(String str, String str2) {
        if (str2.isEmpty() || str.isEmpty()) {
            return str.indexOf(str2);
        }
        for (int i10 = 0; i10 < str.length() && str2.length() + i10 <= str.length(); i10++) {
            int i11 = 0;
            for (int i12 = i10; i12 < str.length() && i11 < str2.length() && Character.toLowerCase(str.charAt(i12)) == Character.toLowerCase(str2.charAt(i11)); i12++) {
                i11++;
            }
            if (i11 == str2.length()) {
                return i10;
            }
        }
        return -1;
    }

    public static void A2(List list) {
        if (Build.VERSION.SDK_INT <= 23 || list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Bitmap bitmap = (Bitmap) list.get(i10);
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList.add(new WeakReference(bitmap));
            }
        }
        h3(new l(1, arrayList), 36L);
    }

    public static void A3(View view, int i10, int i11, int i12, int i13) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
                return;
            }
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.bottomMargin = i13;
            view.requestLayout();
        }
    }

    public static float B(int i10) {
        return c3.i0.x(Color.blue(i10), 0.0722f, (Color.green(i10) * 0.7152f) + (Color.red(i10) * 0.2126f), 255.0f);
    }

    public static Bitmap B0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.messenger.o
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    boolean[] zArr2 = zArr;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    zArr2[0] = i10 == 0;
                    countDownLatch2.countDown();
                }
            }, Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static boolean B1(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i11) > Math.min(i12, i13) && Math.max(i12, i13) > Math.min(i10, i11);
    }

    public static void B2(Activity activity, int i10) {
        if (activity == null || Q1() || N != i10) {
            return;
        }
        activity.getWindow().setSoftInputMode(32);
    }

    public static void B3(z4.g gVar, int i10) {
        try {
            Field declaredField = z4.g.class.getDeclaredField("f0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(gVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = z4.g.class.getDeclaredField("g0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(gVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception unused) {
        }
    }

    public static CharSequence C(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i10 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i10 < length) {
                    CharSequence charSequence2 = charSequenceArr[i10];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i10++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i10 < length2) {
            sb2.append(charSequenceArr[i10]);
            i10++;
        }
        return sb2.toString();
    }

    public static Uri C0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File E0 = E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e7) {
                f8.g(e7, true);
                return null;
            }
        }
        File file = new File(E0, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 87, fileOutputStream);
                fileOutputStream.close();
                Context context = w0.b;
                w0.d();
                Uri d10 = FileProvider.d(context, "org.telegram.messenger.beta.provider", file);
                fileOutputStream.close();
                return d10;
            } finally {
            }
        } catch (Exception e10) {
            f8.g(e10, true);
            return null;
        }
    }

    public static boolean C1() {
        if (I == null) {
            I = (AccessibilityManager) w0.b.getSystemService("accessibility");
        }
        return I.isEnabled() && I.isTouchExplorationEnabled();
    }

    public static void C2(Activity activity, int i10) {
        if (activity != null && O == i10) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void C3(boolean z10) {
        synchronized (l) {
            try {
                try {
                    if (z10) {
                        if (d0 == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = w0.b;
                                CallReceiver callReceiver = new CallReceiver();
                                d0 = callReceiver;
                                context.registerReceiver(callReceiver, intentFilter, 4);
                            } else {
                                Context context2 = w0.b;
                                CallReceiver callReceiver2 = new CallReceiver();
                                d0 = callReceiver2;
                                context2.registerReceiver(callReceiver2, intentFilter);
                            }
                        }
                    } else if (d0 != null) {
                        w0.b.unregisterReceiver(d0);
                        d0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
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
            PackageInfo packageInfo = w0.b.getPackageManager().getPackageInfo(w0.b.getPackageName(), 0);
            int i10 = packageInfo.versionCode;
            int i11 = i10 / 10;
            int i12 = i10 % 10;
            if (i12 == 1 || i12 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                w0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return cd.a0("TelegramVersion", null, 2131744235, "v" + packageInfo.versionName + " (" + i11 + ") " + str);
        } catch (Exception e7) {
            f8.g(e7, true);
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

    public static void D3(boolean z10) {
        synchronized (k) {
            try {
                j = z10;
                if (z10) {
                    try {
                        j7.a aVar = new j7.a(w0.b, y5.a.k, com.google.android.gms.common.api.b.k, com.google.android.gms.common.api.i.c);
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.c = new hb.a(aVar);
                        b10.d = new k6.c[]{j7.b.a};
                        b10.a = 1567;
                        aVar.e(1, b10.a()).addOnSuccessListener(new m4.v0(25));
                    } catch (Throwable th2) {
                        f8.g(th2, true);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
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
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static File E0() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e7) {
            f8.g(e7, true);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            f8.b("external dir mounted");
            try {
                File[] externalCacheDirs = w0.b.getExternalCacheDirs();
                int i10 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(tz.h0)) {
                    while (true) {
                        if (i10 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i10];
                            if (file2 != null && file2.getAbsolutePath().startsWith(tz.h0)) {
                                file = externalCacheDirs[i10];
                                break;
                            }
                            i10++;
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
                f8.b(sb2.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    f8.b("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e10) {
                f8.g(e10, true);
            }
        }
        try {
            File cacheDir = w0.b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e11) {
            f8.g(e11, true);
        }
        try {
            File filesDir = w0.b.getFilesDir();
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

    public static void E3(View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.shake_animation);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(view, 0));
        ofFloat.addListener(new x(0, view));
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.shake_animation, ofFloat);
    }

    public static void F(File file, File file2) {
        try {
            E(file, file2);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static int F0(int i10, int i11) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int red2 = Color.red(i11);
        int i12 = (red + red2) / 2;
        int i13 = red - red2;
        int green2 = green - Color.green(i11);
        int blue2 = blue - Color.blue(i11);
        return (green2 * 4 * green2) + ((((i12 + 512) * i13) * i13) >> 8) + ((((767 - i12) * blue2) * blue2) >> 8);
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

    public static void F3(float f7, View view, Runnable runnable) {
        if (view == null) {
            return;
        }
        int L2 = L(f7);
        if (view.getTag(R.id.spring_tag) != null) {
            ((o1.j) view.getTag(R.id.spring_tag)).d();
        }
        Float f10 = (Float) view.getTag(R.id.spring_was_translation_x_tag);
        if (f10 != null) {
            view.setTranslationX(f10.floatValue());
        }
        view.setTag(R.id.spring_was_translation_x_tag, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        o1.j jVar = new o1.j(view, o1.j.o, translationX);
        o1.k kVar = new o1.k(translationX);
        kVar.b(600.0f);
        jVar.m = kVar;
        jVar.a = (-L2) * 100;
        jVar.a(new i(translationX, view, runnable));
        view.setTag(R.id.spring_tag, jVar);
        jVar.h();
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
            f8.g(th2, false);
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
            InputMethodManager inputMethodManager = (InputMethodManager) w0.b.getSystemService("input_method");
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
            String P0 = cd.P0();
            zc zcVar = cd.D0().B;
            String str3 = zcVar.e;
            String replace = str3 == null ? "" : str3.replace("_", "-");
            boolean isEmpty = TextUtils.isEmpty(replace);
            String str4 = replace;
            if (isEmpty) {
                str4 = zcVar.c();
            }
            if (!P0.contains(str4) && !str4.contains(P0)) {
                str2 = str4;
                return TextUtils.isEmpty(str2) ? new String[]{P0.replace('_', '-'), str2} : new String[]{P0.replace('_', '-')};
            }
            if (!P0.contains("en")) {
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

    public static SpannableStringBuilder G2(CharSequence charSequence, boolean z10) {
        return I2(charSequence, z10, L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    public static void G3(View view) {
        F3(10.0f, view, null);
    }

    public static byte[] H(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if (b10 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i10 + 1], 16);
                    i10 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i10], 16)));
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i10++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e10) {
            f8.g(e10, true);
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

    public static SpannableStringBuilder H2(CharSequence charSequence, boolean z10, float f7, float f10) {
        return I2(charSequence, z10, f7, f10, 1.0f, R.drawable.msg_mini_forumarrow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r1 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H3() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (d6.j()) {
                if ((!d6.j() ? 0 : d6.h) == 40000) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return i10 < 32;
    }

    public static float I(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    public static i0.c I0(r0.j1 j1Var, boolean z10) {
        i0.c g10 = j1Var.a.g(647);
        r0.g1 g1Var = j1Var.a;
        i0.c a2 = i0.c.a(g10, g1Var.f(647));
        return z10 ? i0.c.a(a2, g1Var.f(8)) : a2;
    }

    public static boolean I1(Uri uri, int i10) {
        String str;
        if (uri == null) {
            str = "";
            int i11 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlinkFd = Utilities.readlinkFd(i10);
                    if (readlinkFd != null && !readlinkFd.equals(str)) {
                        i11++;
                        if (i11 >= 10) {
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
        if (str.matches(Pattern.quote(new File(w0.b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
            return false;
        }
        int i12 = 0;
        while (str.length() <= 4096) {
            try {
                String readlink = Utilities.readlink(str);
                if (readlink != null && !readlink.equals(str)) {
                    i12++;
                    if (i12 >= 10) {
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
        return str.toLowerCase().contains("/data/data/" + w0.b.getPackageName());
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, boolean z10, float f7, float f10, float f11, int i10) {
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(i10, 0);
        float f12 = f11 * 0.88f;
        dqVar.H = f12;
        dqVar.I = f12;
        dqVar.r = -f7;
        dqVar.s = f10;
        dqVar.G = 0.8f;
        if (z10) {
            dqVar.f = z10;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(dqVar, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder L2 = L2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(dqVar, 0, 1, 33);
        SpannableStringBuilder L22 = L2(L2, spannableString2, ">");
        org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(i10, 0);
        dqVar2.H = f12;
        dqVar2.I = f12;
        dqVar2.r = f7;
        dqVar2.s = f10;
        dqVar2.w = 180.0f;
        dqVar2.G = 0.8f;
        if (z10) {
            dqVar2.f = z10;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(dqVar2, 0, 1, 33);
        return L2(L22, spannableString3, "<");
    }

    public static boolean I3(String str) {
        try {
            return w(Uri.parse(str).getHost());
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static void J(View view, Runnable runnable) {
        if (view == null) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new v(view, runnable));
        }
    }

    public static int J0(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < 10; i14++) {
            for (int i15 = 0; i15 < 10; i15++) {
                int pixel = bitmap.getPixel((int) (i14 * width), (int) (i15 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i11;
                    int green = Color.green(pixel) + i12;
                    i10++;
                    i13 = Color.blue(pixel) + i13;
                    i12 = green;
                    i11 = red;
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Color.argb(zs.e4, i11 / i10, i12 / i10, i13 / i10);
    }

    public static boolean J1(org.telegram.ui.ActionBar.k2 k2Var) {
        ((t7.u) w0.k()).getClass();
        String str = "com.google.android.apps.maps";
        int i10 = 0;
        try {
            w0.b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (k2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
            ((t7.u) w0.k()).getClass();
            alertDialog$Builder.a.T = cd.L0(2131749205, null);
            alertDialog$Builder.k(cd.L0(2131747847, null), new p(i10, str, k2Var));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            k2Var.showDialog(alertDialog$Builder.a);
            return false;
        }
    }

    public static SpannableStringBuilder J2(CharSequence charSequence, CharSequence charSequence2, String str) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
        }
        return spannableStringBuilder;
    }

    public static boolean J3(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e7) {
            f8.g(e7, true);
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

    public static String K0(String str, boolean z10) {
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
        return (z10 && group != null && group.startsWith("www.")) ? group.substring(4) : group;
    }

    public static boolean K1(char c10) {
        if (k0 == null) {
            k0 = new HashSet();
            int i10 = 0;
            while (true) {
                char[] cArr = j0;
                if (i10 >= cArr.length) {
                    break;
                }
                k0.add(Character.valueOf(cArr[i10]));
                i10++;
            }
        }
        return k0.contains(Character.valueOf(c10));
    }

    public static SpannableStringBuilder K2(String str, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.as asVar) {
        if (e0 == null) {
            e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = e0.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i10, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new w(asVar, group2, p6Var, 0), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i10 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i10, str.length());
        return spannableStringBuilder;
    }

    public static void K3(final LaunchActivity launchActivity, final ji.b bVar) {
        if (bVar.f()) {
            String str = bVar.b;
            int i10 = bVar.c;
            String str2 = bVar.d;
            String str3 = bVar.e;
            String str4 = bVar.f;
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) launchActivity, (org.telegram.ui.ActionBar.p6) null, false);
            z2Var.O();
            z2Var.u0 = false;
            z2Var.v0 = false;
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            linearLayout.setOrientation(1);
            z2Var.N = linearLayout;
            TextView b10 = w7.g6.b(launchActivity, 20.0f, org.telegram.ui.ActionBar.t6.j5, true, null);
            b10.setText(cd.L0(2131743801, null));
            linearLayout.addView(b10, w7.b6.t(-1, -2, 55, 22, 18, 22, 0));
            wy0 wy0Var = new wy0(launchActivity, null);
            linearLayout.addView(wy0Var, w7.b6.t(-1, -2, 55, 14, 18, 14, 0));
            if (!TextUtils.isEmpty(str)) {
                wy0Var.c(cd.L0(2131743817, null), str, null, null);
            }
            if (i10 != 0) {
                wy0Var.c(cd.L0(2131743812, null), Integer.toString(i10), null, null);
            }
            if (!TextUtils.isEmpty(str4)) {
                wy0Var.c(cd.L0(2131743810, null), str4, null, null);
            }
            if (!TextUtils.isEmpty(str2)) {
                wy0Var.c(cd.L0(2131743800, null), str2, null, null);
            }
            if (!TextUtils.isEmpty(str3)) {
                wy0Var.c(cd.L0(2131743813, null), str3, null, null);
            }
            org.telegram.ui.Components.ec[] ecVarArr = new org.telegram.ui.Components.ec[1];
            wy0Var.c(cd.L0(2131746615, null), "", null, ecVarArr);
            ((View) ecVarArr[0].getParent()).setPadding(0, 0, 0, 0);
            ecVarArr[0].setDisablePaddingsOffsetY(true);
            ecVarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
            ecVarArr[0].setText(N2(cd.L0(2131746624, null), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false), new ul(new boolean[1], ecVarArr, bVar, launchActivity, 5)));
            if (!TextUtils.isEmpty(str4)) {
                uy0 a2 = wy0Var.a(cd.L0(2131743802, null));
                a2.setFilled(true);
                nh.p pVar = (nh.p) a2.getChildAt(0);
                pVar.setTextSize(1, 11.0f);
                pVar.setGravity(17);
            }
            vh.d dVar = new vh.d(launchActivity, null, true);
            dVar.setRoundRadius(24);
            dVar.setText(cd.L0(2131751808, null));
            final mg.l1 l1Var = z2Var.x0;
            dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedPreferences.Editor edit = vp.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    ji.b bVar2 = ji.b.this;
                    bVar2.h(edit);
                    edit.commit();
                    tz.B1 = tz.a(new sz(bVar2));
                    ConnectionsManager.setProxySettings(true, bVar2);
                    zs.e().k(zs.A4, new Object[0]);
                    org.telegram.ui.ActionBar.k2 lastFragment = launchActivity.M().getLastFragment();
                    if (lastFragment instanceof org.telegram.ui.un) {
                        org.telegram.ui.un unVar = (org.telegram.ui.un) lastFragment;
                        unVar.Y7();
                        UndoView undoView = unVar.M3;
                        if (undoView != null) {
                            undoView.j(87, 0L, null);
                            l1Var.run();
                        }
                    }
                    zs.e().k(zs.P4, 6, cd.L0(2131746625, null));
                    l1Var.run();
                }
            });
            linearLayout.addView(dVar, w7.b6.t(-1, 48, 55, 14, 18, 14, 14));
            z2Var.show();
        }
    }

    public static int L(float f7) {
        if (f7 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(p * f7);
    }

    public static Pair L0(File file) {
        try {
            return O0(new r1.g(file));
        } catch (Exception e7) {
            f8.g(e7, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder L2(CharSequence charSequence, CharSequence charSequence2, String str) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str, 0);
        while (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
            indexOf = TextUtils.indexOf(spannableStringBuilder, str, indexOf + 1);
        }
        return spannableStringBuilder;
    }

    public static void L3(int i10, int i11, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i10, iArr[1] - i11, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                L3(i10, i11, iArr, canvas, viewGroup.getChildAt(i12));
            }
        }
    }

    public static int M(float f7) {
        if (f7 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(p * f7);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return O0(new r1.g(inputStream));
        } catch (Exception e7) {
            f8.g(e7, true);
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

    public static CharSequence M2(CharSequence charSequence) {
        int i10 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            while (i10 < length) {
                if (sb2.charAt(i10) == '\n') {
                    sb2.setCharAt(i10, ' ');
                }
                i10++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i10 < length2) {
                if (charSequence.charAt(i10) == '\n') {
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) " ");
                }
                i10++;
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
        while (i10 < length3) {
            if (charSequence.charAt(i10) == '\n') {
                spannableStringBuilder2.replace(i10, i10 + 1, (CharSequence) " ");
            }
            i10++;
        }
        return spannableStringBuilder2;
    }

    public static Bitmap M3(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        L3(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static float N(float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        return p * f7;
    }

    public static Pair N0(String str) {
        try {
            return O0(new r1.g(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        TelephonyManager telephonyManager = (TelephonyManager) w0.b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        return (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(w0.b.getContentResolver(), "airplane_mode_on", 0) != 0) ? false : true;
    }

    public static SpannableStringBuilder N2(String str, int i10, Runnable runnable) {
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
            if (runnable != null) {
                spannableStringBuilder.setSpan(new b0(i10, runnable), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new u(i10, 1), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static String N3(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String R0 = cd.D0().R0(str, true, false);
        return R0 == null ? "" : R0;
    }

    public static void O(Canvas canvas, FrameLayout frameLayout, int i10, int i11, float f7) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(T1(0.0f, 0.75f, R0(i11)) * f7, i10);
        Paint paint = o0;
        paint.setColor(r12);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i11, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair O0(r1.g gVar) {
        int i10;
        int i11 = 0;
        try {
            int i12 = 2;
            switch (gVar.c()) {
                case 2:
                    i12 = 1;
                    break;
                case 3:
                    i10 = zs.K2;
                    i12 = 0;
                    i11 = i10;
                    break;
                case 4:
                    break;
                case 5:
                    i11 = 270;
                    break;
                case 6:
                    i10 = 90;
                    i12 = 0;
                    i11 = i10;
                    break;
                case 7:
                    i12 = 1;
                    i11 = 270;
                    break;
                case 8:
                    i12 = 0;
                    i11 = 270;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
        } catch (Exception e7) {
            f8.g(e7, true);
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

    public static SpannableStringBuilder O2(int i10, String str) {
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
            spannableStringBuilder.setSpan(new u(i10, 0), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static CharSequence O3(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) <= ' ') {
            i10++;
        }
        while (i10 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i10;
        }
        return (i10 > 0 || length < charSequence.length()) ? charSequence.subSequence(i10, length) : charSequence;
    }

    public static void P(Canvas canvas, RectF rectF, float f7) {
        float min = Math.min(f7, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float N2 = N(1.0f);
        float f10 = N2 / 2.0f;
        float max = Math.max(0.0f, min - N2);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = Y;
        paint.setStyle(style);
        paint.setStrokeWidth(N2);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(1.0f, 570425343));
        canvas.save();
        float f11 = rectF.left - f10;
        float f12 = rectF.top;
        if (canvas.clipRect(f11, f12, rectF.right + f10, w7.u.a(f12 + max, f12, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f10, rectF.right, f10 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float N3 = N(0.6666667f);
        float f13 = N3 / 2.0f;
        float max2 = Math.max(0.0f, min - N3);
        Paint paint2 = Z;
        paint2.setStyle(style);
        paint2.setStrokeWidth(N3);
        paint2.setColor(org.telegram.ui.ActionBar.t6.r1(1.0f, 385875967));
        canvas.save();
        float f14 = rectF.left - f13;
        float f15 = rectF.bottom;
        if (canvas.clipRect(f14, w7.u.a(f15 - max2, rectF.top, f15), rectF.right + f13, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f13, rectF.right, rectF.bottom - f13, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static File P0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(w0.b.getExternalFilesDir(null).getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(w0.b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(w0.b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            w0.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean P1() {
        Point point = q;
        return ((float) Math.min(point.x, point.y)) / p <= 690.0f;
    }

    public static SpannableStringBuilder P2(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, boolean z10) {
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
            if (runnable != null) {
                spannableStringBuilder.setSpan(new c0(z10, i10, p6Var, runnable), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new d0(z10, i10, p6Var), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void P3(Activity activity) {
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
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i10, TextPaint textPaint) {
        CharSequence charSequence2;
        int i11;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            int indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > 130) {
                CharSequence subSequence2 = charSequence.subSequence(Math.max(0, indexOf - 65), Math.min(length, indexOf + 65));
                try {
                    int max = indexOf - Math.max(0, indexOf - 65);
                    subSequence2.length();
                    i11 = max;
                    charSequence2 = subSequence2;
                } catch (Exception e7) {
                    e = e7;
                    charSequence2 = subSequence2;
                    f8.g(e, true);
                    return charSequence2;
                }
            } else {
                i11 = indexOf;
                charSequence2 = charSequence;
            }
        } catch (Exception e10) {
            e = e10;
            charSequence2 = charSequence;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f7 = i10;
            if (textPaint.measureText("...") + lineWidth >= f7) {
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i13))) {
                    i13++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i13);
                if (staticLayout.isRtlCharAt(i13)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f7) {
                    float f10 = 0.1f * f7;
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f7) + f10;
                    if (charSequence2.length() - i13 > 20) {
                        measureText += f10;
                    }
                    if (measureText > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                        if (offsetForHorizontal > charSequence2.length() - 1) {
                            offsetForHorizontal = charSequence2.length() - 1;
                        }
                        int i14 = 0;
                        while (true) {
                            if (Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) || i14 >= 10) {
                                break;
                            }
                            i14++;
                            offsetForHorizontal++;
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                                break;
                            }
                        }
                        if (i14 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i12) - (f7 * 0.3f)), charSequence2.length());
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
        } catch (Exception e11) {
            e = e11;
            f8.g(e, true);
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
        return R1() && !tz.W;
    }

    public static SpannableStringBuilder Q2(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var, et0 et0Var) {
        return P2(str, i10, p6Var, et0Var, false);
    }

    public static void Q3(ImageView imageView, int i10) {
        R3(imageView, imageView.getContext().getDrawable(i10));
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static float R0(int i10) {
        return Utilities.l((i10 - L(32.0f)) / L(16.0f));
    }

    public static boolean R1() {
        if (K == null) {
            K = Boolean.valueOf(w0.b != null && w0.b.getResources().getBoolean(R.bool.isTablet));
        }
        return K.booleanValue();
    }

    public static SpannableStringBuilder R2(String str, int i10, int i11, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        int i12;
        int i13;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i13 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i12 = 0;
        } else {
            i12 = i13 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i11 == 3) {
                int i14 = indexOf + i12;
                spannableStringBuilder.replace(indexOf, i14, (CharSequence) L2(spannableStringBuilder.subSequence(indexOf, i14), " ", " "));
            }
            if (i11 != 0 && i11 != 3 && i11 != 2 && i11 != 4) {
                spannableStringBuilder.setSpan(new bi.m6(p6Var, 1), indexOf, i12 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new a0(i11, i10, p6Var, runnable), indexOf, i12 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void R3(final ImageView imageView, final Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.m
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

    public static void S(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            g0.f.t(window);
        } else if (i10 >= 30) {
            g0.f.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i10 >= 28) {
            int i11 = i10 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i11) {
                attributes.layoutInDisplayCutoutMode = i11;
                window.setAttributes(attributes);
            }
        }
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static int S0(float f7, float f10, int i10, int i11) {
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int alpha = Color.alpha(i11);
        int red2 = Color.red(i10);
        int green2 = Color.green(i10);
        int blue2 = Color.blue(i10);
        return Color.argb((int) c3.i0.C(alpha - r9, f7, Color.alpha(i10), f10), (int) (((red - red2) * f7) + red2), (int) (((green - green2) * f7) + green2), (int) (((blue - blue2) * f7) + blue2));
    }

    public static boolean S1(char c10) {
        return c10 == '-' || c10 == '~';
    }

    public static SpannableStringBuilder S2(String str, int i10, org.telegram.ui.mf mfVar) {
        return R2(str, i10, 0, mfVar, null);
    }

    public static void S3(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (windowManager == null || view == null || view.getParent() == null) {
            return;
        }
        windowManager.updateViewLayout(view, layoutParams);
    }

    public static void T() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) w0.b.getSystemService("phone");
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
            f8.g(th2, true);
        }
    }

    public static String T0(Uri uri) {
        Uri uri2;
        try {
            if (DocumentsContract.isDocumentUri(w0.b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else {
                    if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                        return H0(w0.b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                        String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = split2[0];
                        int hashCode = str.hashCode();
                        if (hashCode == 93166550) {
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                return H0(w0.b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(w0.b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (hashCode == 100313435) {
                            if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                return H0(w0.b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(w0.b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (hashCode == 112202875 && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            return H0(w0.b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return H0(w0.b, uri2, "_id=?", new String[]{split2[1]});
                    }
                }
            } else {
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return H0(w0.b, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static float T1(float f7, float f10, float f11) {
        return c3.i0.z(f10, f7, f11, f7);
    }

    public static SpannableStringBuilder T2(String str, Runnable runnable) {
        return R2(str, -1, 0, runnable, null);
    }

    public static void T3(float f7, View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getParent() != null;
        view.animate().setListener(null).cancel();
        if (!z12) {
            view.setVisibility(z10 ? 0 : 8);
            view.setTag(z10 ? 1 : null);
            view.setAlpha(1.0f);
            view.setScaleX((!z11 || z10) ? 1.0f : 0.5f);
            view.setScaleY((!z11 || z10) ? 1.0f : 0.5f);
            if (f7 != 0.0f) {
                view.setTranslationY(z10 ? 0.0f : L(-16.0f) * f7);
                return;
            }
            return;
        }
        if (!z10) {
            ViewPropertyAnimator withEndAction = view.animate().alpha(0.0f).scaleY(z11 ? 0.5f : 1.0f).scaleX(z11 ? 0.5f : 1.0f).setListener(new eg.m(view)).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).withEndAction(null);
            if (f7 != 0.0f) {
                withEndAction.translationY(L(-16.0f) * f7);
            }
            withEndAction.start();
            return;
        }
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.setScaleX(z11 ? 0.5f : 1.0f);
            view.setScaleY(z11 ? 0.5f : 1.0f);
            if (f7 != 0.0f) {
                view.setTranslationY(L(-16.0f) * f7);
            }
        }
        ViewPropertyAnimator withEndAction2 = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).withEndAction(null);
        if (f7 != 0.0f) {
            withEndAction2.translationY(0.0f);
        }
        withEndAction2.start();
    }

    public static String U(String str) {
        return F2(D2(str));
    }

    public static int U0(int i10) {
        return V0(i10, false);
    }

    public static float U1(float f7, float[] fArr) {
        return T1(fArr[0], fArr[1], f7);
    }

    public static SpannableStringBuilder U2(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int t10 = t(spannableStringBuilder, "**");
                if (t10 == -1) {
                    break;
                }
                spannableStringBuilder.replace(t10, t10 + 2, "");
                int t11 = t(spannableStringBuilder, "**");
                if (t11 >= 0) {
                    spannableStringBuilder.replace(t11, t11 + 2, "");
                    arrayList.add(Integer.valueOf(t10));
                    arrayList.add(Integer.valueOf(t11));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder2.setSpan(new x41(o()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e7) {
            f8.g(e7, true);
            return spannableStringBuilder;
        }
    }

    public static void U3(View view, boolean z10, boolean z11) {
        T3(0.0f, view, z10, z11);
    }

    public static Object V(Class cls, List list) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
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
    public static int V0(int i10, boolean z10) {
        float[] b10 = b(Color.red(i10), Color.green(i10), Color.blue(i10));
        float f7 = b10[1];
        if (f7 <= 0.0f) {
            float f10 = b10[2];
            if (f10 < 1.0f) {
            }
            if (!z10) {
                float f11 = b10[2];
                if (f11 <= 0.5f) {
                    b10[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (f11 * 0.65f)));
                    return a(b10[0], b10[1], b10[2]) & (z10 ? -1711276033 : 1728053247);
                }
            }
            b10[2] = Math.max(0.0f, b10[2] * 0.65f);
            return a(b10[0], b10[1], b10[2]) & (z10 ? -1711276033 : 1728053247);
        }
        b10[1] = Math.min(1.0f, ((1.0f - f7) * 0.1f) + (z10 ? 0.15f : 0.05f) + f7);
        if (!z10) {
        }
        b10[2] = Math.max(0.0f, b10[2] * 0.65f);
        return a(b10[0], b10[1], b10[2]) & (z10 ? -1711276033 : 1728053247);
    }

    public static float V1(boolean z10, boolean z11, float f7) {
        return c3.i0.z(z11 ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f, f7, z10 ? 1.0f : 0.0f);
    }

    public static SpannableStringBuilder V2(CharSequence charSequence) {
        return charSequence instanceof SpannableStringBuilder ? U2((SpannableStringBuilder) charSequence) : U2(new SpannableStringBuilder(charSequence));
    }

    public static void V3(float f7, View view, boolean z10, boolean z11) {
        Y3(view, z10, f7, true, z11);
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

    public static int W0(int i10) {
        float[] b10 = b(Color.red(i10), Color.green(i10), Color.blue(i10));
        b10[1] = Math.min(1.0f, b10[1] + 0.05f);
        float f7 = b10[2];
        if (f7 > 0.5f) {
            b10[2] = Math.max(0.0f, f7 * 0.9f);
        } else {
            b10[2] = Math.max(0.0f, f7 * 0.9f);
        }
        return a(b10[0], b10[1], b10[2]) | (-16777216);
    }

    public static int W1(float f7, int i10, int i11) {
        return (int) ((f7 * (i11 - i10)) + i10);
    }

    public static SpannableStringBuilder W2(String str) {
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
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder.setSpan(new x41(o()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e7) {
            f8.g(e7, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void W3(View view, boolean z10) {
        Y3(view, z10, 1.0f, true, true);
    }

    public static View X(ViewGroup viewGroup, float f7, float f10) {
        if (viewGroup.getVisibility() != 0) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    View X2 = X((ViewGroup) childAt, f7 - childAt.getLeft(), f10 - childAt.getTop());
                    if (X2 != null) {
                        return X2;
                    }
                } else if (f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getY() && f7 <= childAt.getY() + childAt.getHeight()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static int X0(int i10) {
        return Math.max(73, (i10 >> 16) & 65535);
    }

    public static void X1(Rect rect, Rect rect2, float f7, Rect rect3) {
        if (rect3 != null) {
            rect3.set(W1(f7, rect.left, rect2.left), W1(f7, rect.top, rect2.top), W1(f7, rect.right, rect2.right), W1(f7, rect.bottom, rect2.bottom));
        }
    }

    public static CharSequence X2(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            int i10 = 0;
            while (i10 < length - 2) {
                int i11 = i10 + 2;
                sb2.getChars(i10, i11, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb2 = sb2.replace(i10, i11, "\n");
                    i10--;
                    length--;
                }
                i10++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i12 = 0;
            while (i12 < length2 - 2) {
                int i13 = i12 + 2;
                spannableStringBuilder.getChars(i12, i13, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i12, i13, (CharSequence) "\n");
                    i12--;
                    length2--;
                }
                i12++;
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
        int i14 = 0;
        while (i14 < length3 - 2) {
            int i15 = i14 + 2;
            spannableStringBuilder2.getChars(i14, i15, cArr, 0);
            if (cArr[0] == '\n' && cArr[1] == '\n') {
                spannableStringBuilder2 = spannableStringBuilder2.replace(i14, i15, (CharSequence) "\n");
                i14--;
                length3--;
            }
            i14++;
        }
        return spannableStringBuilder2;
    }

    public static void X3(View view, boolean z10, float f7, boolean z11, float f10, boolean z12, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            z12 = false;
        }
        if (!z12) {
            view.animate().setListener(null).cancel();
            view.setVisibility(z10 ? 0 : z11 ? 8 : 4);
            view.setTag(z10 ? 1 : null);
            view.setAlpha(f10);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (!z10 || view.getTag() != null) {
            if (z10 || view.getTag() == null) {
                return;
            }
            view.animate().setListener(null).cancel();
            view.animate().alpha(0.0f).scaleY(f7).scaleX(f7).setListener(new eg.m(view, z11)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
            view.setTag(null);
            return;
        }
        view.animate().setListener(null).cancel();
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
        view.animate().alpha(f10).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
        view.setTag(r0);
    }

    public static boolean Y(ViewGroup viewGroup, float f7, float f10, View view) {
        int i10;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i11 = 0;
        while (i11 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof th.z2) || childAt == view)) {
                if (childAt instanceof th.q6) {
                    th.s6 s6Var = (th.s6) viewGroup;
                    if (s6Var.b == null || (f7 >= L(60.0f) && f7 <= viewGroup.getWidth() - L(60.0f))) {
                        int i12 = 0;
                        while (i12 < s6Var.getChildCount()) {
                            View childAt2 = s6Var.getChildAt(i12);
                            if (childAt2 instanceof th.v6) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d10 = f7 - translationX;
                                i10 = i11;
                                double d11 = f10 - translationY;
                                float cos = (float) ((Math.cos(radians) * d10) - (Math.sin(radians) * d11));
                                float c10 = (float) i0.a.c(radians, d11, Math.sin(radians) * d10);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && c10 >= (-measuredHeight) / 2.0f && c10 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (!rect.contains((int) f7, (int) f10) && childAt.isClickable()) {
                                        return true;
                                    }
                                    if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), view)) {
                                        return true;
                                    }
                                    i11 = i10 + 1;
                                }
                            } else {
                                i10 = i11;
                            }
                            i12++;
                            i11 = i10;
                        }
                    }
                }
                i10 = i11;
                rect = Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f7, (int) f10)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        return false;
    }

    public static int Y0() {
        return Z0(false);
    }

    public static void Y1(Rect rect, RectF rectF, float f7, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(T1(rect.left, rectF.left, f7), T1(rect.top, rectF.top, f7), T1(rect.right, rectF.right, f7), T1(rect.bottom, rectF.bottom, f7));
        }
    }

    public static void Y2(Activity activity, int i10) {
        if (activity == null || Q1()) {
            return;
        }
        activity.getWindow().setSoftInputMode(48);
        N = i10;
    }

    public static void Y3(View view, boolean z10, float f7, boolean z11, boolean z12) {
        X3(view, z10, f7, z11, 1.0f, z12, null);
    }

    public static TLRPC.Document Z(long j10, List list) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i10);
            if (document != null && document.id == j10) {
                return document;
            }
        }
        return null;
    }

    public static int Z0(boolean z10) {
        if (z10) {
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

    public static void Z1(RectF rectF, RectF rectF2, float f7, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(T1(rectF.left, rectF2.left, f7), T1(rectF.top, rectF2.top, f7), T1(rectF.right, rectF2.right, f7), T1(rectF.bottom, rectF2.bottom, f7));
        }
    }

    public static void Z2(Activity activity, int i10) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null || Q1()) {
            return;
        }
        window.setSoftInputMode(16);
        N = i10;
    }

    public static void Z3(int i10, tk0 tk0Var) {
        s4.g0 adapter;
        s4.c1 T2;
        if (tk0Var == null || (adapter = tk0Var.getAdapter()) == null) {
            return;
        }
        for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
            View childAt = tk0Var.getChildAt(i11);
            int R2 = RecyclerView.R(childAt);
            if (R2 >= 0 && (T2 = tk0Var.T(childAt)) != null && !T2.r() && T2.b() == i10) {
                adapter.t(T2, R2);
            }
        }
    }

    public static int a(float f7, float f10, float f11) {
        int i10;
        int i11;
        int i12;
        if (f10 != 0.0f) {
            float floor = (f7 - ((float) Math.floor(f7))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f12 = (1.0f - f10) * f11;
            float D2 = c3.i0.D(f10, floor2, 1.0f, f11);
            float f13 = (1.0f - ((1.0f - floor2) * f10)) * f11;
            int i13 = (int) floor;
            if (i13 == 0) {
                i10 = (int) ((f11 * 255.0f) + 0.5f);
                i11 = (int) ((f13 * 255.0f) + 0.5f);
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            i10 = (int) ((f12 * 255.0f) + 0.5f);
                            i11 = (int) ((D2 * 255.0f) + 0.5f);
                        } else if (i13 == 4) {
                            i10 = (int) ((f13 * 255.0f) + 0.5f);
                            i11 = (int) ((f12 * 255.0f) + 0.5f);
                        } else if (i13 != 5) {
                            i10 = 0;
                        } else {
                            i10 = (int) ((f11 * 255.0f) + 0.5f);
                            i11 = (int) ((f12 * 255.0f) + 0.5f);
                            i12 = (int) ((D2 * 255.0f) + 0.5f);
                        }
                        i12 = (int) ((f11 * 255.0f) + 0.5f);
                    } else {
                        i10 = (int) ((f12 * 255.0f) + 0.5f);
                        i11 = (int) ((f11 * 255.0f) + 0.5f);
                        i12 = (int) ((f13 * 255.0f) + 0.5f);
                    }
                    return ((i10 & zs.e4) << 16) | (-16777216) | ((i11 & zs.e4) << 8) | (i12 & zs.e4);
                }
                i10 = (int) ((D2 * 255.0f) + 0.5f);
                i11 = (int) ((f11 * 255.0f) + 0.5f);
            }
            i12 = (int) ((f12 * 255.0f) + 0.5f);
            return ((i10 & zs.e4) << 16) | (-16777216) | ((i11 & zs.e4) << 8) | (i12 & zs.e4);
        }
        i10 = (int) ((f11 * 255.0f) + 0.5f);
        i11 = i10;
        i12 = i11;
        return ((i10 & zs.e4) << 16) | (-16777216) | ((i11 & zs.e4) << 8) | (i12 & zs.e4);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("google_bug_154855417", 0);
        if (sharedPreferences.contains("fixed")) {
            return;
        }
        new File(w0.h(), "ZoomTables.data").delete();
        sharedPreferences.edit().putBoolean("fixed", true).apply();
    }

    public static float a1(boolean z10, float f7) {
        float f10 = f7 / 2.54f;
        DisplayMetrics displayMetrics = B;
        return f10 * (z10 ? displayMetrics.xdpi : displayMetrics.ydpi);
    }

    public static void a2(float[] fArr, float[] fArr2, float f7, float[] fArr3) {
        if (fArr3 == null) {
            return;
        }
        int i10 = 0;
        while (i10 < fArr3.length) {
            float f10 = 0.0f;
            float f11 = (fArr == null || i10 >= fArr.length) ? 0.0f : fArr[i10];
            if (fArr2 != null && i10 < fArr2.length) {
                f10 = fArr2[i10];
            }
            fArr3[i10] = T1(f11, f10, f7);
            i10++;
        }
    }

    public static void a3(Activity activity, int i10) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i10;
    }

    public static void a4(tk0 tk0Var) {
        s4.g0 adapter;
        s4.c1 T2;
        if (tk0Var == null || (adapter = tk0Var.getAdapter()) == null) {
            return;
        }
        for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
            View childAt = tk0Var.getChildAt(i10);
            int R2 = RecyclerView.R(childAt);
            if (R2 >= 0 && (T2 = tk0Var.T(childAt)) != null && !T2.r()) {
                adapter.t(T2, R2);
            }
        }
    }

    public static float[] b(int i10, int i11, int i12) {
        int max = Math.max(i10, i11);
        if (i12 > max) {
            max = i12;
        }
        int min = Math.min(i10, i11);
        if (i12 < min) {
            min = i12;
        }
        float f7 = max;
        float f10 = f7 / 255.0f;
        float f11 = 0.0f;
        float f12 = max != 0 ? (max - min) / f7 : 0.0f;
        if (f12 != 0.0f) {
            float f13 = max - min;
            float f14 = (max - i10) / f13;
            float f15 = (max - i11) / f13;
            float f16 = (max - i12) / f13;
            float f17 = (i10 == max ? f16 - f15 : i11 == max ? (f14 + 2.0f) - f16 : (f15 + 4.0f) - f14) / 6.0f;
            f11 = f17 < 0.0f ? f17 + 1.0f : f17;
        }
        return new float[]{f11, f12, f10};
    }

    public static double b0(double d10) {
        return ((long) (d10 * 1000000.0d)) / 1000000.0d;
    }

    public static long b1(SharedPreferences sharedPreferences, String str, long j10) {
        try {
            return sharedPreferences.getLong(str, j10);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j10);
        }
    }

    public static float b2(float f7, float f10, float f11) {
        return ((((((((f10 - f7) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f11) + f7) + 360.0f) % 360.0f;
    }

    public static void b3(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i10 >= 31) {
                builder.setAutoEnterEnabled(false);
            }
            v3(activity, builder.build());
        }
    }

    public static void b4(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Spannable spannable, int i10, boolean z10, boolean z11) {
        Future future;
        boolean z12;
        if (spannable == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        final s sVar = new s(spannableStringBuilder, i10, z10, z11);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Callable callable = new Callable() { // from class: org.telegram.messenger.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return (Boolean) s.this.run();
                } catch (Exception e7) {
                    f8.g(e7, true);
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
            } catch (Exception e7) {
                f8.g(e7, true);
                z12 = false;
                if (z12) {
                }
            }
            try {
                z12 = ((Boolean) future.get(zs.e3, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (TimeoutException unused2) {
                if (future != null) {
                    future.cancel(true);
                }
                z12 = false;
                if (z12) {
                }
            }
            if (z12) {
                for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                    spannable.removeSpan(uRLSpan);
                }
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                for (int i11 = 0; i11 < uRLSpanArr.length; i11++) {
                    URLSpan uRLSpan2 = uRLSpanArr[i11];
                    spannable.setSpan(uRLSpan2, spannableStringBuilder.getSpanStart(uRLSpan2), spannableStringBuilder.getSpanEnd(uRLSpanArr[i11]), 33);
                }
            }
        } finally {
            newSingleThreadExecutor.shutdownNow();
        }
    }

    public static void c0(View view, q20 q20Var) {
        if (!(view instanceof ViewGroup)) {
            q20Var.a(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            q20Var.a(view);
            c0(viewGroup.getChildAt(i10), q20Var);
        }
    }

    public static Point c1() {
        Point point = new Point();
        try {
            ((WindowManager) w0.b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e7) {
            f8.g(e7, true);
            return point;
        }
    }

    public static void c2(RectF rectF, RectF rectF2, float f7, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float T1 = T1(rectF.centerX(), rectF2.centerX(), f7);
        float T12 = T1(rectF.centerY(), rectF2.centerY(), f7);
        float T13 = T1(rectF.width(), rectF2.width(), Math.min(1.0f, f7)) / 2.0f;
        float T14 = T1(rectF.height(), rectF2.height(), Math.min(1.0f, f7)) / 2.0f;
        rectF3.set(T1 - T13, T12 - T14, T1 + T13, T12 + T14);
    }

    public static void c3() {
        if (L == null) {
            L = Boolean.valueOf(R1());
        }
        K = null;
        if (tz.X0) {
            SharedPreferences sharedPreferences = w0.b.getSharedPreferences("mainconfig", 0);
            int i10 = sharedPreferences.getInt("fons_size", (!Q1() || (w0.b != null && w0.b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) ? 16 : 18);
            tz.W0 = i10;
            tz.Z0 = sharedPreferences.getInt("iv_font_size", i10);
        }
    }

    public static SpannableStringBuilder c4(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(cd.L0(2131749019, null));
        spannableString.setSpan(new y(0, runnable), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return G2(spannableStringBuilder, true);
    }

    public static void d(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            w0.b.sendBroadcast(intent);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static void d0(RecyclerView recyclerView, q20 q20Var) {
        if (recyclerView == null) {
            return;
        }
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            q20Var.a(recyclerView.getChildAt(i10));
        }
        for (int i11 = 0; i11 < recyclerView.getCachedChildCount(); i11++) {
            q20Var.a(recyclerView.P(i11));
        }
        for (int i12 = 0; i12 < recyclerView.getHiddenChildCount(); i12++) {
            q20Var.a(recyclerView.V(i12));
        }
        for (int i13 = 0; i13 < recyclerView.getAttachedScrapChildCount(); i13++) {
            q20Var.a(recyclerView.O(i13));
        }
    }

    public static ArrayList d1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = w0.b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((File) arrayList.get(i10)).getPath().equals(file2.getPath());
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

    public static int d2(float f7, int i10, int i11) {
        return Color.argb(W1(f7, Color.alpha(i10), Color.alpha(i11)), W1(f7, Color.red(i10), Color.red(i11)), W1(f7, Color.green(i10), Color.green(i11)), W1(f7, Color.blue(i10), Color.blue(i11)));
    }

    public static double[] d3(int i10, int i11, int i12) {
        double d10;
        double d11;
        double d12;
        double d13 = i10 / 255.0d;
        double d14 = i11 / 255.0d;
        double d15 = i12 / 255.0d;
        double max = (d13 <= d14 || d13 <= d15) ? Math.max(d14, d15) : d13;
        double min = (d13 >= d14 || d13 >= d15) ? Math.min(d14, d15) : d13;
        double d16 = max - min;
        double d17 = 0.0d;
        double d18 = max == 0.0d ? 0.0d : d16 / max;
        if (max != min) {
            if (d13 > d14 && d13 > d15) {
                d10 = (d14 - d15) / d16;
                d11 = d14 < d15 ? 6 : 0;
            } else if (d14 > d15) {
                d12 = 2.0d + ((d15 - d13) / d16);
                d17 = d12 / 6.0d;
            } else {
                d10 = (d13 - d14) / d16;
                d11 = 4.0d;
            }
            d12 = d10 + d11;
            d17 = d12 / 6.0d;
        }
        return new double[]{d17, d18, max};
    }

    public static void e(String str) {
        if (str == null) {
            return;
        }
        d(new File(str));
    }

    public static String e0(int i10, double d10, double d11, int i11, int i12, boolean z10, int i13, int i14) {
        int i15 = 2;
        int min = Math.min(2, (int) Math.ceil(p));
        int i16 = i14 == -1 ? vp.r1(i10).m3 : i14;
        if (i16 != 1 && i16 != 3) {
            String str = vp.r1(i10).s3;
            return !TextUtils.isEmpty(str) ? z10 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d11), str) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), str) : z10 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d11)) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min));
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        zc zcVar = cd.D0().B;
        String str2 = null;
        int i17 = 0;
        while (i17 < i15) {
            int i18 = i15;
            if (strArr[i17].toLowerCase().contains(zcVar.c)) {
                str2 = strArr[i17];
            }
            i17++;
            i15 = i18;
        }
        int i19 = i15;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (!z10) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d11);
            Double valueOf2 = Double.valueOf(d10);
            Integer valueOf3 = Integer.valueOf(i13);
            Integer valueOf4 = Integer.valueOf(i11 * min);
            Integer valueOf5 = Integer.valueOf(i12 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Object[] objArr = new Object[7];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i19] = valueOf3;
            objArr[3] = valueOf4;
            objArr[4] = valueOf5;
            objArr[5] = valueOf6;
            objArr[6] = str2;
            return String.format(locale, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", objArr);
        }
        Locale locale2 = Locale.US;
        Double valueOf7 = Double.valueOf(d11);
        Double valueOf8 = Double.valueOf(d10);
        Integer valueOf9 = Integer.valueOf(i13);
        Integer valueOf10 = Integer.valueOf(i11 * min);
        Integer valueOf11 = Integer.valueOf(i12 * min);
        Integer valueOf12 = Integer.valueOf(min);
        Double valueOf13 = Double.valueOf(d11);
        Double valueOf14 = Double.valueOf(d10);
        Object[] objArr2 = new Object[9];
        objArr2[0] = valueOf7;
        objArr2[1] = valueOf8;
        objArr2[i19] = valueOf9;
        objArr2[3] = valueOf10;
        objArr2[4] = valueOf11;
        objArr2[5] = valueOf12;
        objArr2[6] = valueOf13;
        objArr2[7] = valueOf14;
        objArr2[8] = str2;
        return String.format(locale2, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", objArr2);
    }

    public static Bitmap e1(float f7, float f10, String str, String str2, int i10) {
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        int i11;
        int i12;
        Bitmap decodeStream;
        int i13;
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
                        fileInputStream.getChannel().position(i10);
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            f8.g(th, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                            }
                        }
                    }
                }
                i11 = options.outWidth;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        if (i11 <= 0 || (i12 = options.outHeight) <= 0) {
            if (fileInputStream != null) {
                fileInputStream.close();
                return null;
            }
            return null;
        }
        if (f7 > f10 && i11 < i12) {
            f10 = f7;
            f7 = f10;
        }
        float min = Math.min(i11 / f7, i12 / f10);
        options.inSampleSize = 1;
        if (min > 1.0f) {
            do {
                i13 = options.inSampleSize * 2;
                options.inSampleSize = i13;
            } while (i13 < min);
        }
        options.inJustDecodeBounds = false;
        if (str != null) {
            decodeStream = BitmapFactory.decodeFile(str, options);
        } else {
            fileInputStream.getChannel().position(i10);
            decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
        }
        if (fileInputStream != null) {
            try {
                return decodeStream;
            } catch (Exception e72) {
            }
        }
        return decodeStream;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:203|204)(2:3|4)|5|(7:6|(4:8|9|(3:158|159|160)(9:11|12|13|(3:15|(1:17)(2:105|(4:109|(1:111)(2:117|(1:119)(3:120|(2:127|(1:129)(2:130|(1:132)(2:133|(1:135)(3:136|(2:143|(1:145)(2:146|(1:151)(1:148)))|152))))|153))|(1:115)|116))|18)(1:157)|(1:104)(1:(5:22|23|24|(1:26)|27)(1:103))|(1:29)|30|31|(8:(1:39)|40|(1:42)(1:92)|43|(11:46|47|(2:56|(1:58))|59|(3:61|(2:66|(2:68|69)(2:70|(2:72|73)(1:74)))(2:63|64)|65)|75|76|(1:78)(1:90)|(1:86)|87|88)|91|87|88)(3:93|94|95))|89)(1:164)|97|98|99|100|101)|165|166|167|168|(5:172|(2:191|192)(5:(1:177)|178|(2:179|(2:181|(2:184|185)(1:183))(2:189|190))|186|187)|188|169|170)|193|101) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02c7, code lost:
    
        org.telegram.messenger.f8.g(r0, r16);
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
    public static ArrayList e2(Uri uri, int i10, boolean z10, ArrayList arrayList, String str) {
        InputStream createInputStream;
        int i11;
        ArrayList arrayList2;
        ?? r12;
        ?? r16;
        int i12;
        int i13;
        InputStream inputStream;
        String[] strArr;
        int i14;
        byte[] H2;
        h0 h0Var;
        ArrayList arrayList3 = arrayList;
        int i15 = 1;
        if (z10) {
            try {
                createInputStream = w0.b.getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            } catch (Throwable th2) {
                th = th2;
                i11 = i15;
            }
        } else {
            try {
                createInputStream = w0.b.getContentResolver().openInputStream(uri);
            } catch (Throwable th3) {
                th = th3;
                i11 = 1;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(createInputStream, "UTF-8"));
        int i16 = 0;
        int i17 = 0;
        g0 g0Var = null;
        String str2 = null;
        h0 h0Var2 = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            try {
                if (readLine.startsWith("PHOTO")) {
                    i17 = i15;
                } else {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            g0Var = new g0();
                            g0Var.b = new ArrayList();
                            g0Var.c = new StringBuilder();
                            arrayList4.add(g0Var);
                            g0Var.a = str;
                        } else if (!readLine.startsWith("END:VCARD") && arrayList3 != null) {
                            if (readLine.startsWith("TEL")) {
                                h0Var = new h0();
                                h0Var.c = i16;
                            } else if (readLine.startsWith("EMAIL")) {
                                h0Var = new h0();
                                h0Var.c = i15;
                            } else {
                                if (!readLine.startsWith("ADR") && !readLine.startsWith("LABEL") && !readLine.startsWith("GEO")) {
                                    if (readLine.startsWith("URL")) {
                                        h0Var = new h0();
                                        h0Var.c = 3;
                                    } else if (readLine.startsWith("NOTE")) {
                                        h0Var = new h0();
                                        h0Var.c = 4;
                                    } else if (readLine.startsWith("BDAY")) {
                                        h0Var = new h0();
                                        h0Var.c = 5;
                                    } else {
                                        if (!readLine.startsWith("ORG") && !readLine.startsWith("TITLE") && !readLine.startsWith("ROLE")) {
                                            if (readLine.startsWith("X-ANDROID")) {
                                                h0Var = new h0();
                                                h0Var.c = -1;
                                            } else if (!readLine.startsWith("X-PHONETIC") && readLine.startsWith("X-")) {
                                                h0Var = new h0();
                                                h0Var.c = 20;
                                            } else {
                                                h0Var = null;
                                            }
                                        }
                                        h0Var = new h0();
                                        h0Var.c = 6;
                                    }
                                }
                                h0Var = new h0();
                                h0Var.c = 2;
                            }
                            if (h0Var != null && h0Var.c >= 0) {
                                arrayList3.add(h0Var);
                            }
                            h0Var2 = h0Var;
                            i17 = i16;
                        }
                        i17 = i16;
                        h0Var2 = null;
                    }
                    if (i17 != 0 || g0Var == null) {
                        i13 = i15;
                    } else if (h0Var2 == null) {
                        r16 = i15;
                        try {
                            if (g0Var.c.length() > 0) {
                                g0Var.c.append('\n');
                            }
                            g0Var.c.append(readLine);
                            i13 = r16;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        i13 = i15;
                        h0Var2.a.add(readLine);
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i16, readLine.length() - 1);
                        i15 = i13;
                    } else {
                        if (i17 == 0 && g0Var != null && h0Var2 != null) {
                            h0Var2.b = readLine;
                        }
                        int indexOf = readLine.indexOf(":");
                        if (indexOf >= 0) {
                            inputStream = createInputStream;
                            strArr = new String[]{readLine.substring(i16, indexOf), readLine.substring(indexOf + 1).trim()};
                        } else {
                            inputStream = createInputStream;
                            strArr = new String[]{readLine.trim()};
                        }
                        if (strArr.length >= 2 && g0Var != null) {
                            if (!strArr[i16].startsWith("FN") && !strArr[i16].startsWith("N") && (!strArr[i16].startsWith("ORG") || !TextUtils.isEmpty(g0Var.a))) {
                                if (strArr[i16].startsWith("TEL")) {
                                    g0Var.b.add(strArr[i13]);
                                }
                            }
                            String[] split = strArr[i16].split(";");
                            int length = split.length;
                            String[] strArr2 = strArr;
                            int i18 = i16;
                            i14 = i18;
                            String str3 = null;
                            String str4 = null;
                            while (i18 < length) {
                                String[] split2 = split[i18].split("=");
                                String[] strArr3 = split;
                                if (split2.length == 2) {
                                    if (split2[i14].equals("CHARSET")) {
                                        str3 = split2[i13];
                                    } else if (split2[i14].equals("ENCODING")) {
                                        str4 = split2[i13];
                                    }
                                }
                                i18++;
                                split = strArr3;
                            }
                            if (strArr2[i14].startsWith("N")) {
                                g0Var.a = strArr2[i13].replace(';', ' ').trim();
                            } else {
                                g0Var.a = strArr2[i13];
                            }
                            if (str4 != null && str4.equalsIgnoreCase("QUOTED-PRINTABLE") && (H2 = H(h1(g0Var.a))) != null && H2.length != 0) {
                                g0Var.a = new String(H2, str3);
                            }
                            createInputStream = inputStream;
                            arrayList3 = arrayList;
                            i15 = i13;
                            i16 = i14;
                        }
                        i14 = i16;
                        createInputStream = inputStream;
                        arrayList3 = arrayList;
                        i15 = i13;
                        i16 = i14;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                r16 = i15;
            }
            th = th4;
            i11 = r16;
            arrayList2 = null;
            r12 = i11;
            f8.g(th, r12);
            return arrayList2;
        }
        InputStream inputStream2 = createInputStream;
        r16 = i15;
        int i19 = i16;
        bufferedReader.close();
        inputStream2.close();
        int i20 = i19;
        arrayList2 = null;
        while (i20 < arrayList4.size()) {
            try {
                g0 g0Var2 = (g0) arrayList4.get(i20);
                if (g0Var2.a == null || g0Var2.b.isEmpty()) {
                    i12 = i19;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    String str5 = (String) g0Var2.b.get(i19);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= g0Var2.b.size()) {
                            i12 = 0;
                            break;
                        }
                        String str6 = (String) g0Var2.b.get(i21);
                        i12 = 0;
                        if (i5.r(i10).l0.get(str6.substring(Math.max(0, str6.length() - 7))) != null) {
                            str5 = str6;
                            break;
                        }
                        i21++;
                    }
                    TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                    tL_userContact_old2.phone = str5;
                    tL_userContact_old2.first_name = g0Var2.a;
                    tL_userContact_old2.last_name = "";
                    tL_userContact_old2.id = 0L;
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = g0Var2.c.toString();
                    restrictionReason.platform = "";
                    restrictionReason.reason = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                    arrayList2.add(tL_userContact_old2);
                }
                i20++;
                i19 = i12;
            } catch (Throwable th6) {
                th = th6;
                r12 = 1;
            }
        }
        return arrayList2;
    }

    public static void e3(float[] fArr, int[] iArr) {
        if (fArr == null) {
            throw new NullPointerException("percents or output is null");
        }
        if (iArr == null) {
            iArr = new int[fArr.length];
        }
        if (fArr.length != iArr.length) {
            throw new IndexOutOfBoundsException("percents.length != output.length");
        }
        float f7 = 0.0f;
        for (float f10 : fArr) {
            f7 += f10;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < fArr.length; i11++) {
            int floor = (int) Math.floor((fArr[i11] / f7) * 100.0f);
            iArr[i11] = floor;
            i10 += floor;
        }
        while (i10 < 100) {
            int i12 = -1;
            float f11 = 0.0f;
            for (int i13 = 0; i13 < fArr.length; i13++) {
                float f12 = fArr[i13];
                float f13 = (f12 / f7) - (iArr[i13] / 100.0f);
                if (f12 > 0.0f && f13 >= f11) {
                    i12 = i13;
                    f11 = f13;
                }
            }
            if (i12 < 0) {
                return;
            }
            iArr[i12] = iArr[i12] + 1;
            i10++;
        }
    }

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static String f0(int i10) {
        if (i10 < 1000) {
            return Integer.toString(i10);
        }
        ArrayList arrayList = new ArrayList();
        while (i10 != 0) {
            int i11 = i10 % 1000;
            i10 /= 1000;
            if (i10 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i11)));
            } else {
                arrayList.add(Integer.toString(i11));
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
        float f7 = p;
        if (f7 >= 4.0f) {
            return 3;
        }
        return f7 >= 2.0f ? 2 : 1;
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
            int i10 = activity.getResources().getConfiguration().orientation;
            if (rotation == 3) {
                if (i10 == 1) {
                    activity.setRequestedOrientation(1);
                    return;
                } else {
                    activity.setRequestedOrientation(8);
                    return;
                }
            }
            if (rotation == 1) {
                if (i10 == 1) {
                    activity.setRequestedOrientation(9);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0) {
                if (i10 == 2) {
                    activity.setRequestedOrientation(0);
                    return;
                } else {
                    activity.setRequestedOrientation(1);
                    return;
                }
            }
            if (i10 == 2) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(9);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static int f3(boolean z10, boolean z11) {
        if (z10) {
            return w;
        }
        int i10 = v;
        return z11 ? i10 - L(42.0f) : i10;
    }

    public static boolean g(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) w0.b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, rf.n.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static String g0(int i10, boolean z10, boolean z11) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        return i11 == 0 ? z10 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i12), Integer.valueOf(i13)) : z11 ? String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static File g1() {
        return new File(b8.z(4), "sharing/");
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
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static void g3(Runnable runnable) {
        h3(runnable, 0L);
    }

    public static void h(ColorMatrix colorMatrix, float f7) {
        float f10 = f7 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 1.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 1.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i10, boolean z10) {
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        return z10 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static void h2() {
        f8.b("[FLAG_SECURE]");
    }

    public static void h3(Runnable runnable, long j10) {
        if (w0.d == null) {
            return;
        }
        if (j10 == 0) {
            w0.d.post(runnable);
        } else {
            w0.d.postDelayed(runnable, j10);
        }
    }

    public static void i(ColorMatrix colorMatrix, float f7) {
        float f10 = f7 + 1.0f;
        float f11 = 1.0f - f10;
        float f12 = 0.3086f * f11;
        float f13 = 0.6094f * f11;
        float f14 = f11 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f12 + f10, f13, f14, 0.0f, 0.0f, f12, f13 + f10, f14, 0.0f, 0.0f, f12, f13, f10 + f14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String i0(long j10, boolean z10, boolean z11) {
        if (j10 == 0) {
            return String.format("%d KB", 0);
        }
        if (j10 < 1024) {
            return String.format("%d B", Long.valueOf(j10));
        }
        if (j10 < 1048576) {
            float f7 = j10 / 1024.0f;
            if (z10) {
                int i10 = (int) f7;
                if ((f7 - i10) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f7));
        }
        if (j10 < 1048576000) {
            float f10 = (j10 / 1024.0f) / 1024.0f;
            if (z10) {
                int i11 = (int) f10;
                if ((f10 - i11) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i11));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f10));
        }
        float f11 = ((int) ((j10 / 1024) / 1024)) / 1000.0f;
        if (z10) {
            int i12 = (int) f11;
            if ((f11 - i12) * 10.0f == 0.0f) {
                return String.format("%d GB", Integer.valueOf(i12));
            }
        }
        return z11 ? String.format("%.1f GB", Float.valueOf(f11)) : String.format("%.2f GB", Float.valueOf(f11));
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
        AccessibilityManager accessibilityManager = (AccessibilityManager) w0.b.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(TLObject.FLAG_14);
            obtain.getText().add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static void i3(RectF rectF, float f7, float f10, float f11) {
        float f12 = f10 - rectF.left;
        float f13 = rectF.right - f10;
        rectF.set(f10 - (f12 * f7), f11 - ((f11 - rectF.top) * f7), (f13 * f7) + f10, ((rectF.bottom - f11) * f7) + f11);
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
        } catch (Exception e7) {
            f8.e("allGlobalViews()", e7);
            return null;
        }
    }

    public static String j0(int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        return i10 < 0 ? String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12)), Integer.valueOf(Math.abs(i13))) : String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
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

    public static Bitmap j2(float f7, int i10, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f7);
        int height = (int) (view.getHeight() / f7);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.0f / f7;
        canvas.scale(f10, f10);
        canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i10, Math.max(width, height) / zs.K2));
        return createBitmap;
    }

    public static void j3(org.telegram.ui.ActionBar.z4 z4Var, String str) {
        if (z4Var == null || str == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) z4Var.getFragmentStack().get(z4Var.getFragmentStack().size() - 1);
        try {
            Field declaredField = k2Var.getClass().getDeclaredField("listView");
            declaredField.setAccessible(true);
            tk0 tk0Var = (tk0) declaredField.get(k2Var);
            tk0Var.e1(new j(k2Var, str, tk0Var), 700, true);
            declaredField.setAccessible(false);
        } catch (Throwable unused) {
        }
    }

    public static int k(int i10, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i10);
        int red = Color.red(i10);
        int green = Color.green(i10);
        float f7 = red;
        float f10 = green;
        float blue = Color.blue(i10);
        float f11 = alpha;
        float f12 = (array[3] * f11) + (array[2] * blue) + (array[1] * f10) + (array[0] * f7) + array[4];
        float f13 = (array[8] * f11) + (array[7] * blue) + (array[6] * f10) + (array[5] * f7) + array[9];
        float f14 = (array[13] * f11) + (array[12] * blue) + (array[11] * f10) + (array[10] * f7) + array[14];
        return Color.argb(w7.u.b(Math.round((array[18] * f11) + (array[17] * blue) + (array[16] * f10) + (array[15] * f7) + array[19]), 0, zs.e4), w7.u.b(Math.round(f12), 0, zs.e4), w7.u.b(Math.round(f13), 0, zs.e4), w7.u.b(Math.round(f14), 0, zs.e4));
    }

    public static String k0(int i10, int i11) {
        int i12 = i11 / 3600;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 % 60;
        int i15 = i10 / 3600;
        int i16 = (i10 / 60) % 60;
        int i17 = i10 % 60;
        return i11 == 0 ? i15 == 0 ? String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)) : (i15 == 0 && i12 == 0) ? String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
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
        spannableStringBuilder.setSpan(new y(1, runnable), 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void k3(Activity activity, int i10) {
        if (activity == null || Q1()) {
            return;
        }
        int i11 = N;
        if (i11 == 0 || i11 == i10) {
            activity.getWindow().setSoftInputMode(48);
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

    public static SpannableStringBuilder l0(CharSequence charSequence, l9 l9Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            String str = (String) l9Var.l(Integer.valueOf(i10));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i10]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i10].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(int i10, int i11, int i12) {
        return Math.max(L(320.0f), (((i10 - i11) - i12) * 35) / 100) + i11;
    }

    public static void l2(q20 q20Var, float f7) {
        m2(q20Var, f7, (int) f7, null);
    }

    public static void l3(Activity activity, boolean z10) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        n3(window.getDecorView(), z10);
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i10 >= 30 ? 3 : 1;
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        return charSequence.toString().contains("%s") ? l0(charSequence, new m4.v0(24), charSequenceArr) : l0(charSequence, new m4.v0(26), charSequenceArr);
    }

    public static int m1(String str, boolean z10) {
        int[] iArr = b0;
        int[] iArr2 = a0;
        if (str == null || str.length() == 0) {
            return z10 ? iArr[0] : iArr2[0];
        }
        int i10 = (str.contains(".doc") || str.contains(".txt") || str.contains(".psd")) ? 0 : (str.contains(".xls") || str.contains(".csv")) ? 1 : (str.contains(".pdf") || str.contains(".ppt") || str.contains(".key")) ? 2 : (str.contains(".zip") || str.contains(".rar") || str.contains(".ai") || str.contains(".mp3") || str.contains(".mov") || str.contains(".avi")) ? 3 : -1;
        if (i10 == -1) {
            int lastIndexOf = str.lastIndexOf(46);
            String substring = lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
            i10 = substring.length() != 0 ? substring.charAt(0) % iArr2.length : str.charAt(0) % iArr2.length;
        }
        return z10 ? iArr[i10] : iArr2[i10];
    }

    public static void m2(q20 q20Var, float f7, int i10, ArrayList arrayList) {
        List j10 = j();
        if (j10 == null) {
            q20Var.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = q;
                int i11 = (int) (point.x / f7);
                int i12 = (int) (((point.y + m) + n) / f7);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f10 = 1.0f / f7;
                canvas.scale(f10, f10);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                for (int i13 = 0; i13 < j10.size(); i13++) {
                    View view = (View) j10.get(i13);
                    if (!(view instanceof ze0) && (arrayList == null || !arrayList.contains(view))) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(i0.b.o(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f7, iArr[1] / f7);
                        try {
                            view.draw(canvas);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i10, Math.max(i11, i12) / zs.K2));
                q20Var.a(createBitmap);
            } catch (Exception e10) {
                f8.g(e10, true);
                q20Var.a(null);
            }
            m0 = false;
        } catch (Throwable th2) {
            m0 = false;
            throw th2;
        }
    }

    public static void m3(Dialog dialog, boolean z10) {
        Window window;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        n3(window.getDecorView(), z10);
    }

    public static void n(Animator animator, double d10, double d11) {
        double d12;
        double d13;
        double sqrt = Math.sqrt(d10 / 1.0d);
        double sqrt2 = d11 / (Math.sqrt(d10 * 1.0d) * 2.0d);
        if (sqrt2 < 1.0d) {
            d13 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d12 = ((sqrt2 * sqrt) + (-0.0d)) / d13;
        } else {
            d12 = (-0.0d) + sqrt;
            d13 = 0.0d;
        }
        double d14 = d13;
        double d15 = d12;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new z(sqrt2, sqrt, d14, d15));
    }

    public static String n0(int i10) {
        String str;
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i11 > 0) {
            Locale locale = Locale.US;
            str = a1.g.k(i11, "h");
        } else {
            str = "";
        }
        if (i12 > 0) {
            StringBuilder t10 = a1.g.t(str);
            t10.append(String.format(Locale.US, i11 > 0 ? "%02dm" : "%dm", Integer.valueOf(i12)));
            str = t10.toString();
        }
        StringBuilder t11 = a1.g.t(str);
        t11.append(String.format(Locale.US, (i11 > 0 || i12 > 0) ? "%02ds" : "%ds", Integer.valueOf(i13)));
        return t11.toString();
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

    public static void n2(ColorMatrix colorMatrix, float f7) {
        colorMatrix.postConcat(new ColorMatrix(new float[]{f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void n3(View view, boolean z10) {
        int systemUiVisibility;
        int b10;
        if (view == null || Build.VERSION.SDK_INT < 26 || systemUiVisibility == (b10 = v7.u7.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z10))) {
            return;
        }
        view.setSystemUiVisibility(b10);
    }

    public static Typeface o() {
        if (a == null) {
            if (!tz.V0 || Build.VERSION.SDK_INT < 28) {
                a = o1("fonts/rmedium.ttf");
            } else {
                a = Typeface.create(null, 500, false);
            }
        }
        return a;
    }

    public static String o0(int i10, int i11) {
        String[] strArr;
        if (i10 == 0) {
            return "0";
        }
        float f7 = i10;
        if (i11 == 0) {
            i11 = i10;
        }
        if (i11 < 1000) {
            return f0(i10);
        }
        int i12 = 0;
        while (true) {
            strArr = g0;
            if (i11 < 1000 || i12 >= strArr.length - 1) {
                break;
            }
            i11 /= 1000;
            f7 /= 1000.0f;
            i12++;
        }
        if (f7 < 0.1d) {
            return "0";
        }
        float f10 = f7 * 10.0f;
        float f11 = (int) f10;
        if (f10 != f11) {
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 / 10.0f), strArr[i12]);
        }
        Locale locale = Locale.ENGLISH;
        return sc.e.A(f0((int) f7), strArr[i12]);
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
                            Typeface.Builder builder = new Typeface.Builder(w0.b.getAssets(), str);
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
                            createFromAsset = Typeface.createFromAsset(w0.b.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e7) {
                        if (v2.a) {
                            f8.d("Could not get typeface '" + str + "' because " + e7.getMessage());
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

    public static void o3(Activity activity, boolean z10) {
        if (activity != null) {
            r3(activity.getWindow(), z10);
        }
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
            } catch (Exception e7) {
                f8.g(e7, true);
                return 0;
            }
        }
        return 0;
    }

    public static String p0(int i10, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i10 != 0) {
            return a1.g.n("VID_", format, ".mp4");
        }
        StringBuilder u10 = a1.g.u("IMG_", format, ".");
        if (TextUtils.isEmpty(str)) {
            str = "jpg";
        }
        u10.append(str);
        return u10.toString();
    }

    public static Vibrator p1() {
        if (J == null) {
            J = (Vibrator) w0.b.getSystemService("vibrator");
        }
        return J;
    }

    public static boolean p2(boolean z10) {
        u0 u0Var = u0.f;
        if (z10) {
            u0Var.getClass();
            if (SystemClock.elapsedRealtime() - u0Var.c < 200) {
                u0Var.b = false;
            }
        }
        boolean z11 = u0Var.b;
        if (z10) {
            u0.f.b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (v2.a && z10 && tz.s.length() > 0) {
            f8.b("wasInBackground = " + z11 + " appLocked = " + tz.x + " autoLockIn = " + tz.y + " lastPauseTime = " + tz.B + " uptime = " + elapsedRealtime);
        }
        if (tz.s.length() > 0 && z11) {
            if (tz.x) {
                return true;
            }
            if ((tz.y != 0 && tz.B != 0 && !tz.x && tz.B + tz.y <= elapsedRealtime) || elapsedRealtime + 5 < tz.B) {
                return true;
            }
        }
        return false;
    }

    public static void p3(Dialog dialog, boolean z10) {
        if (dialog != null) {
            r3(dialog.getWindow(), z10);
        }
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.xn) {
            return q(((org.telegram.ui.xn) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i10 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i10 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i10 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.f9) {
                int[] iArr2 = ((org.telegram.ui.Components.f9) drawable).a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i10 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i10 = iArr2[0];
                    }
                }
            } else if (drawable instanceof jb0) {
                int argb = Color.argb(45, 0, 0, 0);
                iArr[2] = argb;
                iArr[0] = argb;
                int argb2 = Color.argb(61, 0, 0, 0);
                iArr[3] = argb2;
                iArr[1] = argb2;
                return iArr;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        double[] d32 = d3((i10 >> 16) & zs.e4, (i10 >> 8) & zs.e4, i10 & zs.e4);
        double d10 = d32[1];
        d32[1] = Math.min(1.0d, ((1.0d - d10) * 0.1d) + 0.05d + d10);
        int[] y12 = y1(d32[0], d32[1], Math.max(0.0d, d32[2] * 0.65d));
        iArr[0] = Color.argb(zs.n1, y12[0], y12[1], y12[2]);
        iArr[1] = Color.argb(zs.S1, y12[0], y12[1], y12[2]);
        int[] y13 = y1(d32[0], d32[1], Math.max(0.0d, d32[2] * 0.72d));
        iArr[2] = Color.argb(zs.n1, y13[0], y13[1], y13[2]);
        iArr[3] = Color.argb(zs.S1, y13[0], y13[1], y13[2]);
        return iArr;
    }

    public static File q0(String str, boolean z10) {
        try {
            File z11 = b8.z(100);
            if (!z10 && z11 != null) {
                return new File(z11, p0(0, str));
            }
            return new File(w0.b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str));
        } catch (Exception e7) {
            f8.g(e7, true);
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
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
        }
        return 0;
    }

    public static void q2(long j10, StringBuilder sb2) {
        if (j10 >= 10) {
            sb2.append(j10);
        } else {
            sb2.append("0");
            sb2.append(j10);
        }
    }

    public static void q3(View view, boolean z10) {
        int systemUiVisibility;
        int b10;
        if (view == null || Build.VERSION.SDK_INT < 26 || systemUiVisibility == (b10 = v7.u7.b((systemUiVisibility = view.getSystemUiVisibility()), TLObject.FLAG_13, z10))) {
            return;
        }
        view.setSystemUiVisibility(b10);
    }

    public static void r(Runnable runnable) {
        if (w0.d == null) {
            return;
        }
        w0.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null || str.length() == 0) {
            str = str2;
        } else if (str2 != null && str2.length() != 0) {
            str = a1.g.C(str, " ", str2);
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i10 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i10);
            if (indexOf == -1) {
                break;
            }
            int i11 = indexOf - (indexOf == 0 ? 0 : 1);
            int length = str3.length() + (indexOf == 0 ? 0 : 1) + i11;
            if (i10 != 0 && i10 != i11 + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i10, i11));
            } else if (i10 == 0 && i11 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i11));
            }
            String substring = trim.substring(i11, Math.min(trim.length(), length));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), length2, trim2.length() + length2, 33);
            i10 = length;
        }
        if (i10 != -1 && i10 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i10));
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
            if (!(view.getParent() instanceof z4.g)) {
                fArr[0] = view.getX() + fArr[0];
                fArr[1] = view.getY() + fArr[1];
            }
            view = (View) view.getParent();
        }
    }

    public static void r2(dr0 dr0Var) {
        if (dr0Var == null || dr0Var.getAdapter() == null) {
            return;
        }
        if (dr0Var.c0()) {
            dr0Var.post(new a(dr0Var, 1));
        } else {
            dr0Var.getAdapter().f();
        }
    }

    public static void r3(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b10 = v7.u7.b(systemUiVisibility, TLObject.FLAG_13, z10);
        if (systemUiVisibility != b10) {
            decorView.setSystemUiVisibility(b10);
        }
        if (Build.VERSION.SDK_INT >= 35 || window.getStatusBarColor() == 0) {
            return;
        }
        window.setStatusBarColor(0);
    }

    public static float s(float f7, float f10, float f11, float f12) {
        if (f11 <= 0.0f) {
            return f7;
        }
        float min = Math.min(f12, f11) * (1.0f / f11);
        return w7.u.a((f7 - ((1.0f - min) * (f10 / f11))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z10) {
        try {
            File v02 = v0(z10);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
            if (f0 == null) {
                f0 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            return new File(v02, "VID_" + f0.format(date) + ".mp4");
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static int s1(int i10, boolean z10) {
        int i11 = z10 ? i10 + zs.K2 : i10 - 180;
        while (i11 >= 360) {
            i11 -= 360;
        }
        while (i11 < 0) {
            i11 += 360;
        }
        return i11;
    }

    public static void s2(jj jjVar, Activity activity, org.telegram.ui.ActionBar.k2 k2Var) {
        TLRPC.Document F0;
        char c10;
        String str;
        if (jjVar == null || (F0 = jjVar.F0()) == null) {
            return;
        }
        String r10 = jjVar.k.media != null ? b8.r(null, F0) : "";
        String str2 = jjVar.k.attachPath;
        File file = (str2 == null || str2.length() == 0) ? null : new File(jjVar.k.attachPath);
        if (file == null || !file.exists()) {
            b8.G(d20.s0);
            file = b8.N(jjVar.k, false, true);
        }
        if (file == null || !file.exists()) {
            return;
        }
        if (k2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
            org.telegram.ui.ActionBar.s6 v10 = org.telegram.ui.ActionBar.t6.v(file, jjVar.I0(), null, true);
            if (v10 != null) {
                k2Var.presentFragment(new m91(v10));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            HashMap hashMap = new HashMap();
            int i10 = org.telegram.ui.ActionBar.t6.L5;
            hashMap.put("info1", Integer.valueOf(k2Var.getThemedColor(i10)));
            hashMap.put("info2", Integer.valueOf(k2Var.getThemedColor(i10)));
            alertDialog$Builder.m(R.raw.not_available, 52, k2Var.getThemedColor(i10), hashMap);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.W = true;
            x1Var.T = cd.L0(2131749209, null);
            alertDialog$Builder.k(cd.L0(2131747847, null), null);
            k2Var.showDialog(x1Var);
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
                    w0.d();
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
                        w0.d();
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
                int i11 = org.telegram.ui.ActionBar.t6.L5;
                hashMap2.put("info1", Integer.valueOf(k2Var.getThemedColor(i11)));
                hashMap2.put("info2", Integer.valueOf(k2Var.getThemedColor(i11)));
                alertDialog$Builder2.m(R.raw.not_available, 52, k2Var.getThemedColor(i11), hashMap2);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.W = true;
                alertDialog$Builder2.k(cd.L0(2131747847, null), null);
                Object[] objArr = new Object[1];
                objArr[c10] = jjVar.F0().mime_type;
                x1Var2.T = cd.a0("NoHandleAppInstalled", null, 2131748222, objArr);
                k2Var.showDialog(x1Var2);
            }
        } catch (Exception unused3) {
            c10 = 0;
        }
    }

    public static void s3(Activity activity, int i10, boolean z10) {
        if (activity != null) {
            u3(activity.getWindow(), i10, z10, null);
        }
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
        int i10 = 0;
        while (i10 <= charSequence.length() - charSequence2.length()) {
            for (int i11 = 0; i11 < charSequence2.length(); i11++) {
                if (charSequence2.charAt(i11) != charSequence.charAt(i10 + i11)) {
                    break;
                }
            }
            return i10;
        }
        return -1;
    }

    public static int t0() {
        if (d20.i(d20.s0).p() && !ConnectionsManager.getInstance(d20.s0).isTestBackend()) {
            return d20.s0;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (d20.i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                return i10;
            }
        }
        return d20.s0;
    }

    public static boolean t1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        ji.b d10;
        if (intent == null) {
            return false;
        }
        try {
            if ((intent.getFlags() & TLObject.FLAG_20) != 0 || (data = intent.getData()) == null || (d10 = ji.b.d(data)) == null || !d10.f()) {
                return false;
            }
            K3(launchActivity, d10);
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
    public static boolean t2(File file, String str, String str2, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        if (file == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int lastIndexOf = str == null ? -1 : str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            if (z10) {
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
                if (!z10) {
                    if (Build.VERSION.SDK_INT >= 26 && !w0.b.getPackageManager().canRequestPackageInstalls()) {
                        org.telegram.ui.Components.s4.j(activity, p6Var).show();
                        return true;
                    }
                }
                return true;
            }
            if (Build.VERSION.SDK_INT < 24) {
                w0.d();
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
                    w0.d();
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
            if (!z10) {
            }
            return true;
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        if (str2 != null) {
        }
    }

    public static void t3(Dialog dialog, int i10, boolean z10, org.telegram.ui.Components.ig igVar) {
        if (dialog != null) {
            u3(dialog.getWindow(), i10, z10, igVar);
        }
    }

    public static void u(Context context, boolean z10) {
        if (context == null) {
            return;
        }
        context.setTheme((org.telegram.ui.ActionBar.t6.I.q() && z10) ? R.style.Theme_TMessages_Dark : R.style.Theme_TMessages);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.I1;
        }
        return (W2 == null || W2.isFinishing()) ? W(w0.b) : W2;
    }

    public static boolean u1(org.telegram.ui.ActionBar.k2 k2Var) {
        List j10;
        if (k2Var == null) {
            return false;
        }
        Dialog dialog = k2Var.visibleDialog;
        if (dialog == null || (dialog instanceof org.telegram.ui.ActionBar.x1) || ((dialog instanceof org.telegram.ui.ActionBar.z2) && ((org.telegram.ui.ActionBar.z2) dialog).f1 != null)) {
            if (k2Var.getParentLayout() == null || (j10 = j()) == null || j10.isEmpty()) {
                return false;
            }
            View view = null;
            for (int size = j10.size() - 1; size >= 0; size--) {
                view = (View) j10.get(size);
                Dialog dialog2 = k2Var.visibleDialog;
                if (dialog2 instanceof org.telegram.ui.ActionBar.x1) {
                    View view2 = ((org.telegram.ui.ActionBar.x1) dialog2).c1;
                    while (view2 != null && (view2.getParent() instanceof View)) {
                        view2 = (View) view2.getParent();
                    }
                    if (view == view2) {
                        continue;
                    }
                }
                if (!(view instanceof org.telegram.ui.ActionBar.t1) && !(view instanceof ze0)) {
                    break;
                }
            }
            View view3 = k2Var.getParentLayout().getView();
            while (view3 != null && (view3.getParent() instanceof View)) {
                view3 = (View) view3.getParent();
            }
            if (view == view3) {
                return false;
            }
        }
        return true;
    }

    public static boolean u2(jj jjVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        String str = jjVar.k.attachPath;
        File file = (str == null || str.length() == 0) ? null : new File(jjVar.k.attachPath);
        if (file == null || !file.exists()) {
            b8.G(jjVar.I1);
            file = b8.N(jjVar.k, false, true);
        }
        File file2 = file;
        int i10 = jjVar.D;
        return t2(file2, jjVar.S0(), (i10 == 9 || i10 == 0) ? jjVar.u1() : null, activity, p6Var, z10);
    }

    public static void u3(Window window, int i10, boolean z10, org.telegram.ui.Components.ig igVar) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            l0.remove(window);
        }
        if (!z10) {
            if (igVar != null) {
                org.telegram.ui.Components.bi biVar = igVar.b;
                biVar.F0 = -1;
                biVar.G0 = i10;
                biVar.b.invalidate();
            }
            try {
                window.setNavigationBarColor(i10);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i10);
        ofArgb.addUpdateListener(new r(0, igVar, window));
        ofArgb.addListener(new bg.e(window, 15));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(org.telegram.ui.Components.gr.f);
        ofArgb.start();
        if (l0 == null) {
            l0 = new HashMap();
        }
        l0.put(window, ofArgb);
    }

    public static void v(Context context, Configuration configuration) {
        Display defaultDisplay;
        try {
            float f7 = p;
            p = context.getResources().getDisplayMetrics().density;
            if (o && Math.abs(f7 - r3) > 0.001d) {
                if (org.telegram.ui.ActionBar.t6.m3 != null) {
                    org.telegram.ui.ActionBar.t6.m3 = null;
                    org.telegram.ui.ActionBar.t6.K(context, false);
                }
                if (org.telegram.ui.ActionBar.t6.B0 != null) {
                    org.telegram.ui.ActionBar.t6.B0 = null;
                    org.telegram.ui.ActionBar.t6.T(context);
                }
                if (org.telegram.ui.ActionBar.t6.Q1 != null) {
                    org.telegram.ui.ActionBar.t6.Q1 = null;
                    org.telegram.ui.ActionBar.t6.Z(context);
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
                    for (float f10 : supportedRefreshRates) {
                        if (f10 > s) {
                            s = f10;
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
            if (v2.a) {
                f8.d("density = " + p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + m + ", navbar height: " + n);
            }
            e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static File v0(boolean z10) {
        int i10;
        if (z10 || !v2.b || (((i10 = Build.VERSION.SDK_INT) >= 33 && w0.b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) || (i10 <= 33 && w0.b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))) {
            return b8.z(0);
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
            if (file.mkdirs() || file.exists()) {
                return file;
            }
            if (v2.a) {
                f8.b("failed to create directory");
                return null;
            }
        } else if (v2.a) {
            f8.b("External storage is not mounted READ/WRITE.");
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
        } catch (Exception e7) {
            f8.g(e7, true);
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
        String r10 = b8.r(null, tLObject);
        b8.G(d20.s0);
        File K2 = b8.K(tLObject, null, true, true);
        if (K2 == null || !K2.exists()) {
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
            w0.d();
            intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", K2), str != null ? str : "text/plain");
        } else {
            intent.setDataAndType(Uri.fromFile(K2), str != null ? str : "text/plain");
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
                w0.d();
                intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", K2), "text/plain");
            } else {
                intent.setDataAndType(Uri.fromFile(K2), "text/plain");
            }
            activity.startActivityForResult(intent, 500);
            return true;
        }
    }

    public static void v3(Activity activity, PictureInPictureParams pictureInPictureParams) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        if (pictureInPictureParams == null) {
            b3(activity);
            return;
        }
        try {
            activity.setPictureInPictureParams(pictureInPictureParams);
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    public static boolean w(String str) {
        boolean z10;
        boolean z11;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z10 = false;
            z11 = false;
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    char charAt = str.charAt(i10);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                            z11 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10 && z11) {
                            break;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    f8.g(e, true);
                    return !z10 ? false : false;
                }
            }
        } catch (Exception e10) {
            e = e10;
            z10 = false;
            z11 = false;
        }
        if (!z10 && z11) {
            return true;
        }
    }

    public static int w0(int i10, int i11) {
        int red = Color.red(i10);
        int red2 = Color.red(i11);
        int green = Color.green(i10);
        int green2 = Color.green(i11);
        int blue = Color.blue(i10);
        return Color.argb(zs.e4, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i11) / 2) + (blue / 2));
    }

    public static SpannableStringBuilder w1(CharSequence charSequence, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        int indexOf = lowerCase.indexOf(str);
        while (indexOf >= 0) {
            try {
                valueOf.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, p6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            indexOf = lowerCase.indexOf(str, indexOf + 1);
        }
        return valueOf;
    }

    public static long w2(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static void w3(Window window) {
        WindowManager windowManager;
        float f7 = s;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f7;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static boolean x(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String d10 = af.b.d(str2, false);
            int i10 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d10.indexOf(str3, i10);
                    if (indexOf == -1) {
                        return false;
                    }
                    i10 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static Bitmap x0() {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = w0.b.getResources().openRawResource(R.raw.round_blur_overlay_text);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    f8.g(th, true);
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

    public static CharSequence x1(CharSequence charSequence, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
        if (arrayList != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                SpannableStringBuilder w12 = w1(charSequence, (String) arrayList.get(i11), p6Var);
                if (w12 != null) {
                    charSequence = w12;
                } else {
                    i10++;
                }
            }
            if (i10 != arrayList.size()) {
                return charSequence;
            }
        }
        return null;
    }

    public static SpannableStringBuilder x2(String str, Runnable runnable) {
        return R2(str, -1, 2, runnable, null);
    }

    public static void x3(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - s) > 0.2d) {
            layoutParams.preferredRefreshRate = s;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
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
            PixelCopy.request(surface, bitmap, new q(countDownLatch, 0), Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
    }

    public static int[] y1(double d10, double d11, double d12) {
        double d13;
        double d14 = d10 * 6.0d;
        double floor = (int) Math.floor(d14);
        double d15 = d14 - floor;
        double d16 = (1.0d - d11) * d12;
        double d17 = (1.0d - (d15 * d11)) * d12;
        double d18 = (1.0d - ((1.0d - d15) * d11)) * d12;
        int i10 = ((int) floor) % 6;
        if (i10 == 0) {
            d16 = d18;
            d18 = d16;
        } else if (i10 != 1) {
            if (i10 == 2) {
                d13 = d16;
                d16 = d12;
            } else if (i10 == 3) {
                d18 = d12;
                d12 = d16;
                d16 = d17;
            } else if (i10 == 4) {
                d13 = d18;
                d18 = d12;
            } else if (i10 != 5) {
                d12 = 0.0d;
                d18 = 0.0d;
                d16 = 0.0d;
            } else {
                d18 = d17;
            }
            d12 = d13;
        } else {
            d18 = d16;
            d16 = d12;
            d12 = d17;
        }
        return new int[]{(int) (d12 * 255.0d), (int) (d16 * 255.0d), (int) (d18 * 255.0d)};
    }

    public static String y2(File file, int i10) {
        InputStream inputStream;
        ThreadLocal threadLocal = b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            inputStream = file != null ? new FileInputStream(file) : w0.b.getResources().openRawResource(i10);
            try {
                ThreadLocal threadLocal2 = c;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[TLObject.FLAG_12];
                    threadLocal2.set(bArr2);
                }
                int i11 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, bArr2.length);
                    if (read >= 0) {
                        int i12 = i11 + read;
                        if (bArr.length < i12) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i11);
                            b.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i11, read);
                            i11 = i12;
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                inputStream.close();
                return new String(bArr, 0, i11);
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

    public static void y3(ScrollView scrollView, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i10);
            scrollView.setBottomEdgeEffectColor(i10);
            return;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception unused) {
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
        PixelCopy.request(surfaceView, bitmap, new q(countDownLatch, 1), Utilities.g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
    }

    public static float z1(float f7, float f10, float f11) {
        return (f7 - f10) / (f11 - f10);
    }

    public static void z2(Bitmap bitmap) {
        A2(Collections.singletonList(bitmap));
    }

    public static void z3(org.telegram.ui.r2 r2Var, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            r2Var.setEdgeEffectColor(i10);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(r2Var);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(r2Var);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }
}
