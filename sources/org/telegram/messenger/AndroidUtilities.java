package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
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
import android.graphics.Matrix;
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
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.CalendarContract;
import android.provider.CallLog;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
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
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.view.inspector.WindowInspector;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ff.r;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import java.net.IDN;
import java.nio.ByteBuffer;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oc1;
import org.telegram.ui.qn;
import org.telegram.ui.tn;
import org.telegram.ui.xh1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AndroidUtilities {
    public static Pattern BAD_CHARS_MESSAGE_LONG_PATTERN = null;
    public static Pattern BAD_CHARS_MESSAGE_PATTERN = null;
    public static Pattern BAD_CHARS_PATTERN = null;
    public static final int FLAG_TAG_ALL = 11;
    public static final int FLAG_TAG_BOLD = 2;
    public static final int FLAG_TAG_BR = 1;
    public static final int FLAG_TAG_COLOR = 4;
    public static final int FLAG_TAG_URL = 8;
    public static Pattern LONG_BAD_CHARS_PATTERN = null;
    public static Pattern REMOVE_MULTIPLE_DIACRITICS = null;
    public static final int REPLACING_TAG_TYPE_BOLD = 1;
    public static final int REPLACING_TAG_TYPE_LINK = 0;
    public static final int REPLACING_TAG_TYPE_LINKBOLD = 2;
    public static final int REPLACING_TAG_TYPE_LINK_NBSP = 3;
    public static final int REPLACING_TAG_TYPE_UNDERLINE = 4;
    public static final String STICKERS_PLACEHOLDER_PACK_NAME = "tg_placeholders_android";
    public static final String STICKERS_PLACEHOLDER_PACK_NAME_2 = "tg_superplaceholders_android_2";
    public static final String TYPEFACE_MERRIWEATHER_BOLD = "fonts/mw_bold.ttf";
    public static final String TYPEFACE_ROBOTO_EXTRA_BOLD = "fonts/rextrabold.ttf";
    public static final String TYPEFACE_ROBOTO_MEDIUM = "fonts/rmedium.ttf";
    public static final String TYPEFACE_ROBOTO_MEDIUM_ITALIC = "fonts/rmediumitalic.ttf";
    public static final String TYPEFACE_ROBOTO_MONO = "fonts/rmono.ttf";
    public static Pattern WEB_URL;
    private static AccessibilityManager accessibilityManager;
    private static CallReceiver callReceiver;
    private static char[] characters;
    private static HashSet<Character> charactersMap;
    private static int[] documentIcons;
    private static int[] documentMediaIcons;
    public static boolean firstConfigurationWas;
    private static SimpleDateFormat generatingVideoPathFormat;
    private static boolean hasCallPermissions;
    public static boolean incorrectDisplaySizeFix;
    private static Boolean isHonor;
    public static boolean isInMultiwindow;
    public static int leftBaseline;
    private static Pattern linksPattern;
    private static Field mAttachInfoField;
    private static Field mStableInsetsField;
    public static boolean makingGlobalBlurBitmap;
    public static Typeface mediumTypeface;
    private static final Paint navbarProtactionPaint;
    private static HashMap<Window, ValueAnimator> navigationBarColorAnimators;
    public static final String[] numbersSignatureArray;
    public static int roundMessageInset;
    public static int roundMessageSize;
    public static int roundPlayingMessageSize;
    public static int roundSidePlayingMessageSize;
    public static final Linkify.MatchFilter sUrlMatchFilter;
    private static final float[] tempFloats;
    private static final float[] tempFloats2;
    public static float touchSlop;
    private static Runnable unregisterRunnable;
    private static Pattern uriParse;
    public static boolean usingHardwareInput;
    private static Vibrator vibrator;
    public static ThreadLocal<byte[]> readBufferLocal = new ThreadLocal<>();
    public static ThreadLocal<byte[]> bufferLocal = new ThreadLocal<>();
    private static final Hashtable<String, Typeface> typefaceCache = new Hashtable<>();
    private static int prevOrientation = -10;
    private static boolean waitingForSms = false;
    private static boolean waitingForCall = false;
    private static final Object smsLock = new Object();
    private static final Object callLock = new Object();

    @Deprecated
    public static int statusBarHeight = 0;

    @Deprecated
    public static int navigationBarHeight = 0;
    public static float density = 1.0f;
    public static Point displaySize = new Point();
    public static float screenRefreshRate = 60.0f;
    public static float screenMaxRefreshRate = 60.0f;
    public static float screenRefreshTime = 16.666666f;
    public static Integer photoSize = null;
    public static Integer highQualityPhotoSize = null;
    public static DisplayMetrics displayMetrics = new DisplayMetrics();
    public static DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    public static AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
    public static OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
    private static Boolean isTablet = null;
    private static Boolean wasTablet = null;
    private static Boolean isSmallScreen = null;
    private static int adjustOwnerClassGuid = 0;
    private static int altFocusableClassGuid = 0;
    public static final RectF rectTmp = new RectF();
    public static final Rect rectTmp2 = new Rect();
    public static final int[] pointTmp2 = new int[2];
    public static Pattern REMOVE_RTL = null;
    private static Pattern singleTagPatter = null;
    public static final Paint strokeTop = new Paint(1);
    public static final Paint strokeBottom = new Paint(1);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface IntColorCallback {
        void run(int i9);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class LinkMovementMethodMy extends LinkMovementMethod {
        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            try {
                boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return onTouchEvent;
                }
                Selection.removeSelection(spannable);
                return onTouchEvent;
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class LinkSpec {
        int end;
        int start;
        String url;

        private LinkSpec() {
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class VcardData {
        String name;
        ArrayList<String> phones;
        StringBuilder vcard;

        private VcardData() {
            this.phones = new ArrayList<>();
            this.vcard = new StringBuilder();
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class VcardItem {
        public int type;
        public ArrayList<String> vcardData = new ArrayList<>();
        public String fullData = "";
        public boolean checked = true;

        public String getRawType(boolean z10) {
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return "";
            }
            String substring = this.fullData.substring(0, indexOf);
            if (this.type == 20) {
                String[] split = substring.substring(2).split(";");
                return z10 ? split[0] : split.length > 1 ? split[split.length - 1] : "";
            }
            String[] split2 = substring.split(";");
            for (int i9 = 0; i9 < split2.length; i9++) {
                if (split2[i9].indexOf(61) < 0) {
                    substring = split2[i9];
                }
            }
            return substring;
        }

        public String[] getRawValue() {
            byte[] decodeQuotedPrintable;
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return new String[0];
            }
            String substring = this.fullData.substring(0, indexOf);
            String substring2 = this.fullData.substring(indexOf + 1);
            String str = null;
            String str2 = "UTF-8";
            for (String str3 : substring.split(";")) {
                String[] split = str3.split("=");
                if (split.length == 2) {
                    if (split[0].equals("CHARSET")) {
                        str2 = split[1];
                    } else if (split[0].equals("ENCODING")) {
                        str = split[1];
                    }
                }
            }
            String[] split2 = substring2.split(";");
            for (int i9 = 0; i9 < split2.length; i9++) {
                if (!TextUtils.isEmpty(split2[i9]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(split2[i9]))) != null && decodeQuotedPrintable.length != 0) {
                    try {
                        split2[i9] = new String(decodeQuotedPrintable, str2);
                    } catch (Exception unused) {
                    }
                }
            }
            return split2;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
        
            if (r0.equals("WORK") == false) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getType() {
            int i9 = this.type;
            char c10 = 4;
            if (i9 == 4) {
                return LocaleController.getString(R.string.ContactNote);
            }
            if (i9 == 3) {
                return LocaleController.getString(R.string.ContactUrl);
            }
            if (i9 == 5) {
                return LocaleController.getString(R.string.ContactBirthday);
            }
            if (i9 == 6) {
                return "ORG".equalsIgnoreCase(getRawType(true)) ? LocaleController.getString(R.string.ContactJob) : LocaleController.getString(R.string.ContactJobTitle);
            }
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return "";
            }
            String substring = this.fullData.substring(0, indexOf);
            if (this.type != 20) {
                String[] split = substring.split(";");
                for (int i10 = 0; i10 < split.length; i10++) {
                    if (split[i10].indexOf(61) < 0) {
                        substring = split[i10];
                    }
                }
                if (substring.startsWith("X-")) {
                    substring = substring.substring(2);
                }
                substring.getClass();
                switch (substring.hashCode()) {
                    case -2015525726:
                        if (substring.equals("MOBILE")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2064738:
                        if (substring.equals("CELL")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2223327:
                        if (substring.equals("HOME")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2464291:
                        if (substring.equals("PREF")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2670353:
                        break;
                    case 75532016:
                        if (substring.equals("OTHER")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                        substring = LocaleController.getString(R.string.PhoneMobile);
                        break;
                    case 2:
                        substring = LocaleController.getString(R.string.PhoneHome);
                        break;
                    case 3:
                        substring = LocaleController.getString(R.string.PhoneMain);
                        break;
                    case 4:
                        substring = LocaleController.getString(R.string.PhoneWork);
                        break;
                    case 5:
                        substring = LocaleController.getString(R.string.PhoneOther);
                        break;
                }
            } else {
                substring = substring.substring(2).split(";")[0];
            }
            return substring.substring(0, 1).toUpperCase() + substring.substring(1).toLowerCase();
        }

        public String getValue(boolean z10) {
            byte[] decodeQuotedPrintable;
            StringBuilder sb2 = new StringBuilder();
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return "";
            }
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            String substring = this.fullData.substring(0, indexOf);
            String substring2 = this.fullData.substring(indexOf + 1);
            String str = null;
            String str2 = "UTF-8";
            for (String str3 : substring.split(";")) {
                String[] split = str3.split("=");
                if (split.length == 2) {
                    if (split[0].equals("CHARSET")) {
                        str2 = split[1];
                    } else if (split[0].equals("ENCODING")) {
                        str = split[1];
                    }
                }
            }
            String[] split2 = substring2.split(";");
            boolean z11 = false;
            for (int i9 = 0; i9 < split2.length; i9++) {
                if (!TextUtils.isEmpty(split2[i9])) {
                    if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(split2[i9]))) != null && decodeQuotedPrintable.length != 0) {
                        try {
                            split2[i9] = new String(decodeQuotedPrintable, str2);
                        } catch (Exception unused) {
                        }
                    }
                    if (z11 && sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(split2[i9]);
                    if (!z11) {
                        z11 = split2[i9].length() > 0;
                    }
                }
            }
            if (z10) {
                int i10 = this.type;
                if (i10 == 0) {
                    return ne.b.c().b(sb2.toString());
                }
                if (i10 == 5) {
                    String[] split3 = sb2.toString().split("T");
                    if (split3.length > 0) {
                        String[] split4 = split3[0].split("-");
                        if (split4.length == 3) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, Utilities.parseInt((CharSequence) split4[0]).intValue());
                            calendar.set(2, Utilities.parseInt((CharSequence) split4[1]).intValue() - 1);
                            calendar.set(5, Utilities.parseInt((CharSequence) split4[2]).intValue());
                            return LocaleController.getInstance().getFormatterYearMax().format(calendar.getTime());
                        }
                    }
                }
            }
            return sb2.toString();
        }
    }

    static {
        WEB_URL = null;
        BAD_CHARS_PATTERN = null;
        LONG_BAD_CHARS_PATTERN = null;
        BAD_CHARS_MESSAGE_PATTERN = null;
        BAD_CHARS_MESSAGE_LONG_PATTERN = null;
        REMOVE_MULTIPLE_DIACRITICS = null;
        try {
            BAD_CHARS_PATTERN = Pattern.compile("[─-◿]");
            LONG_BAD_CHARS_PATTERN = Pattern.compile("[一-\u9fff]");
            BAD_CHARS_MESSAGE_LONG_PATTERN = Pattern.compile("[̀-ͯ\u2066-\u2067]");
            BAD_CHARS_MESSAGE_PATTERN = Pattern.compile("[\u2066-\u2067]+");
            REMOVE_MULTIPLE_DIACRITICS = Pattern.compile("([\\u0300-\\u036f]{1,2})[\\u0300-\\u036f]+");
            WEB_URL = Pattern.compile("((?:(http|https|Http|Https|ton|tg|tonsite):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-\ufdcfﷰ-\uffef]{2,63}|" + Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))") + ")") + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        leftBaseline = isTablet() ? 80 : 72;
        checkDisplaySize(ApplicationLoader.applicationContext, null);
        documentIcons = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        documentMediaIcons = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        sUrlMatchFilter = new l();
        hasCallPermissions = Build.VERSION.SDK_INT >= 23;
        numbersSignatureArray = new String[]{"", "K", "M", "B", "T", "P"};
        tempFloats = new float[9];
        tempFloats2 = new float[9];
        characters = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        navbarProtactionPaint = new Paint(1);
    }

    public static int HSBtoRGB(float f10, float f11, float f12) {
        int i9;
        int i10;
        int i11;
        if (f11 == 0.0f) {
            i9 = (int) ((f12 * 255.0f) + 0.5f);
            i10 = i9;
            i11 = i10;
        } else {
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float f14 = (1.0f - (f11 * floor2)) * f12;
            float f15 = (1.0f - ((1.0f - floor2) * f11)) * f12;
            int i12 = (int) floor;
            if (i12 == 0) {
                i9 = (int) ((f12 * 255.0f) + 0.5f);
                i10 = (int) ((f15 * 255.0f) + 0.5f);
            } else if (i12 == 1) {
                i9 = (int) ((f14 * 255.0f) + 0.5f);
                i10 = (int) ((f12 * 255.0f) + 0.5f);
            } else if (i12 != 2) {
                if (i12 == 3) {
                    i9 = (int) ((f13 * 255.0f) + 0.5f);
                    i10 = (int) ((f14 * 255.0f) + 0.5f);
                } else if (i12 == 4) {
                    i9 = (int) ((f15 * 255.0f) + 0.5f);
                    i10 = (int) ((f13 * 255.0f) + 0.5f);
                } else if (i12 != 5) {
                    i9 = 0;
                    i10 = 0;
                    i11 = 0;
                } else {
                    i9 = (int) ((f12 * 255.0f) + 0.5f);
                    i10 = (int) ((f13 * 255.0f) + 0.5f);
                    i11 = (int) ((f14 * 255.0f) + 0.5f);
                }
                i11 = (int) ((f12 * 255.0f) + 0.5f);
            } else {
                i9 = (int) ((f13 * 255.0f) + 0.5f);
                i10 = (int) ((f12 * 255.0f) + 0.5f);
                i11 = (int) ((f15 * 255.0f) + 0.5f);
            }
            i11 = (int) ((f13 * 255.0f) + 0.5f);
        }
        return ((i9 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
    }

    public static float[] RGBtoHSB(int i9, int i10, int i11) {
        int max = Math.max(i9, i10);
        if (i11 > max) {
            max = i11;
        }
        int min = Math.min(i9, i10);
        if (i11 < min) {
            min = i11;
        }
        float f10 = max;
        float f11 = f10 / 255.0f;
        float f12 = 0.0f;
        float f13 = max != 0 ? (max - min) / f10 : 0.0f;
        if (f13 != 0.0f) {
            float f14 = max - min;
            float f15 = (max - i9) / f14;
            float f16 = (max - i10) / f14;
            float f17 = (max - i11) / f14;
            float f18 = (i9 == max ? f17 - f16 : i10 == max ? (f15 + 2.0f) - f17 : (f16 + 4.0f) - f15) / 6.0f;
            f12 = f18 < 0.0f ? f18 + 1.0f : f18;
        }
        return new float[]{f12, f13, f11};
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i9) {
        return addLinks(spannable, i9, false);
    }

    public static boolean addLinksSafe(Spannable spannable, final int i9, final boolean z10, final boolean z11) {
        if (spannable == null) {
            return false;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        boolean doSafe = doSafe(new Utilities.Callback0Return() { // from class: org.telegram.messenger.h
            @Override // org.telegram.messenger.Utilities.Callback0Return
            public final Object run() {
                Boolean lambda$addLinksSafe$8;
                lambda$addLinksSafe$8 = AndroidUtilities.lambda$addLinksSafe$8(spannableStringBuilder, i9, z10, z11);
                return lambda$addLinksSafe$8;
            }
        });
        if (doSafe) {
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                spannable.removeSpan(uRLSpan);
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            for (int i10 = 0; i10 < uRLSpanArr.length; i10++) {
                URLSpan uRLSpan2 = uRLSpanArr[i10];
                spannable.setSpan(uRLSpan2, spannableStringBuilder.getSpanStart(uRLSpan2), spannableStringBuilder.getSpanEnd(uRLSpanArr[i10]), 33);
            }
        }
        return doSafe;
    }

    public static void addMediaToGallery(String str) {
        if (str == null) {
            return;
        }
        addMediaToGallery(new File(str));
    }

    public static boolean addToClipboard(CharSequence charSequence, String str) {
        if (str == null) {
            return addToClipboard(charSequence);
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static void adjustBrightnessColorMatrix(ColorMatrix colorMatrix, float f10) {
        if (colorMatrix == null) {
            return;
        }
        float f11 = f10 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f11, 0.0f, 1.0f, 0.0f, 0.0f, f11, 0.0f, 0.0f, 1.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void adjustHueColorMatrix(ColorMatrix colorMatrix, float f10) {
        float cleanValue = (cleanValue(f10, 180.0f) / 180.0f) * 3.1415927f;
        if (cleanValue == 0.0f) {
            return;
        }
        double d = cleanValue;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f11 = (cos * (-0.715f)) + 0.715f;
        float f12 = ((-0.072f) * cos) + 0.072f;
        float f13 = ((-0.213f) * cos) + 0.213f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{(sin * (-0.213f)) + (0.787f * cos) + 0.213f, ((-0.715f) * sin) + f11, (sin * 0.928f) + f12, 0.0f, 0.0f, (0.143f * sin) + f13, (0.14f * sin) + (0.28500003f * cos) + 0.715f, ((-0.283f) * sin) + f12, 0.0f, 0.0f, ((-0.787f) * sin) + f13, (0.715f * sin) + f11, (sin * 0.072f) + (cos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
    }

    public static void adjustSaturationColorMatrix(ColorMatrix colorMatrix, float f10) {
        if (colorMatrix == null) {
            return;
        }
        float f11 = f10 + 1.0f;
        float f12 = 1.0f - f11;
        float f13 = 0.3086f * f12;
        float f14 = 0.6094f * f12;
        float f15 = f12 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f13 + f11, f14, f15, 0.0f, 0.0f, f13, f14 + f11, f15, 0.0f, 0.0f, f13, f14, f11 + f15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static List<View> allGlobalViews() {
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
            FileLog.e("allGlobalViews()", e10);
            return null;
        }
    }

    public static boolean allowScreenCapture() {
        return SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture;
    }

    public static void appCenterLog(Throwable th) {
        ApplicationLoader.appCenterLog(th);
    }

    public static Bitmap applyColorMatrix(Bitmap bitmap, ColorMatrix colorMatrix) {
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void applyEdgeToEdgeLayoutParams(WindowManager.LayoutParams layoutParams) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i9 >= 30 ? 3 : 1;
        }
    }

    public static void applySpring(Animator animator, double d, double d9) {
        applySpring(animator, d, d9, 1.0d, 0.0d);
    }

    public static Typeface bold() {
        if (mediumTypeface == null) {
            if (!SharedConfig.useSystemBoldFont || Build.VERSION.SDK_INT < 28) {
                mediumTypeface = getTypeface(TYPEFACE_ROBOTO_MEDIUM);
            } else {
                mediumTypeface = Typeface.create(null, 500, false);
            }
        }
        return mediumTypeface;
    }

    public static byte[] calcAuthKeyHash(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(Utilities.computeSHA1(bArr), 0, bArr2, 0, 16);
        return bArr2;
    }

    public static int calcBitmapColor(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            Bitmap createScaledBitmap = Bitmaps.createScaledBitmap(bitmap, 1, 1, true);
            if (createScaledBitmap != null) {
                int pixel = createScaledBitmap.getPixel(0, 0);
                if (bitmap == createScaledBitmap) {
                    return pixel;
                }
                createScaledBitmap.recycle();
                return pixel;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return 0;
    }

    public static int[] calcDrawableColor(Drawable drawable) {
        if (drawable instanceof tn) {
            return calcDrawableColor(((tn) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i9 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i9 = calcBitmapColor(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i9 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.n9) {
                int[] iArr2 = ((org.telegram.ui.Components.n9) drawable).a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i9 = getAverageColor(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i9 = iArr2[0];
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        double[] rgbToHsv = rgbToHsv((i9 >> 16) & 255, (i9 >> 8) & 255, i9 & 255);
        double d = rgbToHsv[1];
        rgbToHsv[1] = Math.min(1.0d, ((1.0d - d) * 0.1d) + 0.05d + d);
        int[] hsvToRgb = hsvToRgb(rgbToHsv[0], rgbToHsv[1], Math.max(0.0d, rgbToHsv[2] * 0.65d));
        iArr[0] = Color.argb(102, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
        iArr[1] = Color.argb(136, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
        int[] hsvToRgb2 = hsvToRgb(rgbToHsv[0], rgbToHsv[1], Math.max(0.0d, rgbToHsv[2] * 0.72d));
        iArr[2] = Color.argb(102, hsvToRgb2[0], hsvToRgb2[1], hsvToRgb2[2]);
        iArr[3] = Color.argb(136, hsvToRgb2[0], hsvToRgb2[1], hsvToRgb2[2]);
        return iArr;
    }

    public static void cancelRunOnUIThread(Runnable runnable) {
        if (ApplicationLoader.applicationHandler == null) {
            return;
        }
        ApplicationLoader.applicationHandler.removeCallbacks(runnable);
    }

    public static float cascade(float f10, float f11, float f12, float f13) {
        if (f12 <= 0.0f) {
            return f10;
        }
        float min = Math.min(f13, f12) * (1.0f / f12);
        return g7.n.a((f10 - ((1.0f - min) * (f11 / f12))) / min, 0.0f, 1.0f);
    }

    private static void changeSetSystemUiVisibility(View view, int i9, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        int b10 = g7.z7.b(systemUiVisibility, i9, z10);
        if (systemUiVisibility != b10) {
            view.setSystemUiVisibility(b10);
        }
    }

    public static boolean charSequenceContains(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2) != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2, int i9) {
        if (charSequence2 != null && charSequence2.length() > 0) {
            while (i9 <= charSequence.length() - charSequence2.length()) {
                for (int i10 = 0; i10 < charSequence2.length(); i10++) {
                    if (charSequence2.charAt(i10) != charSequence.charAt(i9 + i10)) {
                        break;
                    }
                }
                return i9;
            }
        }
        return -1;
    }

    public static void checkAndroidTheme(Context context, boolean z10) {
        if (context == null) {
            return;
        }
        context.setTheme((org.telegram.ui.ActionBar.f6.I.q() && z10) ? R.style.Theme_TMessages_Dark : R.style.Theme_TMessages);
    }

    public static void checkDisplaySize(Context context, Configuration configuration) {
        Display defaultDisplay;
        try {
            float f10 = density;
            density = context.getResources().getDisplayMetrics().density;
            if (firstConfigurationWas && Math.abs(f10 - r2) > 0.001d) {
                if (org.telegram.ui.ActionBar.f6.m3 != null) {
                    org.telegram.ui.ActionBar.f6.m3 = null;
                    org.telegram.ui.ActionBar.f6.J(context, false);
                }
                if (org.telegram.ui.ActionBar.f6.B0 != null) {
                    org.telegram.ui.ActionBar.f6.B0 = null;
                    org.telegram.ui.ActionBar.f6.R(context);
                }
                if (org.telegram.ui.ActionBar.f6.Q1 != null) {
                    org.telegram.ui.ActionBar.f6.Q1 = null;
                    org.telegram.ui.ActionBar.f6.X(context);
                }
            }
            firstConfigurationWas = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            usingHardwareInput = configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(displaySize);
                float refreshRate = defaultDisplay.getRefreshRate();
                screenRefreshRate = refreshRate;
                screenMaxRefreshRate = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f11 : supportedRefreshRates) {
                        if (f11 > screenMaxRefreshRate) {
                            screenMaxRefreshRate = f11;
                        }
                    }
                }
                screenRefreshTime = 1000.0f / screenRefreshRate;
            }
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(r2 * density);
                if (Math.abs(displaySize.x - ceil) > 3) {
                    displaySize.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(r2 * density);
                if (Math.abs(displaySize.y - ceil2) > 3) {
                    displaySize.y = ceil2;
                }
            }
            if (roundMessageSize == 0) {
                if (isTablet()) {
                    roundMessageSize = (int) (getMinTabletSide() * 0.6f);
                    roundPlayingMessageSize = getMinTabletSide() - dp(28.0f);
                    roundSidePlayingMessageSize = getMinTabletSide() - dp(92.0f);
                } else {
                    Point point = displaySize;
                    roundMessageSize = (int) (Math.min(point.x, point.y) * 0.6f);
                    Point point2 = displaySize;
                    roundPlayingMessageSize = Math.min(point2.x, point2.y) - dp(28.0f);
                    roundSidePlayingMessageSize = Math.min(displaySize.x - dp(64.0f), displaySize.y) - dp(28.0f);
                }
                roundMessageInset = dp(2.0f);
            }
            fillStatusBarHeight(context, true);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("density = " + density + " display size = " + displaySize.x + " " + displaySize.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + statusBarHeight + ", navbar height: " + navigationBarHeight);
            }
            touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            isSmallScreen = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static boolean checkHostForPunycode(String str) {
        boolean z10;
        boolean z11;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z10 = false;
            z11 = false;
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    char charAt = str.charAt(i9);
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
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    return !z10 ? false : false;
                }
            }
        } catch (Exception e11) {
            e = e11;
            z10 = false;
            z11 = false;
        }
        if (!z10 && z11) {
            return true;
        }
    }

    public static boolean checkInlinePermissions(Context context) {
        return Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
    }

    public static boolean checkPhonePattern(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String d = ne.b.d(str2, false);
            int i9 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d.indexOf(str3, i9);
                    if (indexOf == -1) {
                        return false;
                    }
                    i9 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static boolean checkPipPermissions(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0;
    }

    public static float cleanValue(float f10, float f11) {
        return Math.min(f11, Math.max(-f11, f10));
    }

    public static void clearDrawableAnimation(View view) {
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

    public static ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
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

    public static int compare(int i9, int i10) {
        if (i9 == i10) {
            return 0;
        }
        return i9 > i10 ? 1 : -1;
    }

    public static float computeDampingRatio(float f10, float f11, float f12) {
        return f11 / (((float) Math.sqrt(f12 * f10)) * 2.0f);
    }

    public static float computePerceivedBrightness(int i9) {
        return e2.c.y(Color.blue(i9), 0.0722f, (Color.green(i9) * 0.7152f) + (Color.red(i9) * 0.2126f), 255.0f);
    }

    public static CharSequence concat(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i9 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i9 < length) {
                    CharSequence charSequence2 = charSequenceArr[i9];
                    if (charSequence2 == null) {
                        charSequence2 = BuildConfig.BETA_URL;
                    }
                    spannableStringBuilder.append(charSequence2);
                    i9++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i9 < length2) {
            sb2.append(charSequenceArr[i9]);
            i9++;
        }
        return sb2.toString();
    }

    private static boolean containsUnsupportedCharacters(String str) {
        if (str.contains("\u202c") || str.contains("\u202d") || str.contains("\u202e")) {
            return true;
        }
        try {
            return BAD_CHARS_PATTERN.matcher(str).find();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean copyFile(InputStream inputStream, File file) {
        return copyFile(inputStream, new FileOutputStream(file));
    }

    public static boolean copyFileSafe(File file, File file2) {
        try {
            return copyFile(file, file2);
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static void createCalendarEvent(Activity activity, long j10, String str, String str2, boolean z10) {
        long millis;
        if (z10) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            j10 = calendar.getTimeInMillis();
            millis = TimeUnit.DAYS.toMillis(1L);
        } else {
            millis = TimeUnit.MINUTES.toMillis(10L);
        }
        Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j10).putExtra("endTime", millis + j10).putExtra("allDay", z10);
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("title", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            putExtra.putExtra("description", str2);
        }
        try {
            activity.startActivity(putExtra);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void createEmptyFile(File file) {
        try {
            if (file.exists()) {
                return;
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th) {
            FileLog.e(th, false);
        }
    }

    public static byte[] decodeQuotedPrintable(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i9 = 0;
        while (i9 < bArr.length) {
            byte b10 = bArr[i9];
            if (b10 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i9 + 1], 16);
                    i9 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i9], 16)));
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i9++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e11) {
            FileLog.e(e11);
            return byteArray;
        }
    }

    public static float distance(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f15 * f15) + (f14 * f14));
    }

    public static float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public static void doOnLayout(final View view, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (view == null) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.messenger.AndroidUtilities.10
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                    view.removeOnLayoutChangeListener(this);
                    runnable.run();
                }
            });
        }
    }

    public static void doOnPreDraw(View view, final Runnable runnable) {
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final boolean[] zArr = new boolean[1];
        final ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = {r2};
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.messenger.p
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean lambda$doOnPreDraw$27;
                lambda$doOnPreDraw$27 = AndroidUtilities.lambda$doOnPreDraw$27(viewTreeObserver, onPreDrawListenerArr, zArr, runnable);
                return lambda$doOnPreDraw$27;
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    public static boolean doSafe(Utilities.Callback0Return<Boolean> callback0Return) {
        return doSafe(callback0Return, 200);
    }

    public static int dp(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(density * f10);
    }

    public static int dp2(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(density * f10);
    }

    public static float dpf2(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return density * f10;
    }

    public static int dpr(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Math.round(density * f10);
    }

    public static void drawNavigationBarProtection(Canvas canvas, View view, int i9, int i10) {
        drawNavigationBarProtection(canvas, view, i9, i10, 1.0f);
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f10) {
        drawStroke(canvas, rectF, f10, 1.0f);
    }

    public static CharSequence ellipsizeCenterEnd(CharSequence charSequence, String str, int i9, TextPaint textPaint, int i10) {
        Exception exc;
        int indexOf;
        CharSequence charSequence2;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > i10) {
                charSequence = charSequence.subSequence(Math.max(0, indexOf - (i10 / 2)), Math.min(length, (i10 / 2) + indexOf));
                indexOf -= Math.max(0, indexOf - (i10 / 2));
                charSequence.length();
            }
            charSequence2 = charSequence;
        } catch (Exception e10) {
            exc = e10;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f10 = i9;
            if (textPaint.measureText("...") + lineWidth >= f10) {
                int i11 = indexOf + 1;
                int i12 = i11;
                while (i12 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i12))) {
                    i12++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i12);
                if (staticLayout.isRtlCharAt(i12)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f10) {
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f10);
                    float f11 = 0.1f * f10;
                    float f12 = measureText + f11;
                    if (charSequence2.length() - i12 > 20) {
                        f12 += f11;
                    }
                    if (f12 > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f12);
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
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f12);
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
        } catch (Exception e11) {
            exc = e11;
            charSequence = charSequence2;
            FileLog.e(exc);
            return charSequence;
        }
    }

    public static MotionEvent emptyMotionEvent() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static void enableEdgeToEdge(Activity activity) {
        Window window = activity.getWindow();
        try {
            enableEdgeToEdge(window);
            if (Build.VERSION.SDK_INT >= 28) {
                window.setNavigationBarDividerColor(0);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void endIncomingCall() {
        if (hasCallPermissions) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
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
                FileLog.e(th);
            }
        }
    }

    public static String escape(String str) {
        return removeRTL(removeDiacritics(str));
    }

    public static void executeOnUIThread(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runOnUIThread(runnable);
        } else {
            runnable.run();
        }
    }

    public static <A, B> B find(List<A> list, Class<B> cls) {
        if (list == null) {
            return null;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            A a2 = list.get(i9);
            if (cls.isInstance(a2)) {
                return cls.cast(a2);
            }
        }
        return null;
    }

    public static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static View findChildViewUnder(ViewGroup viewGroup, float f10, float f11) {
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return null;
        }
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    View findChildViewUnder = findChildViewUnder((ViewGroup) childAt, f10 - childAt.getLeft(), f11 - childAt.getTop());
                    if (findChildViewUnder != null) {
                        return findChildViewUnder;
                    }
                } else if (f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getY() && f10 <= childAt.getY() + childAt.getHeight()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static boolean findClickableView(ViewGroup viewGroup, float f10, float f11) {
        return findClickableView(viewGroup, f10, f11, null);
    }

    public static TLRPC.Document findDocument(List<TLRPC.Document> list, long j10) {
        if (list == null) {
            return null;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            TLRPC.Document document = list.get(i9);
            if (document != null && document.id == j10) {
                return document;
            }
        }
        return null;
    }

    public static <A, B> B findLast(List<A> list, Class<B> cls) {
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            A a2 = list.get(size);
            if (cls.isInstance(a2)) {
                return cls.cast(a2);
            }
        }
        return null;
    }

    public static TLRPC.Photo findPhoto(List<TLRPC.Photo> list, long j10) {
        if (list == null) {
            return null;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            TLRPC.Photo photo = list.get(i9);
            if (photo != null && photo.id == j10) {
                return photo;
            }
        }
        return null;
    }

    public static void fixGoogleMapsBug() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("google_bug_154855417", 0);
        if (sharedPreferences.contains("fixed")) {
            return;
        }
        new File(ApplicationLoader.getFilesDirFixed(), "ZoomTables.data").delete();
        sharedPreferences.edit().putBoolean("fixed", true).apply();
    }

    public static double fixLocationCoord(double d) {
        return ((long) (d * 1000000.0d)) / 1000000.0d;
    }

    public static WindowInsets fixedDispatchApplyWindowInsets(WindowInsets windowInsets, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            viewGroup.getChildAt(i9).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }

    public static void forEachViews(View view, d5.d dVar) {
        if (!(view instanceof ViewGroup)) {
            dVar.accept(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            dVar.accept(view);
            forEachViews(viewGroup.getChildAt(i9), dVar);
        }
    }

    public static String formapMapUrl(int i9, double d, double d9, int i10, int i11, boolean z10, int i12, int i13) {
        int min = Math.min(2, (int) Math.ceil(density));
        int i14 = i13 == -1 ? MessagesController.getInstance(i9).mapProvider : i13;
        if (i14 != 1 && i14 != 3) {
            String str = MessagesController.getInstance(i9).mapKey;
            return !TextUtils.isEmpty(str) ? z10 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d), Double.valueOf(d9), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d), Double.valueOf(d9), str) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d), Double.valueOf(d9), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), str) : z10 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d), Double.valueOf(d9), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d), Double.valueOf(d9)) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d), Double.valueOf(d9), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min));
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str2 = null;
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            if (strArr[i15].toLowerCase().contains(currentLocaleInfo.shortName)) {
                str2 = strArr[i15];
            }
            i15++;
        }
        if (str2 == null) {
            str2 = "en_US";
        }
        return z10 ? String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", Double.valueOf(d9), Double.valueOf(d), Integer.valueOf(i12), Integer.valueOf(i10 * min), Integer.valueOf(i11 * min), Integer.valueOf(min), Double.valueOf(d9), Double.valueOf(d), str2) : String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", Double.valueOf(d9), Double.valueOf(d), Integer.valueOf(i12), Integer.valueOf(i10 * min), Integer.valueOf(i11 * min), Integer.valueOf(min), str2);
    }

    public static String formatCount(int i9) {
        if (i9 < 1000) {
            return Integer.toString(i9);
        }
        ArrayList arrayList = new ArrayList();
        while (i9 != 0) {
            int i10 = i9 % MediaDataController.MAX_STYLE_RUNS_COUNT;
            i9 /= MediaDataController.MAX_STYLE_RUNS_COUNT;
            if (i9 > 0) {
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

    public static String formatDuration(int i9, boolean z10) {
        return formatDuration(i9, z10, false);
    }

    public static String formatDurationNoHours(int i9, boolean z10) {
        int i10 = i9 / 60;
        int i11 = i9 % 60;
        return z10 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String formatFileSize(long j10) {
        return formatFileSize(j10, false, false);
    }

    public static String formatFullDuration(int i9) {
        int i10 = i9 / 3600;
        int i11 = (i9 / 60) % 60;
        int i12 = i9 % 60;
        return i9 < 0 ? String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i10)), Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12))) : String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String formatLongDuration(int i9) {
        return formatDuration(i9, true);
    }

    public static String formatShortDuration(int i9) {
        return formatDuration(i9, false);
    }

    public static SpannableStringBuilder formatSpannable(CharSequence charSequence, CharSequence... charSequenceArr) {
        return charSequence.toString().contains("%s") ? formatSpannableSimple(charSequence, charSequenceArr) : formatSpannable(charSequence, new b(4), charSequenceArr);
    }

    public static SpannableStringBuilder formatSpannableSimple(CharSequence charSequence, CharSequence... charSequenceArr) {
        return formatSpannable(charSequence, new b(3), charSequenceArr);
    }

    public static String formatTimerDurationFast(long j10, int i9) {
        StringBuilder sb2 = new StringBuilder();
        long j11 = j10 / 60;
        if (j11 >= 60) {
            sb2.append(j11 / 60);
            sb2.append(":");
            normalizeTimePart(sb2, j11 % 60);
            sb2.append(":");
            normalizeTimePart(sb2, j10 % 60);
            sb2.append(",");
            sb2.append(i9 / 10);
        } else {
            sb2.append(j11);
            sb2.append(":");
            normalizeTimePart(sb2, j10 % 60);
            sb2.append(",");
            sb2.append(i9 / 10);
        }
        return sb2.toString();
    }

    public static String formatTimestamp(int i9) {
        String str;
        int i10 = i9 / 3600;
        int i11 = (i9 / 60) % 60;
        int i12 = i9 % 60;
        if (i10 > 0) {
            Locale locale = Locale.US;
            str = ta.b.c(i10, "h");
        } else {
            str = "";
        }
        if (i11 > 0) {
            StringBuilder n10 = e2.c.n(str);
            n10.append(String.format(Locale.US, i10 > 0 ? "%02dm" : "%dm", Integer.valueOf(i11)));
            str = n10.toString();
        }
        StringBuilder n11 = e2.c.n(str);
        n11.append(String.format(Locale.US, (i10 > 0 || i11 > 0) ? "%02ds" : "%ds", Integer.valueOf(i12)));
        return n11.toString();
    }

    public static String formatVideoDuration(int i9, int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        int i14 = i9 / 3600;
        int i15 = (i9 / 60) % 60;
        int i16 = i9 % 60;
        return (i14 == 0 && i11 == 0) ? String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i12), Integer.valueOf(i13)) : i11 == 0 ? String.format(Locale.US, "%d:%02d:%02d / %02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i12), Integer.valueOf(i13)) : i14 == 0 ? String.format(Locale.US, "%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String formatVideoDurationFast(int i9, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (i9 >= 60) {
            normalizeTimePart(sb2, i9 / 60);
            sb2.append(":");
            normalizeTimePart(sb2, i9 % 60);
            sb2.append(":");
            normalizeTimePart(sb2, i10);
        } else {
            normalizeTimePart(sb2, i9);
            sb2.append(":");
            normalizeTimePart(sb2, i10);
        }
        return sb2.toString();
    }

    public static String formatWholeNumber(int i9, int i10) {
        if (i9 == 0) {
            return "0";
        }
        float f10 = i9;
        if (i10 == 0) {
            i10 = i9;
        }
        if (i10 < 1000) {
            return formatCount(i9);
        }
        int i11 = 0;
        while (i10 >= 1000 && i11 < numbersSignatureArray.length - 1) {
            i10 /= MediaDataController.MAX_STYLE_RUNS_COUNT;
            f10 /= 1000.0f;
            i11++;
        }
        if (f10 < 0.1d) {
            return "0";
        }
        float f11 = f10 * 10.0f;
        float f12 = (int) f11;
        if (f11 != f12) {
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 / 10.0f), numbersSignatureArray[i11]);
        }
        Locale locale = Locale.ENGLISH;
        return ta.b.j(formatCount((int) f10), numbersSignatureArray[i11]);
    }

    private static void gatherLinks(ArrayList<LinkSpec> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, boolean z10) {
        if (TextUtils.indexOf((CharSequence) spannable, (char) 9472) >= 0) {
            spannable = new SpannableStringBuilder(spannable.toString().replace((char) 9472, ' '));
        }
        if (!TextUtils.isEmpty(spannable) && TextUtils.lastIndexOf(spannable, '_') == spannable.length() - 1) {
            spannable = new SpannableStringBuilder(spannable.toString()).replace(spannable.length() - 1, spannable.length(), (CharSequence) "a");
        }
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                LinkSpec linkSpec = new LinkSpec();
                String makeUrl = makeUrl(matcher.group(0), strArr, matcher);
                if (!z10 || ve.e.f(Uri.parse(makeUrl), true, null)) {
                    linkSpec.url = makeUrl;
                    linkSpec.start = start;
                    linkSpec.end = end;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    public static String generateFileName(int i9, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i9 != 0) {
            return aa.d.o("VID_", format, ".mp4");
        }
        StringBuilder t10 = aa.d.t("IMG_", format, ".");
        if (TextUtils.isEmpty(str)) {
            str = "jpg";
        }
        t10.append(str);
        return t10.toString();
    }

    public static File generatePicturePath() {
        return generatePicturePath(false, null);
    }

    public static CharSequence generateSearchName(String str, String str2, String str3) {
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null || str.length() == 0) {
            str = str2;
        } else if (str2 != null && str2.length() != 0) {
            str = aa.d.z(str, " ", str2);
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i9 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i9);
            if (indexOf == -1) {
                break;
            }
            int i10 = indexOf - (indexOf == 0 ? 0 : 1);
            int length = str3.length() + (indexOf == 0 ? 0 : 1) + i10;
            if (i9 != 0 && i9 != i10 + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i9, i10));
            } else if (i9 == 0 && i10 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i10));
            }
            String substring = trim.substring(i10, Math.min(trim.length(), length));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new p00(org.telegram.ui.ActionBar.f6.q6, null), length2, trim2.length() + length2, 33);
            i9 = length;
        }
        if (i9 != -1 && i9 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i9));
        }
        return spannableStringBuilder;
    }

    public static File generateVideoPath() {
        return generateVideoPath(false);
    }

    public static Activity getActivity() {
        return getActivity(null);
    }

    private static File getAlbumDir(boolean z10) {
        int i9;
        if (z10 || !BuildVars.NO_SCOPED_STORAGE || (((i9 = Build.VERSION.SDK_INT) >= 33 && ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) || (i9 >= 23 && i9 <= 33 && ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))) {
            return FileLoader.getDirectory(0);
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("External storage is not mounted READ/WRITE.");
            }
            return null;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("failed to create directory");
        }
        return null;
    }

    public static float getAnimatorDurationScale() {
        try {
            return Settings.Global.getFloat(ApplicationLoader.applicationContext.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    public static int getAverageColor(int i9, int i10) {
        int red = Color.red(i9);
        int red2 = Color.red(i10);
        int green = Color.green(i9);
        int green2 = Color.green(i10);
        int blue = Color.blue(i9);
        return Color.argb(255, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i10) / 2) + (blue / 2));
    }

    public static Bitmap getBitmapFromRaw(int i9) {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getResources().openRawResource(i9);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Throwable th) {
                th = th;
                try {
                    FileLog.e(th);
                    return bitmap;
                } finally {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        return bitmap;
    }

    public static void getBitmapFromSurface(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surfaceView, bitmap, new j(countDownLatch, 0), Utilities.searchQueue.getHandler());
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    public static Bitmap getBitmapFromWindow(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: org.telegram.messenger.n
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i9) {
                    AndroidUtilities.lambda$getBitmapFromWindow$6(zArr, countDownLatch, i9);
                }
            }, Utilities.searchQueue.getHandler());
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

    public static Uri getBitmapShareUri(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File cacheDir = getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        File file = new File(cacheDir, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 87, fileOutputStream);
                fileOutputStream.close();
                Uri d = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file);
                fileOutputStream.close();
                return d;
            } finally {
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            return null;
        }
    }

    public static String getBuildVersionInfo() {
        String str;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            int i9 = packageInfo.versionCode;
            int i10 = i9 / 10;
            int i11 = i9 % 10;
            if (i11 == 1 || i11 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else if (ApplicationLoader.isStandaloneBuild()) {
                str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i12 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            return LocaleController.formatString("TelegramVersion", i12, "v" + packageInfo.versionName + " (" + i10 + ") " + str);
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static File getCacheDir() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e10) {
            FileLog.e(e10);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            FileLog.d("external dir mounted");
            try {
                File[] externalCacheDirs = ApplicationLoader.applicationContext.getExternalCacheDirs();
                int i9 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    while (true) {
                        if (i9 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i9];
                            if (file2 != null && file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                file = externalCacheDirs[i9];
                                break;
                            }
                            i9++;
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
                FileLog.d(sb2.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    FileLog.d("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        try {
            File cacheDir = ApplicationLoader.applicationContext.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
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

    public static String getCertificateSHA1Fingerprint() {
        try {
            return Utilities.bytesToHex(Utilities.computeSHA1(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getCertificateSHA256Fingerprint() {
        try {
            return Utilities.bytesToHex(Utilities.computeSHA256(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getColorDistance(int i9, int i10) {
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        int red2 = Color.red(i10);
        int i11 = (red + red2) / 2;
        int i12 = red - red2;
        int green2 = green - Color.green(i10);
        int blue2 = blue - Color.blue(i10);
        return (green2 * 4 * green2) + ((((i11 + 512) * i12) * i12) >> 8) + ((((767 - i11) * blue2) * blue2) >> 8);
    }

    public static float[] getCoordinateInParent(ViewGroup viewGroup, View view) {
        float f10;
        float f11 = 0.0f;
        if (view != null && viewGroup != null) {
            f10 = 0.0f;
            float f12 = 0.0f;
            while (view != viewGroup) {
                if (view != null) {
                    float y10 = view.getY() + f10;
                    float x10 = view.getX() + f12;
                    if (view instanceof NestedScrollView) {
                        y10 -= view.getScrollY();
                        x10 -= view.getScrollX();
                    }
                    f12 = x10;
                    f10 = y10;
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            f11 = f12;
            return new float[]{f11, f10};
        }
        f10 = 0.0f;
        return new float[]{f11, f10};
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0015, B:7:0x0019, B:8:0x001f, B:10:0x0025, B:11:0x0048, B:13:0x0052, B:15:0x0068, B:16:0x006c, B:18:0x0072, B:22:0x0082, B:24:0x0088, B:27:0x0091, B:29:0x007b, B:32:0x009a, B:35:0x002a, B:37:0x0030, B:39:0x0034, B:40:0x003a, B:42:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:3:0x0002, B:5:0x0015, B:7:0x0019, B:8:0x001f, B:10:0x0025, B:11:0x0048, B:13:0x0052, B:15:0x0068, B:16:0x006c, B:18:0x0072, B:22:0x0082, B:24:0x0088, B:27:0x0091, B:29:0x007b, B:32:0x009a, B:35:0x002a, B:37:0x0030, B:39:0x0034, B:40:0x003a, B:42:0x0040), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] getCurrentKeyboardLanguage() {
        String str;
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
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
            String systemLocaleStringIso639 = LocaleController.getSystemLocaleStringIso639();
            LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
            String baseLangCode = currentLocaleInfo.getBaseLangCode();
            boolean isEmpty = TextUtils.isEmpty(baseLangCode);
            String str3 = baseLangCode;
            if (isEmpty) {
                str3 = currentLocaleInfo.getLangCode();
            }
            if (!systemLocaleStringIso639.contains(str3) && !str3.contains(systemLocaleStringIso639)) {
                str2 = str3;
                return TextUtils.isEmpty(str2) ? new String[]{systemLocaleStringIso639.replace('_', '-'), str2} : new String[]{systemLocaleStringIso639.replace('_', '-')};
            }
            if (!systemLocaleStringIso639.contains("en")) {
                str2 = "en";
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (Exception unused) {
            return new String[]{"en"};
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r9.startsWith("file://") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
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
            if (query != null) {
                query.close();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static ArrayList<File> getDataDirs() {
        ArrayList<File> arrayList = null;
        File[] externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (int i9 = 0; i9 < externalFilesDirs.length; i9++) {
                File file = externalFilesDirs[i9];
                if (file != null) {
                    file.getAbsolutePath();
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(externalFilesDirs[i9]);
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Environment.getExternalStorageDirectory());
        }
        return arrayList;
    }

    public static i0.b getDefaultWindowInsets(r0.m1 m1Var, boolean z10) {
        i0.b g10 = m1Var.a.g(647);
        return z10 ? i0.b.a(g10, m1Var.a.f(8)) : g10;
    }

    public static int getDominantColor(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            for (int i14 = 0; i14 < 10; i14++) {
                int pixel = bitmap.getPixel((int) (i13 * width), (int) (i14 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i10;
                    int green = Color.green(pixel) + i11;
                    i9++;
                    i12 = Color.blue(pixel) + i12;
                    i11 = green;
                    i10 = red;
                }
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return Color.argb(255, i10 / i9, i11 / i9, i12 / i9);
    }

    public static String getHelloWorld() {
        return "Hello World!";
    }

    public static String getHostAuthority(String str) {
        return getHostAuthority(str, false);
    }

    public static Pair<Integer, Integer> getImageOrientation(InputStream inputStream) {
        try {
            return getImageOrientation(new r1.g(inputStream));
        } catch (Exception e10) {
            FileLog.e(e10);
            return new Pair<>(0, 0);
        }
    }

    public static boolean getLightNavigationBar(Window window) {
        if (Build.VERSION.SDK_INT >= 26) {
            return g7.z7.a(window.getDecorView().getSystemUiVisibility(), 16);
        }
        return false;
    }

    public static File getLogsDir() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null).getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(ApplicationLoader.applicationContext.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(ApplicationLoader.applicationContext.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            ApplicationLoader.appCenterLog(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static int getMinTabletSide() {
        if (!isSmallTablet()) {
            Point point = displaySize;
            int min = Math.min(point.x, point.y);
            return min - getTabletLeftFragmentSize(min, 0, 0);
        }
        Point point2 = displaySize;
        int min2 = Math.min(point2.x, point2.y);
        Point point3 = displaySize;
        int max = Math.max(point3.x, point3.y);
        return Math.min(min2, max - getTabletLeftFragmentSize(max, 0, 0));
    }

    public static int getMyLayerVersion(int i9) {
        return i9 & 65535;
    }

    public static float getNavigationBarThirdButtonsFactor(int i9) {
        return Utilities.clamp01((i9 - dp(32.0f)) / dp(16.0f));
    }

    public static int getOffsetColor(int i9, int i10, float f10, float f11) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        int red2 = Color.red(i9);
        int green2 = Color.green(i9);
        int blue2 = Color.blue(i9);
        return Color.argb((int) e2.c.B(alpha - r7, f10, Color.alpha(i9), f11), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2));
    }

    public static String getPath(Uri uri) {
        Uri uri2;
        try {
            if (DocumentsContract.isDocumentUri(ApplicationLoader.applicationContext, uri)) {
                if (isExternalStorageDocument(uri)) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else {
                    if (isDownloadsDocument(uri)) {
                        return getDataColumn(ApplicationLoader.applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if (isMediaDocument(uri)) {
                        String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = split2[0];
                        int hashCode = str.hashCode();
                        if (hashCode == 93166550) {
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (hashCode == 100313435) {
                            if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (hashCode == 112202875 && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                    }
                }
            } else {
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return getDataColumn(ApplicationLoader.applicationContext, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return null;
    }

    public static int getPatternColor(int i9) {
        return getPatternColor(i9, false);
    }

    public static int getPatternSideColor(int i9) {
        float[] RGBtoHSB = RGBtoHSB(Color.red(i9), Color.green(i9), Color.blue(i9));
        RGBtoHSB[1] = Math.min(1.0f, RGBtoHSB[1] + 0.05f);
        float f10 = RGBtoHSB[2];
        if (f10 > 0.5f) {
            RGBtoHSB[2] = Math.max(0.0f, f10 * 0.9f);
        } else {
            RGBtoHSB[2] = Math.max(0.0f, f10 * 0.9f);
        }
        return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) | (-16777216);
    }

    public static int getPeerLayerVersion(int i9) {
        return Math.max(73, (i9 >> 16) & 65535);
    }

    public static int getPhotoSize() {
        return getPhotoSize(false);
    }

    public static float getPixelsInCM(float f10, boolean z10) {
        return (f10 / 2.54f) * (z10 ? displayMetrics.xdpi : displayMetrics.ydpi);
    }

    public static long getPrefIntOrLong(SharedPreferences sharedPreferences, String str, long j10) {
        try {
            return sharedPreferences.getLong(str, j10);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j10);
        }
    }

    public static Point getRealScreenSize() {
        Point point = new Point();
        try {
            ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e10) {
            FileLog.e(e10);
            return point;
        }
    }

    public static ArrayList<File> getRootDirs() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList<File> arrayList = null;
        File[] externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        arrayList.get(i9).getPath().equals(file2.getPath());
                    }
                    if (!hashSet.contains(file2.getAbsolutePath())) {
                        hashSet.add(file2.getAbsolutePath());
                        arrayList.add(file2);
                    }
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.isEmpty() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !hashSet.contains(externalStorageDirectory.getAbsolutePath())) {
            arrayList.add(externalStorageDirectory);
        }
        return arrayList;
    }

    public static View getRootView(View view) {
        while (view != null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static String getSafeString(String str) {
        try {
            return BAD_CHARS_MESSAGE_PATTERN.matcher(str).replaceAll("\u200c");
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r3 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        org.telegram.messenger.FileLog.e(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
    
        if (r3 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap getScaledBitmap(float f10, float f11, String str, String str2, int i9) {
        FileInputStream fileInputStream;
        int i10;
        Bitmap decodeStream;
        int i11;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (str != null) {
                BitmapFactory.decodeFile(str, options);
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(str2);
                try {
                    fileInputStream.getChannel().position(i9);
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                } catch (Throwable th) {
                    th = th;
                    try {
                        FileLog.e(th);
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                }
            }
            int i12 = options.outWidth;
            if (i12 > 0 && (i10 = options.outHeight) > 0) {
                if (f10 > f11 && i12 < i10) {
                    f11 = f10;
                    f10 = f11;
                }
                float min = Math.min(i12 / f10, i10 / f11);
                options.inSampleSize = 1;
                if (min > 1.0f) {
                    do {
                        i11 = options.inSampleSize * 2;
                        options.inSampleSize = i11;
                    } while (i11 < min);
                }
                options.inJustDecodeBounds = false;
                if (str != null) {
                    decodeStream = BitmapFactory.decodeFile(str, options);
                } else {
                    fileInputStream.getChannel().position(i9);
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
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        return null;
    }

    public static int getShadowHeight() {
        float f10 = density;
        if (f10 >= 4.0f) {
            return 3;
        }
        return f10 >= 2.0f ? 2 : 1;
    }

    public static File getSharingDirectory() {
        return new File(FileLoader.getDirectory(4), "sharing/");
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static Long getSysInfoLong(String str) {
        String sysInfoString = getSysInfoString(str);
        if (sysInfoString == null) {
            return null;
        }
        try {
            return Utilities.parseLong(sysInfoString);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getSysInfoString(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (Exception unused) {
            randomAccessFile = null;
        } catch (Throwable th) {
            th = th;
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
        } catch (Throwable th2) {
            th = th2;
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

    public static String getSystemProperty(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getTabletLeftFragmentSize(int i9, int i10, int i11) {
        return Math.max(dp(320.0f), (((i9 - i10) - i11) * 35) / 100) + i10;
    }

    public static int getThumbForNameOrMime(String str, String str2, boolean z10) {
        if (str == null || str.length() == 0) {
            return z10 ? documentMediaIcons[0] : documentIcons[0];
        }
        int i9 = (str.contains(".doc") || str.contains(".txt") || str.contains(".psd")) ? 0 : (str.contains(".xls") || str.contains(".csv")) ? 1 : (str.contains(".pdf") || str.contains(".ppt") || str.contains(".key")) ? 2 : (str.contains(".zip") || str.contains(".rar") || str.contains(".ai") || str.contains(".mp3") || str.contains(".mov") || str.contains(".avi")) ? 3 : -1;
        if (i9 == -1) {
            int lastIndexOf = str.lastIndexOf(46);
            String substring = lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
            i9 = substring.length() != 0 ? substring.charAt(0) % documentIcons.length : str.charAt(0) % documentIcons.length;
        }
        return z10 ? documentMediaIcons[i9] : documentIcons[i9];
    }

    public static CharSequence getTrimmedString(CharSequence charSequence) {
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

    public static Typeface getTypeface(String str) {
        Typeface createFromAsset;
        Typeface typeface;
        Hashtable<String, Typeface> hashtable = typefaceCache;
        synchronized (hashtable) {
            try {
                if (!hashtable.containsKey(str)) {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Typeface.Builder builder = new Typeface.Builder(ApplicationLoader.applicationContext.getAssets(), str);
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
                            createFromAsset = Typeface.createFromAsset(ApplicationLoader.applicationContext.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e10) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Could not get typeface '" + str + "' because " + e10.getMessage());
                        }
                        return null;
                    }
                }
                typeface = hashtable.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return typeface;
    }

    public static Pattern getURIParsePattern() {
        if (uriParse == null) {
            uriParse = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
        }
        return uriParse;
    }

    public static Vibrator getVibrator() {
        if (vibrator == null) {
            vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
        }
        return vibrator;
    }

    public static int getViewInset(View view) {
        if (view != null && view.getHeight() != displaySize.y && view.getHeight() != displaySize.y - statusBarHeight) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                    return 0;
                }
                if (mAttachInfoField == null) {
                    Field declaredField = View.class.getDeclaredField("mAttachInfo");
                    mAttachInfoField = declaredField;
                    declaredField.setAccessible(true);
                }
                Object obj = mAttachInfoField.get(view);
                if (obj != null) {
                    if (mStableInsetsField == null) {
                        Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
                        mStableInsetsField = declaredField2;
                        declaredField2.setAccessible(true);
                    }
                    return ((Rect) mStableInsetsField.get(obj)).bottom;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return 0;
    }

    public static void getViewPositionInParent(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view == null || viewGroup == null) {
            return;
        }
        while (view != viewGroup) {
            if (!(view.getParent() instanceof m2.g)) {
                fArr[0] = view.getX() + fArr[0];
                fArr[1] = view.getY() + fArr[1];
            }
            view = (View) view.getParent();
        }
    }

    public static String getWallPaperUrl(Object obj) {
        if (!(obj instanceof TLRPC.TL_wallPaper)) {
            if (obj instanceof xh1) {
                return ((xh1) obj).b();
            }
            return null;
        }
        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
        String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + tL_wallPaper.slug;
        StringBuilder sb2 = new StringBuilder();
        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
        if (wallPaperSettings != null) {
            if (wallPaperSettings.blur) {
                sb2.append("blur");
            }
            if (tL_wallPaper.settings.motion) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
        }
        if (sb2.length() <= 0) {
            return str;
        }
        StringBuilder e10 = ta.b.e(str, "?mode=");
        e10.append(sb2.toString());
        return e10.toString();
    }

    public static int getWallpaperRotation(int i9, boolean z10) {
        int i10 = z10 ? i9 + 180 : i9 - 180;
        while (i10 >= 360) {
            i10 -= 360;
        }
        while (i10 < 0) {
            i10 += 360;
        }
        return i10;
    }

    public static Boolean getWasTablet() {
        return wasTablet;
    }

    public static void googleVoiceClientService_performAction(Intent intent, boolean z10, Bundle bundle) {
        if (z10) {
            runOnUIThread(new k(intent, 0));
        }
    }

    public static boolean gzip(File file, File file2) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            gZIPOutputStream.close();
                            bufferedInputStream.close();
                            return true;
                        }
                        gZIPOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            FileLog.e(e10);
            return false;
        } catch (IOException e11) {
            FileLog.e(e11);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0116 A[Catch: Exception -> 0x0135, TRY_LEAVE, TryCatch #0 {Exception -> 0x0135, blocks: (B:6:0x000a, B:9:0x0014, B:11:0x001a, B:13:0x0022, B:16:0x0039, B:19:0x0042, B:21:0x004b, B:24:0x005e, B:26:0x0064, B:28:0x006a, B:30:0x0070, B:32:0x008e, B:33:0x0092, B:34:0x0110, B:36:0x0116, B:47:0x0131, B:53:0x00a8, B:55:0x00b9, B:57:0x00c2, B:61:0x00cb, B:63:0x00d1, B:65:0x00d9, B:67:0x00e1, B:69:0x00eb, B:70:0x00ef), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean handleProxyIntent(Activity activity, Intent intent, boolean z10) {
        Uri data;
        String str;
        String str2;
        String str3;
        String str4;
        String path;
        String queryParameter;
        String queryParameter2;
        String str5;
        if (intent == null) {
            return false;
        }
        try {
            if ((intent.getFlags() & 1048576) == 0 && (data = intent.getData()) != null) {
                String scheme = data.getScheme();
                String str6 = null;
                if (scheme != null) {
                    if (!scheme.equals("http") && !scheme.equals("https")) {
                        if (scheme.equals("tg")) {
                            String uri = data.toString();
                            if (uri.startsWith("tg:proxy") || uri.startsWith("tg://proxy") || uri.startsWith("tg:socks") || uri.startsWith("tg://socks")) {
                                Uri parse = Uri.parse(uri.replace("tg:proxy", "tg://telegram.org").replace("tg://proxy", "tg://telegram.org").replace("tg://socks", "tg://telegram.org").replace("tg:socks", "tg://telegram.org"));
                                String queryParameter3 = parse.getQueryParameter("server");
                                if (checkHostForPunycode(queryParameter3)) {
                                    queryParameter3 = IDN.toASCII(queryParameter3, 1);
                                }
                                String str7 = queryParameter3;
                                String queryParameter4 = parse.getQueryParameter("port");
                                String queryParameter5 = parse.getQueryParameter("user");
                                str2 = parse.getQueryParameter("pass");
                                str = parse.getQueryParameter("secret");
                                str4 = queryParameter4;
                                str3 = str7;
                                str6 = queryParameter5;
                                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                                    String str8 = str6 != null ? "" : str6;
                                    String str9 = str2 != null ? "" : str2;
                                    String str10 = str != null ? "" : str;
                                    if (z10) {
                                        showProxyAlert(activity, str3, str4, str8, str9, str10);
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                    String lowerCase = data.getHost().toLowerCase();
                    if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && (path.startsWith("/socks") || path.startsWith("/proxy"))) {
                        String queryParameter6 = data.getQueryParameter("server");
                        if (checkHostForPunycode(queryParameter6)) {
                            queryParameter6 = IDN.toASCII(queryParameter6, 1);
                        }
                        String str11 = queryParameter6;
                        queryParameter = data.getQueryParameter("port");
                        String queryParameter7 = data.getQueryParameter("user");
                        str2 = data.getQueryParameter("pass");
                        queryParameter2 = data.getQueryParameter("secret");
                        str6 = queryParameter7;
                        str5 = str11;
                    } else {
                        queryParameter = null;
                        str5 = null;
                        queryParameter2 = null;
                        str2 = null;
                    }
                    str4 = queryParameter;
                    str3 = str5;
                    str = queryParameter2;
                    if (!TextUtils.isEmpty(str3)) {
                        if (str6 != null) {
                        }
                        if (str2 != null) {
                        }
                        if (str != null) {
                        }
                        if (z10) {
                        }
                        return true;
                    }
                }
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                if (!TextUtils.isEmpty(str3)) {
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean hasDialogOnTop(org.telegram.ui.ActionBar.o2 o2Var) {
        List<View> allGlobalViews;
        if (o2Var == null) {
            return false;
        }
        Dialog dialog = o2Var.visibleDialog;
        if (dialog != null && !(dialog instanceof org.telegram.ui.ActionBar.c2) && (!(dialog instanceof org.telegram.ui.ActionBar.f3) || ((org.telegram.ui.ActionBar.f3) dialog).attachedFragment == null)) {
            return true;
        }
        if (o2Var.getParentLayout() != null && (allGlobalViews = allGlobalViews()) != null && !allGlobalViews.isEmpty()) {
            View view = null;
            for (int size = allGlobalViews.size() - 1; size >= 0; size--) {
                view = allGlobalViews.get(size);
                Dialog dialog2 = o2Var.visibleDialog;
                if ((!(dialog2 instanceof org.telegram.ui.ActionBar.c2) || view != getRootView(((org.telegram.ui.ActionBar.c2) dialog2).W0)) && !(view instanceof org.telegram.ui.ActionBar.a2) && !(view instanceof ff0)) {
                    break;
                }
            }
            if (view != getRootView(o2Var.getParentLayout().getView())) {
                return true;
            }
        }
        return false;
    }

    public static void hideKeyboard(View view) {
        if (view == null) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static CharSequence highlightText(CharSequence charSequence, ArrayList<String> arrayList, org.telegram.ui.ActionBar.b6 b6Var) {
        if (arrayList == null) {
            return null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence highlightText = highlightText(charSequence, arrayList.get(i10), b6Var);
            if (highlightText != null) {
                charSequence = highlightText;
            } else {
                i9++;
            }
        }
        if (i9 == arrayList.size()) {
            return null;
        }
        return charSequence;
    }

    public static int hsvToColor(double d, double d9, double d10) {
        int[] hsvToRgb = hsvToRgb(d, d9, d10);
        return Color.argb(255, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
    }

    public static int[] hsvToRgb(double d, double d9, double d10) {
        double d11;
        double d12 = d * 6.0d;
        double floor = (int) Math.floor(d12);
        double d13 = d12 - floor;
        double d14 = (1.0d - d9) * d10;
        double d15 = (1.0d - (d13 * d9)) * d10;
        double d16 = (1.0d - ((1.0d - d13) * d9)) * d10;
        int i9 = ((int) floor) % 6;
        if (i9 == 0) {
            d14 = d16;
            d16 = d14;
        } else if (i9 != 1) {
            if (i9 == 2) {
                d11 = d14;
                d14 = d10;
            } else if (i9 == 3) {
                d16 = d10;
                d10 = d14;
                d14 = d15;
            } else if (i9 == 4) {
                d11 = d16;
                d16 = d10;
            } else if (i9 != 5) {
                d10 = 0.0d;
                d16 = 0.0d;
                d14 = 0.0d;
            } else {
                d16 = d15;
            }
            d10 = d11;
        } else {
            d16 = d14;
            d14 = d10;
            d10 = d15;
        }
        return new int[]{(int) (d10 * 255.0d), (int) (d14 * 255.0d), (int) (d16 * 255.0d)};
    }

    public static float ilerp(float f10, float f11, float f12) {
        return (f10 - f11) / (f12 - f11);
    }

    public static int indexOfIgnoreCase(String str, String str2) {
        if (str2.isEmpty() || str.isEmpty()) {
            return str.indexOf(str2);
        }
        for (int i9 = 0; i9 < str.length() && str2.length() + i9 <= str.length(); i9++) {
            int i10 = 0;
            for (int i11 = i9; i11 < str.length() && i10 < str2.length() && Character.toLowerCase(str.charAt(i11)) == Character.toLowerCase(str2.charAt(i10)); i11++) {
                i10++;
            }
            if (i10 == str2.length()) {
                return i9;
            }
        }
        return -1;
    }

    public static boolean intersect1d(int i9, int i10, int i11, int i12) {
        return Math.max(i9, i10) > Math.min(i11, i12) && Math.max(i11, i12) > Math.min(i9, i10);
    }

    public static boolean intersect1dInclusive(int i9, int i10, int i11, int i12) {
        return Math.max(i9, i10) >= Math.min(i11, i12) && Math.max(i11, i12) >= Math.min(i9, i10);
    }

    public static boolean isAccessibilityScreenReaderEnabled() {
        return isAccessibilityTouchExplorationEnabled();
    }

    public static boolean isAccessibilityTouchExplorationEnabled() {
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        }
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean isActivityRunning(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean isAirplaneModeOn() {
        return Settings.Global.getInt(ApplicationLoader.applicationContext.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean isBannedForever(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        return tL_chatBannedRights == null || Math.abs(((long) tL_chatBannedRights.until_date) - (System.currentTimeMillis() / 1000)) > 157680000;
    }

    public static boolean isContextSafe(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isContextSafe(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static boolean isDarkColor(int i9) {
        return computePerceivedBrightness(i9) < 0.721f;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isENOSPC(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.ENOSPC) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device");
    }

    public static boolean isEROFS(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.EROFS) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system");
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isFilNotFoundException(Throwable th) {
        return (th instanceof FileNotFoundException) || (th instanceof EOFException);
    }

    public static boolean isFold() {
        return ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean isHonor() {
        boolean z10;
        if (isHonor == null) {
            try {
                String lowerCase = Build.BRAND.toLowerCase();
                if (!lowerCase.contains("huawei") && !lowerCase.contains("honor")) {
                    z10 = false;
                    isHonor = Boolean.valueOf(z10);
                }
                z10 = true;
                isHonor = Boolean.valueOf(z10);
            } catch (Exception e10) {
                FileLog.e(e10);
                isHonor = Boolean.FALSE;
            }
        }
        return isHonor.booleanValue();
    }

    public static boolean isInAirplaneMode(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean isInPictureInPictureMode(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode();
    }

    public static boolean isInternalUri(Uri uri) {
        return isInternalUri(uri, 0);
    }

    public static boolean isKeyguardSecure() {
        return ((KeyguardManager) ApplicationLoader.applicationContext.getSystemService("keyguard")).isKeyguardSecure();
    }

    public static boolean isMapsInstalled(org.telegram.ui.ActionBar.o2 o2Var) {
        String mapsAppPackageName = ApplicationLoader.getMapsProvider().getMapsAppPackageName();
        try {
            ApplicationLoader.applicationContext.getPackageManager().getApplicationInfo(mapsAppPackageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (o2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            alertDialog$Builder.a.P = LocaleController.getString(ApplicationLoader.getMapsProvider().getInstallMapsString());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new c(1, mapsAppPackageName, o2Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            o2Var.showDialog(alertDialog$Builder.a);
            return false;
        }
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isProxyLink(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        return handleProxyIntent(activity, new Intent("android.intent.action.VIEW", uri), false);
    }

    public static boolean isPunctuationCharacter(char c10) {
        if (charactersMap == null) {
            charactersMap = new HashSet<>();
            int i9 = 0;
            while (true) {
                char[] cArr = characters;
                if (i9 >= cArr.length) {
                    break;
                }
                charactersMap.add(Character.valueOf(cArr[i9]));
                i9++;
            }
        }
        return charactersMap.contains(Character.valueOf(c10));
    }

    public static boolean isRTL(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i9 = 0; i9 < charSequence.length(); i9++) {
                char charAt = charSequence.charAt(i9);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafeToShow(Context context) {
        Activity findActivity = findActivity(context);
        if (findActivity == null) {
            return true;
        }
        return isActivityRunning(findActivity);
    }

    public static boolean isSimAvailable() {
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        return (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || isAirplaneModeOn()) ? false : true;
    }

    public static boolean isSmallScreen() {
        if (isSmallScreen == null) {
            Point point = displaySize;
            isSmallScreen = Boolean.valueOf(((float) ((Math.max(point.x, point.y) - statusBarHeight) - navigationBarHeight)) / density <= 650.0f);
        }
        return isSmallScreen.booleanValue();
    }

    public static boolean isSmallTablet() {
        Point point = displaySize;
        return ((float) Math.min(point.x, point.y)) / density <= 690.0f;
    }

    public static boolean isTablet() {
        return isTabletInternal() && !SharedConfig.forceDisableTabletMode;
    }

    public static boolean isTabletForce() {
        return ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getResources().getBoolean(R.bool.isTablet);
    }

    public static boolean isTabletInternal() {
        if (isTablet == null) {
            isTablet = Boolean.valueOf(isTabletForce());
        }
        return isTablet.booleanValue();
    }

    public static boolean isValidWallChar(char c10) {
        return c10 == '-' || c10 == '~';
    }

    public static boolean isWaitingForCall() {
        boolean z10;
        synchronized (callLock) {
            z10 = waitingForCall;
        }
        return z10;
    }

    public static boolean isWaitingForSms() {
        boolean z10;
        synchronized (smsLock) {
            z10 = waitingForSms;
        }
        return z10;
    }

    public static boolean isWhitespace(char c10) {
        return Character.isWhitespace(c10) || c10 == 10240 || c10 == 12644 || c10 == 65440;
    }

    public static boolean isWifiEnabled(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$addLinksSafe$8(SpannableStringBuilder spannableStringBuilder, int i9, boolean z10, boolean z11) {
        return Boolean.valueOf(addLinks(spannableStringBuilder, i9, z10, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$doOnPreDraw$27(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr, boolean[] zArr, Runnable runnable) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListenerArr[0]);
        }
        if (!zArr[0]) {
            zArr[0] = true;
            runnable.run();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$doSafe$9(Utilities.Callback0Return callback0Return) {
        try {
            return (Boolean) callback0Return.run();
        } catch (Exception e10) {
            FileLog.e(e10);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$formatSpannable$16(Integer num) {
        return "%" + (num.intValue() + 1) + "$s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$formatSpannableSimple$15(Integer num) {
        return "%s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBitmapFromWindow$6(boolean[] zArr, CountDownLatch countDownLatch, int i9) {
        zArr[0] = i9 == 0;
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$googleVoiceClientService_performAction$2(Intent intent) {
        try {
            int i9 = UserConfig.selectedAccount;
            ApplicationLoader.postInitApplication();
            if (!needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(parseLong));
                if (user == null && (user = MessagesStorage.getInstance(i9).getUserSync(parseLong)) != null) {
                    MessagesController.getInstance(i9).putUser(user, true);
                }
                if (user != null) {
                    ContactsController.getInstance(i9).markAsContacted(stringExtra2);
                    SendMessagesHelper.getInstance(i9).sendMessage(SendMessagesHelper.SendMessageParams.of(stringExtra, user.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isMapsInstalled$11(String str, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        try {
            o2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyDataSetChanged$26(RecyclerView recyclerView) {
        if (recyclerView.getAdapter() != null) {
            recyclerView.getAdapter().l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$pruneOverlaps$10(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i9;
        int i10;
        int i11 = linkSpec.start;
        int i12 = linkSpec2.start;
        if (i11 < i12) {
            return -1;
        }
        if (i11 <= i12 && (i9 = linkSpec.end) >= (i10 = linkSpec2.end)) {
            return i9 > i10 ? -1 : 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recycleBitmaps$0(ArrayList arrayList) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i9)).get();
            ((WeakReference) arrayList.get(i9)).clear();
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recycleBitmaps$1(ArrayList arrayList) {
        Utilities.globalQueue.postRunnable(new e(arrayList, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$scrollToFragmentRow$24(org.telegram.ui.ActionBar.o2 o2Var, String str, wk0 wk0Var) {
        int i9 = -1;
        try {
            Field declaredField = o2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            f2.m0 m0Var = (f2.m0) wk0Var.getLayoutManager();
            i9 = declaredField.getInt(o2Var);
            m0Var.h1(i9, dp(60.0f));
            declaredField.setAccessible(false);
            return i9;
        } catch (Throwable unused) {
            return i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setNavigationBarColor$23(IntColorCallback intColorCallback, Window window, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intColorCallback != null) {
            intColorCallback.run(intValue);
        }
        try {
            window.setNavigationBarColor(intValue);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setWaitingForSms$12(Void r02) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sms listener registered");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shakeView$13(View view, ValueAnimator valueAnimator) {
        view.setTranslationX((float) (Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d * 4.0d) * (1.0f - r8) * r8 * 4.0f * dp(4.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shakeViewSpring$14(Runnable runnable, View view, float f10, o1.h hVar, boolean z10, float f11, float f12) {
        if (runnable != null) {
            runnable.run();
        }
        view.setTranslationX(f10);
        view.setTag(R.id.spring_tag, null);
        view.setTag(R.id.spring_was_translation_x_tag, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showProxyAlert$17(long j10, org.telegram.ui.Components.qc[] qcVarArr) {
        if (j10 == -1) {
            qcVarArr[0].setText(LocaleController.getString(R.string.Unavailable));
            qcVarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
        } else {
            qcVarArr[0].setText(LocaleController.formatString(R.string.Ping2, Long.valueOf(j10)));
            qcVarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w6, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showProxyAlert$18(org.telegram.ui.Components.qc[] qcVarArr, long j10) {
        runOnUIThread(new bg.i2(j10, qcVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showProxyAlert$19(boolean[] zArr, org.telegram.ui.Components.qc[] qcVarArr, String str, String str2, String str3, String str4, String str5) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        qcVarArr[0].setText(LocaleController.getString(R.string.ProxyBottomSheetChecking) + "...");
        qcVarArr[0].b.d(false);
        try {
            ConnectionsManager.getInstance(UserConfig.selectedAccount).checkProxy(str, Integer.parseInt(str2), str3, str4, str5, new d(qcVarArr, 0));
        } catch (NumberFormatException unused) {
            qcVarArr[0].setText(LocaleController.getString(R.string.Unavailable));
            qcVarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showProxyAlert$20(SharedPreferences sharedPreferences, Runnable runnable, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        sharedPreferences.edit().putBoolean("proxycheckstatusip", true).apply();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showProxyAlert$21(boolean[] zArr, org.telegram.ui.Components.qc[] qcVarArr, String str, String str2, String str3, String str4, String str5, Activity activity) {
        if (zArr[0]) {
            return;
        }
        dl dlVar = new dl(zArr, qcVarArr, str, str2, str3, str4, str5, 1);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("proxycheckstatusip", false)) {
            dlVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ProxyBottomSheetCheckWarning);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ProxyBottomSheetCheckWarningText);
        alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new c(0, globalMainSettings, dlVar));
        j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showProxyAlert$22(String str, String str2, String str3, String str4, String str5, Activity activity, Runnable runnable, View view) {
        SharedConfig.ProxyInfo proxyInfo;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("proxy_enabled", true);
        edit.putString("proxy_ip", str);
        int intValue = Utilities.parseInt((CharSequence) str2).intValue();
        edit.putInt("proxy_port", intValue);
        if (TextUtils.isEmpty(str3)) {
            edit.remove("proxy_secret");
            if (TextUtils.isEmpty(str4)) {
                edit.remove("proxy_pass");
            } else {
                edit.putString("proxy_pass", str4);
            }
            if (TextUtils.isEmpty(str5)) {
                edit.remove("proxy_user");
            } else {
                edit.putString("proxy_user", str5);
            }
            proxyInfo = new SharedConfig.ProxyInfo(str, intValue, str5, str4, "");
        } else {
            edit.remove("proxy_pass");
            edit.remove("proxy_user");
            edit.putString("proxy_secret", str3);
            proxyInfo = new SharedConfig.ProxyInfo(str, intValue, "", "", str3);
        }
        edit.commit();
        SharedConfig.currentProxy = SharedConfig.addProxy(proxyInfo);
        ConnectionsManager.setProxySettings(true, str, intValue, str5, str4, str3);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        if (activity instanceof LaunchActivity) {
            org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
            if (lastFragment instanceof qn) {
                qn qnVar = (qn) lastFragment;
                qnVar.Q7();
                UndoView undoView = qnVar.u3;
                if (undoView != null) {
                    undoView.j(87, 0L, null);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$7(CharSequence charSequence, int i9, int i10) {
        return i9 == 0 || charSequence.charAt(i9 - 1) != '@';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateImageViewImageAnimated$25(ImageView imageView, AtomicBoolean atomicBoolean, Drawable drawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float abs = Math.abs(floatValue - 0.5f) + 0.5f;
        imageView.setScaleX(abs);
        imageView.setScaleY(abs);
        if (floatValue < 0.5f || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        imageView.setImageDrawable(drawable);
    }

    public static double lerp(double d, double d9, float f10) {
        return ((d9 - d) * f10) + d;
    }

    public static float lerp3(float f10, float f11, float f12, float f13) {
        return f13 < 0.0f ? lerp(f11, f10, -f13) : lerp(f11, f12, f13);
    }

    public static float lerpAngle(float f10, float f11, float f12) {
        return ((((((((f11 - f10) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f12) + f10) + 360.0f) % 360.0f;
    }

    public static void lerpCentered(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float lerp = lerp(rectF.centerX(), rectF2.centerX(), f10);
        float lerp2 = lerp(rectF.centerY(), rectF2.centerY(), f10);
        float lerp3 = lerp(rectF.width(), rectF2.width(), Math.min(1.0f, f10)) / 2.0f;
        float lerp4 = lerp(rectF.height(), rectF2.height(), Math.min(1.0f, f10)) / 2.0f;
        rectF3.set(lerp - lerp3, lerp2 - lerp4, lerp + lerp3, lerp2 + lerp4);
    }

    public static int lerpColor(int i9, int i10, float f10) {
        return Color.argb(lerp(Color.alpha(i9), Color.alpha(i10), f10), lerp(Color.red(i9), Color.red(i10), f10), lerp(Color.green(i9), Color.green(i10), f10), lerp(Color.blue(i9), Color.blue(i10), f10));
    }

    public static int lerpColor3(int i9, int i10, int i11, float f10) {
        return f10 < 0.0f ? lerpColor(i10, i9, -f10) : lerpColor(i10, i11, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<TLRPC.User> loadVCardFromStream(Uri uri, int i9, boolean z10, ArrayList<VcardItem> arrayList, String str) {
        InputStream createInputStream;
        InputStream inputStream;
        String[] strArr;
        byte[] decodeQuotedPrintable;
        VcardItem vcardItem;
        ArrayList<VcardItem> arrayList2 = arrayList;
        ArrayList<TLRPC.User> arrayList3 = null;
        1 r32 = 0;
        if (z10) {
            try {
                createInputStream = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                return arrayList3;
            }
        } else {
            try {
                createInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
            } catch (Throwable th2) {
                th = th2;
                arrayList3 = null;
                FileLog.e(th);
                return arrayList3;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(createInputStream, "UTF-8"));
        int i10 = 0;
        VcardData vcardData = null;
        String str2 = null;
        VcardItem vcardItem2 = null;
        boolean z11 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            if (readLine.startsWith("PHOTO")) {
                z11 = true;
            } else {
                if (readLine.indexOf(58) >= 0) {
                    if (readLine.startsWith("BEGIN:VCARD")) {
                        vcardData = new VcardData();
                        arrayList4.add(vcardData);
                        vcardData.name = str;
                    } else if (!readLine.startsWith("END:VCARD") && arrayList2 != null) {
                        if (readLine.startsWith("TEL")) {
                            vcardItem = new VcardItem();
                            vcardItem.type = i10;
                        } else if (readLine.startsWith("EMAIL")) {
                            vcardItem = new VcardItem();
                            vcardItem.type = 1;
                        } else {
                            if (!readLine.startsWith("ADR") && !readLine.startsWith("LABEL") && !readLine.startsWith("GEO")) {
                                if (readLine.startsWith("URL")) {
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 3;
                                } else if (readLine.startsWith("NOTE")) {
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 4;
                                } else if (readLine.startsWith("BDAY")) {
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 5;
                                } else {
                                    if (!readLine.startsWith("ORG") && !readLine.startsWith("TITLE") && !readLine.startsWith("ROLE")) {
                                        if (readLine.startsWith("X-ANDROID")) {
                                            vcardItem = new VcardItem();
                                            vcardItem.type = -1;
                                        } else if (!readLine.startsWith("X-PHONETIC") && readLine.startsWith("X-")) {
                                            vcardItem = new VcardItem();
                                            vcardItem.type = 20;
                                        } else {
                                            vcardItem = r32;
                                        }
                                    }
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 6;
                                }
                            }
                            vcardItem = new VcardItem();
                            vcardItem.type = 2;
                        }
                        if (vcardItem != null && vcardItem.type >= 0) {
                            arrayList2.add(vcardItem);
                        }
                        vcardItem2 = vcardItem;
                        z11 = false;
                    }
                    vcardItem2 = r32;
                    z11 = false;
                }
                if (!z11 && vcardData != null) {
                    if (vcardItem2 == null) {
                        if (vcardData.vcard.length() > 0) {
                            vcardData.vcard.append('\n');
                        }
                        vcardData.vcard.append(readLine);
                    } else {
                        vcardItem2.vcardData.add(readLine);
                    }
                }
                if (str2 != null) {
                    readLine = str2 + readLine;
                    str2 = null;
                }
                if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                    str2 = readLine.substring(i10, readLine.length() - 1);
                    r32 = 0;
                } else {
                    if (!z11 && vcardData != null && vcardItem2 != null) {
                        vcardItem2.fullData = readLine;
                    }
                    int indexOf = readLine.indexOf(":");
                    if (indexOf >= 0) {
                        inputStream = createInputStream;
                        strArr = new String[]{readLine.substring(i10, indexOf), readLine.substring(indexOf + 1).trim()};
                    } else {
                        inputStream = createInputStream;
                        strArr = new String[]{readLine.trim()};
                    }
                    if (strArr.length >= 2 && vcardData != null) {
                        if (!strArr[i10].startsWith("FN") && !strArr[i10].startsWith("N") && (!strArr[i10].startsWith("ORG") || !TextUtils.isEmpty(vcardData.name))) {
                            if (strArr[i10].startsWith("TEL")) {
                                vcardData.phones.add(strArr[1]);
                            }
                        }
                        String[] split = strArr[i10].split(";");
                        int length = split.length;
                        String[] strArr2 = strArr;
                        String str3 = null;
                        String str4 = null;
                        int i11 = 0;
                        while (i11 < length) {
                            String[] split2 = split[i11].split("=");
                            String[] strArr3 = split;
                            if (split2.length == 2) {
                                if (split2[0].equals("CHARSET")) {
                                    str3 = split2[1];
                                } else if (split2[0].equals("ENCODING")) {
                                    str4 = split2[1];
                                }
                            }
                            i11++;
                            split = strArr3;
                        }
                        if (strArr2[0].startsWith("N")) {
                            vcardData.name = strArr2[1].replace(';', ' ').trim();
                        } else {
                            vcardData.name = strArr2[1];
                        }
                        if (str4 != null && str4.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = decodeQuotedPrintable(getStringBytes(vcardData.name))) != null && decodeQuotedPrintable.length != 0) {
                            vcardData.name = new String(decodeQuotedPrintable, str3);
                        }
                        arrayList2 = arrayList;
                        createInputStream = inputStream;
                        r32 = 0;
                        i10 = 0;
                    }
                    arrayList2 = arrayList;
                    createInputStream = inputStream;
                    r32 = 0;
                    i10 = 0;
                }
            }
        }
        InputStream inputStream2 = createInputStream;
        try {
            bufferedReader.close();
            inputStream2.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        arrayList3 = null;
        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
            VcardData vcardData2 = (VcardData) arrayList4.get(i12);
            if (vcardData2.name != null && !vcardData2.phones.isEmpty()) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                String str5 = vcardData2.phones.get(0);
                int i13 = 0;
                while (true) {
                    if (i13 >= vcardData2.phones.size()) {
                        break;
                    }
                    String str6 = vcardData2.phones.get(i13);
                    if (ContactsController.getInstance(i9).contactsByShortPhone.get(str6.substring(Math.max(0, str6.length() - 7))) != null) {
                        str5 = str6;
                        break;
                    }
                    i13++;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                tL_userContact_old2.phone = str5;
                tL_userContact_old2.first_name = vcardData2.name;
                tL_userContact_old2.last_name = "";
                tL_userContact_old2.id = 0L;
                TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                restrictionReason.text = vcardData2.vcard.toString();
                restrictionReason.platform = "";
                restrictionReason.reason = "";
                tL_userContact_old2.restriction_reason.add(restrictionReason);
                arrayList3.add(tL_userContact_old2);
            }
        }
        return arrayList3;
    }

    public static void lockOrientation(Activity activity) {
        if (activity == null || prevOrientation != -10 || isTabletInternal()) {
            return;
        }
        try {
            prevOrientation = activity.getRequestedOrientation();
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            if (windowManager == null || windowManager.getDefaultDisplay() == null) {
                return;
            }
            int rotation = windowManager.getDefaultDisplay().getRotation();
            int i9 = activity.getResources().getConfiguration().orientation;
            if (rotation == 3) {
                if (i9 == 1) {
                    activity.setRequestedOrientation(1);
                    return;
                } else {
                    activity.setRequestedOrientation(8);
                    return;
                }
            }
            if (rotation == 1) {
                if (i9 == 1) {
                    activity.setRequestedOrientation(9);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0) {
                if (i9 == 2) {
                    activity.setRequestedOrientation(0);
                    return;
                } else {
                    activity.setRequestedOrientation(1);
                    return;
                }
            }
            if (i9 == 2) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(9);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void logFlagSecure() {
        FileLog.d("[FLAG_SECURE]");
        printStackTrace("FLAG_SECURE");
    }

    public static void makeAccessibilityAnnouncement(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        if (accessibilityManager2.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.getText().add(charSequence);
            accessibilityManager2.sendAccessibilityEvent(obtain);
        }
    }

    public static Bitmap makeBlurBitmap(View view) {
        return makeBlurBitmap(view, 6.0f, 7);
    }

    public static SpannableStringBuilder makeClickable(CharSequence charSequence, final int i9, final Runnable runnable, final org.telegram.ui.ActionBar.b6 b6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i9 == 0 || i9 == 3 || i9 == 2 || i9 == 4) {
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.3
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(i9 == 4);
                    if (i9 == 2) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                    }
                }
            }, 0, spannableStringBuilder.length(), 0);
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.AndroidUtilities.4
            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, org.telegram.ui.ActionBar.b6.this));
                textPaint.setAlpha(alpha);
            }
        }, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void makeGlobalBlurBitmap(Utilities.Callback<Bitmap> callback, float f10) {
        makeGlobalBlurBitmap(callback, f10, (int) f10, null, null);
    }

    private static String makeUrl(String str, String[] strArr, Matcher matcher) {
        boolean z10;
        int i9 = 0;
        while (true) {
            if (i9 >= strArr.length) {
                z10 = false;
                break;
            }
            String str2 = strArr[i9];
            String str3 = str;
            if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                String str4 = strArr[i9];
                boolean regionMatches = str3.regionMatches(false, 0, str4, 0, str4.length());
                z10 = true;
                if (regionMatches) {
                    str = str3;
                } else {
                    str = strArr[i9] + str3.substring(strArr[i9].length());
                }
            } else {
                i9++;
                str = str3;
            }
        }
        return (z10 || strArr.length <= 0) ? str : aa.d.r(new StringBuilder(), strArr[0], str);
    }

    public static int multiplyAlphaComponent(int i9, float f10) {
        return i0.a.k(i9, (int) (Color.alpha(i9) * f10));
    }

    public static void multiplyBrightnessColorMatrix(ColorMatrix colorMatrix, float f10) {
        if (colorMatrix == null) {
            return;
        }
        colorMatrix.postConcat(new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static boolean needShowPasscode() {
        return needShowPasscode(false);
    }

    public static void normalizeTimePart(StringBuilder sb2, int i9) {
        if (i9 >= 10) {
            sb2.append(i9);
        } else {
            sb2.append("0");
            sb2.append(i9);
        }
    }

    public static void notifyDataSetChanged(RecyclerView recyclerView) {
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (recyclerView.b0()) {
            recyclerView.post(new e1(recyclerView, 12));
        } else {
            recyclerView.getAdapter().l();
        }
    }

    public static String obtainLoginPhoneCall(String str) {
        if (!hasCallPermissions) {
            return null;
        }
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, Build.VERSION.SDK_INT >= 26 ? "date DESC" : "date DESC LIMIT 5");
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    long j10 = query.getLong(1);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("number = " + string);
                    }
                    if (Math.abs(System.currentTimeMillis() - j10) < 3600000 && checkPhonePattern(str, string)) {
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            query.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[Catch: Exception -> 0x00ee, TRY_ENTER, TryCatch #0 {Exception -> 0x00ee, blocks: (B:30:0x00bd, B:32:0x00d4, B:34:0x00e3, B:36:0x00e7, B:39:0x00f2, B:42:0x00fd, B:45:0x0119, B:48:0x015c, B:54:0x0132, B:56:0x0136, B:57:0x0158, B:59:0x0151, B:61:0x011d, B:64:0x0126, B:51:0x012d), top: B:29:0x00bd, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c A[Catch: Exception -> 0x00ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ee, blocks: (B:30:0x00bd, B:32:0x00d4, B:34:0x00e3, B:36:0x00e7, B:39:0x00f2, B:42:0x00fd, B:45:0x0119, B:48:0x015c, B:54:0x0132, B:56:0x0136, B:57:0x0158, B:59:0x0151, B:61:0x011d, B:64:0x0126, B:51:0x012d), top: B:29:0x00bd, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:30:0x00bd, B:32:0x00d4, B:34:0x00e3, B:36:0x00e7, B:39:0x00f2, B:42:0x00fd, B:45:0x0119, B:48:0x015c, B:54:0x0132, B:56:0x0136, B:57:0x0158, B:59:0x0151, B:61:0x011d, B:64:0x0126, B:51:0x012d), top: B:29:0x00bd, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void openDocument(MessageObject messageObject, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.Document document;
        String str;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        String attachFileName = messageObject.messageOwner.media != null ? FileLoader.getAttachFileName(document) : "";
        String str2 = messageObject.messageOwner.attachPath;
        File file = (str2 == null || str2.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner);
        }
        if (file == null || !file.exists()) {
            return;
        }
        if (o2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
            org.telegram.ui.ActionBar.e6 u10 = org.telegram.ui.ActionBar.f6.u(file, messageObject.getDocumentName(), null, true);
            if (u10 != null) {
                o2Var.presentFragment(new oc1(u10));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            HashMap hashMap = new HashMap();
            int i9 = org.telegram.ui.ActionBar.f6.L5;
            hashMap.put("info1", Integer.valueOf(o2Var.getThemedColor(i9)));
            hashMap.put("info2", Integer.valueOf(o2Var.getThemedColor(i9)));
            alertDialog$Builder.m(R.raw.not_available, 52, o2Var.getThemedColor(i9), hashMap);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.S = true;
            c2Var.P = LocaleController.getString(R.string.IncorrectTheme);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(c2Var);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = attachFileName.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str = singleton.getMimeTypeFromExtension(attachFileName.substring(lastIndexOf + 1).toLowerCase());
                if (str == null) {
                    str = document.mime_type;
                    if (str != null) {
                        if (str.length() == 0) {
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), str != null ? str : "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(file), str != null ? str : "text/plain");
                }
                if (str != null) {
                    activity.startActivityForResult(intent, 500);
                    return;
                }
                try {
                    activity.startActivityForResult(intent, 500);
                    return;
                } catch (Exception unused) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), "text/plain");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file), "text/plain");
                    }
                    activity.startActivityForResult(intent, 500);
                    return;
                }
            }
            str = null;
            if (Build.VERSION.SDK_INT < 24) {
            }
            if (str != null) {
            }
        } catch (Exception unused2) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            HashMap hashMap2 = new HashMap();
            int i10 = org.telegram.ui.ActionBar.f6.L5;
            hashMap2.put("info1", Integer.valueOf(o2Var.getThemedColor(i10)));
            hashMap2.put("info2", Integer.valueOf(o2Var.getThemedColor(i10)));
            alertDialog$Builder2.m(R.raw.not_available, 52, o2Var.getThemedColor(i10), hashMap2);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.S = true;
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
            c2Var2.P = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
            o2Var.showDialog(c2Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r8.length() != 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean openForView(File file, String str, String str2, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        if (file == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int lastIndexOf = str == null ? -1 : str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            if (!z10 || !MessageObject.isV(substring)) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(substring.toLowerCase());
                if (mimeTypeFromExtension != null) {
                    str2 = mimeTypeFromExtension;
                } else if (str2 != null) {
                }
                if (str2 != null && str2.equals("application/vnd.android.package-archive")) {
                    if (!z10) {
                        if (Build.VERSION.SDK_INT >= 26 && !ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
                            org.telegram.ui.Components.y4.j(activity, b6Var).show();
                            return true;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), str2 != null ? str2 : "text/plain");
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
                        intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), "text/plain");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file), "text/plain");
                    }
                    activity.startActivityForResult(intent, 500);
                    return true;
                }
            }
            return true;
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

    public static void openSharing(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        o2Var.showDialog(new rp0(o2Var.getParentActivity(), null, str, false, str, false, null));
    }

    public static long pack(int i9, int i10) {
        return (i10 & 4294967295L) | (i9 << 32);
    }

    public static SpannableStringBuilder premiumText(String str, Runnable runnable) {
        return replaceSingleTag(str, -1, 2, runnable);
    }

    public static void printLayoutRequestedChain(View view) {
        if (view == null) {
            FileLog.d("LayoutCheck view == null");
            return;
        }
        int i9 = 0;
        while (true) {
            if (view == null) {
                break;
            }
            Object parent = view.getParent();
            StringBuilder p6 = j3.r0.p(i9, "LayoutCheck level=", ", view=");
            p6.append(view.getClass().getSimpleName());
            p6.append("@");
            p6.append(Integer.toHexString(System.identityHashCode(view)));
            p6.append(", isLayoutRequested=");
            p6.append(view.isLayoutRequested());
            FileLog.d(p6.toString());
            if (parent instanceof View) {
                view = (View) parent;
                i9++;
            } else if (parent != null) {
                StringBuilder sb2 = new StringBuilder("LayoutCheck level=");
                sb2.append(i9 + 1);
                sb2.append(", parent=");
                sb2.append(parent.getClass().getSimpleName());
                j3.r0.x(" (not a View)", sb2);
            }
        }
        FileLog.d("LayoutCheck");
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> arrayList) {
        int i9;
        int i10 = 0;
        Collections.sort(arrayList, new q(i10));
        int size = arrayList.size();
        while (i10 < size - 1) {
            LinkSpec linkSpec = arrayList.get(i10);
            int i11 = i10 + 1;
            LinkSpec linkSpec2 = arrayList.get(i11);
            int i12 = linkSpec.start;
            int i13 = linkSpec2.start;
            if (i12 <= i13 && (i9 = linkSpec.end) > i13) {
                int i14 = linkSpec2.end;
                int i15 = (i14 > i9 && i9 - i12 <= i14 - i13) ? i9 - i12 < i14 - i13 ? i10 : -1 : i11;
                if (i15 != -1) {
                    arrayList.remove(i15);
                    size--;
                }
            }
            i10 = i11;
        }
    }

    public static void quietSleep(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public static <T> T randomOf(ArrayList<T> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(Math.abs(Utilities.fastRandom.nextInt() % arrayList.size()));
    }

    public static String readRes(int i9) {
        return readRes(null, i9);
    }

    public static void recycleBitmap(Bitmap bitmap) {
        recycleBitmaps(Collections.singletonList(bitmap));
    }

    public static void recycleBitmaps(List<Bitmap> list) {
        if (Build.VERSION.SDK_INT <= 23 || list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            Bitmap bitmap = list.get(i9);
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList.add(new WeakReference(bitmap));
            }
        }
        runOnUIThread(new e(arrayList, 0), 36L);
    }

    public static void removeAdjustResize(Activity activity, int i9) {
        if (activity == null || isTablet() || adjustOwnerClassGuid != i9) {
            return;
        }
        activity.getWindow().setSoftInputMode(32);
    }

    public static void removeAltFocusable(Activity activity, int i9) {
        if (activity != null && altFocusableClassGuid == i9) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static String removeDiacritics(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        Pattern pattern = REMOVE_MULTIPLE_DIACRITICS;
        return (pattern == null || (matcher = pattern.matcher(str)) == null) ? str : matcher.replaceAll("$1");
    }

    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static String removeRTL(String str) {
        if (str == null) {
            return null;
        }
        if (REMOVE_RTL == null) {
            REMOVE_RTL = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
        }
        Matcher matcher = REMOVE_RTL.matcher(str);
        return matcher == null ? str : matcher.replaceAll("");
    }

    public static CharSequence removeSpans(CharSequence charSequence, Class cls) {
        if (!(charSequence instanceof Spannable)) {
            return charSequence;
        }
        Spannable spannable = (Spannable) charSequence;
        for (Object obj : spannable.getSpans(0, spannable.length(), cls)) {
            spannable.removeSpan(obj);
        }
        return spannable;
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10) {
        return replaceArrows(charSequence, z10, dp(2.6666667f), 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceCharSequence(String str, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceLinks(String str, org.telegram.ui.ActionBar.b6 b6Var) {
        return replaceLinks(str, b6Var, null);
    }

    public static CharSequence replaceMultipleCharSequence(String str, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int indexOf = TextUtils.indexOf(charSequence, str, 0);
        while (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
            indexOf = TextUtils.indexOf(spannableStringBuilder, str, indexOf + 1);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceMultipleTags(String str, Runnable... runnableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (final Runnable runnable : runnableArr) {
            int charSequenceIndexOf = charSequenceIndexOf(spannableStringBuilder, "**");
            int i9 = charSequenceIndexOf + 2;
            int charSequenceIndexOf2 = charSequenceIndexOf(spannableStringBuilder, "**", i9);
            if (charSequenceIndexOf < 0 || charSequenceIndexOf2 < 0) {
                break;
            }
            spannableStringBuilder.delete(charSequenceIndexOf, i9);
            int i10 = charSequenceIndexOf2 - 2;
            spannableStringBuilder.delete(i10, charSequenceIndexOf2);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.5
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, charSequenceIndexOf, i10, 33);
        }
        return spannableStringBuilder;
    }

    public static CharSequence replaceNewLines(CharSequence charSequence) {
        int i9 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            while (i9 < length) {
                if (sb2.charAt(i9) == '\n') {
                    sb2.setCharAt(i9, ' ');
                }
                i9++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i9 < length2) {
                if (charSequence.charAt(i9) == '\n') {
                    spannableStringBuilder.replace(i9, i9 + 1, (CharSequence) " ");
                }
                i9++;
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
        while (i9 < length3) {
            if (charSequence.charAt(i9) == '\n') {
                spannableStringBuilder2.replace(i9, i9 + 1, (CharSequence) " ");
            }
            i9++;
        }
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder replaceSingleLink(String str, int i9) {
        return replaceSingleLink(str, i9, null);
    }

    public static SpannableStringBuilder replaceSingleLinkBold(String str, int i9) {
        return replaceSingleLinkBold(str, i9, null);
    }

    public static SpannableStringBuilder replaceSingleTag(String str, Runnable runnable) {
        return replaceSingleTag(str, -1, 0, runnable);
    }

    public static SpannableStringBuilder replaceTags(String str) {
        return replaceTags(str, 11, new Object[0]);
    }

    public static CharSequence replaceTwoNewLinesToOne(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            int i9 = 0;
            while (i9 < length - 2) {
                int i10 = i9 + 2;
                sb2.getChars(i9, i10, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb2 = sb2.replace(i9, i10, "\n");
                    i9--;
                    length--;
                }
                i9++;
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

    public static void requestAdjustNothing(Activity activity, int i9) {
        if (activity == null || isTablet()) {
            return;
        }
        activity.getWindow().setSoftInputMode(48);
        adjustOwnerClassGuid = i9;
    }

    public static void requestAdjustResize(Activity activity, int i9) {
        if (activity == null) {
            return;
        }
        requestAdjustResize(activity.getWindow(), i9);
    }

    public static void requestAltFocusable(Activity activity, int i9) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        altFocusableClassGuid = i9;
    }

    public static void resetPictureInPictureParams(Activity activity) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i9 >= 31) {
                builder.setAutoEnterEnabled(false);
            }
            setPictureInPictureParams(activity, builder.build());
        }
    }

    public static void resetTabletFlag() {
        if (wasTablet == null) {
            wasTablet = Boolean.valueOf(isTabletInternal());
        }
        isTablet = null;
        SharedConfig.updateTabletConfig();
    }

    public static void resetWasTabletFlag() {
        wasTablet = null;
    }

    public static double[] rgbToHsv(int i9) {
        return rgbToHsv(Color.red(i9), Color.green(i9), Color.blue(i9));
    }

    public static int[] roundPercents(float[] fArr, int[] iArr) {
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
        int i9 = 0;
        for (int i10 = 0; i10 < fArr.length; i10++) {
            int floor = (int) Math.floor((fArr[i10] / f10) * 100.0f);
            iArr[i10] = floor;
            i9 += floor;
        }
        while (i9 < 100) {
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
                break;
            }
            iArr[i11] = iArr[i11] + 1;
            i9++;
        }
        return iArr;
    }

    public static int roundPlayingMessageSize(boolean z10) {
        return z10 ? roundSidePlayingMessageSize : roundPlayingMessageSize;
    }

    public static void runOnUIThread(Runnable runnable) {
        runOnUIThread(runnable, 0L);
    }

    public static void scaleRect(RectF rectF, float f10) {
        scaleRect(rectF, f10, rectF.centerX(), rectF.centerY());
    }

    public static void scrollToFragmentRow(org.telegram.ui.ActionBar.b5 b5Var, String str) {
        if (b5Var == null || str == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) b5Var.getFragmentStack().get(b5Var.getFragmentStack().size() - 1);
        try {
            Field declaredField = o2Var.getClass().getDeclaredField("listView");
            declaredField.setAccessible(true);
            wk0 wk0Var = (wk0) declaredField.get(o2Var);
            wk0Var.e1(new f(o2Var, str, wk0Var), 700, true);
            declaredField.setAccessible(false);
        } catch (Throwable unused) {
        }
    }

    public static void setAdjustResizeToNothing(Activity activity, int i9) {
        if (activity == null || isTablet()) {
            return;
        }
        int i10 = adjustOwnerClassGuid;
        if (i10 == 0 || i10 == i9) {
            activity.getWindow().setSoftInputMode(48);
        }
    }

    public static void setEnabled(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                setEnabled(viewGroup.getChildAt(i9), z10);
            }
        }
    }

    public static void setLightNavigationBar(Dialog dialog, boolean z10) {
        if (dialog != null) {
            setLightNavigationBar(dialog.getWindow(), z10);
        }
    }

    public static void setLightStatusBar(Activity activity, boolean z10) {
        if (activity != null) {
            setLightStatusBar(activity.getWindow(), z10);
        }
    }

    public static int setMyLayerVersion(int i9, int i10) {
        return (i9 & (-65536)) | i10;
    }

    public static void setNavigationBarColor(Dialog dialog, int i9) {
        setNavigationBarColor(dialog, i9, true);
    }

    public static int setPeerLayerVersion(int i9, int i10) {
        return (i9 & 65535) | (i10 << 16);
    }

    public static void setPictureInPictureParams(Activity activity, PictureInPictureParams pictureInPictureParams) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        if (pictureInPictureParams == null) {
            resetPictureInPictureParams(activity);
            return;
        }
        try {
            activity.setPictureInPictureParams(pictureInPictureParams);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void setPreferredMaxRefreshRate(Window window) {
        setPreferredMaxRefreshRate(window, screenMaxRefreshRate);
    }

    public static void setRectD(RectF rectF, float f10, float f11, float f12) {
        float f13 = f12 / 2.0f;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
    }

    public static void setRectR(RectF rectF, float f10, float f11, float f12) {
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
    }

    public static void setRectToRect(Matrix matrix, RectF rectF, RectF rectF2, int i9, int i10, boolean z10) {
        float height;
        float width;
        float height2;
        boolean z11;
        float f10;
        float f11;
        float height3;
        float height4;
        if (i9 == 90 || i9 == 270) {
            height = rectF2.height() / rectF.width();
            width = rectF2.width();
            height2 = rectF.height();
        } else {
            height = rectF2.width() / rectF.width();
            width = rectF2.height();
            height2 = rectF.height();
        }
        float f12 = width / height2;
        if (height < f12) {
            height = f12;
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            matrix.setTranslate(rectF2.left, rectF2.top);
        }
        if (i9 == 90) {
            matrix.preRotate(90.0f);
            if (i10 == 1) {
                matrix.preScale(-1.0f, 1.0f);
            } else if (i10 == 2) {
                matrix.preScale(1.0f, -1.0f);
            }
            matrix.preTranslate(0.0f, -rectF2.width());
        } else if (i9 == 180) {
            matrix.preRotate(180.0f);
            if (i10 == 1) {
                matrix.preScale(-1.0f, 1.0f);
            } else if (i10 == 2) {
                matrix.preScale(1.0f, -1.0f);
            }
            matrix.preTranslate(-rectF2.width(), -rectF2.height());
        } else if (i9 == 270) {
            matrix.preRotate(270.0f);
            if (i10 == 1) {
                matrix.preScale(-1.0f, 1.0f);
            } else if (i10 == 2) {
                matrix.preScale(1.0f, -1.0f);
            }
            matrix.preTranslate(-rectF2.height(), 0.0f);
        }
        if (z10) {
            f10 = (-rectF.left) * height;
            f11 = (-rectF.top) * height;
        } else {
            f10 = rectF2.left - (rectF.left * height);
            f11 = rectF2.top - (rectF.top * height);
        }
        if (z11) {
            height3 = rectF2.width();
            height4 = rectF.width();
        } else {
            height3 = rectF2.height();
            height4 = rectF.height();
        }
        float f13 = (height3 - (height4 * height)) / 2.0f;
        if (z11) {
            f10 += f13;
        } else {
            f11 += f13;
        }
        matrix.preScale(height, height);
        if (z10) {
            matrix.preTranslate(f10, f11);
        }
    }

    public static void setScrollViewEdgeEffectColor(HorizontalScrollView horizontalScrollView, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            horizontalScrollView.setEdgeEffectColor(i9);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(horizontalScrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i9);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(horizontalScrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i9);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void setViewLayoutMargins(View view, int i9, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin == i9 && marginLayoutParams.topMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.bottomMargin == i12) {
                return;
            }
            marginLayoutParams.leftMargin = i9;
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.rightMargin = i11;
            marginLayoutParams.bottomMargin = i12;
            view.requestLayout();
        }
    }

    public static void setViewPagerEdgeEffectColor(m2.g gVar, int i9) {
        try {
            Field declaredField = m2.g.class.getDeclaredField("b0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(gVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i9);
            }
            Field declaredField2 = m2.g.class.getDeclaredField("c0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(gVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i9);
            }
        } catch (Exception unused) {
        }
    }

    public static void setWaitingForCall(boolean z10) {
        synchronized (callLock) {
            try {
                try {
                    if (z10) {
                        if (callReceiver == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = ApplicationLoader.applicationContext;
                                CallReceiver callReceiver2 = new CallReceiver();
                                callReceiver = callReceiver2;
                                context.registerReceiver(callReceiver2, intentFilter, 4);
                            } else {
                                Context context2 = ApplicationLoader.applicationContext;
                                CallReceiver callReceiver3 = new CallReceiver();
                                callReceiver = callReceiver3;
                                context2.registerReceiver(callReceiver3, intentFilter);
                            }
                        }
                    } else if (callReceiver != null) {
                        ApplicationLoader.applicationContext.unregisterReceiver(callReceiver);
                        callReceiver = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
            waitingForCall = z10;
        }
    }

    public static void setWaitingForSms(boolean z10) {
        synchronized (smsLock) {
            try {
                waitingForSms = z10;
                if (z10) {
                    try {
                        t6.a aVar = new t6.a(ApplicationLoader.applicationContext, i5.a.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c);
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.c = new v9.d(aVar);
                        b10.d = new u5.c[]{t6.b.a};
                        b10.a = 1567;
                        aVar.e(1, b10.b()).addOnSuccessListener(new b(2));
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void shakeView(final View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.shake_animation);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new o(view, 0));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.AndroidUtilities.12
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(0.0f);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.shake_animation, ofFloat);
    }

    public static void shakeViewSpring(View view) {
        shakeViewSpring(view, 10.0f, null);
    }

    public static boolean shouldEnableAnimation() {
        int i9 = Build.VERSION.SDK_INT;
        return i9 < 26 || i9 >= 28 || (!((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).isPowerSaveMode() && getAnimatorDurationScale() > 0.0f);
    }

    public static boolean shouldShowClipboardToast() {
        int i9 = Build.VERSION.SDK_INT;
        return (i9 < 31 || !OneUIUtilities.hasBuiltInClipboardToasts()) && i9 < 32;
    }

    public static boolean shouldShowUrlInAlert(String str) {
        try {
            return checkHostForPunycode(Uri.parse(str).getHost());
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static boolean showKeyboard(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static void showProxyAlert(final Activity activity, final String str, final String str2, final String str3, final String str4, final String str5) {
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z10;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(activity, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyTopPadding = false;
        f3Var.applyBottomPadding = false;
        final Runnable runnable = f3Var.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f3Var.customView = linearLayout;
        TextView b10 = g7.i6.b(activity, 20.0f, org.telegram.ui.ActionBar.f6.j5, true, null);
        b10.setText(LocaleController.getString(R.string.UseProxyTitle));
        linearLayout.addView(b10, g7.e6.t(-1, -2, 55, 22, 18, 22, 0));
        wy0 wy0Var = new wy0(activity, null);
        linearLayout.addView(wy0Var, g7.e6.t(-1, -2, 55, 14, 18, 14, 0));
        if (TextUtils.isEmpty(str)) {
            str6 = str;
        } else {
            str6 = str;
            wy0Var.c(LocaleController.getString(R.string.UseProxyAddress), str6, null, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            wy0Var.c(LocaleController.getString(R.string.UseProxyPort), str2, null, null);
        }
        if (TextUtils.isEmpty(str5)) {
            str7 = str5;
        } else {
            str7 = str5;
            wy0Var.c(LocaleController.getString(R.string.UseProxySecret), str7, null, null);
        }
        if (TextUtils.isEmpty(str3)) {
            str8 = str3;
        } else {
            str8 = str3;
            wy0Var.c(LocaleController.getString(R.string.UseProxyUsername), str8, null, null);
        }
        if (TextUtils.isEmpty(str4)) {
            str9 = str4;
        } else {
            str9 = str4;
            wy0Var.c(LocaleController.getString(R.string.UseProxyPassword), str9, null, null);
        }
        org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
        wy0Var.c(LocaleController.getString(R.string.ProxyStatus), "", null, qcVarArr);
        ((View) qcVarArr[0].getParent()).setPadding(0, 0, 0, 0);
        qcVarArr[0].setDisablePaddingsOffsetY(true);
        qcVarArr[0].setPadding(dp(12.66f), dp(9.33f), dp(12.66f), dp(9.33f));
        qcVarArr[0].setText(replaceSingleLink(LocaleController.getString(R.string.ProxyBottomSheetCheckStatus), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gc, false), new bg.p0(new boolean[1], qcVarArr, str6, str2, str8, str9, str7, activity, 4)));
        if (TextUtils.isEmpty(str5)) {
            z10 = true;
        } else {
            uy0 a2 = wy0Var.a(LocaleController.getString(R.string.UseProxyTelegramInfo2));
            z10 = true;
            a2.setFilled(true);
            dh.u uVar = (dh.u) a2.getChildAt(0);
            uVar.setTextSize(1, 11.0f);
            uVar.setGravity(17);
        }
        kh.d dVar = new kh.d(activity, null, z10);
        dVar.setRoundRadius(24);
        dVar.setText(LocaleController.getString(R.string.ConnectingConnectProxy));
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.messenger.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AndroidUtilities.lambda$showProxyAlert$22(str, str2, str5, str4, str3, activity, runnable, view);
            }
        });
        linearLayout.addView(dVar, g7.e6.t(-1, 48, 55, 14, 18, 14, 14));
        f3Var.show();
    }

    private static void snapshotTextureViews(int i9, int i10, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i9, iArr[1] - i10, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                snapshotTextureViews(i9, i10, iArr, canvas, viewGroup.getChildAt(i11));
            }
        }
    }

    public static Bitmap snapshotView(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        snapshotTextureViews(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static CharSequence superTrim(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length && isWhitespace(charSequence.charAt(i9))) {
            i9++;
        }
        while (i9 < length && isWhitespace(charSequence.charAt(length - 1))) {
            length--;
        }
        return (i9 > 0 || length < charSequence.length()) ? charSequence.subSequence(i9, length) : charSequence;
    }

    public static int[] toIntArray(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr[i9] = list.get(i9).intValue();
        }
        return iArr;
    }

    public static String translitSafe(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String translitString = LocaleController.getInstance().getTranslitString(str, false);
        return translitString == null ? "" : translitString;
    }

    public static CharSequence trim(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) <= ' ') {
            i9++;
        }
        while (i9 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i9;
        }
        return (i9 > 0 || length < charSequence.length()) ? charSequence.subSequence(i9, length) : charSequence;
    }

    public static void unlockOrientation(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            int i9 = prevOrientation;
            if (i9 != -10) {
                activity.setRequestedOrientation(i9);
                prevOrientation = -10;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static int unpackA(long j10) {
        return (int) (j10 >> 32);
    }

    public static int unpackB(long j10) {
        return (int) j10;
    }

    public static void updateImageViewImageAnimated(ImageView imageView, int i9) {
        updateImageViewImageAnimated(imageView, imageView.getContext().getDrawable(i9));
    }

    public static void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (windowManager == null || view == null || view.getParent() == null) {
            return;
        }
        windowManager.updateViewLayout(view, layoutParams);
    }

    public static void updateViewShow(View view, boolean z10) {
        updateViewShow(view, z10, true, true);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10) {
        updateViewVisibilityAnimated(view, z10, 1.0f, true, true);
    }

    public static void updateVisibleRow(wk0 wk0Var, int i9) {
        f2.r0 adapter;
        f2.q1 T;
        if (wk0Var == null || (adapter = wk0Var.getAdapter()) == null) {
            return;
        }
        for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
            View childAt = wk0Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = wk0Var.T(childAt)) != null && !T.r() && T.b() == i9) {
                adapter.v(T, R);
            }
        }
    }

    public static void updateVisibleRows(wk0 wk0Var) {
        f2.r0 adapter;
        f2.q1 T;
        if (wk0Var == null || (adapter = wk0Var.getAdapter()) == null) {
            return;
        }
        for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
            View childAt = wk0Var.getChildAt(i9);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && (T = wk0Var.T(childAt)) != null && !T.r()) {
                adapter.v(T, R);
            }
        }
    }

    public static void vibrate(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(3, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void vibrateCursor(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static CharSequence withLearnMore(CharSequence charSequence, final Runnable runnable) {
        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.LearnMoreArrow));
        spannableString.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.14
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
            }
        }, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return replaceArrows(spannableStringBuilder, true);
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i9, boolean z10) {
        return addLinks(spannable, i9, z10, true);
    }

    public static void applySpring(Animator animator, double d, double d9, double d10) {
        applySpring(animator, d, d9, d10, 0.0d);
    }

    public static int compare(long j10, long j11) {
        if (j10 == j11) {
            return 0;
        }
        return j10 > j11 ? 1 : -1;
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                outputStream.close();
                return true;
            }
            Thread.yield();
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean doSafe(final Utilities.Callback0Return<Boolean> callback0Return, int i9) {
        Future future;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                try {
                    future = newSingleThreadExecutor.submit(new Callable() { // from class: org.telegram.messenger.i
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Boolean lambda$doSafe$9;
                            lambda$doSafe$9 = AndroidUtilities.lambda$doSafe$9(Utilities.Callback0Return.this);
                            return lambda$doSafe$9;
                        }
                    });
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
                try {
                    return ((Boolean) future.get(i9, TimeUnit.MILLISECONDS)).booleanValue();
                } catch (TimeoutException unused) {
                    if (future != null) {
                        future.cancel(true);
                    }
                    return false;
                }
            } finally {
                newSingleThreadExecutor.shutdownNow();
            }
        } catch (TimeoutException unused2) {
            future = null;
        }
    }

    public static void drawNavigationBarProtection(Canvas canvas, View view, int i9, int i10, float f10) {
        Paint paint = navbarProtactionPaint;
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(getNavigationBarThirdButtonsFactor(0.0f, 0.75f, i10) * f10, i9));
        canvas.drawRect(0.0f, (view.getY() + view.getMeasuredHeight()) - i10, view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight(), paint);
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f10, float f11) {
        if (f11 <= 0.0f) {
            return;
        }
        float min = Math.min(f10, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float dpf2 = dpf2(1.0f);
        float f12 = dpf2 / 2.0f;
        float max = Math.max(0.0f, min - dpf2);
        Paint paint = strokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(dpf2);
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(f11, 570425343));
        canvas.save();
        float f13 = rectF.left - f12;
        float f14 = rectF.top;
        if (canvas.clipRect(f13, f14, rectF.right + f12, g7.n.a(f14 + max, f14, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f12, rectF.right, f12 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float dpf22 = dpf2(0.6666667f);
        float f15 = dpf22 / 2.0f;
        float max2 = Math.max(0.0f, min - dpf22);
        Paint paint2 = strokeBottom;
        paint2.setStyle(style);
        paint2.setStrokeWidth(dpf22);
        paint2.setColor(org.telegram.ui.ActionBar.f6.l1(f11, 385875967));
        canvas.save();
        float f16 = rectF.left - f15;
        float f17 = rectF.bottom;
        if (canvas.clipRect(f16, g7.n.a(f17 - max2, rectF.top, f17), rectF.right + f15, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f15, rectF.right, rectF.bottom - f15, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static boolean findClickableView(ViewGroup viewGroup, float f10, float f11, View view) {
        int i9;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i10 = 0;
        while (i10 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof ih.i4) || childAt == view)) {
                if (childAt instanceof ih.o8) {
                    ih.q8 q8Var = (ih.q8) viewGroup;
                    if (q8Var.b == null || (f10 >= dp(60.0f) && f10 <= viewGroup.getWidth() - dp(60.0f))) {
                        int i11 = 0;
                        while (i11 < q8Var.getChildCount()) {
                            View childAt2 = q8Var.getChildAt(i11);
                            if (childAt2 instanceof ih.t8) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d = f10 - translationX;
                                i9 = i10;
                                double d9 = f11 - translationY;
                                float cos = (float) ((Math.cos(radians) * d) - (Math.sin(radians) * d9));
                                float b10 = (float) j3.r0.b(radians, d9, Math.sin(radians) * d);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && b10 >= (-measuredHeight) / 2.0f && b10 <= measuredHeight / 2.0f) {
                                    rect = rectTmp2;
                                    childAt.getHitRect(rect);
                                    if (!rect.contains((int) f10, (int) f11) && childAt.isClickable()) {
                                        return true;
                                    }
                                    if ((childAt instanceof ViewGroup) && findClickableView((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), view)) {
                                        return true;
                                    }
                                    i10 = i9 + 1;
                                }
                            } else {
                                i9 = i10;
                            }
                            i11++;
                            i10 = i9;
                        }
                    }
                }
                i9 = i10;
                rect = rectTmp2;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i10 = i9 + 1;
            }
            i9 = i10;
            i10 = i9 + 1;
        }
        return false;
    }

    public static String formatDuration(int i9, boolean z10, boolean z11) {
        int i10 = i9 / 3600;
        int i11 = (i9 / 60) % 60;
        int i12 = i9 % 60;
        return i10 == 0 ? z10 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : z11 ? String.format(Locale.US, "%d:%02d", Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String formatFileSize(long j10, boolean z10, boolean z11) {
        if (j10 == 0) {
            return String.format("%d KB", 0);
        }
        if (j10 < 1024) {
            return String.format("%d B", Long.valueOf(j10));
        }
        if (j10 < 1048576) {
            float f10 = j10 / 1024.0f;
            if (z10) {
                int i9 = (int) f10;
                if ((f10 - i9) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i9));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f10));
        }
        if (j10 < 1048576000) {
            float f11 = (j10 / 1024.0f) / 1024.0f;
            if (z10) {
                int i10 = (int) f11;
                if ((f11 - i10) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f11));
        }
        float f12 = ((int) ((j10 / 1024) / 1024)) / 1000.0f;
        if (z10) {
            int i11 = (int) f12;
            if ((f12 - i11) * 10.0f == 0.0f) {
                return String.format("%d GB", Integer.valueOf(i11));
            }
        }
        return z11 ? String.format("%.1f GB", Float.valueOf(f12)) : String.format("%.2f GB", Float.valueOf(f12));
    }

    public static String formatLongDuration(int i9, int i10) {
        return formatDuration(i9, i10, true);
    }

    public static String formatShortDuration(int i9, int i10) {
        return formatDuration(i9, i10, false);
    }

    public static File generatePicturePath(boolean z10, String str) {
        try {
            File directory = FileLoader.getDirectory(100);
            if (!z10 && directory != null) {
                return new File(directory, generateFileName(0, str));
            }
            return new File(ApplicationLoader.applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES), generateFileName(0, str));
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static File generateVideoPath(boolean z10) {
        try {
            File albumDir = getAlbumDir(z10);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) + 1);
            if (generatingVideoPathFormat == null) {
                generatingVideoPathFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            return new File(albumDir, "VID_" + generatingVideoPathFormat.format(date) + ".mp4");
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Activity getActivity(Context context) {
        Activity findActivity = findActivity(context);
        if (findActivity == null || findActivity.isFinishing()) {
            findActivity = LaunchActivity.C1;
        }
        return (findActivity == null || findActivity.isFinishing()) ? findActivity(ApplicationLoader.applicationContext) : findActivity;
    }

    public static String getHostAuthority(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        Matcher matcher = getURIParsePattern().matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        if (group != null) {
            group = group.toLowerCase();
        }
        return (z10 && group != null && group.startsWith("www.")) ? group.substring(4) : group;
    }

    public static float getNavigationBarThirdButtonsFactor(float f10, float f11, int i9) {
        return lerp(f10, f11, getNavigationBarThirdButtonsFactor(i9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r5 > 0.0f) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getPatternColor(int i9, boolean z10) {
        float[] RGBtoHSB = RGBtoHSB(Color.red(i9), Color.green(i9), Color.blue(i9));
        float f10 = RGBtoHSB[1];
        if (f10 <= 0.0f) {
            float f11 = RGBtoHSB[2];
            if (f11 < 1.0f) {
            }
            if (!z10) {
                float f12 = RGBtoHSB[2];
                if (f12 <= 0.5f) {
                    RGBtoHSB[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (f12 * 0.65f)));
                    return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) & (z10 ? -1711276033 : 1728053247);
                }
            }
            RGBtoHSB[2] = Math.max(0.0f, RGBtoHSB[2] * 0.65f);
            return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) & (z10 ? -1711276033 : 1728053247);
        }
        RGBtoHSB[1] = Math.min(1.0f, ((1.0f - f10) * 0.1f) + (z10 ? 0.15f : 0.05f) + f10);
        if (!z10) {
        }
        RGBtoHSB[2] = Math.max(0.0f, RGBtoHSB[2] * 0.65f);
        return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) & (z10 ? -1711276033 : 1728053247);
    }

    public static int getPhotoSize(boolean z10) {
        if (z10) {
            if (highQualityPhotoSize == null) {
                highQualityPhotoSize = 2560;
            }
            return highQualityPhotoSize.intValue();
        }
        if (photoSize == null) {
            photoSize = 1280;
        }
        return photoSize.intValue();
    }

    public static float ilerp(int i9, int i10, int i11) {
        return (i9 - i10) / (i11 - i10);
    }

    public static boolean intersect1d(float f10, float f11, float f12, float f13) {
        return Math.max(f10, f11) > Math.min(f12, f13) && Math.max(f12, f13) > Math.min(f10, f11);
    }

    public static boolean isInternalUri(int i9) {
        return isInternalUri(null, i9);
    }

    public static int lerp(int i9, int i10, float f10) {
        return (int) ((f10 * (i10 - i9)) + i9);
    }

    public static Bitmap makeBlurBitmap(View view, float f10, int i9) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f10);
        int height = (int) (view.getHeight() / f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i9, Math.max(width, height) / 180));
        return createBitmap;
    }

    public static void makeGlobalBlurBitmap(Utilities.Callback<Bitmap> callback, float f10, int i9, View view, List<View> list) {
        int width;
        int height;
        if (callback == null) {
            return;
        }
        List<View> allGlobalViews = allGlobalViews();
        if (allGlobalViews == null) {
            callback.run(null);
            return;
        }
        makingGlobalBlurBitmap = true;
        try {
            try {
                if (view == null) {
                    width = (int) (r7.x / f10);
                    height = displaySize.y + statusBarHeight + navigationBarHeight;
                } else {
                    width = (int) (view.getWidth() / f10);
                    height = view.getHeight();
                }
                int i10 = (int) (height / f10);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(width, i10, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    canvas.translate((-iArr[0]) / f10, (-iArr[1]) / f10);
                }
                float f11 = 1.0f / f10;
                canvas.scale(f11, f11);
                canvas.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                for (int i11 = 0; i11 < allGlobalViews.size(); i11++) {
                    View view2 = allGlobalViews.get(i11);
                    if (!(view2 instanceof ff0) && (list == null || !list.contains(view2))) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(i0.a.k(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view2.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f10, iArr[1] / f10);
                        try {
                            view2.draw(canvas);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i9, Math.max(width, i10) / 180));
                callback.run(createBitmap);
            } catch (Throwable th) {
                makingGlobalBlurBitmap = false;
                throw th;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            callback.run(null);
        }
        makingGlobalBlurBitmap = false;
    }

    public static boolean needShowPasscode(boolean z10) {
        boolean isWasInBackground = r00.getInstance().isWasInBackground(z10);
        if (z10) {
            r00.getInstance().resetBackgroundVar();
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (BuildVars.LOGS_ENABLED && z10 && SharedConfig.passcodeHash.length() > 0) {
            FileLog.d("wasInBackground = " + isWasInBackground + " appLocked = " + SharedConfig.appLocked + " autoLockIn = " + SharedConfig.autoLockIn + " lastPauseTime = " + SharedConfig.lastPauseTime + " uptime = " + elapsedRealtime);
        }
        if (SharedConfig.passcodeHash.length() <= 0 || !isWasInBackground) {
            return false;
        }
        if (SharedConfig.appLocked) {
            return true;
        }
        return !(SharedConfig.autoLockIn == 0 || SharedConfig.lastPauseTime == 0 || SharedConfig.appLocked || SharedConfig.lastPauseTime + SharedConfig.autoLockIn > elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime;
    }

    public static String readRes(File file) {
        return readRes(file, 0);
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10, float f10, float f11) {
        return replaceArrows(charSequence, z10, f10, f11, 1.0f);
    }

    public static SpannableStringBuilder replaceLinks(String str, final org.telegram.ui.ActionBar.b6 b6Var, final Runnable runnable) {
        if (linksPattern == null) {
            linksPattern = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = linksPattern.matcher(str);
        int i9 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i9, matcher.start());
            String group = matcher.group(1);
            final String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.11
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    ve.e.s(ApplicationLoader.applicationContext, group2);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
                    textPaint.setUnderlineText(false);
                }
            }, spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i9 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i9, str.length());
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleLink(String str, final int i9, final Runnable runnable) {
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
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.6
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(i9);
                    }
                }, indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.AndroidUtilities.7
                @Override // android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(i9);
                }
            }, indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleLinkBold(String str, final int i9, final Runnable runnable) {
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
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.8
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        textPaint.setTypeface(AndroidUtilities.bold());
                        textPaint.setColor(i9);
                    }
                }, indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.AndroidUtilities.9
                @Override // android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setTypeface(AndroidUtilities.bold());
                    textPaint.setColor(i9);
                }
            }, indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleTag(String str, int i9, int i10, Runnable runnable) {
        return replaceSingleTag(str, i9, i10, runnable, null);
    }

    public static SpannableStringBuilder replaceTags(String str, int i9, Object... objArr) {
        try {
            StringBuilder sb2 = new StringBuilder(str);
            if ((i9 & 1) != 0) {
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
            }
            ArrayList arrayList = new ArrayList();
            if ((i9 & 2) != 0) {
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
            }
            if ((i9 & 8) != 0) {
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
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder.setSpan(new i41(bold()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e10) {
            FileLog.e(e10);
            return new SpannableStringBuilder(str);
        }
    }

    public static void requestAdjustResize(Window window, int i9) {
        if (window == null || isTablet()) {
            return;
        }
        window.setSoftInputMode(16);
        adjustOwnerClassGuid = i9;
    }

    public static double[] rgbToHsv(int i9, int i10, int i11) {
        double d;
        double d9;
        double d10;
        double d11 = i9 / 255.0d;
        double d12 = i10 / 255.0d;
        double d13 = i11 / 255.0d;
        double max = (d11 <= d12 || d11 <= d13) ? Math.max(d12, d13) : d11;
        double min = (d11 >= d12 || d11 >= d13) ? Math.min(d12, d13) : d11;
        double d14 = max - min;
        double d15 = 0.0d;
        double d16 = max == 0.0d ? 0.0d : d14 / max;
        if (max != min) {
            if (d11 > d12 && d11 > d13) {
                d = (d12 - d13) / d14;
                d9 = d12 < d13 ? 6 : 0;
            } else if (d12 > d13) {
                d10 = 2.0d + ((d13 - d11) / d14);
                d15 = d10 / 6.0d;
            } else {
                d = (d11 - d12) / d14;
                d9 = 4.0d;
            }
            d10 = d + d9;
            d15 = d10 / 6.0d;
        }
        return new double[]{d15, d16, max};
    }

    public static void runOnUIThread(Runnable runnable, long j10) {
        if (ApplicationLoader.applicationHandler == null) {
            return;
        }
        if (j10 == 0) {
            ApplicationLoader.applicationHandler.post(runnable);
        } else {
            ApplicationLoader.applicationHandler.postDelayed(runnable, j10);
        }
    }

    public static void scaleRect(RectF rectF, float f10, float f11, float f12) {
        float f13 = f11 - rectF.left;
        float f14 = rectF.right - f11;
        rectF.set(f11 - (f13 * f10), f12 - ((f12 - rectF.top) * f10), (f14 * f10) + f11, ((rectF.bottom - f12) * f10) + f12);
    }

    public static void setLightNavigationBar(Activity activity, boolean z10) {
        if (activity != null) {
            setLightNavigationBar(activity.getWindow(), z10);
        }
    }

    public static void setLightStatusBar(Dialog dialog, boolean z10) {
        if (dialog != null) {
            setLightStatusBar(dialog.getWindow(), z10);
        }
    }

    public static void setNavigationBarColor(Dialog dialog, int i9, boolean z10) {
        setNavigationBarColor(dialog, i9, z10, (IntColorCallback) null);
    }

    public static void setPreferredMaxRefreshRate(Window window, float f10) {
        WindowManager windowManager;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f10;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void shakeViewSpring(View view, float f10) {
        shakeViewSpring(view, f10, null);
    }

    public static void updateViewShow(View view, boolean z10, boolean z11, boolean z12) {
        updateViewShow(view, z10, z11, 0.0f, z12, null);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10, float f10, boolean z11) {
        updateViewVisibilityAnimated(view, z10, f10, true, z11);
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i9, boolean z10, boolean z11) {
        Spannable spannable2;
        if (spannable == null || containsUnsupportedCharacters(spannable.toString()) || i9 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            URLSpan uRLSpan = uRLSpanArr[length];
            if (!(uRLSpan instanceof r41) || z11) {
                spannable.removeSpan(uRLSpan);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!z10 && (i9 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        if ((i9 & 1) != 0) {
            spannable2 = spannable;
            gatherLinks(arrayList, spannable2, LinkifyPort.WEB_URL, new String[]{"http://", "https://", "tg://", "tonsite://"}, sUrlMatchFilter, z10);
        } else {
            spannable2 = spannable;
        }
        pruneOverlaps(arrayList);
        if (arrayList.size() == 0) {
            return false;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LinkSpec linkSpec = (LinkSpec) arrayList.get(i10);
            URLSpan[] uRLSpanArr2 = (URLSpan[]) spannable2.getSpans(linkSpec.start, linkSpec.end, URLSpan.class);
            if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                for (URLSpan uRLSpan2 : uRLSpanArr2) {
                    spannable2.removeSpan(uRLSpan2);
                    if (!(uRLSpan2 instanceof r41) || z11) {
                        spannable2.removeSpan(uRLSpan2);
                    }
                }
            }
            String str = linkSpec.url;
            if (str != null) {
                str = str.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
            }
            if (!ve.e.j(str)) {
                spannable2.setSpan(new URLSpan(str), linkSpec.start, linkSpec.end, 33);
            }
        }
        return true;
    }

    public static void addMediaToGallery(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            ApplicationLoader.applicationContext.sendBroadcast(intent);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void applySpring(Animator animator, double d, double d9, double d10, double d11) {
        double d12;
        double d13;
        final double sqrt = Math.sqrt(d / d10);
        final double sqrt2 = d9 / (Math.sqrt(d * d10) * 2.0d);
        if (sqrt2 < 1.0d) {
            d13 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d12 = ((sqrt2 * sqrt) + (-d11)) / d13;
        } else {
            d12 = (-d11) + sqrt;
            d13 = 0.0d;
        }
        final double d14 = d13;
        final double d15 = d12;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-sqrt2) * sqrt)) * 1000.0d));
        final double d16 = 1.0d;
        animator.setInterpolator(new Interpolator() { // from class: org.telegram.messenger.AndroidUtilities.15
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                double exp;
                double d17 = sqrt2;
                if (d17 < 1.0d) {
                    double d18 = f10;
                    exp = 1.0d - (((Math.sin(d14 * d18) * d15) + (Math.cos(d14 * d18) * d16)) * Math.exp(((-f10) * d17) * sqrt));
                } else {
                    exp = 1.0d - (Math.exp((-f10) * sqrt) * ((d15 * f10) + d16));
                }
                return (float) exp;
            }
        });
    }

    private static boolean isInternalUri(Uri uri, int i9) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
                return false;
            }
            int i10 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlink = Utilities.readlink(str);
                    if (readlink != null && !readlink.equals(str)) {
                        i10++;
                        if (i10 >= 10) {
                            return true;
                        }
                        str = readlink;
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
            return true;
        }
        str = "";
        int i11 = 0;
        while (str.length() <= 4096) {
            try {
                String readlinkFd = Utilities.readlinkFd(i9);
                if (readlinkFd != null && !readlinkFd.equals(str)) {
                    i11++;
                    if (i11 >= 10) {
                        return true;
                    }
                    str = readlinkFd;
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
        return str.toLowerCase().contains("/data/data/" + ApplicationLoader.applicationContext.getPackageName());
    }

    public static float lerp(float f10, float f11, float f12) {
        return e2.c.z(f11, f10, f12, f10);
    }

    public static String readRes(File file, int i9) {
        InputStream inputStream;
        byte[] bArr = readBufferLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            readBufferLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = ApplicationLoader.applicationContext.getResources().openRawResource(i9);
            }
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            byte[] bArr2 = bufferLocal.get();
            if (bArr2 == null) {
                bArr2 = new byte[4096];
                bufferLocal.set(bArr2);
            }
            int i10 = 0;
            while (true) {
                int read = inputStream.read(bArr2, 0, bArr2.length);
                if (read >= 0) {
                    int i11 = i10 + read;
                    if (bArr.length < i11) {
                        byte[] bArr3 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr3, 0, i10);
                        readBufferLocal.set(bArr3);
                        bArr = bArr3;
                    }
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i10, read);
                        i10 = i11;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            inputStream.close();
            return new String(bArr, 0, i10);
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

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10, float f10, float f11, float f12) {
        return replaceArrows(charSequence, z10, f10, f11, f12, R.drawable.msg_mini_forumarrow);
    }

    public static SpannableStringBuilder replaceSingleTag(String str, final int i9, final int i10, final Runnable runnable, final org.telegram.ui.ActionBar.b6 b6Var) {
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
                spannableStringBuilder.replace(indexOf, i13, replaceMultipleCharSequence(" ", spannableStringBuilder.subSequence(indexOf, i13), " "));
            }
            if (i10 != 0 && i10 != 3 && i10 != 2 && i10 != 4) {
                spannableStringBuilder.setSpan(new CharacterStyle() { // from class: org.telegram.messenger.AndroidUtilities.2
                    @Override // android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                        int alpha = textPaint.getAlpha();
                        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, org.telegram.ui.ActionBar.b6.this));
                        textPaint.setAlpha(alpha);
                    }
                }, indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.messenger.AndroidUtilities.1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(i10 == 4);
                    int i14 = i9;
                    if (i14 >= 0) {
                        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
                    }
                    if (i10 == 2) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                    }
                }
            }, indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    private static void setLightNavigationBar(Window window, boolean z10) {
        if (window != null) {
            setLightNavigationBar(window.getDecorView(), z10);
        }
    }

    public static void setLightStatusBar(Window window, boolean z10) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            changeSetSystemUiVisibility(window.getDecorView(), 8192, z10);
            if (i9 >= 35 || window.getStatusBarColor() == 0) {
                return;
            }
            window.setStatusBarColor(0);
        }
    }

    public static void setNavigationBarColor(Dialog dialog, int i9, boolean z10, IntColorCallback intColorCallback) {
        if (dialog != null) {
            setNavigationBarColor(dialog.getWindow(), i9, z10, intColorCallback);
        }
    }

    public static void shakeViewSpring(View view, Runnable runnable) {
        shakeViewSpring(view, 10.0f, runnable);
    }

    public static void updateViewShow(View view, boolean z10, boolean z11, boolean z12, Runnable runnable) {
        updateViewShow(view, z10, z11, 0.0f, z12, runnable);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10, float f10, boolean z11, boolean z12) {
        updateViewVisibilityAnimated(view, z10, f10, z11, 1.0f, z12, null);
    }

    public static SpannableStringBuilder formatSpannable(CharSequence charSequence, GenericProvider<Integer, String> genericProvider, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i9 = 0; i9 < charSequenceArr.length; i9++) {
            String provide = genericProvider.provide(Integer.valueOf(i9));
            int indexOf = charSequence2.indexOf(provide);
            if (indexOf != -1) {
                valueOf.replace(indexOf, provide.length() + indexOf, charSequenceArr[i9]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i9].toString() + charSequence2.substring(provide.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static CharSequence highlightText(CharSequence charSequence, String str, org.telegram.ui.ActionBar.b6 b6Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        int indexOf = lowerCase.indexOf(str);
        while (indexOf >= 0) {
            try {
                valueOf.setSpan(new p00(org.telegram.ui.ActionBar.f6.q6, b6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            indexOf = lowerCase.indexOf(str, indexOf + 1);
        }
        return valueOf;
    }

    public static float lerp(float f10, float f11, float f12, float f13) {
        return lerp(f10, f11, f12, 0.5f, f13);
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10, float f10, float f11, float f12, int i9) {
        eq eqVar = new eq(i9, 0);
        float f13 = f12 * 0.88f;
        eqVar.setScale(f13, f13);
        eqVar.translate(-f10, f11);
        eqVar.spaceScaleX = 0.8f;
        if (z10) {
            eqVar.useLinkPaintColor = z10;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
        CharSequence replaceMultipleCharSequence = replaceMultipleCharSequence(" >", charSequence, spannableString);
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(eqVar, 0, 1, 33);
        CharSequence replaceMultipleCharSequence2 = replaceMultipleCharSequence(">", replaceMultipleCharSequence, spannableString2);
        eq eqVar2 = new eq(i9, 0);
        eqVar2.setScale(f13, f13);
        eqVar2.translate(f10, f11);
        eqVar2.rotate(180.0f);
        eqVar2.spaceScaleX = 0.8f;
        if (z10) {
            eqVar2.useLinkPaintColor = z10;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(eqVar2, 0, 1, 33);
        return replaceMultipleCharSequence("<", replaceMultipleCharSequence2, spannableString3);
    }

    public static void setLightNavigationBar(View view, boolean z10) {
        if (view == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        changeSetSystemUiVisibility(view, 16, z10);
    }

    @Deprecated
    public static void setNavigationBarColor(Activity activity, int i9) {
        setNavigationBarColor(activity, i9, true);
    }

    public static void shakeViewSpring(View view, float f10, Runnable runnable) {
        if (view == null) {
            return;
        }
        int dp = dp(f10);
        if (view.getTag(R.id.spring_tag) != null) {
            ((o1.j) view.getTag(R.id.spring_tag)).c();
        }
        Float f11 = (Float) view.getTag(R.id.spring_was_translation_x_tag);
        if (f11 != null) {
            view.setTranslationX(f11.floatValue());
        }
        view.setTag(R.id.spring_was_translation_x_tag, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        o1.j jVar = new o1.j(view, o1.h.m, translationX);
        o1.k kVar = new o1.k(translationX);
        kVar.b(600.0f);
        jVar.u = kVar;
        jVar.a = (-dp) * 100;
        jVar.a(new kh.s3(view, translationX, runnable));
        view.setTag(R.id.spring_tag, jVar);
        jVar.f();
    }

    public static void updateImageViewImageAnimated(final ImageView imageView, final Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AndroidUtilities.lambda$updateImageViewImageAnimated$25(imageView, atomicBoolean, drawable, valueAnimator);
            }
        });
        duration.start();
    }

    public static void updateViewShow(View view, boolean z10, boolean z11, float f10, boolean z12, Runnable runnable) {
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            z12 = false;
        }
        view.animate().setListener(null).cancel();
        if (!z12) {
            view.setVisibility(z10 ? 0 : 8);
            view.setTag(z10 ? 1 : null);
            view.setAlpha(1.0f);
            view.setScaleX((!z11 || z10) ? 1.0f : 0.5f);
            view.setScaleY((!z11 || z10) ? 1.0f : 0.5f);
            if (f10 != 0.0f) {
                view.setTranslationY(z10 ? 0.0f : dp(-16.0f) * f10);
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (z10) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(z11 ? 0.5f : 1.0f);
                view.setScaleY(z11 ? 0.5f : 1.0f);
                if (f10 != 0.0f) {
                    view.setTranslationY(dp(-16.0f) * f10);
                }
            }
            ViewPropertyAnimator withEndAction = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(gr.h).setDuration(340L).withEndAction(runnable);
            if (f10 != 0.0f) {
                withEndAction.translationY(0.0f);
            }
            withEndAction.start();
            return;
        }
        ViewPropertyAnimator withEndAction2 = view.animate().alpha(0.0f).scaleY(z11 ? 0.5f : 1.0f).scaleX(z11 ? 0.5f : 1.0f).setListener(new org.telegram.ui.Components.u9(view)).setInterpolator(gr.h).setDuration(340L).withEndAction(runnable);
        if (f10 != 0.0f) {
            withEndAction2.translationY(dp(-16.0f) * f10);
        }
        withEndAction2.start();
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10, float f10, boolean z11, float f11, boolean z12, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
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
            view.setAlpha(f11);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (z10 && view.getTag() == null) {
            view.animate().setListener(null).cancel();
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(f10);
                view.setScaleY(f10);
            }
            view.animate().alpha(f11).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
            view.setTag(r0);
            return;
        }
        if (z10 || view.getTag() == null) {
            return;
        }
        view.animate().setListener(null).cancel();
        view.animate().alpha(0.0f).scaleY(f10).scaleX(f10).setListener(new org.telegram.ui.Components.u9(view, z11)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
        view.setTag(null);
    }

    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2, 0);
    }

    public static Pair<Integer, Integer> getImageOrientation(File file) {
        try {
            return getImageOrientation(new r1.g(file));
        } catch (Exception e10) {
            FileLog.e(e10);
            return new Pair<>(0, 0);
        }
    }

    public static float lerp(float f10, float f11, float f12, float f13, float f14) {
        if (f14 < f13) {
            return lerp(f10, f11, f14 / f13);
        }
        return lerp(f11, f12, (f14 - f13) / (1.0f - f13));
    }

    public static void normalizeTimePart(StringBuilder sb2, long j10) {
        if (j10 < 10) {
            sb2.append("0");
            sb2.append(j10);
        } else {
            sb2.append(j10);
        }
    }

    @Deprecated
    public static void setNavigationBarColor(Activity activity, int i9, boolean z10) {
        if (activity != null) {
            setNavigationBarColor(activity.getWindow(), i9, z10, (IntColorCallback) null);
        }
    }

    public static boolean addToClipboard(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, r.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static void enableEdgeToEdge(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 35) {
            g0.f.t(window);
        } else if (i9 >= 30) {
            g0.f.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i9 >= 28) {
            int i10 = i9 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i10) {
                attributes.layoutInDisplayCutoutMode = i10;
                window.setAttributes(attributes);
            }
        }
        if (i9 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static void lerpCentered(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 == null) {
            return;
        }
        float lerp = lerp(rect.centerX(), rect2.centerX(), f10);
        float lerp2 = lerp(rect.centerY(), rect2.centerY(), f10);
        float lerp3 = lerp(rect.width(), rect2.width(), Math.min(1.0f, f10)) / 2.0f;
        float lerp4 = lerp(rect.height(), rect2.height(), Math.min(1.0f, f10)) / 2.0f;
        rect3.set((int) (lerp - lerp3), (int) (lerp2 - lerp4), (int) (lerp + lerp3), (int) (lerp2 + lerp4));
    }

    private static void setNavigationBarColor(final Window window, int i9, boolean z10, IntColorCallback intColorCallback) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap<Window, ValueAnimator> hashMap = navigationBarColorAnimators;
        if (hashMap != null && (valueAnimator = hashMap.get(window)) != null) {
            valueAnimator.cancel();
            navigationBarColorAnimators.remove(window);
        }
        if (!z10) {
            if (intColorCallback != null) {
                intColorCallback.run(i9);
            }
            try {
                window.setNavigationBarColor(i9);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i9);
        ofArgb.addUpdateListener(new oh(1, intColorCallback, window));
        ofArgb.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.AndroidUtilities.13
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (AndroidUtilities.navigationBarColorAnimators != null) {
                    AndroidUtilities.navigationBarColorAnimators.remove(window);
                }
            }
        });
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(gr.f);
        ofArgb.start();
        if (navigationBarColorAnimators == null) {
            navigationBarColorAnimators = new HashMap<>();
        }
        navigationBarColorAnimators.put(window, ofArgb);
    }

    public static int applyColorMatrix(int i9, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i9);
        int red = Color.red(i9);
        int green = Color.green(i9);
        float f10 = red;
        float f11 = green;
        float blue = Color.blue(i9);
        float f12 = alpha;
        float f13 = (array[3] * f12) + (array[2] * blue) + (array[1] * f11) + (array[0] * f10) + array[4];
        float f14 = (array[8] * f12) + (array[7] * blue) + (array[6] * f11) + (array[5] * f10) + array[9];
        float f15 = (array[13] * f12) + (array[12] * blue) + (array[11] * f11) + (array[10] * f10) + array[14];
        return Color.argb(g7.n.b(Math.round((array[18] * f12) + (array[17] * blue) + (array[16] * f11) + (array[15] * f10) + array[19]), 0, 255), g7.n.b(Math.round(f13), 0, 255), g7.n.b(Math.round(f14), 0, 255), g7.n.b(Math.round(f15), 0, 255));
    }

    public static boolean copyFile(File file, File file2) {
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
            FileLog.e(e10);
            return false;
        }
    }

    public static void forEachViews(RecyclerView recyclerView, d5.d dVar) {
        if (recyclerView == null) {
            return;
        }
        for (int i9 = 0; i9 < recyclerView.getChildCount(); i9++) {
            dVar.accept(recyclerView.getChildAt(i9));
        }
        for (int i10 = 0; i10 < recyclerView.getCachedChildCount(); i10++) {
            dVar.accept(recyclerView.P(i10));
        }
        for (int i11 = 0; i11 < recyclerView.getHiddenChildCount(); i11++) {
            dVar.accept(recyclerView.V(i11));
        }
        for (int i12 = 0; i12 < recyclerView.getAttachedScrapChildCount(); i12++) {
            dVar.accept(recyclerView.O(i12));
        }
    }

    public static float lerp(boolean z10, boolean z11, float f10) {
        return e2.c.z(z11 ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f, f10, z10 ? 1.0f : 0.0f);
    }

    public static void setPreferredMaxRefreshRate(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - screenMaxRefreshRate) > 0.2d) {
            layoutParams.preferredRefreshRate = screenMaxRefreshRate;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static void getBitmapFromSurface(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView == null || ApplicationLoader.applicationHandler == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        PixelCopy.request(surfaceView, bitmap, new j(runnable, 2), ApplicationLoader.applicationHandler);
    }

    public static String getHostAuthority(Uri uri) {
        if (uri == null) {
            return null;
        }
        return getHostAuthority(uri.toString());
    }

    public static float lerp(float[] fArr, float f10) {
        return lerp(fArr[0], fArr[1], f10);
    }

    public static SpannableStringBuilder makeClickable(CharSequence charSequence, Runnable runnable) {
        return makeClickable(charSequence, 0, runnable, null);
    }

    public static void setLightStatusBar(View view, boolean z10) {
        if (view == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        changeSetSystemUiVisibility(view, 8192, z10);
    }

    public static void applySpring(Animator animator, float f10, float f11, float f12, long j10) {
        final double sqrt = f11 / (Math.sqrt(f10 * f12) * 2.0d);
        final double sqrt2 = Math.sqrt(f10 / f12);
        animator.setDuration(j10);
        animator.setInterpolator(new Interpolator() { // from class: org.telegram.messenger.AndroidUtilities.16
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f13) {
                double d;
                double exp;
                double d9 = sqrt;
                if (d9 < 1.0d) {
                    double sqrt3 = Math.sqrt(1.0d - (d9 * d9)) * sqrt2;
                    double d10 = f13;
                    d = Math.exp((-sqrt) * sqrt2 * d10);
                    double d11 = d10 * sqrt3;
                    exp = (Math.sin(d11) * ((sqrt * sqrt2) / sqrt3)) + Math.cos(d11);
                } else {
                    double d12 = (-d9) * sqrt2 * f13;
                    d = d12 + 1.0d;
                    exp = Math.exp(d12);
                }
                return (float) (1.0d - (exp * d));
            }
        });
    }

    public static String getHostAuthority(Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        return getHostAuthority(uri.toString(), z10);
    }

    public static Pair<Integer, Integer> getImageOrientation(String str) {
        try {
            return getImageOrientation(new r1.g(str));
        } catch (Exception unused) {
            return new Pair<>(0, 0);
        }
    }

    public static void lerp(Rect rect, RectF rectF, float f10, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(lerp(rect.left, rectF.left, f10), lerp(rect.top, rectF.top, f10), lerp(rect.right, rectF.right, f10), lerp(rect.bottom, rectF.bottom, f10));
        }
    }

    public static String formatDuration(int i9, int i10, boolean z10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        int i14 = i9 / 3600;
        int i15 = (i9 / 60) % 60;
        int i16 = i9 % 60;
        return i10 == 0 ? i14 == 0 ? z10 ? String.format(Locale.US, "%02d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)) : (i14 == 0 && i11 == 0) ? z10 ? String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static void getBitmapFromSurface(Surface surface, Bitmap bitmap) {
        if (surface == null || !surface.isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surface, bitmap, new j(countDownLatch, 1), Utilities.searchQueue.getHandler());
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r0
      0x0025: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:8:0x001b, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r0
      0x001e: PHI (r0v9 int) = (r0v0 int), (r0v3 int), (r0v5 int), (r0v8 int) binds: [B:8:0x001b, B:15:0x002f, B:13:0x0027, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> getImageOrientation(r1.g gVar) {
        int e10;
        int i9 = 0;
        try {
            r1.c c10 = gVar.c("Orientation");
            if (c10 != null) {
                try {
                    e10 = c10.e(gVar.g);
                } catch (NumberFormatException unused) {
                }
                int i10 = 2;
                switch (e10) {
                    case 2:
                        i10 = 1;
                        break;
                    case 3:
                        i9 = 180;
                        i10 = 0;
                        break;
                    case 4:
                        break;
                    case 5:
                        i9 = 270;
                        break;
                    case 6:
                        i9 = 90;
                        i10 = 0;
                        break;
                    case 7:
                        i9 = 270;
                        i10 = 1;
                        break;
                    case 8:
                        i9 = 270;
                        i10 = 0;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i10));
            }
            e10 = 1;
            int i102 = 2;
            switch (e10) {
            }
            return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i102));
        } catch (Exception e11) {
            FileLog.e(e11);
            return new Pair<>(0, 0);
        }
    }

    public static void setScrollViewEdgeEffectColor(ScrollView scrollView, int i9) {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
                declaredField.setAccessible(true);
                EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
                if (edgeEffect != null) {
                    edgeEffect.setColor(i9);
                }
                Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
                declaredField2.setAccessible(true);
                EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
                if (edgeEffect2 != null) {
                    edgeEffect2.setColor(i9);
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        scrollView.setTopEdgeEffectColor(i9);
        scrollView.setBottomEdgeEffectColor(i9);
    }

    public static void lerp(RectF rectF, Rect rect, float f10, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(lerp(rectF.left, rect.left, f10), lerp(rectF.top, rect.top, f10), lerp(rectF.right, rect.right, f10), lerp(rectF.bottom, rect.bottom, f10));
        }
    }

    public static void lockOrientation(Activity activity, int i9) {
        if (activity == null || isTabletInternal()) {
            return;
        }
        try {
            prevOrientation = activity.getRequestedOrientation();
            activity.setRequestedOrientation(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void lerp(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(lerp(rectF.left, rectF2.left, f10), lerp(rectF.top, rectF2.top, f10), lerp(rectF.right, rectF2.right, f10), lerp(rectF.bottom, rectF2.bottom, f10));
        }
    }

    public static boolean openForView(MessageObject messageObject, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        String str = messageObject.messageOwner.attachPath;
        File file = (str == null || str.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
        }
        File file2 = file;
        int i9 = messageObject.type;
        return openForView(file2, messageObject.getFileName(), (i9 == 9 || i9 == 0) ? messageObject.getMimeType() : null, activity, b6Var, z10);
    }

    public static void lerp(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 != null) {
            rect3.set(lerp(rect.left, rect2.left, f10), lerp(rect.top, rect2.top, f10), lerp(rect.right, rect2.right, f10), lerp(rect.bottom, rect2.bottom, f10));
        }
    }

    public static boolean openForView(TLRPC.Document document, boolean z10, Activity activity) {
        return openForView(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), FileLoader.getAttachFileName(document), document.mime_type, activity, null, false);
    }

    public static void dumpCanvas(View view) {
    }

    public static void printStackTrace(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r1.length() != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean openForView(TLObject tLObject, Activity activity) {
        if (tLObject != null && activity != null) {
            String attachFileName = FileLoader.getAttachFileName(tLObject);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLObject, true);
            if (pathToAttach != null && pathToAttach.exists()) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                int lastIndexOf = attachFileName.lastIndexOf(46);
                String str = null;
                if (lastIndexOf != -1) {
                    String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(attachFileName.substring(lastIndexOf + 1).toLowerCase());
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
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), str != null ? str : "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), str != null ? str : "text/plain");
                }
                if (str != null) {
                    try {
                        activity.startActivityForResult(intent, 500);
                    } catch (Exception unused) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "text/plain");
                        } else {
                            intent.setDataAndType(Uri.fromFile(pathToAttach), "text/plain");
                        }
                        activity.startActivityForResult(intent, 500);
                    }
                } else {
                    activity.startActivityForResult(intent, 500);
                }
                return true;
            }
        }
        return false;
    }

    public static void lerp(int[] iArr, int[] iArr2, float f10, int[] iArr3) {
        if (iArr3 == null) {
            return;
        }
        int i9 = 0;
        while (i9 < iArr3.length) {
            iArr3[i9] = lerp((iArr == null || i9 >= iArr.length) ? 0 : iArr[i9], (iArr2 == null || i9 >= iArr2.length) ? 0 : iArr2[i9], f10);
            i9++;
        }
    }

    public static CharSequence replaceTags(CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return replaceTags((SpannableStringBuilder) charSequence);
        }
        return replaceTags(new SpannableStringBuilder(charSequence));
    }

    public static SpannableStringBuilder replaceTags(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int charSequenceIndexOf = charSequenceIndexOf(spannableStringBuilder, "**");
                if (charSequenceIndexOf == -1) {
                    break;
                }
                spannableStringBuilder.replace(charSequenceIndexOf, charSequenceIndexOf + 2, "");
                int charSequenceIndexOf2 = charSequenceIndexOf(spannableStringBuilder, "**");
                if (charSequenceIndexOf2 >= 0) {
                    spannableStringBuilder.replace(charSequenceIndexOf2, charSequenceIndexOf2 + 2, "");
                    arrayList.add(Integer.valueOf(charSequenceIndexOf));
                    arrayList.add(Integer.valueOf(charSequenceIndexOf2));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i9 = 0; i9 < arrayList.size() / 2; i9++) {
                int i10 = i9 * 2;
                spannableStringBuilder2.setSpan(new i41(bold()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e10) {
            FileLog.e(e10);
            return spannableStringBuilder;
        }
    }

    public static void lerp(float[] fArr, float[] fArr2, float f10, float[] fArr3) {
        if (fArr3 == null) {
            return;
        }
        int i9 = 0;
        while (i9 < fArr3.length) {
            float f11 = 0.0f;
            float f12 = (fArr == null || i9 >= fArr.length) ? 0.0f : fArr[i9];
            if (fArr2 != null && i9 < fArr2.length) {
                f11 = fArr2[i9];
            }
            fArr3[i9] = lerp(f12, f11, f10);
            i9++;
        }
    }

    public static void fillStatusBarHeight(Context context, boolean z10) {
    }

    public static void lerp(Matrix matrix, Matrix matrix2, float f10, Matrix matrix3) {
        if (matrix == null || matrix2 == null) {
            return;
        }
        float[] fArr = tempFloats;
        matrix.getValues(fArr);
        float[] fArr2 = tempFloats2;
        matrix2.getValues(fArr2);
        lerp(fArr, fArr2, f10, fArr2);
        matrix3.setValues(fArr2);
    }
}
