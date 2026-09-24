package ai;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.th;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.w31;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 1:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 2:
                ((a0) ((View) obj)).invalidate();
                break;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof hg.y1) {
                    ((hg.y1) view2).c.invalidate();
                    break;
                }
                break;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof hg.y1) {
                    ((hg.y1) view3).d.a(false, true);
                    break;
                }
                break;
            case 5:
                ((View) obj).invalidate();
                break;
            case 6:
                HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                break;
            case 7:
                int i10 = org.telegram.ui.ActionBar.k3.r;
                break;
            case 8:
                int i11 = org.telegram.ui.Cells.wa.f;
                break;
            case 9:
                ad.Y0((View) obj);
                break;
            case 10:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) view4).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    messageObject.reactionsChanged = true;
                    break;
                }
                break;
            case 11:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.u1) && (messageObject2 = ((org.telegram.ui.Cells.u1) view5).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    break;
                }
                break;
            case 12:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.x2) {
                    ((org.telegram.ui.ActionBar.x2) view6).getTextView().invalidate();
                    break;
                } else {
                    view6.invalidate();
                    break;
                }
            case 13:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.h5) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view7;
                    h5Var.b.invalidate();
                    h5Var.c.invalidate();
                    break;
                } else if (view7 instanceof hg.y1) {
                    ((hg.y1) view7).c.invalidate();
                    break;
                } else {
                    view7.invalidate();
                    break;
                }
            case 14:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view8).a(true);
                    break;
                }
                break;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view9).c(true);
                    break;
                }
                break;
            case 16:
                ((Boolean) obj).getClass();
                break;
            case 17:
                break;
            case 18:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l4.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new th(27));
                    break;
                }
                break;
            case 19:
                break;
            case 20:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(w31.Y());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                w31.s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        MessagesController.getInstance(i12).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                break;
            case 21:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                break;
            case 22:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view11).setChecked(false);
                    break;
                }
                break;
            case 23:
                View view12 = (View) obj;
                if (view12 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view12).setChecked(false);
                    break;
                }
                break;
            default:
                break;
        }
    }

    public /* synthetic */ i(ad adVar) {
        this.a = 9;
    }
}
