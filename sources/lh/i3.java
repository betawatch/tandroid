package lh;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i3 extends jk0 {
    public final /* synthetic */ p3 c;

    public i3(p3 p3Var) {
        this.c = p3Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        p3 p3Var = this.c;
        if (p3Var.V) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (p3Var.W) {
            if (i11 >= 0 && i11 < p3Var.U.size()) {
                return LocaleController.formatYearMont(((z7) p3Var.U.get(i11)).d / 1000, true);
            }
            i11 -= p3Var.U.size();
        }
        ArrayList arrayList = p3Var.b0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) p3Var.b0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int k10 = k();
        float width = (zk0Var.getWidth() - zk0Var.getPaddingLeft()) - zk0Var.getPaddingRight();
        p3 p3Var = this.c;
        z2 z2Var = p3Var.e;
        float f11 = z2Var.J;
        int i10 = (int) (((int) (width / f11)) * p3Var.K);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - zk0Var.getPaddingTop()) - zk0Var.getPaddingBottom())), f10) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, z2Var.J * round) + 2;
        iArr[1] = zk0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.jk0
    public final float H(zk0 zk0Var) {
        int k10 = k();
        float width = (zk0Var.getWidth() - zk0Var.getPaddingLeft()) - zk0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, zk0Var.computeVerticalScrollOffset() - r2.getPadding()) - zk0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (width / f10)) * r2.K))) - (AndroidUtilities.displaySize.y - zk0Var.getPaddingTop()));
    }

    @Override // f2.q0
    public final int h() {
        return k() + 3;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0 || i10 == h() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override // f2.q0
    public final int k() {
        p3 p3Var = this.c;
        ArrayList arrayList = p3Var.b0;
        int size = arrayList == null ? 0 : arrayList.size();
        return p3Var.V ? size + 1 : p3Var.W ? p3Var.U.size() + size : size;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        p3 p3Var = this.c;
        ArrayList arrayList = p3Var.d0;
        ArrayList arrayList2 = p3Var.U;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            ((m3) view).a = i10 == 0 ? p3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            l3 l3Var = (l3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            l3Var.Q = z10;
            l3Var.R = z11;
            l3Var.I = new h3(this, l3Var, 0);
            l3Var.J = new h3(this, l3Var, 1);
            int i12 = i10 - 2;
            if (p3Var.V) {
                if (i12 == 0) {
                    l3Var.f(-1, false, false);
                    l3Var.e(arrayList2.size(), (z7) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (p3Var.W) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    l3Var.f(-1, false, false);
                    l3Var.e(0, (z7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = p3Var.b0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.b0.get(i12);
            l3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || p3Var.M, l3Var.O == photoEntry);
            l3Var.O = photoEntry;
            l3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            l3Var.B = null;
            if (photoEntry == null) {
                l3Var.K = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                rl.j(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                l3Var.K = sb2.toString();
            } else {
                l3Var.K = LocaleController.getString(R.string.AttachPhoto);
            }
            l3Var.b(photoEntry);
            l3Var.invalidate();
            if (p3Var.I) {
                l3Var.E.setOnClickListener(new gg.f(this, photoEntry, l3Var, 14));
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        p3 p3Var = this.c;
        if (i10 == 0) {
            view = new m3(p3Var, p3Var.getContext());
        } else if (i10 == 1) {
            Context context = p3Var.getContext();
            boolean z10 = p3Var.H;
            ag.d dVar = new ag.d(context, 3);
            dVar.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(p3Var.getTitle());
            dVar.addView(textView, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            p3Var.e0 = dVar;
            view = dVar;
        } else {
            view = new l3(p3Var.getContext(), p3Var.b, p3Var.K, p3Var.I);
        }
        return new lk0(view);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        p3 p3Var = this.c;
        ArrayList arrayList = p3Var.d0;
        if (o1Var.f == 2) {
            l3 l3Var = (l3) o1Var.a;
            Object obj = l3Var.O;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                l3Var.f(-1, false, false);
            } else {
                l3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || p3Var.M, false);
            }
        }
    }
}
