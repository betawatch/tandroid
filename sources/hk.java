// default package

import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class hk extends EditTextBoldCursor implements vlb {
    public boolean M1;
    public int N1;
    public ylb O1;
    public int P1;

    public final void A(int i, ylb ylbVar) {
        this.M1 = true;
        this.N1 = i;
        this.O1 = ylbVar;
        int v0 = cmb.v0(i, ylbVar);
        this.P1 = v0;
        setCursorColor(v0);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        if (this.M1) {
            hashSet.add(Integer.valueOf(this.N1));
        }
    }

    @Override // vlb
    public final void updateColors() {
        int v0;
        try {
            if (!this.M1 || (v0 = cmb.v0(this.N1, this.O1)) == this.P1) {
                return;
            }
            this.P1 = v0;
            setCursorColor(v0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
