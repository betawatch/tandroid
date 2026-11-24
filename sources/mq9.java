// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mq9 {
    public static final mq9 a;
    public static final mq9 b;
    public static final mq9 c;
    public static final /* synthetic */ mq9[] d;

    static {
        mq9 mq9Var = new mq9("NETWORK_UNMETERED", 0);
        a = mq9Var;
        mq9 mq9Var2 = new mq9("DEVICE_IDLE", 1);
        b = mq9Var2;
        mq9 mq9Var3 = new mq9("DEVICE_CHARGING", 2);
        c = mq9Var3;
        d = new mq9[]{mq9Var, mq9Var2, mq9Var3};
    }

    public static mq9 valueOf(String str) {
        return (mq9) Enum.valueOf(mq9.class, str);
    }

    public static mq9[] values() {
        return (mq9[]) d.clone();
    }
}
