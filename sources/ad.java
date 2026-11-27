// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ad extends xmb {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(Context context, byte b) {
        super(context);
        this.d = b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z) {
        switch (this.d) {
            case 0:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
            case 1:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
            case 2:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
            default:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
        }
    }

    @Override // xmb, android.widget.TextView
    public final void setTextColor(int i) {
        switch (this.d) {
            case 0:
                super.setTextColor(i);
                setBackground(aob.H0(hl.L(20.0f), i));
                break;
            case 1:
                super.setTextColor(i);
                setBackground(aob.H0(hl.L(20.0f), i));
                break;
            case 2:
                super.setTextColor(i);
                setBackground(aob.H0(hl.L(20.0f), i));
                break;
            default:
                super.setTextColor(i);
                setBackgroundDrawable(aob.H0(hl.L(20.0f), i));
                break;
        }
    }
}
