// default package

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwc implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bwc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // r69
    public final void e(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cwc cwcVar = (cwc) obj;
                String M0 = ob6.M0(2131753731, null);
                StringBuilder l = c00.l(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                l.append(ob6.M0(WallpapersListActivity.l0[i], strArr[i]));
                SpannableString spannableString = new SpannableString(l.toString());
                spannableString.setSpan(new ForegroundColorSpan(aob.w0(null, aob.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = cwcVar.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.P("", true);
                cwcVar.n = strArr[i];
                cwcVar.E("", true);
                break;
            default:
                yg4 yg4Var = (yg4) obj;
                if (!(view instanceof zea)) {
                    if (!(view instanceof cfa)) {
                        if (!(view instanceof vea)) {
                            if (!(view instanceof vw2)) {
                                if (view instanceof of3) {
                                    yg4Var.e(i, view, ((of3) view).getMessage(), 0);
                                    break;
                                }
                            } else {
                                yg4Var.e(i, view, ((vw2) view).getMessageObject(), 0);
                                break;
                            }
                        } else {
                            yg4Var.e(i, view, ((vea) view).getMessage(), 0);
                            break;
                        }
                    } else {
                        yg4Var.e(i, view, ((cfa) view).getMessage(), 0);
                        break;
                    }
                } else {
                    yg4Var.e(i, view, ((zea) view).getMessage(), 0);
                    break;
                }
                break;
        }
    }
}
