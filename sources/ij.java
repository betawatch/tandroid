// default package

import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ij extends EditTextBoldCursor implements snb {
    public boolean N1;
    public int O1;
    public vnb P1;
    public int Q1;

    public final void A(int i, vnb vnbVar) {
        this.N1 = true;
        this.O1 = i;
        this.P1 = vnbVar;
        int v0 = aob.v0(i, vnbVar);
        this.Q1 = v0;
        setCursorColor(v0);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        if (this.N1) {
            hashSet.add(Integer.valueOf(this.O1));
        }
    }

    @Override // snb
    public final void updateColors() {
        int v0;
        try {
            if (!this.N1 || (v0 = aob.v0(this.O1, this.P1)) == this.Q1) {
                return;
            }
            this.Q1 = v0;
            setCursorColor(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
