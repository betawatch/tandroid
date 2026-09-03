package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.jd1;
import org.telegram.ui.w70;
import org.telegram.ui.ww0;
import ph.f3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j1 extends m2.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ j1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        switch (this.c) {
            case 0:
                hVar.removeView((View) obj);
                break;
            case 1:
                hVar.removeView((View) obj);
                break;
            default:
                hVar.removeView((View) obj);
                break;
        }
    }

    @Override // m2.a
    public final int b() {
        switch (this.c) {
            case 0:
                return ((o1) this.d).d.size();
            case 1:
                return ((w70) this.d).C.length;
            default:
                return ((jd1) this.d).b != 0 ? 1 : 2;
        }
    }

    @Override // m2.a
    public int c(Object obj) {
        switch (this.c) {
            case 2:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        int i11;
        switch (this.c) {
            case 0:
                o1 o1Var = (o1) this.d;
                n1 n1Var = new n1(o1Var, o1Var.getContext(), i10);
                hVar.addView(n1Var);
                n1Var.a = i10;
                ww0 ww0Var = (ww0) o1Var.d.get(i10);
                int i12 = ww0Var.a;
                String str = ww0Var.d;
                CharSequence charSequence = ww0Var.c;
                TextView textView = n1Var.b;
                f90 f90Var = n1Var.c;
                if (i12 == 0 || i12 == 14 || i12 == 28) {
                    textView.setText("");
                    f90Var.setText("");
                    n1Var.h = true;
                } else if (o1Var.B) {
                    int i13 = o1Var.y;
                    if (i13 == 4) {
                        textView.setText(LocaleController.getString(R.string.AdditionalReactions));
                        i11 = R.string.AdditionalReactionsDescription;
                    } else if (i13 == 3) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                        i11 = R.string.PremiumPreviewNoAdsDescription2;
                    } else if (i13 == 24) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                        i11 = R.string.PremiumPreviewTagsDescription;
                    } else if (i13 == 10) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                        i11 = R.string.PremiumPreviewAppIconDescription2;
                    } else if (i13 == 2) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                        i11 = R.string.PremiumPreviewDownloadSpeedDescription2;
                    } else if (i13 == 9) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                        i11 = R.string.PremiumPreviewAdvancedChatManagementDescription2;
                    } else if (i13 == 8) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                        i11 = R.string.PremiumPreviewVoiceToTextDescription2;
                    } else if (i13 == 13) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                        i11 = R.string.PremiumPreviewTranslationsDescription;
                    } else if (i13 == 38) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                        i11 = R.string.PremiumPreviewEffectsDescription;
                    } else if (i13 == 22) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                        i11 = R.string.PremiumPreviewWallpaperDescription;
                    } else if (i13 == 23) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                        i11 = R.string.PremiumPreviewProfileColorDescription;
                    } else if (i13 == 41) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                        i11 = R.string.PremiumPreviewSharingDisableDescription;
                    } else {
                        textView.setText(charSequence);
                        f90Var.setText(AndroidUtilities.replaceTags(str));
                        n1Var.h = false;
                    }
                    org.telegram.ui.b.n(i11, f90Var);
                    n1Var.h = false;
                } else {
                    textView.setText(charSequence);
                    f90Var.setText(AndroidUtilities.replaceTags(str));
                    n1Var.h = false;
                }
                f90Var.setMaxWidth(f3.a(f90Var.getText(), f90Var.getPaint()));
                n1Var.requestLayout();
                boolean z4 = ww0Var.a == 40;
                if (z4 && n1Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(n1Var.getContext());
                    n1Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = n1Var.getContext();
                    f6Var = ((g3) o1Var).resourcesProvider;
                    rh.i iVar = new rh.i(context, f6Var, true);
                    iVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    n1Var.d.addView(r2[0], b6.n(-1, -2));
                    Context context2 = n1Var.getContext();
                    f6Var2 = ((g3) o1Var).resourcesProvider;
                    rh.i iVar2 = new rh.i(context2, f6Var2, true);
                    iVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    n1Var.d.addView(r2[1], b6.n(-1, -2));
                    Context context3 = n1Var.getContext();
                    f6Var3 = ((g3) o1Var).resourcesProvider;
                    rh.i iVar3 = new rh.i(context3, f6Var3, true);
                    rh.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    n1Var.d.addView(iVarArr[2], b6.n(-1, -2));
                    n1Var.addView(n1Var.d, b6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = n1Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z4 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) f90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(z4 ? 6.0f : 10.0f);
                return n1Var;
            case 1:
                TextView textView2 = new TextView(hVar.getContext());
                w70 w70Var = (w70) this.d;
                textView2.setTag(w70Var.a);
                TextView textView3 = new TextView(hVar.getContext());
                textView3.setTag(w70Var.b);
                ah.e eVar = new ah.e(hVar.getContext(), textView2, textView3);
                int i14 = j6.G6;
                textView2.setTextColor(j6.w0(null, i14, false));
                textView2.setTextSize(1, 26.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setGravity(17);
                eVar.addView(textView2, b6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView3.setTextColor(j6.w0(null, i14, false));
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView3.setGravity(17);
                eVar.addView(textView3, b6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                hVar.addView(eVar, 0);
                textView2.setText(w70Var.C[i10]);
                textView3.setText(AndroidUtilities.replaceTags(w70Var.D[i10]));
                return eVar;
            default:
                jd1 jd1Var = (jd1) this.d;
                View view = i10 == 0 ? jd1Var.q0 : jd1Var.j0;
                hVar.addView(view);
                return view;
        }
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        switch (this.c) {
            case 0:
                return view == obj;
            case 1:
                return view.equals(obj);
            default:
                return obj == view;
        }
    }

    @Override // m2.a
    public void h(int i10) {
        switch (this.c) {
            case 1:
                w70 w70Var = (w70) this.d;
                w70Var.e.setCurrentPage(i10);
                w70Var.E = i10;
                break;
        }
    }
}
