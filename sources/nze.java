// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class nze {
    public static mfb a(mfb mfbVar) {
        return !(mfbVar instanceof ofb) ? mfbVar instanceof nfb ? mfbVar : mfbVar instanceof Serializable ? new nfb(mfbVar) : new ofb(mfbVar) : mfbVar;
    }
}
