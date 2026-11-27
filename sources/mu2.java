// default package

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class mu2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mu2(uc7 uc7Var, int i, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x011b, code lost:
    
        if (r5 <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r5 <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
    
        if (r5 <= 0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b A[ADDED_TO_REGION] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b = this.a;
        int i7 = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.User X1 = uc7Var.X1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                TLRPC.User X12 = uc7Var.X1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                if (X1 != null) {
                    if (X1.self) {
                        i = i7 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = X1.status;
                        if (userStatus != null) {
                            i = userStatus.expires;
                        }
                    }
                    if (X12 != null) {
                        if (X12.self) {
                            i2 = i7 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = X12.status;
                            if (userStatus2 != null) {
                                i2 = userStatus2.expires;
                            }
                        }
                        if (i > 0 || i2 <= 0) {
                            if (i < 0) {
                                if (i2 < 0) {
                                    if (i <= i2) {
                                        if (i >= i2) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (i == 0 || i2 == 0) {
                                if ((i2 < 0 || i <= 0) && (i2 != 0 || i == 0)) {
                                }
                            }
                        } else if (i <= i2) {
                            if (i >= i2) {
                            }
                        }
                    }
                    i2 = 0;
                    if (i > 0) {
                    }
                    if (i < 0) {
                    }
                    if (i == 0) {
                    }
                    if (i2 < 0) {
                    }
                }
                i = 0;
                if (X12 != null) {
                }
                i2 = 0;
                if (i > 0) {
                }
                if (i < 0) {
                }
                if (i == 0) {
                }
                if (i2 < 0) {
                }
                break;
            case 1:
                TLRPC.User X13 = uc7Var.X1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                TLRPC.User X14 = uc7Var.X1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                if (X13 != null) {
                    if (X13.self) {
                        i3 = i7 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = X13.status;
                        if (userStatus3 != null) {
                            i3 = userStatus3.expires;
                        }
                    }
                    if (X14 != null) {
                        if (X14.self) {
                            i4 = i7 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = X14.status;
                            if (userStatus4 != null) {
                                i4 = userStatus4.expires;
                            }
                        }
                        if (i3 > 0 || i4 <= 0) {
                            if (i3 < 0) {
                                if (i4 < 0) {
                                    if (i3 <= i4) {
                                        if (i3 >= i4) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (i3 == 0 || i4 == 0) {
                                if (i4 >= 0 && i3 == 0) {
                                }
                            }
                        } else if (i3 <= i4) {
                            if (i3 >= i4) {
                            }
                        }
                    }
                    i4 = 0;
                    if (i3 > 0) {
                    }
                    if (i3 < 0) {
                    }
                    if (i3 == 0) {
                    }
                    if (i4 >= 0) {
                    }
                }
                i3 = 0;
                if (X14 != null) {
                }
                i4 = 0;
                if (i3 > 0) {
                }
                if (i3 < 0) {
                }
                if (i3 == 0) {
                }
                if (i4 >= 0) {
                }
                break;
            default:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User X15 = tLObject2 instanceof TLRPC.TL_contact ? uc7Var.X1(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User X16 = tLObject instanceof TLRPC.TL_contact ? uc7Var.X1(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                if (X15 != null) {
                    if (X15.self) {
                        i5 = i7 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = X15.status;
                        if (userStatus5 != null) {
                            i5 = userStatus5.expires;
                        }
                    }
                    if (X16 != null) {
                        if (X16.self) {
                            i6 = i7 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = X16.status;
                            if (userStatus6 != null) {
                                i6 = userStatus6.expires;
                            }
                        }
                        if (i5 > 0 || i6 <= 0) {
                            if (i5 < 0) {
                                if (i6 < 0) {
                                    if (i5 <= i6) {
                                        if (i5 >= i6) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (i5 == 0 || i6 == 0) {
                                if (i6 >= 0 && i5 == 0) {
                                }
                            }
                        } else if (i5 <= i6) {
                            if (i5 >= i6) {
                            }
                        }
                    }
                    i6 = 0;
                    if (i5 > 0) {
                    }
                    if (i5 < 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 >= 0) {
                    }
                }
                i5 = 0;
                if (X16 != null) {
                }
                i6 = 0;
                if (i5 > 0) {
                }
                if (i5 < 0) {
                }
                if (i5 == 0) {
                }
                if (i6 >= 0) {
                }
                break;
        }
        return 1;
    }
}
