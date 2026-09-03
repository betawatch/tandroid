package gg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.t31;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Utilities.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                HashMap hashMap = n3.H;
                break;
            case 2:
                int i10 = l3.r;
                break;
            case 3:
                int i11 = ra.f;
                break;
            case 4:
                ((Boolean) obj).getClass();
                break;
            case 5:
                break;
            default:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(t31.Y());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                t31.s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        MessagesController.getInstance(i12).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                break;
        }
    }
}
