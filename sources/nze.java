// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class nze {
    public static mfb a(mfb mfbVar) {
        return !(mfbVar instanceof ofb) ? mfbVar instanceof nfb ? mfbVar : mfbVar instanceof Serializable ? new nfb(mfbVar) : new ofb(mfbVar) : mfbVar;
    }
}
