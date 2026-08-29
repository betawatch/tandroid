package cg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y80;
import org.telegram.ui.fw0;
import org.telegram.ui.k70;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k1 extends m2.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ k1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.c = i10;
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
                return ((p1) this.d).d.size();
            case 1:
                return ((k70) this.d).B.length;
            default:
                return ((qc1) this.d).b != 0 ? 1 : 2;
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
    public final Object e(m2.g gVar, int i10) {
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        int i11;
        switch (this.c) {
            case 0:
                p1 p1Var = (p1) this.d;
                o1 o1Var = new o1(p1Var, p1Var.getContext(), i10);
                gVar.addView(o1Var);
                o1Var.a = i10;
                fw0 fw0Var = (fw0) p1Var.d.get(i10);
                int i12 = fw0Var.a;
                String str = fw0Var.d;
                CharSequence charSequence = fw0Var.c;
                TextView textView = o1Var.b;
                y80 y80Var = o1Var.c;
                if (i12 == 0 || i12 == 14 || i12 == 28) {
                    textView.setText("");
                    y80Var.setText("");
                    o1Var.h = true;
                } else if (p1Var.A) {
                    int i13 = p1Var.y;
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
                        y80Var.setText(AndroidUtilities.replaceTags(str));
                        o1Var.h = false;
                    }
                    org.telegram.ui.b.o(i11, y80Var);
                    o1Var.h = false;
                } else {
                    textView.setText(charSequence);
                    y80Var.setText(AndroidUtilities.replaceTags(str));
                    o1Var.h = false;
                }
                y80Var.setMaxWidth(t3.a(y80Var.getText(), y80Var.getPaint()));
                o1Var.requestLayout();
                boolean z10 = fw0Var.a == 40;
                if (z10 && o1Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(o1Var.getContext());
                    o1Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = o1Var.getContext();
                    c6Var = ((f3) p1Var).resourcesProvider;
                    ph.i iVar = new ph.i(context, c6Var, true);
                    iVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    o1Var.d.addView(r2[0], f6.n(-1, -2));
                    Context context2 = o1Var.getContext();
                    c6Var2 = ((f3) p1Var).resourcesProvider;
                    ph.i iVar2 = new ph.i(context2, c6Var2, true);
                    iVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    o1Var.d.addView(r2[1], f6.n(-1, -2));
                    Context context3 = o1Var.getContext();
                    c6Var3 = ((f3) p1Var).resourcesProvider;
                    ph.i iVar3 = new ph.i(context3, c6Var3, true);
                    ph.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    o1Var.d.addView(iVarArr[2], f6.n(-1, -2));
                    o1Var.addView(o1Var.d, f6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = o1Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z10 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) y80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(z10 ? 6.0f : 10.0f);
                return o1Var;
            case 1:
                TextView textView2 = new TextView(gVar.getContext());
                k70 k70Var = (k70) this.d;
                textView2.setTag(k70Var.a);
                TextView textView3 = new TextView(gVar.getContext());
                textView3.setTag(k70Var.b);
                bg.d1 d1Var = new bg.d1(gVar.getContext(), textView2, textView3);
                int i14 = g6.G6;
                textView2.setTextColor(g6.w0(null, i14, false));
                textView2.setTextSize(1, 26.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setGravity(17);
                d1Var.addView(textView2, f6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView3.setTextColor(g6.w0(null, i14, false));
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView3.setGravity(17);
                d1Var.addView(textView3, f6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(d1Var, 0);
                textView2.setText(k70Var.B[i10]);
                textView3.setText(AndroidUtilities.replaceTags(k70Var.C[i10]));
                return d1Var;
            default:
                qc1 qc1Var = (qc1) this.d;
                View view = i10 == 0 ? qc1Var.p0 : qc1Var.i0;
                gVar.addView(view);
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
                k70 k70Var = (k70) this.d;
                k70Var.e.setCurrentPage(i10);
                k70Var.D = i10;
                break;
        }
    }
}
