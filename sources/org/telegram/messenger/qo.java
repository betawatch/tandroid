package org.telegram.messenger;

import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ z2 c;

    public /* synthetic */ qo(int i10, z2 z2Var, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = z2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
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
        switch (this.a) {
            case 0:
                ?? r02 = this.b;
                z2 z2Var = this.c;
                SQLiteCursor sQLiteCursor3 = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hs.a0(r02).b;
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
                                    z2Var.a(Long.valueOf(r6.hash), (TLRPC.TL_help_appConfig) help_appconfig);
                                } else {
                                    z2Var.a(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e) {
                                e = e;
                                f8.g(e, true);
                                z2Var.a(0L, null);
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
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = r02;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                break;
            default:
                ?? r03 = this.b;
                z2 z2Var2 = this.c;
                SQLiteCursor sQLiteCursor4 = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = hs.a0(r03).b;
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
                                    z2Var2.a(Long.valueOf(r6.hash), (TLRPC.TL_messages_availableEffects) messages_availableeffects);
                                } else {
                                    z2Var2.a(0L, null);
                                }
                                sQLiteCursor4 = sQLiteCursor2;
                            } catch (Exception e10) {
                                e = e10;
                                f8.g(e, true);
                                z2Var2.a(0L, null);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor4 = r03;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    if (sQLiteCursor4 != null) {
                    }
                    throw th;
                }
                break;
        }
    }
}
