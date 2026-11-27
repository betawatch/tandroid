// default package

import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class nze {
    public static mfb a(mfb mfbVar) {
        return !(mfbVar instanceof ofb) ? mfbVar instanceof nfb ? mfbVar : mfbVar instanceof Serializable ? new nfb(mfbVar) : new ofb(mfbVar) : mfbVar;
    }
}
