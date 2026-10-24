package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m70 extends z4.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ m70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override // z4.a
    public final void a(z4.h hVar, Object obj) {
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

    @Override // z4.a
    public final int b() {
        switch (this.c) {
            case 0:
                return ((n70) this.d).F.length;
            case 1:
                return ((qc1) this.d).b != 0 ? 1 : 2;
            default:
                return ((sg.y0) this.d).d.size();
        }
    }

    @Override // z4.a
    public int c(Object obj) {
        switch (this.c) {
            case 1:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override // z4.a
    public final Object e(z4.h hVar, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i11;
        switch (this.c) {
            case 0:
                TextView textView = new TextView(hVar.getContext());
                n70 n70Var = (n70) this.d;
                textView.setTag(n70Var.a);
                TextView textView2 = new TextView(hVar.getContext());
                textView2.setTag(n70Var.b);
                ah.v vVar = new ah.v(hVar.getContext(), textView, textView2);
                int i12 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.messenger.v0.q(textView, i12, null, 1, 26.0f);
                textView.setGravity(17);
                vVar.addView(textView, w7.z5.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.W(textView2, i12, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                vVar.addView(textView2, w7.z5.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                hVar.addView(vVar, 0);
                textView.setText(n70Var.F[i10]);
                textView2.setText(AndroidUtilities.replaceTags(n70Var.G[i10]));
                return vVar;
            case 1:
                qc1 qc1Var = (qc1) this.d;
                View view = i10 == 0 ? qc1Var.u0 : qc1Var.n0;
                hVar.addView(view);
                return view;
            default:
                sg.y0 y0Var = (sg.y0) this.d;
                sg.x0 x0Var = new sg.x0(y0Var, y0Var.getContext(), i10);
                hVar.addView(x0Var);
                x0Var.a = i10;
                sw0 sw0Var = (sw0) y0Var.d.get(i10);
                int i13 = sw0Var.a;
                String str = sw0Var.d;
                CharSequence charSequence = sw0Var.c;
                TextView textView3 = x0Var.b;
                org.telegram.ui.Components.y90 y90Var = x0Var.c;
                if (i13 == 0 || i13 == 14 || i13 == 28) {
                    textView3.setText("");
                    y90Var.setText("");
                    x0Var.h = true;
                } else if (y0Var.E) {
                    int i14 = y0Var.y;
                    if (i14 == 4) {
                        textView3.setText(LocaleController.getString(R.string.AdditionalReactions));
                        i11 = R.string.AdditionalReactionsDescription;
                    } else if (i14 == 3) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                        i11 = R.string.PremiumPreviewNoAdsDescription2;
                    } else if (i14 == 24) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                        i11 = R.string.PremiumPreviewTagsDescription;
                    } else if (i14 == 10) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                        i11 = R.string.PremiumPreviewAppIconDescription2;
                    } else if (i14 == 2) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                        i11 = R.string.PremiumPreviewDownloadSpeedDescription2;
                    } else if (i14 == 9) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                        i11 = R.string.PremiumPreviewAdvancedChatManagementDescription2;
                    } else if (i14 == 8) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                        i11 = R.string.PremiumPreviewVoiceToTextDescription2;
                    } else if (i14 == 13) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                        i11 = R.string.PremiumPreviewTranslationsDescription;
                    } else if (i14 == 38) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                        i11 = R.string.PremiumPreviewEffectsDescription;
                    } else if (i14 == 22) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                        i11 = R.string.PremiumPreviewWallpaperDescription;
                    } else if (i14 == 23) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                        i11 = R.string.PremiumPreviewProfileColorDescription;
                    } else if (i14 == 41) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                        i11 = R.string.PremiumPreviewSharingDisableDescription;
                    } else {
                        textView3.setText(charSequence);
                        y90Var.setText(AndroidUtilities.replaceTags(str));
                        x0Var.h = false;
                    }
                    org.telegram.ui.Cells.b1.r(i11, y90Var);
                    x0Var.h = false;
                } else {
                    textView3.setText(charSequence);
                    y90Var.setText(AndroidUtilities.replaceTags(str));
                    x0Var.h = false;
                }
                y90Var.setMaxWidth(ei.x3.a(y90Var.getText(), y90Var.getPaint()));
                x0Var.requestLayout();
                boolean z10 = sw0Var.a == 40;
                if (z10 && x0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(x0Var.getContext());
                    x0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = x0Var.getContext();
                    g6Var = ((org.telegram.ui.ActionBar.h3) y0Var).resourcesProvider;
                    gi.k kVar = new gi.k(context, g6Var, true);
                    kVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    x0Var.d.addView(r2[0], w7.z5.n(-1, -2));
                    Context context2 = x0Var.getContext();
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) y0Var).resourcesProvider;
                    gi.k kVar2 = new gi.k(context2, g6Var2, true);
                    kVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    x0Var.d.addView(r2[1], w7.z5.n(-1, -2));
                    Context context3 = x0Var.getContext();
                    g6Var3 = ((org.telegram.ui.ActionBar.h3) y0Var).resourcesProvider;
                    gi.k kVar3 = new gi.k(context3, g6Var3, true);
                    gi.k[] kVarArr = {kVar, kVar2, kVar3};
                    kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    x0Var.d.addView(kVarArr[2], w7.z5.n(-1, -2));
                    x0Var.addView(x0Var.d, w7.z5.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = x0Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z10 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) y90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(z10 ? 6.0f : 10.0f);
                return x0Var;
        }
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        switch (this.c) {
            case 0:
                return view.equals(obj);
            case 1:
                return obj == view;
            default:
                return view == obj;
        }
    }

    @Override // z4.a
    public void h(int i10) {
        switch (this.c) {
            case 0:
                n70 n70Var = (n70) this.d;
                n70Var.e.setCurrentPage(i10);
                n70Var.H = i10;
                break;
        }
    }
}
