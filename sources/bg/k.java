package bg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.b31;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Utilities.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                HashMap hashMap = m3.G;
                break;
            case 2:
                int i9 = k3.r;
                break;
            case 3:
                int i10 = sa.f;
                break;
            case 4:
                ((Boolean) obj).getClass();
                break;
            case 5:
                break;
            default:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(b31.X());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                b31.s = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    try {
                        MessagesController.getInstance(i11).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                break;
        }
    }
}
