// default package

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class bn6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ bn6(hq6 hq6Var, SharedPreferences sharedPreferences, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = sharedPreferences;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final SharedPreferences sharedPreferences = this.c;
        final hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.getClass();
                final byte b2 = 0;
                gl.c3(new Runnable() { // from class: mo6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        hq6 hq6Var2 = hq6Var;
                        switch (b3) {
                            case 0:
                                hq6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    hq6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("replyicons", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    hq6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit2.putString("restrictedstatuses", Utilities.f(serializedData2.toByteArray()));
                                    edit2.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit2.apply();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                gl.c3(new e45(this.b, tL_error, tLObject, this.c, (byte) 25));
                break;
            default:
                final byte b3 = 1;
                gl.c3(new Runnable() { // from class: mo6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        hq6 hq6Var2 = hq6Var;
                        switch (b32) {
                            case 0:
                                hq6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    hq6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("replyicons", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    hq6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit2.putString("restrictedstatuses", Utilities.f(serializedData2.toByteArray()));
                                    edit2.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit2.apply();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
