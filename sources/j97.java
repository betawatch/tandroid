// default package

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class j97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ e c;

    public /* synthetic */ j97(int i, e eVar, byte b) {
        this.a = b;
        this.b = i;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        TLRPC.help_AppConfig help_appconfig;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor2;
        TLRPC.messages_AvailableEffects messages_availableeffects;
        NativeByteBuffer byteBufferValue2;
        byte b = this.a;
        SQLiteCursor sQLiteCursor3 = null;
        e eVar = this.c;
        ?? r7 = this.b;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7.Y(r7).b;
                        if (sQLiteDatabase != null) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM app_config", new Object[0]);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    help_appconfig = null;
                                } else {
                                    help_appconfig = TLRPC.help_AppConfig.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (help_appconfig instanceof TLRPC.TL_help_appConfig) {
                                    eVar.a(Long.valueOf(r2.hash), (TLRPC.TL_help_appConfig) help_appconfig);
                                } else {
                                    eVar.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e) {
                                e = e;
                                fa4.g(e, true);
                                eVar.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor3 = r7;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                break;
            default:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = ad7.Y(r7).b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data FROM effects", new Object[0]);
                            try {
                                if (!sQLiteCursor2.next() || (byteBufferValue2 = sQLiteCursor2.byteBufferValue(0)) == null) {
                                    messages_availableeffects = null;
                                } else {
                                    messages_availableeffects = TLRPC.messages_AvailableEffects.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                    byteBufferValue2.reuse();
                                }
                                if (messages_availableeffects instanceof TLRPC.TL_messages_availableEffects) {
                                    eVar.a(Long.valueOf(r2.hash), (TLRPC.TL_messages_availableEffects) messages_availableeffects);
                                } else {
                                    eVar.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor2;
                            } catch (Exception e3) {
                                e = e3;
                                fa4.g(e, true);
                                eVar.a(0L, null);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor3 = r7;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    sQLiteCursor2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                break;
        }
    }
}
