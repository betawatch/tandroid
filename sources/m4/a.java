package m4;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import i9.e2;
import j3.f;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import nh.n3;
import o3.k;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ur;
import sg.g;
import v2.e;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements f, e, GenericProvider, Utilities.Callback2Return, b2, kv0, g, yk0, yu0, zu0, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 i(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    public Constructor a() {
        switch (this.a) {
            case 7:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(null);
        }
    }

    @Override // v2.e
    public Object apply(Object obj) {
        m9.a.b.getClass();
        return j9.a.a.y((e2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // org.telegram.ui.Components.zu0
    public void b(Object obj, float f9) {
        ur urVar = (ur) obj;
        switch (this.a) {
            case 21:
                urVar.b = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    break;
                }
                break;
            case 22:
            case 24:
            default:
                urVar.e = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    break;
                }
                break;
            case 23:
                urVar.c = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    break;
                }
                break;
            case 25:
                urVar.d = f9;
                if (urVar.getParent() != null) {
                    ((View) urVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        long j10 = bundle.getLong(b.r);
        int i10 = bundle.getInt(b.s);
        int i11 = bundle.getInt(b.B);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.v);
        int[] intArray = bundle.getIntArray(b.w);
        long[] longArray = bundle.getLongArray(b.x);
        long j11 = bundle.getLong(b.y);
        boolean z10 = bundle.getBoolean(b.A);
        int[] iArr = intArray;
        if (iArr == null) {
            iArr = new int[0];
        }
        Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
        if (longArray == null) {
            longArray = new long[0];
        }
        return new b(j10, i10, i11, iArr, uriArr, longArray, j11, z10);
    }

    @Override // sg.g
    public void d(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 10:
                c2Var.dismiss();
                break;
            case 15:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public float get(Object obj) {
        ur urVar = (ur) obj;
        switch (this.a) {
            case 20:
                return urVar.b;
            case 21:
            case 23:
            default:
                return urVar.e;
            case 22:
                return urVar.c;
            case 24:
                return urVar.d;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = n3.f0;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 28:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 6:
                if (num.intValue() == 0) {
                    return num2.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
            case 13:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
    }
}
