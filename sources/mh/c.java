package mh;

import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.z41;
import org.telegram.ui.i10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                return Boolean.valueOf((messageObject == null || messageObject.getFactCheck() == null) ? false : true);
            case 2:
                MessageObject messageObject2 = (MessageObject) obj;
                return Boolean.valueOf((messageObject2 == null || messageObject2.getEffect() == null) ? false : true);
            case 3:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 4:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 5:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof b9) || (view instanceof z6) || (view instanceof i10) || (view instanceof org.telegram.ui.Cells.v3) || (view instanceof org.telegram.ui.Cells.a2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            default:
                return Boolean.valueOf(z41.K(((Integer) obj).intValue()));
        }
    }
}
