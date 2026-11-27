// default package

import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bef extends v3d {
    public final al5 Z(br7 br7Var, String str, int i, br7 br7Var2) {
        Parcel R = R();
        dld.b(R, br7Var);
        R.writeString(str);
        R.writeInt(i);
        dld.b(R, br7Var2);
        Parcel P = P(R, 2);
        al5 T = br7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final al5 a0(br7 br7Var, String str, int i, br7 br7Var2) {
        Parcel R = R();
        dld.b(R, br7Var);
        R.writeString(str);
        R.writeInt(i);
        dld.b(R, br7Var2);
        Parcel P = P(R, 3);
        al5 T = br7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }
}
