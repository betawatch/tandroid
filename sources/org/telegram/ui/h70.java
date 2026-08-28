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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h70 extends m2.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ h70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.c = i9;
        this.d = notificationCenterDelegate;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        switch (this.c) {
            case 0:
                gVar.removeView((View) obj);
                break;
            case 1:
                gVar.removeView((View) obj);
                break;
            default:
                gVar.removeView((View) obj);
                break;
        }
    }

    @Override // m2.a
    public final int b() {
        switch (this.c) {
            case 0:
                return ((i70) this.d).B.length;
            case 1:
                return ((oc1) this.d).b != 0 ? 1 : 2;
            default:
                return ((zf.x0) this.d).d.size();
        }
    }

    @Override // m2.a
    public int c(Object obj) {
        switch (this.c) {
            case 1:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i10;
        switch (this.c) {
            case 0:
                TextView textView = new TextView(gVar.getContext());
                i70 i70Var = (i70) this.d;
                textView.setTag(i70Var.a);
                TextView textView2 = new TextView(gVar.getContext());
                textView2.setTag(i70Var.b);
                fh.v vVar = new fh.v(gVar.getContext(), textView, textView2);
                int i11 = org.telegram.ui.ActionBar.f6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                textView.setTextSize(1, 26.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                vVar.addView(textView, g7.e6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                vVar.addView(textView2, g7.e6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(vVar, 0);
                textView.setText(i70Var.B[i9]);
                textView2.setText(AndroidUtilities.replaceTags(i70Var.C[i9]));
                return vVar;
            case 1:
                oc1 oc1Var = (oc1) this.d;
                View view = i9 == 0 ? oc1Var.p0 : oc1Var.i0;
                gVar.addView(view);
                return view;
            default:
                zf.x0 x0Var = (zf.x0) this.d;
                zf.w0 w0Var = new zf.w0(x0Var, x0Var.getContext(), i9);
                gVar.addView(w0Var);
                w0Var.a = i9;
                gw0 gw0Var = (gw0) x0Var.d.get(i9);
                int i12 = gw0Var.a;
                String str = gw0Var.d;
                CharSequence charSequence = gw0Var.c;
                TextView textView3 = w0Var.b;
                org.telegram.ui.Components.l80 l80Var = w0Var.c;
                if (i12 == 0 || i12 == 14 || i12 == 28) {
                    textView3.setText("");
                    l80Var.setText("");
                    w0Var.h = true;
                } else if (x0Var.A) {
                    int i13 = x0Var.y;
                    if (i13 == 4) {
                        textView3.setText(LocaleController.getString(R.string.AdditionalReactions));
                        i10 = R.string.AdditionalReactionsDescription;
                    } else if (i13 == 3) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                        i10 = R.string.PremiumPreviewNoAdsDescription2;
                    } else if (i13 == 24) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                        i10 = R.string.PremiumPreviewTagsDescription;
                    } else if (i13 == 10) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                        i10 = R.string.PremiumPreviewAppIconDescription2;
                    } else if (i13 == 2) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                        i10 = R.string.PremiumPreviewDownloadSpeedDescription2;
                    } else if (i13 == 9) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                        i10 = R.string.PremiumPreviewAdvancedChatManagementDescription2;
                    } else if (i13 == 8) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                        i10 = R.string.PremiumPreviewVoiceToTextDescription2;
                    } else if (i13 == 13) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                        i10 = R.string.PremiumPreviewTranslationsDescription;
                    } else if (i13 == 38) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                        i10 = R.string.PremiumPreviewEffectsDescription;
                    } else if (i13 == 22) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                        i10 = R.string.PremiumPreviewWallpaperDescription;
                    } else if (i13 == 23) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                        i10 = R.string.PremiumPreviewProfileColorDescription;
                    } else if (i13 == 41) {
                        textView3.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                        i10 = R.string.PremiumPreviewSharingDisableDescription;
                    } else {
                        textView3.setText(charSequence);
                        l80Var.setText(AndroidUtilities.replaceTags(str));
                        w0Var.h = false;
                    }
                    org.telegram.ui.Cells.j2.p(i10, l80Var);
                    w0Var.h = false;
                } else {
                    textView3.setText(charSequence);
                    l80Var.setText(AndroidUtilities.replaceTags(str));
                    w0Var.h = false;
                }
                l80Var.setMaxWidth(kh.x3.a(l80Var.getText(), l80Var.getPaint()));
                w0Var.requestLayout();
                boolean z10 = gw0Var.a == 40;
                if (z10 && w0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(w0Var.getContext());
                    w0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = w0Var.getContext();
                    b6Var = ((org.telegram.ui.ActionBar.f3) x0Var).resourcesProvider;
                    mh.k kVar = new mh.k(context, b6Var, true);
                    kVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    w0Var.d.addView(r2[0], g7.e6.n(-1, -2));
                    Context context2 = w0Var.getContext();
                    b6Var2 = ((org.telegram.ui.ActionBar.f3) x0Var).resourcesProvider;
                    mh.k kVar2 = new mh.k(context2, b6Var2, true);
                    kVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    w0Var.d.addView(r2[1], g7.e6.n(-1, -2));
                    Context context3 = w0Var.getContext();
                    b6Var3 = ((org.telegram.ui.ActionBar.f3) x0Var).resourcesProvider;
                    mh.k kVar3 = new mh.k(context3, b6Var3, true);
                    mh.k[] kVarArr = {kVar, kVar2, kVar3};
                    kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    w0Var.d.addView(kVarArr[2], g7.e6.n(-1, -2));
                    w0Var.addView(w0Var.d, g7.e6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = w0Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z10 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) l80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(z10 ? 6.0f : 10.0f);
                return w0Var;
        }
    }

    @Override // m2.a
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

    @Override // m2.a
    public void h(int i9) {
        switch (this.c) {
            case 0:
                i70 i70Var = (i70) this.d;
                i70Var.e.setCurrentPage(i9);
                i70Var.D = i9;
                break;
        }
    }
}
