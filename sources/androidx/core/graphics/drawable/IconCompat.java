package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import d1.f;
import f2.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i7 = bundle.getInt(TeXSymbolParser.TYPE_ATTR);
        IconCompat iconCompat = new IconCompat(i7);
        iconCompat.e = bundle.getInt("int1");
        iconCompat.f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i7) {
            case -1:
            case 1:
            case 5:
                iconCompat.b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i7);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z9) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z9) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Context context, int i7) {
        context.getClass();
        return e(context.getResources(), context.getPackageName(), i7);
    }

    public static IconCompat e(Resources resources, String str, int i7) {
        str.getClass();
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i7;
        if (resources != null) {
            try {
                iconCompat.b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final Bitmap f() {
        int i7 = this.a;
        if (i7 == -1) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.b;
        }
        if (i7 == 5) {
            return b((Bitmap) this.b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public final int g() {
        int i7 = this.a;
        if (i7 != -1) {
            if (i7 == 2) {
                return this.e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.b;
        if (i10 >= 28) {
            return f.i(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final String h() {
        int i7 = this.a;
        if (i7 != -1) {
            if (i7 == 2) {
                String str = this.j;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.b).split(":", -1)[0] : this.j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.b;
        if (i10 >= 28) {
            return f.j(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    public final int i() {
        int i7 = this.a;
        if (i7 != -1) {
            return i7;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.b;
        if (i10 >= 28) {
            return f.q(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public final Uri j() {
        int i7 = this.a;
        if (i7 != -1) {
            if (i7 == 4 || i7 == 6) {
                return Uri.parse((String) this.b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.b;
        if (i10 >= 28) {
            return f.r(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final InputStream k(Context context) {
        Uri j3 = j();
        String scheme = j3.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(j3);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + j3, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + j3, e11);
            return null;
        }
    }

    public final Bundle l() {
        Bundle bundle = new Bundle();
        switch (this.a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.b);
                break;
        }
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, this.a);
        bundle.putInt("int1", this.e);
        bundle.putInt("int2", this.f);
        bundle.putString("string1", this.j);
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final Icon m(Context context) {
        Icon createWithBitmap;
        int i7 = Build.VERSION.SDK_INT;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(h(), this.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.b, this.e, this.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                if (i7 < 26) {
                    createWithBitmap = Icon.createWithBitmap(b((Bitmap) this.b, false));
                    break;
                } else {
                    createWithBitmap = i.b((Bitmap) this.b);
                    break;
                }
            case 6:
                if (i7 >= 30) {
                    createWithBitmap = g0.f.d(j());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + j());
                    }
                    InputStream k10 = k(context);
                    if (k10 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + j());
                    }
                    if (i7 < 26) {
                        createWithBitmap = Icon.createWithBitmap(b(BitmapFactory.decodeStream(k10), false));
                        break;
                    } else {
                        createWithBitmap = i.b(BitmapFactory.decodeStream(k10));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(g())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.e);
                if (this.f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.b);
                break;
        }
        if (this.g != null) {
            sb2.append(" tint=");
            sb2.append(this.g);
        }
        if (this.h != k) {
            sb2.append(" mode=");
            sb2.append(this.h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i7) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = i7;
    }
}
