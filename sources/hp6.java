// default package

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class hp6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ hp6(ls6 ls6Var, SharedPreferences sharedPreferences, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = sharedPreferences;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final SharedPreferences sharedPreferences = this.c;
        final ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new g65(this.b, tL_error, tLObject, this.c, (byte) 25));
                break;
            case 1:
                final byte b2 = 1;
                hl.c3(new Runnable() { // from class: mq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        ls6 ls6Var2 = ls6Var;
                        switch (b3) {
                            case 0:
                                ls6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    ls6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
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
                                    ls6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
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
            default:
                ls6Var.getClass();
                final byte b3 = 0;
                hl.c3(new Runnable() { // from class: mq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        ls6 ls6Var2 = ls6Var;
                        switch (b32) {
                            case 0:
                                ls6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    ls6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
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
                                    ls6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
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
