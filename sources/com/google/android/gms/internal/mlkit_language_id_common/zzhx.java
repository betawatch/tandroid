package com.google.android.gms.internal.mlkit_language_id_common;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public enum zzhx implements zzak {
    zza(0),
    zzb(1),
    zzc(2),
    zzd(3),
    zze(4),
    zzf(6),
    zzg(7),
    zzh(8),
    zzi(9),
    zzj(5),
    zzk(100),
    zzl(101),
    zzm(102),
    zzn(103),
    zzo(104),
    zzp(105),
    zzq(106),
    zzr(107),
    zzs(108),
    zzt(109),
    zzu(110),
    zzv(111),
    zzw(112),
    zzx(113),
    zzy(114),
    zzz(115),
    zzA(116),
    zzB(NotificationCenter.channelRecommendationsLoaded),
    zzC(NotificationCenter.savedMessagesDialogsUpdate),
    zzD(203),
    zzE(NotificationCenter.userIsPremiumBlockedUpadted),
    zzF(NotificationCenter.storyAlbumsCollectionsUpdate),
    zzG(NotificationCenter.savedMessagesForwarded),
    zzH(NotificationCenter.emojiKeywordsLoaded),
    zzI(NotificationCenter.onDownloadingFilesChanged),
    zzJ(NotificationCenter.onActivityResultReceived),
    zzK(NotificationCenter.onRequestPermissionResultReceived),
    zzL(NotificationCenter.onUserRingtonesUpdated),
    zzM(NotificationCenter.currentUserPremiumStatusChanged),
    zzN(400),
    zzO(401),
    zzP(402),
    zzQ(403),
    zzR(404),
    zzS(405),
    zzT(406),
    zzU(407),
    zzV(9999);

    private final int zzX;

    zzhx(int i) {
        this.zzX = i;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzak
    public final int zza() {
        return this.zzX;
    }
}
