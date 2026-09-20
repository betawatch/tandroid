package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements org.telegram.ui.Components.rv0, org.telegram.ui.Components.sv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.yc0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ad0 {
    public final /* synthetic */ int a;

    public /* synthetic */ es(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.sv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 1:
                gsVar.c = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 2:
            default:
                gsVar.e = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                gsVar.d = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.yc0
    public String e(int i10) {
        switch (this.a) {
            case 9:
                switch (i10) {
                }
            case 13:
                if (i10 != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(1);
                    calendar.add(6, i10);
                    long timeInMillis = calendar.getTimeInMillis();
                    int i12 = calendar.get(1);
                    if (i12 == i11 && i10 < 7) {
                        break;
                    } else if (i12 != i11) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 16:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                break;
            case 19:
                if (i10 != 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    int i13 = calendar3.get(1);
                    calendar3.add(6, i10);
                    long timeInMillis2 = calendar3.getTimeInMillis();
                    if (calendar3.get(1) != i13) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 26:
                if (i10 != 0) {
                    Calendar calendar4 = Calendar.getInstance();
                    int i14 = calendar4.get(1);
                    calendar4.add(6, i10);
                    long timeInMillis3 = calendar4.getTimeInMillis();
                    if (calendar4.get(1) != i14) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.rv0
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 0:
                return gsVar.c;
            case 1:
            default:
                return gsVar.e;
            case 2:
                return gsVar.d;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 11:
                b2Var.dismiss();
                break;
            case 22:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ad0
    public void q(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.d5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 6:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
